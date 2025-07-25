# 📝 User Registration Service

Este é um projeto simples em Java com Spring Boot que simula um serviço de registo de utilizadores.

## 📌 Funcionalidades

- Registo de novos utilizadores com nome, email e password.
- Armazenamento dos utilizadores em memória.
- Simulação de envio de notificação por "email" após registo.
- Leitura de configurações do "servidor de email" via `application.yaml`.
- Suporte à injeção de dependências via interfaces.
- Estrutura modular e facilmente extensível.

## 🧩 Arquitetura

### 🧍 User
Classe que representa o utilizador:
- `id`: Long
- `name`: String
- `email`: String
- `password`: String

### 💾 UserRepository
Interface responsável por guardar utilizadores.
- Implementada em `InMemoryUserRepository`, que usa um `HashMap` com o email como chave.

### 📣 NotificationService
Interface para serviços de notificação.
- Implementada em `EmailNotificationService`, que imprime mensagens no terminal simulando o envio de email.
- As configurações (host e porta) são lidas do `application.yaml`.

### 🛠 UserService
- Regista novos utilizadores.
- Dispara uma notificação de confirmação.
- Garante desacoplamento entre persistência e notificação.

## 🧪 Testes

Na `main`, é feita a criação do `UserService` e o registo de um utilizador, verificando:
- Se o utilizador é guardado corretamente.
- Se a simulação da notificação é enviada.

## ✅ Extra (Bónus)

- Detecção de registos duplicados com base no email.

## 🚀 Como correr o projeto

1. Clona este repo:
   ```bash
   git clone https://github.com/wttjoao/user-registration-service.git
