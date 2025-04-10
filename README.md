# 🧱 Monolith Clean Architecture Base (Spring Boot)

> A reusable base project using **Clean Architecture** in a **monolith** setup with Spring Boot, JPA, MapStruct, and Security.

---

## 📚 Kiến trúc tổng quan

Dự án được tổ chức theo nguyên lý **Clean Architecture** để đảm bảo:
- Separation of concerns rõ ràng.
- Dễ mở rộng và maintain.
- Dễ test từng phần (domain, use case, adapter).
- Tái sử dụng và thay thế dễ dàng (infrastructure, repo, mapper...).

---

## 🗂️ Cấu trúc thư mục
```
📦 src
└── 📂 main
    ├── 📂 java
    │   └── 📂 com.example.project
    │       ├── 📂 common
    │       │   ├── 📂 base              # Lớp cơ sở (BaseEntity, BaseResponse, v.v.)
    │       │   ├── 📂 exception         # Xử lý lỗi toàn cục
    │       │   └── 📂 util              # Tiện ích dùng chung
    │       │
    │       ├── 📂 config
    │       │   ├── SecurityConfig.java
    │       │   ├── SwaggerConfig.java
    │       │   └── MapperConfig.java
    │       │
    │       ├── 📂 user                  # Module quản lý người dùng
    │       │   ├── 📂 domain
    │       │   │   ├── 📂 model         # Thực thể miền (User, Role, ...)
    │       │   │   └── 📂 port          # Interface repo, notifier,...
    │       │   │
    │       │   ├── 📂 usecase
    │       │   │   └── RegisterUserUseCaseImpl.java
    │       │   │
    │       │   ├── 📂 adapter
    │       │   │   ├── 📂 web
    │       │   │   │   ├── UserController.java
    │       │   │   │   └── 📂 dto
    │       │   │   │       ├── RegisterRequest.java
    │       │   │   │       └── UserResponse.java
    │       │   │   │
    │       │   │   ├── 📂 persistence
    │       │   │   │   ├── UserEntity.java
    │       │   │   │   ├── JpaUserRepository.java
    │       │   │   │   └── UserRepositoryImpl.java
    │       │   │   │
    │       │   │   └── 📂 mapper
    │       │   │       └── UserMapper.java
    │       │   │
    │       │   └── 📂 config             # Cấu hình riêng của module (nếu có)
    │       │
    │       └── 📂 booking                # Module đặt sân bóng (tương tự user)
    │
    └── 📂 resources
        ├── application.yml
        └── ... (các file cấu hình khác)
```

---

## ⚙️ Công nghệ sử dụng

- ✅ Spring Boot 3.x
- ✅ Spring Security + JWT
- ✅ Spring Data JPA
- ✅ MapStruct
- ✅ Swagger UI (OpenAPI)
- ✅ PostgreSQL / MySQL (tuỳ cấu hình)
- ✅ Global Exception Handler
- ✅ Clean Architecture đúng chuẩn

---

## 🚀 Cách chạy project

```bash
# clone project
git clone https://github.com/giangtx03/base-project.git
cd base-project

# chỉnh sửa application.yml nếu cần
# khởi chạy bằng IntelliJ / VS Code hoặc:
./mvnw spring-boot:run
