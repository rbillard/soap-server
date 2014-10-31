# soap-server
=============

Application Java EE utilisant les technologies Web Services SOAP. Elle permet de gérer des acteurs, des films et des rôles.


## Technologies

Spring 4.1.1

CXF 3.0.2

Hibernate 4.3.6

Spring JPA 1.7.0

HSQLDB 2.3.2


## Serveur

Tomcat 8


## Outils

IDE Eclipse STS 3.6.2


## Utilisation
Une fois installée sur un serveur, les WSDl sont accessibles depuis ADRESSE_DU_SERVEUR/soap-server/services.

Il existe 3 services permettant de gérer les acteurs, les films et les rôles.

### Requêtes SOAP

#### Actor : ADRESSE_DU_SERVEUR/soap-server/services/actor

##### Create

&lt;soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.soap_server.rbillard.fr/"&gt;
   &lt;soapenv:Header/&gt;
   &lt;soapenv:Body&gt;
      &lt;ws:create&gt;
         &lt;firstName&gt;Johnny&lt;/firstName&gt;
         &lt;lastName&gt;Depp&lt;/lastName&gt;
         &lt;birthDate&gt;1963-06-09&lt;/birthDate&gt;
      &lt;/ws:create&gt;
   &lt;/soapenv:Body&gt;
&lt;/soapenv:Envelope&gt;

Réponse :
&lt;soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"&gt;
   &lt;soap:Body&gt;
      &lt;ns2:createResponse xmlns:ns2="http://ws.soap_server.rbillard.fr/"&gt;
         &lt;return&gt;
            &lt;id&gt;3&lt;/id&gt;
            &lt;firstName&gt;Johnny&lt;/firstName&gt;
            &lt;lastName&gt;Depp&lt;/lastName&gt;
            &lt;birthDate&gt;1963-06-09T00:00:00+01:00&lt;/birthDate&gt;
         &lt;/return&gt;
      &lt;/ns2:createResponse&gt;
   &lt;/soap:Body&gt;
&lt;/soap:Envelope&gt;

##### Update

&lt;soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.soap_server.rbillard.fr/"&gt;
   &lt;soapenv:Header/&gt;
   &lt;soapenv:Body&gt;
      &lt;ws:update&gt;
         &lt;id&gt;1&lt;/id&gt;
         &lt;firstName&gt;Johnny&lt;/firstName&gt;
         &lt;lastName&gt;Depp&lt;/lastName&gt;
         &lt;birthDate&gt;1963-06-09&lt;/birthDate&gt;
      &lt;/ws:update&gt;
   &lt;/soapenv:Body&gt;
&lt;/soapenv:Envelope&gt;

Réponse :
&lt;soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"&gt;
   &lt;soap:Body&gt;
      &lt;ns2:updateResponse xmlns:ns2="http://ws.soap_server.rbillard.fr/"&gt;
         &lt;return&gt;
            &lt;id&gt;1&lt;/id&gt;
            &lt;firstName&gt;Johnny&lt;/firstName&gt;
            &lt;lastName&gt;Depp&lt;/lastName&gt;
            &lt;birthDate&gt;1963-06-09T00:00:00+01:00&lt;/birthDate&gt;
         &lt;/return&gt;
      &lt;/ns2:updateResponse&gt;
   &lt;/soap:Body&gt;
&lt;/soap:Envelope&gt;

##### findOne

&lt;soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.soap_server.rbillard.fr/"&gt;
   &lt;soapenv:Header/&gt;
   &lt;soapenv:Body&gt;
      &lt;ws:findOne&gt;
         &lt;id&gt;1&lt;/id&gt;
      &lt;/ws:findOne&gt;
   &lt;/soapenv:Body&gt;
&lt;/soapenv:Envelope&gt;

