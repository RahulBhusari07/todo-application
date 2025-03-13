
# 📝 To-Do Application  
A simple To-Do application built using **Spring Boot, Thymeleaf, Bootstrap 5, and MySQL**.  

## 🚀 Features  
- ✅ **Task Management** (Add, Update, Toggle, Delete Tasks)  
- 🎨 **Bootstrap 5 UI** for responsive design  
- 🗄️ **MySQL Database** for task storage  
- 🔄 **Spring Boot & Hibernate** for backend  
- ⚡ **Lombok** to reduce boilerplate code  

## 🛠️ Technologies Used  
- **Spring Boot 3.2.5**  
- **Java 17**  
- **Hibernate (JPA)**  
- **Jakarta API**  
- **MySQL**  
- **Thymeleaf**  
- **Bootstrap 5**  
- **Maven**  
- **Tomcat Server**  
- **Lombok**  

## 📌 Prerequisites  
Make sure you have the following installed:  
✅ **JDK 17**  
✅ **MySQL Workbench**  
✅ **Spring Tool Suite (STS) or IntelliJ IDEA**  
✅ **Lombok Plugin**  

## 📂 Project Structure  
```
ToDoApplication/
│── src/
│   ├── main/java/tech/codefirst
│   │   ├── controller/
│   │   │   ├── MyController.java
│   │   ├── entity/
│   │   │   ├── Task.java
│   │   ├── repository/
│   │   │   ├── TaskRepository.java
│   │   ├── service/
│   │   │   ├── MyService.java
│   │   │   ├── MyServiceImpl.java
│   ├── main/resources/templates/
│   │   ├── tasks.html
│   ├── main/resources/static/
│   │   ├── css/ (Custom Stylesheets)
│── pom.xml
│── application.properties
│── ToDoApplication.java
```

## 📖 How to Run the Project  
### **1️⃣ Setup MySQL Database**  
1. **Open MySQL Workbench**  
2. Run the following SQL query to create the database:
   ```sql
   CREATE DATABASE todo_db;
   ```
3. Configure `application.properties` file:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
   spring.datasource.username=root
   spring.datasource.password=root
   spring.jpa.hibernate.ddl-auto=update
   ```

### **2️⃣ Start the Application**  
- Open **STS (Spring Tool Suite) or IntelliJ**  
- Run `ToDoApplication.java`  

### **3️⃣ Access the Application**  
- Open your **browser** and go to:  
  ```
  http://localhost:8080
  ```
## 🎯 Project Documentation
[📝 To-Do Application   Documentation](https://docs.google.com/document/d/1wmMVqeUevmGvQllkielQAyOU-RdBGg9z4_rYdOXdOw8/edit?usp=sharing)


## 💡 Contributing
If you'd like to contribute:
1. **Fork the repository**
2. **Create a new branch** (`git checkout -b feature-branch`)
3. **Make changes & commit** (`git commit -m "Added new feature"`)
4. **Push changes** (`git push origin feature-branch`)
5. **Submit a Pull Request (PR)**



