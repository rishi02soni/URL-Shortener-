# 🚀 URL Shortener - Spring Boot

A **scalable URL Shortener backend system** built using **Java, Spring Boot, and JPA**.
This project converts long URLs into short, unique links and redirects users efficiently.


## 🚀 Tech Stack

<p align="center">
  <img src="https://media.giphy.com/media/KAq5w47R9rmTuvWOWa/giphy.gif" width="300"/>
  <img src="https://media.giphy.com/media/f3iwJFOVOwuy7K6FFw/giphy.gif" width="300"/>
</p>

<p align="center">
  <b>Java | Spring Boot</b>
</p>

Inspired by real-world systems like **Bitly**, this project demonstrates **backend system design concepts** used in high-scale applications.

---

## ✨ Features

* 🔗 Shorten long URLs into unique short codes
* 🔁 Redirect short URLs to original links
* ⚡ Base62 Encoding for compact URLs
* 🧠 Persistent storage using JPA (H2 / SQL DB)
* 🏗️ Clean layered architecture (Controller → Service → Repository)
* 🚀 Scalable and production-ready design

---

## 🛠️ Tech Stack

* Java 17+
* Spring Boot
* Spring Data JPA
* H2 Database (can be replaced with MySQL/PostgreSQL)
* Maven

---

## 📁 Project Structure

```id="o92d32"
url-shortener/
│── src/main/java/com/project/urlshortener/
│   ├── controller/
│   │     └── UrlController.java
│   ├── service/
│   │     └── UrlService.java
│   ├── repository/
│   │     └── UrlRepository.java
│   ├── model/
│   │     └── Url.java
│   ├── util/
│   │     └── Base62Encoder.java
│   └── UrlShortenerApplication.java
│
│── src/main/resources/
│   └── application.properties
│
│── pom.xml
│── README.md
```

---

## ⚙️ Installation & Setup

### 1️⃣ Clone Repository

```bash id="x5x1cr"
git clone https://github.com/your-username/url-shortener.git
cd url-shortener
```

---

### 2️⃣ Build Project

```bash id="4bsy8h"
mvn clean install
```

---

### 3️⃣ Run Application

```bash id="n7zvld"
mvn spring-boot:run
```

Server runs on:

```id="5nndw6"
http://localhost:8080
```

---

## 🔗 API Endpoints

### 🔗 Shorten URL

```http id="ewxq2k"
POST /api/url/shorten?url=https://example.com
```

### 📥 Response

```json id="c7zqf3"
"abc123"
```

---

### 🔁 Redirect URL

```http id="38xjwb"
GET /api/url/{shortCode}
```

### 📥 Response

```json id="6d2y5o"
"https://example.com"
```

---

## 🧠 How It Works

1. User sends a long URL
2. System stores it in database
3. Unique ID is generated
4. ID is encoded using **Base62**
5. Short code is returned
6. On request → short code maps back to original URL

---

## 🔢 Base62 Encoding

Base62 uses:

```
a-z + A-Z + 0-9
```

Example:

```
ID: 125 → Short Code: cb
```

---

## 🧪 Testing

Use tools like:

* Postman
* Thunder Client
* Browser (for redirect API)

---

## 🚀 Future Enhancements (SDE-2 Level)

* ⚡ Redis Caching (reduce DB hits)
* 📊 Click Analytics (track usage)
* 🔒 Rate Limiting
* 🌍 Custom domains
* ⏳ Expiry URLs
* 🧩 Distributed ID generation (Snowflake)

---

## 💡 Learning Outcomes

* Backend system design principles
* REST API development with Spring Boot
* Database modeling with JPA
* Encoding algorithms (Base62)
* Layered architecture (MVC pattern)

---

## 📸 Architecture Flow

```
Client → Controller → Service → Repository → Database
```

---

## 🤝 Contributing

Pull requests are welcome. For major changes, open an issue first.

---



## ⭐ Support

If you like this project, give it a ⭐ on GitHub!

---

## 👨‍💻 Author

**Rishi Soni**

---

🔥 *Build scalable systems. Think like an SDE-2.*