Réponse :
&lt;soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"&gt;
   &lt;soap:Body&gt;
      &lt;ns2:findOneResponse xmlns:ns2="http://ws.soap_server.rbillard.fr/"&gt;
         &lt;return&gt;
            &lt;id&gt;1&lt;/id&gt;
            &lt;firstName&gt;Johnny&lt;/firstName&gt;
            &lt;lastName&gt;Depp&lt;/lastName&gt;
            &lt;birthDate&gt;1963-06-09T00:00:00+01:00&lt;/birthDate&gt;
         &lt;/return&gt;
      &lt;/ns2:findOneResponse&gt;
   &lt;/soap:Body&gt;
&lt;/soap:Envelope&gt;

##### find

&lt;soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.soap_server.rbillard.fr/"&gt;
   &lt;soapenv:Header/&gt;
   &lt;soapenv:Body&gt;
      &lt;ws:find&gt;
         &lt;firstName&gt;Johnny&lt;/firstName&gt;
         &lt;lastName&gt;Depp&lt;/lastName&gt;
      &lt;/ws:find&gt;
   &lt;/soapenv:Body&gt;
&lt;/soapenv:Envelope&gt;

Réponse :
&lt;soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"&gt;
   &lt;soap:Body&gt;
      &lt;ns2:findResponse xmlns:ns2="http://ws.soap_server.rbillard.fr/"&gt;
         &lt;return&gt;
            &lt;id&gt;1&lt;/id&gt;
            &lt;firstName&gt;Johnny&lt;/firstName&gt;
            &lt;lastName&gt;Depp&lt;/lastName&gt;
            &lt;birthDate&gt;1963-06-09T00:00:00+01:00&lt;/birthDate&gt;
         &lt;/return&gt;
      &lt;/ns2:findResponse&gt;
   &lt;/soap:Body&gt;
&lt;/soap:Envelope&gt;

##### findAll

&lt;soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.soap_server.rbillard.fr/"&gt;
   &lt;soapenv:Header/&gt;
   &lt;soapenv:Body&gt;
      &lt;ws:findAll/&gt;
   &lt;/soapenv:Body&gt;
&lt;/soapenv:Envelope&gt;

Réponse:
&lt;soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"&gt;
   &lt;soap:Body&gt;
      &lt;ns2:findAllResponse xmlns:ns2="http://ws.soap_server.rbillard.fr/"&gt;
         &lt;return&gt;
            &lt;id&gt;1&lt;/id&gt;
            &lt;firstName&gt;Johnny&lt;/firstName&gt;
            &lt;lastName&gt;DEPP&lt;/lastName&gt;
            &lt;birthDate&gt;1963-06-09T00:00:00+01:00&lt;/birthDate&gt;
         &lt;/return&gt;
         &lt;return&gt;
            &lt;id&gt;2&lt;/id&gt;
            &lt;firstName&gt;Orlando&lt;/firstName&gt;
            &lt;lastName&gt;BLOOM&lt;/lastName&gt;
            &lt;birthDate&gt;1977-01-13T00:00:00+01:00&lt;/birthDate&gt;
         &lt;/return&gt;
      &lt;/ns2:findAllResponse&gt;
   &lt;/soap:Body&gt;
&lt;/soap:Envelope&gt;

##### delete

&lt;soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.soap_server.rbillard.fr/"&gt;
   &lt;soapenv:Header/&gt;
   &lt;soapenv:Body&gt;
      &lt;ws:delete&gt;
         &lt;id&gt;1&lt;/id&gt;
      &lt;/ws:delete&gt;
   &lt;/soapenv:Body&gt;
&lt;/soapenv:Envelope&gt;

Réponse :
&lt;soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"&gt;
   &lt;soap:Body&gt;
      &lt;ns2:deleteResponse xmlns:ns2="http://ws.soap_server.rbillard.fr/"/&gt;
   &lt;/soap:Body&gt;
&lt;/soap:Envelope&gt;


#### Movie : ADRESSE_DU_SERVEUR/soap-server/services/movie

##### create

