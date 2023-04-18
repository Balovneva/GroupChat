# GroupChat
<h2 align="center">Микро-чат, API на Spring Boot c DB</h2>

Java v17.0.6

Стек: Spring Boot, MySQL, Lombok

<h3>Описание:</h3>
Чат, в котором пользователи могут обмениваться сообщениями.

Cоздан интерфейс API на основе REST для проведения CRUD операций над объектами. 


Инструкция по запуску: https://docs.google.com/document/d/1Xv1jVHBs9Uy0PUB9VCtlijK0E4kMtiNi/edit?usp=sharing&ouid=103002682866459275054&rtpof=true&sd=true


Для тестирование API был использован Talend API Tester.


Связь объектов в базе данных:


<h2 align="center">Интерфейс</h2>

При переходе на стартовую страницу http://localhost:8080 нужно ввести имя пользователя:


![1](https://user-images.githubusercontent.com/122821058/232856611-6abfc99b-b762-4643-94f3-9fe0ecef756c.png)


Открывается страница, с полем для ввода текста:


![2](https://user-images.githubusercontent.com/122821058/232800512-bf86f022-89af-48df-bc16-f60765dbba24.png)


С разных браузеров создала двух пользователей и в окно ввода передала диалог:


![3](https://user-images.githubusercontent.com/122821058/232856859-35ebfc67-2fea-4f3f-99c3-bd9ddf6110b6.png)


Диалоги и пользователи хранятся в базе данных:


![5](https://user-images.githubusercontent.com/122821058/232857828-3a4aa840-c68b-4d4f-bc92-a153d65b34ba.png)


![4](https://user-images.githubusercontent.com/122821058/232857899-fe081de4-37a9-46f5-a29a-aa5ec537d11b.png)



<h2 align="center">Тестирование API</h2>

GET request для получения списка пользователей:

![image](https://user-images.githubusercontent.com/122821058/232859081-1b3d2c82-2121-4e19-b84c-6e6ffdca8f80.png)


![image](https://user-images.githubusercontent.com/122821058/232859632-340b2a27-0dea-4fec-883b-91956abe244d.png)


GET request для получения списка сообщений:


![image](https://user-images.githubusercontent.com/122821058/232860111-cb9c7766-430d-487d-8081-93e20a60bb69.png)


![image](https://user-images.githubusercontent.com/122821058/232860317-eee7d1fe-f3cb-496e-9da2-b4c2227f95b3.png)


GET request для проверки инициализации пользователя:


![image](https://user-images.githubusercontent.com/122821058/232860589-e5bb751d-8f74-4a87-aa67-9f928a74ca36.png)


POST request для добавления пользователя:


![image](https://user-images.githubusercontent.com/122821058/232861359-7e04646c-c1b1-41ce-863c-5a7e6b184bdc.png)


![image](https://user-images.githubusercontent.com/122821058/232861495-736818ca-47f8-414d-b4d4-1db6d21acd5b.png)



POST request для добавления сообщения:


![image](https://user-images.githubusercontent.com/122821058/232873878-59a23afd-643a-4ab6-b8bb-7fd3b1a0c6bf.png)


![image](https://user-images.githubusercontent.com/122821058/232873949-20acd717-6faa-4d32-9daf-108610a7e47f.png)
