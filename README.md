# Project Spring with Security and Oauth2

This is a project template using Java and Spring Boot, configured with Spring Security and OAuth2.
The project includes an Authorization Server for token generation 
and a Resource Server for authentication and authorization of requests,
with token validation at the route level. The project uses the H2 database for data storage.

## Requirements

- JDK 21
- Spring 3.3.0
- Maven 3.8+

## Project Structure

1. **config**: Responsible for managing authentication and token issuance.

2. **controllers**: Contains application controllers responsible for handling HTTP requests and returning appropriate responses.

3. **entities**: Domain entities representing objects persisted in the database.

4. **projections**: Projections used to efficiently transfer data for specific operations.

5. **repositories**: Data repositories responsible for interacting with the database or other data sources.

6. **services**: Application services containing business logic and coordinating interaction between controllers, repositories, and other layers.

## Project Setup

1. **Clone the repository:**

    ```bash
    git clone https://github.com/Rudersonvf/spring-security-oauth2.git
    cd seu-repositorio
    ```

2. **Import the project into your IDE:**

   - For IntelliJ IDEA: `File -> Open -> Select the project folder`.
   - For Eclipse: `File -> Import -> Existing Maven Projects -> Select the project folder`.


3. **Start the project:**

   - Run the project according to your IDE.

## Postman Setup

1. **Endpoints:**
   
   - [ Post ] Login: /oauth2/token
   - [ Get ] Admin request: /test/admin
   - [ Get ] User request: /test/user
   - [ Get ] Free request: /test/free


2. **Globals:**
   
   - host: http://localhost:8080
   - client-id: myclientid
   - client-secret: myclientsecret
   - token: ""


**Fork collection in Postman:**

[<img src="https://run.pstmn.io/button.svg" alt="Run In Postman" style="width: 128px; height: 32px;">](https://app.getpostman.com/run-collection/32793447-98e73983-28af-4a43-b237-c7b3fd564257?action=collection%2Ffork&source=rip_markdown&collection-url=entityId%3D32793447-98e73983-28af-4a43-b237-c7b3fd564257%26entityType%3Dcollection%26workspaceId%3Dec03cabd-7017-4e1e-9732-ede9cc8e46b8#?env%5BTest%20oauth2%20security%5D=W3sia2V5IjoiaG9zdCIsInZhbHVlIjoibG9jYWxob3N0OjgwODAiLCJlbmFibGVkIjp0cnVlLCJ0eXBlIjoiZGVmYXVsdCIsInNlc3Npb25WYWx1ZSI6ImxvY2FsaG9zdDo4MDgwIiwic2Vzc2lvbkluZGV4IjowfSx7ImtleSI6ImNsaWVudC1pZCIsInZhbHVlIjoibXljbGllbnRpZCIsImVuYWJsZWQiOnRydWUsInR5cGUiOiJkZWZhdWx0Iiwic2Vzc2lvblZhbHVlIjoibXljbGllbnRpZCIsInNlc3Npb25JbmRleCI6MX0seyJrZXkiOiJjbGllbnQtc2VjcmV0IiwidmFsdWUiOiJteWNsaWVudHNlY3JldCIsImVuYWJsZWQiOnRydWUsInR5cGUiOiJkZWZhdWx0Iiwic2Vzc2lvblZhbHVlIjoibXljbGllbnRzZWNyZXQiLCJzZXNzaW9uSW5kZXgiOjJ9LHsia2V5IjoicGFzc3dvcmQiLCJ2YWx1ZSI6IjEyMzQ1NiIsImVuYWJsZWQiOnRydWUsInR5cGUiOiJkZWZhdWx0Iiwic2Vzc2lvblZhbHVlIjoiMTIzNDU2Iiwic2Vzc2lvbkluZGV4IjozfSx7ImtleSI6InVzZXIiLCJ2YWx1ZSI6Im1hcmlhQGdtYWlsLmNvbSIsImVuYWJsZWQiOnRydWUsInR5cGUiOiJkZWZhdWx0Iiwic2Vzc2lvblZhbHVlIjoibWFyaWFAZ21haWwuY29tIiwic2Vzc2lvbkluZGV4Ijo0fSx7ImtleSI6ImFkbWluIiwidmFsdWUiOiJqb2huQGdtYWlsLmNvbSIsImVuYWJsZWQiOnRydWUsInR5cGUiOiJkZWZhdWx0Iiwic2Vzc2lvblZhbHVlIjoiam9obkBnbWFpbC5jb20iLCJzZXNzaW9uSW5kZXgiOjV9LHsia2V5IjoidG9rZW4iLCJ2YWx1ZSI6IiIsImVuYWJsZWQiOnRydWUsInR5cGUiOiJkZWZhdWx0Iiwic2Vzc2lvblZhbHVlIjoiIiwic2Vzc2lvbkluZGV4Ijo2fV0=)

## Autor

Ruderson Florentino

https://www.linkedin.com/in/rudersonvf

# Licence
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/devsuperior/sds1-wmazoni/blob/master/LICENSE) 