&lt;soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.soap_server.rbillard.fr/"&gt;
   &lt;soapenv:Header/&gt;
   &lt;soapenv:Body&gt;
      &lt;ws:create&gt;
         &lt;title&gt;Pirates of the Caribbean&lt;/title&gt;
      &lt;/ws:create&gt;
   &lt;/soapenv:Body&gt;
&lt;/soapenv:Envelope&gt;

Réponse:
&lt;soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"&gt;
   &lt;soap:Body&gt;
      &lt;ns2:createResponse xmlns:ns2="http://ws.soap_server.rbillard.fr/"&gt;
         &lt;return&gt;
            &lt;id&gt;1&lt;/id&gt;
            &lt;title&gt;Pirates of the Caribbean&lt;/title&gt;
         &lt;/return&gt;
      &lt;/ns2:createResponse&gt;
   &lt;/soap:Body&gt;
&lt;/soap:Envelope&gt;

##### update

&lt;soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.soap_server.rbillard.fr/"&gt;
   &lt;soapenv:Header/&gt;
   &lt;soapenv:Body&gt;
      &lt;ws:update&gt;
         &lt;id&gt;1&lt;/id&gt;
         &lt;title&gt;Pirates of the Caribbean&lt;/title&gt;
      &lt;/ws:update&gt;
   &lt;/soapenv:Body&gt;
&lt;/soapenv:Envelope&gt;

Réponse :
&lt;soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"&gt;
   &lt;soap:Body&gt;
      &lt;ns2:updateResponse xmlns:ns2="http://ws.soap_server.rbillard.fr/"&gt;
         &lt;return&gt;
            &lt;id&gt;1&lt;/id&gt;
            &lt;title&gt;Pirates of the Caribbean&lt;/title&gt;
            &lt;roles/&gt;
         &lt;/return&gt;
      &lt;/ns2:updateResponse&gt;
   &lt;/soap:Body&gt;
&lt;/soap:Envelope&gt;

##### findOne

&lt;soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.soap_server.rbillard.fr/"&gt;
   &lt;soapenv:Header/&gt;
   &lt;soapenv:Body&gt;
      &lt;ws:findOne&gt;
         &lt;id&gt;1&lt;/id&gt;
      &lt;/ws:findOne&gt;
   &lt;/soapenv:Body&gt;
&lt;/soapenv:Envelope&gt;

Réponse :
&lt;soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"&gt;
   &lt;soap:Body&gt;
      &lt;ns2:findOneResponse xmlns:ns2="http://ws.soap_server.rbillard.fr/"&gt;
         &lt;return&gt;
            &lt;id&gt;1&lt;/id&gt;
            &lt;title&gt;Pirates of the Caribbean&lt;/title&gt;
            &lt;roles&gt;
               &lt;role&gt;
                  &lt;id&gt;
                     &lt;actor&gt;
                        &lt;id&gt;1&lt;/id&gt;
                        &lt;firstName&gt;Johnny&lt;/firstName&gt;
                        &lt;lastName&gt;Depp&lt;/lastName&gt;
                        &lt;birthDate&gt;1963-06-09T00:00:00+01:00&lt;/birthDate&gt;
                     &lt;/actor&gt;
                  &lt;/id&gt;
                  &lt;firstName&gt;Jack&lt;/firstName&gt;
                  &lt;lastName&gt;SPARROW&lt;/lastName&gt;
               &lt;/role&gt;
               &lt;role&gt;
                  &lt;id&gt;
                     &lt;actor&gt;
                        &lt;id&gt;2&lt;/id&gt;
                        &lt;firstName&gt;Orlando&lt;/firstName&gt;
                        &lt;lastName&gt;BLOOM&lt;/lastName&gt;
                        &lt;birthDate&gt;1977-01-13T00:00:00+01:00&lt;/birthDate&gt;
                     &lt;/actor&gt;
                  &lt;/id&gt;
                  &lt;firstName&gt;Will&lt;/firstName&gt;
                  &lt;lastName&gt;TURNER&lt;/lastName&gt;
               &lt;/role&gt;
            &lt;/roles&gt;
         &lt;/return&gt;
      &lt;/ns2:findOneResponse&gt;
   &lt;/soap:Body&gt;
