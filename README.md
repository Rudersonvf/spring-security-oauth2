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

[<img src="https://run.pstmn.io/button.svg" alt="Run In Postman" style="width: 128px; height: 32px;">](https://god.gw.postman.com/run-collection/32793447-968ecfbe-11cc-421e-9266-0626e6aa411f?action=collection%2Ffork&source=rip_markdown&collection-url=entityId%3D32793447-968ecfbe-11cc-421e-9266-0626e6aa411f%26entityType%3Dcollection%26workspaceId%3Dec03cabd-7017-4e1e-9732-ede9cc8e46b8)

## Autor

Ruderson Florentino

https://www.linkedin.com/in/rudersonvf

# Licence
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/devsuperior/sds1-wmazoni/blob/master/LICENSE) 

