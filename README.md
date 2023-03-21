# OAuth-in-Simple-Microservices-Using-Keycloak

This is simple implementation OAuth in microservices using keycloak, in this implementation, gateway is a client, services as resource protected and keycloak as Authorization server.


 user requests to microservice 
 via gateway, the resource service 
 will be protected by keycloak 
 as Authorization server  
    
____
  Gateway
  (client)
 ______
      |     |            =========
      |     |            Keycloak (Authorization server)
      |     _ _ _ _>    ==================
      \/
  ______
      Service
      (protected resource)
  ______
      
      