&lt;/soap:Envelope&gt;

##### find
&lt;soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.soap_server.rbillard.fr/"&gt;
   &lt;soapenv:Header/&gt;
   &lt;soapenv:Body&gt;
      &lt;ws:find&gt;
         &lt;title&gt;Pirates of the Caribbean&lt;/title&gt;
      &lt;/ws:find&gt;
   &lt;/soapenv:Body&gt;
&lt;/soapenv:Envelope&gt;

Réponse :
&lt;soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"&gt;
   &lt;soap:Body&gt;
      &lt;ns2:findResponse xmlns:ns2="http://ws.soap_server.rbillard.fr/"&gt;
         &lt;return&gt;
            &lt;id&gt;1&lt;/id&gt;
            &lt;title&gt;Pirates of the Caribbean&lt;/title&gt;
            &lt;roles&gt;
               &lt;role&gt;
                  &lt;id&gt;
                     &lt;actor&gt;
                        &lt;id&gt;1&lt;/id&gt;
                        &lt;firstName&gt;Johnny&lt;/firstName&gt;
                        &lt;lastName&gt;Depp&lt;/lastName&gt;
                        &lt;birthDate&gt;1963-06-09T00:00:00+01:00&lt;/birthDate&gt;
                     &lt;/actor&gt;
                  &lt;/id&gt;
                  &lt;firstName&gt;Jack&lt;/firstName&gt;
                  &lt;lastName&gt;SPARROW&lt;/lastName&gt;
               &lt;/role&gt;
               &lt;role&gt;
                  &lt;id&gt;
                     &lt;actor&gt;
                        &lt;id&gt;2&lt;/id&gt;
                        &lt;firstName&gt;Orlando&lt;/firstName&gt;
                        &lt;lastName&gt;BLOOM&lt;/lastName&gt;
                        &lt;birthDate&gt;1977-01-13T00:00:00+01:00&lt;/birthDate&gt;
                     &lt;/actor&gt;
                  &lt;/id&gt;
                  &lt;firstName&gt;Will&lt;/firstName&gt;
                  &lt;lastName&gt;TURNER&lt;/lastName&gt;
               &lt;/role&gt;
            &lt;/roles&gt;
         &lt;/return&gt;
      &lt;/ns2:findResponse&gt;
   &lt;/soap:Body&gt;
&lt;/soap:Envelope&gt;

#### findAll

&lt;soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.soap_server.rbillard.fr/"&gt;
   &lt;soapenv:Header/&gt;
   &lt;soapenv:Body&gt;
      &lt;ws:findAll/&gt;
   &lt;/soapenv:Body&gt;
&lt;/soapenv:Envelope&gt;

Réponse :
&lt;soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"&gt;
   &lt;soap:Body&gt;
      &lt;ns2:findAllResponse xmlns:ns2="http://ws.soap_server.rbillard.fr/"&gt;
         &lt;return&gt;
            &lt;id&gt;1&lt;/id&gt;
            &lt;title&gt;Pirates of the Caribbean&lt;/title&gt;
            &lt;roles&gt;
               &lt;role&gt;
                  &lt;id&gt;
                     &lt;actor&gt;
                        &lt;id&gt;1&lt;/id&gt;
                        &lt;firstName&gt;Johnny&lt;/firstName&gt;
                        &lt;lastName&gt;DEPP&lt;/lastName&gt;
                        &lt;birthDate&gt;1963-06-09T00:00:00+01:00&lt;/birthDate&gt;
                     &lt;/actor&gt;
                  &lt;/id&gt;
                  &lt;firstName&gt;Jack&lt;/firstName&gt;
                  &lt;lastName&gt;SPARROW&lt;/lastName&gt;
               &lt;/role&gt;
               &lt;role&gt;
                  &lt;id&gt;
                     &lt;actor&gt;
                        &lt;id&gt;2&lt;/id&gt;
                        &lt;firstName&gt;Orlando&lt;/firstName&gt;
                        &lt;lastName&gt;BLOOM&lt;/lastName&gt;
                        &lt;birthDate&gt;1977-01-13T00:00:00+01:00&lt;/birthDate&gt;
                     &lt;/actor&gt;
                  &lt;/id&gt;
                  &lt;firstName&gt;Will&lt;/firstName&gt;
                  &lt;lastName&gt;TURNER&lt;/lastName&gt;
               &lt;/role&gt;
            &lt;/roles&gt;
         &lt;/return&gt;
      &lt;/ns2:findAllResponse&gt;
   &lt;/soap:Body&gt;
