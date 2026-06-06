# ✈️ ms_aeronave

Microserviço responsável pelo gerenciamento de aeronaves, desenvolvido com **Spring Boot 4**, utilizando **Java 21**, persistência com **JPA/Hibernate** e banco de dados **PostgreSQL**.

## Tecnologias Utilizadas

* Java 21
* Spring Boot 4.0.6
* Spring Web MVC
* Spring Data JPA
* PostgreSQL
* Spring Boot DevTools
* SpringDoc OpenAPI (Swagger UI)
* Maven

---

## Pré-requisitos

Antes de executar a aplicação, certifique-se de possuir instalado:

* Java 21 ou superior
* Maven 3.9+
* PostgreSQL

---

## Configuração do Banco de Dados

Crie um banco de dados PostgreSQL para a aplicação.

Exemplo:

```sql
CREATE DATABASE ms_aeronave;
```

Configure as propriedades de conexão no arquivo:

```properties
src/main/resources/application.properties
```

Exemplo:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/ms_aeronave
spring.datasource.username=postgres
spring.datasource.password=senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

---

## Executando a Aplicação

### Utilizando Maven

Execute o comando abaixo na raiz do projeto:

```bash
./mvnw spring-boot:run
```

ou

```bash
mvn spring-boot:run
```

### Gerando o artefato

```bash
./mvnw clean package
```

ou

```bash
mvn clean package
```

Após a geração do artefato:

```bash
java -jar target/ms_aeronave-0.0.1-SNAPSHOT.jar
```

---

## Documentação da API

A documentação interativa da API é disponibilizada através do Swagger UI.

Após iniciar a aplicação, acesse:

### Swagger UI

```
http://localhost:8080/swagger-ui.html
```

ou

```
http://localhost:8080/swagger-ui/index.html
```

### OpenAPI JSON

```
http://localhost:8080/v3/api-docs
```

---

## Estrutura Sugerida do Projeto

```text
ms_aeronave/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── br/com/...
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── pom.xml
└── README.md
```

---

## Dependências Principais

| Dependência                         | Finalidade                       |
| ----------------------------------- | -------------------------------- |
| spring-boot-starter-webmvc          | Desenvolvimento de APIs REST     |
| spring-boot-starter-data-jpa        | Persistência e acesso a dados    |
| postgresql                          | Driver de conexão com PostgreSQL |
| springdoc-openapi-starter-webmvc-ui | Documentação automática da API   |
| spring-boot-devtools                | Facilita o desenvolvimento       |
| starters de teste                   | Testes unitários e de integração |

---

## Testes

Para executar os testes automatizados:

```bash
mvn test
```

---

## Versão

**0.0.1-SNAPSHOT**

---

## Autor

Projeto desenvolvido para gerenciamento de aeronaves utilizando arquitetura baseada em microserviços com Spring Boot.
