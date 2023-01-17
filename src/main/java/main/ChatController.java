package main;


import main.dto.DtoMessage;
import main.dto.MessageMapper;
import main.model.Message;
import main.model.MessageRepository;
import main.model.User;
import main.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;

import java.time.LocalDateTime;
import java.util.*;

@RestController
public class ChatController {

    // аннотация autowired, чтобы репозиторий
    // автоматичеки подключался к этому контроллеру
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private MessageRepository messageRepository;

    @GetMapping("/init")
    public HashMap<String, Boolean> init() {
        HashMap<String, Boolean> response = new HashMap<>();

        Map<String, Boolean> result = new HashMap<>();
        String sessionId = RequestContextHolder
                .currentRequestAttributes().getSessionId();
        Optional<User> userOpt = userRepository.findBySessionId(sessionId);

        response.put("result", userOpt.isPresent());
        return response;
    }

    @PostMapping("/auth")
    public HashMap<String, Boolean> auth(@RequestParam String name) {
        HashMap<String, Boolean> response = new HashMap<>();
        User user = new User();
        user.setName(name);
        String sessionId = RequestContextHolder
                .currentRequestAttributes().getSessionId();
        user.setSessionId(sessionId);

        userRepository.save(user);

        response.put("result", true);
        return response;
    }

    @PostMapping("/message")
    public Map<String, Boolean> sendMessage(@RequestParam String message) {

        if (message.isEmpty()) {
            return Map.of("result", false);
        }

        String sessionId = RequestContextHolder
                .currentRequestAttributes().getSessionId();
        User user = userRepository
                .findBySessionId(sessionId).get();

        Message mes = new Message();
        mes.setDateTime(LocalDateTime.now());
        mes.setMessage(message);
        mes.setUser(user);
        messageRepository.save(mes);

        return Map.of("result", true);
    }

    @GetMapping("/message")
    public List<DtoMessage> getMessagesList() {
        return messageRepository
                .findAll(Sort.by(Sort.Direction.ASC, "dateTime"))
                .stream()
                .map(MessageMapper::map).toList();
    }

    @GetMapping("/user")
    public HashMap<Integer, String> getUsersList() {
        return  null;
    }
}