&lt;/soap:Envelope&gt;

##### delete

&lt;soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.soap_server.rbillard.fr/"&gt;
   &lt;soapenv:Header/&gt;
   &lt;soapenv:Body&gt;
      &lt;ws:delete&gt;
         &lt;id&gt;1&lt;/id&gt;
      &lt;/ws:delete&gt;
   &lt;/soapenv:Body&gt;
&lt;/soapenv:Envelope&gt;

Réponse :
&lt;soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"&gt;
   &lt;soap:Body&gt;
      &lt;ns2:deleteResponse xmlns:ns2="http://ws.soap_server.rbillard.fr/"/&gt;
   &lt;/soap:Body&gt;
&lt;/soap:Envelope&gt;


#### Role : ADRESSE_DU_SERVEUR/soap-server/services/role

##### create

&lt;soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.soap_server.rbillard.fr/"&gt;
   &lt;soapenv:Header/&gt;
   &lt;soapenv:Body&gt;
      &lt;ws:create&gt;
         &lt;actorId&gt;1&lt;/actorId&gt;
         &lt;movieId&gt;1&lt;/movieId&gt;
         &lt;firstName&gt;Jack&lt;/firstName&gt;
         &lt;lastName&gt;Sparrow&lt;/lastName&gt;
      &lt;/ws:create&gt;
   &lt;/soapenv:Body&gt;
&lt;/soapenv:Envelope&gt;

Réponse :
&lt;soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"&gt;
   &lt;soap:Body&gt;
      &lt;ns2:createResponse xmlns:ns2="http://ws.soap_server.rbillard.fr/"&gt;
         &lt;return&gt;
            &lt;id&gt;
               &lt;actor&gt;
                  &lt;id&gt;1&lt;/id&gt;
                  &lt;firstName&gt;Johnny&lt;/firstName&gt;
                  &lt;lastName&gt;Depp&lt;/lastName&gt;
                  &lt;birthDate&gt;1963-06-09T00:00:00+01:00&lt;/birthDate&gt;
               &lt;/actor&gt;
            &lt;/id&gt;
            &lt;firstName&gt;Jack&lt;/firstName&gt;
            &lt;lastName&gt;Sparrow&lt;/lastName&gt;
         &lt;/return&gt;
      &lt;/ns2:createResponse&gt;
   &lt;/soap:Body&gt;
&lt;/soap:Envelope&gt;

##### delete

&lt;soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.soap_server.rbillard.fr/"&gt;
   &lt;soapenv:Header/&gt;
   &lt;soapenv:Body&gt;
      &lt;ws:delete&gt;
         &lt;actorId&gt;1&lt;/actorId&gt;
         &lt;movieId&gt;1&lt;/movieId&gt;
      &lt;/ws:delete&gt;
   &lt;/soapenv:Body&gt;
&lt;/soapenv:Envelope&gt;

Réponse :
&lt;soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"&gt;
   &lt;soap:Body&gt;
      &lt;ns2:deleteResponse xmlns:ns2="http://ws.soap_server.rbillard.fr/"/&gt;
   &lt;/soap:Body&gt;
&lt;/soap:Envelope&gt;