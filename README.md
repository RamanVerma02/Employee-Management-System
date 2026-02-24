# Employee Management System 🧑‍💼💻

A **Java Swing + JDBC based Employee Management System** that allows organizations to manage employee records efficiently through a graphical user interface.

---

## 🚀 Features

- 🔐 Login System
- ➕ Add New Employee
- ✏️ Update Employee Details
- ❌ Remove Employee
- 👁️ View Employee Information
- 🏠 Home Dashboard
- 💾 Database connectivity using JDBC
- 🎨 Simple and user-friendly Swing UI

---

## 🛠️ Technologies Used

- **Java (Core Java)**
- **Java Swing** – for GUI
- **JDBC** – for database connectivity
- **MySQL** – as backend database
- **Git & GitHub** – version control

---

## 📂 Project Structure

```
Employee-Management-System
│
├── src
│   └── employee
│       └── management
│           └── system
│               ├── AddEmployee.java
│               ├── RemoveEmployee.java
│               ├── UpdateEmployee.java
│               ├── ViewEmployee.java
│               ├── Login.java
│               ├── Home.java
│               ├── Splash.java
│               └── Conn.java
│
├── icons
│
├── .gitignore
└── README.md
```


---
## 📸 Project Screenshots

### 🔹 Splash / First Screen
![First Screen](images/first_Screen.png)

### 🔹 Login Screen
![Login](images/Login.png)

### 🔹 Dashboard
![Dashboard](images/Adsboard.png)

### 🔹 Add Employee
![Add Employee](images/Add_Employee.png)

### 🔹 View Employee
![View Employee](images/View_Employee.png)

### 🔹 Search Employee by ID
![Search Employee](images/Search_by_employee_id.png)

### 🔹 Update Employee Details
![Update Employee](images/Update_employee_details.png)

### 🔹 Remove Employee
![Remove Employee](images/Remove_employee_by_id.png)


## 🧩 Database Configuration

Update database credentials inside **Conn.java**:

```java
String url = "jdbc:mysql://localhost:3306/employeemanagement";
String username = "root";
String password = "your_password";



