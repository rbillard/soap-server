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

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.soap_server.rbillard.fr/">
   <soapenv:Header/>
   <soapenv:Body>
      <ws:create>
         <firstName>Johnny</firstName>
         <lastName>Depp</lastName>
         <birthDate>1963-06-09</birthDate>
      </ws:create>
   </soapenv:Body>
</soapenv:Envelope>

Réponse :
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
   <soap:Body>
      <ns2:createResponse xmlns:ns2="http://ws.soap_server.rbillard.fr/">
         <return>
            <id>3</id>
            <firstName>Johnny</firstName>
            <lastName>Depp</lastName>
            <birthDate>1963-06-09T00:00:00+01:00</birthDate>
         </return>
      </ns2:createResponse>
   </soap:Body>
</soap:Envelope>

##### Update

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.soap_server.rbillard.fr/">
   <soapenv:Header/>
   <soapenv:Body>
      <ws:update>
         <id>1</id>
         <firstName>Johnny</firstName>
         <lastName>Depp</lastName>
         <birthDate>1963-06-09</birthDate>
      </ws:update>
   </soapenv:Body>
</soapenv:Envelope>

Réponse :
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
   <soap:Body>
      <ns2:updateResponse xmlns:ns2="http://ws.soap_server.rbillard.fr/">
         <return>
            <id>1</id>
            <firstName>Johnny</firstName>
            <lastName>Depp</lastName>
            <birthDate>1963-06-09T00:00:00+01:00</birthDate>
         </return>
      </ns2:updateResponse>
   </soap:Body>
</soap:Envelope>

##### findOne

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.soap_server.rbillard.fr/">
   <soapenv:Header/>
   <soapenv:Body>
      <ws:findOne>
         <id>1</id>
      </ws:findOne>
   </soapenv:Body>
</soapenv:Envelope>

Réponse :
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
   <soap:Body>
      <ns2:findOneResponse xmlns:ns2="http://ws.soap_server.rbillard.fr/">
         <return>
            <id>1</id>
            <firstName>Johnny</firstName>
            <lastName>Depp</lastName>
            <birthDate>1963-06-09T00:00:00+01:00</birthDate>
         </return>
      </ns2:findOneResponse>
   </soap:Body>
</soap:Envelope>

##### find

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.soap_server.rbillard.fr/">
   <soapenv:Header/>
   <soapenv:Body>
      <ws:find>
         <firstName>Johnny</firstName>
         <lastName>Depp</lastName>
      </ws:find>
   </soapenv:Body>
</soapenv:Envelope>

Réponse :
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
   <soap:Body>
      <ns2:findResponse xmlns:ns2="http://ws.soap_server.rbillard.fr/">
         <return>
            <id>1</id>
            <firstName>Johnny</firstName>
            <lastName>Depp</lastName>
            <birthDate>1963-06-09T00:00:00+01:00</birthDate>
         </return>
      </ns2:findResponse>
   </soap:Body>
</soap:Envelope>

##### delete

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.soap_server.rbillard.fr/">
   <soapenv:Header/>
   <soapenv:Body>
      <ws:delete>
         <id>1</id>
      </ws:delete>
   </soapenv:Body>
</soapenv:Envelope>

Réponse :
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
   <soap:Body>
      <ns2:deleteResponse xmlns:ns2="http://ws.soap_server.rbillard.fr/"/>
   </soap:Body>
</soap:Envelope>


#### Movie : ADRESSE_DU_SERVEUR/soap-server/services/movie

##### create

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.soap_server.rbillard.fr/">
   <soapenv:Header/>
   <soapenv:Body>
      <ws:create>
         <title>Pirates of the Caribbean</title>
      </ws:create>
   </soapenv:Body>
</soapenv:Envelope>

Réponse:
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
   <soap:Body>
      <ns2:createResponse xmlns:ns2="http://ws.soap_server.rbillard.fr/">
         <return>
            <id>1</id>
            <title>Pirates of the Caribbean</title>
         </return>
      </ns2:createResponse>
   </soap:Body>
</soap:Envelope>

##### update

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.soap_server.rbillard.fr/">
   <soapenv:Header/>
   <soapenv:Body>
      <ws:update>
         <id>1</id>
         <title>Pirates of the Caribbean</title>
      </ws:update>
   </soapenv:Body>
</soapenv:Envelope>

Réponse :
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
   <soap:Body>
      <ns2:updateResponse xmlns:ns2="http://ws.soap_server.rbillard.fr/">
         <return>
            <id>1</id>
            <title>Pirates of the Caribbean</title>
            <roles/>
         </return>
      </ns2:updateResponse>
   </soap:Body>
</soap:Envelope>

##### findOne

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.soap_server.rbillard.fr/">
   <soapenv:Header/>
   <soapenv:Body>
      <ws:findOne>
         <id>1</id>
      </ws:findOne>
   </soapenv:Body>
</soapenv:Envelope>

Réponse :
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
   <soap:Body>
      <ns2:findOneResponse xmlns:ns2="http://ws.soap_server.rbillard.fr/">
         <return>
            <id>1</id>
            <title>Pirates of the Caribbean</title>
            <roles>
               <role>
                  <id>
                     <actor>
                        <id>1</id>
                        <firstName>Johnny</firstName>
                        <lastName>Depp</lastName>
                        <birthDate>1963-06-09T00:00:00+01:00</birthDate>
                     </actor>
                  </id>
                  <firstName>Jack</firstName>
                  <lastName>SPARROW</lastName>
               </role>
               <role>
                  <id>
                     <actor>
                        <id>2</id>
                        <firstName>Orlando</firstName>
                        <lastName>BLOOM</lastName>
                        <birthDate>1977-01-13T00:00:00+01:00</birthDate>
                     </actor>
                  </id>
                  <firstName>Will</firstName>
                  <lastName>TURNER</lastName>
               </role>
            </roles>
         </return>
      </ns2:findOneResponse>
   </soap:Body>
</soap:Envelope>

##### find
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.soap_server.rbillard.fr/">
   <soapenv:Header/>
   <soapenv:Body>
      <ws:find>
         <title>Pirates of the Caribbean</title>
      </ws:find>
   </soapenv:Body>
</soapenv:Envelope>

Réponse :
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
   <soap:Body>
      <ns2:findResponse xmlns:ns2="http://ws.soap_server.rbillard.fr/">
         <return>
            <id>1</id>
            <title>Pirates of the Caribbean</title>
            <roles>
               <role>
                  <id>
                     <actor>
                        <id>1</id>
                        <firstName>Johnny</firstName>
                        <lastName>Depp</lastName>
                        <birthDate>1963-06-09T00:00:00+01:00</birthDate>
                     </actor>
                  </id>
                  <firstName>Jack</firstName>
                  <lastName>SPARROW</lastName>
               </role>
               <role>
                  <id>
                     <actor>
                        <id>2</id>
                        <firstName>Orlando</firstName>
                        <lastName>BLOOM</lastName>
                        <birthDate>1977-01-13T00:00:00+01:00</birthDate>
                     </actor>
                  </id>
                  <firstName>Will</firstName>
                  <lastName>TURNER</lastName>
               </role>
            </roles>
         </return>
      </ns2:findResponse>
   </soap:Body>
</soap:Envelope>

##### delete

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.soap_server.rbillard.fr/">
   <soapenv:Header/>
   <soapenv:Body>
      <ws:delete>
         <id>1</id>
      </ws:delete>
   </soapenv:Body>
</soapenv:Envelope>

Réponse :
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
   <soap:Body>
      <ns2:deleteResponse xmlns:ns2="http://ws.soap_server.rbillard.fr/"/>
   </soap:Body>
</soap:Envelope>


#### Role : ADRESSE_DU_SERVEUR/soap-server/services/role

##### create

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.soap_server.rbillard.fr/">
   <soapenv:Header/>
   <soapenv:Body>
      <ws:create>
         <actorId>1</actorId>
         <movieId>1</movieId>
         <firstName>Jack</firstName>
         <lastName>Sparrow</lastName>
      </ws:create>
   </soapenv:Body>
</soapenv:Envelope>

Réponse :
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
   <soap:Body>
      <ns2:createResponse xmlns:ns2="http://ws.soap_server.rbillard.fr/">
         <return>
            <id>
               <actor>
                  <id>1</id>
                  <firstName>Johnny</firstName>
                  <lastName>Depp</lastName>
                  <birthDate>1963-06-09T00:00:00+01:00</birthDate>
               </actor>
            </id>
            <firstName>Jack</firstName>
            <lastName>Sparrow</lastName>
         </return>
      </ns2:createResponse>
   </soap:Body>
</soap:Envelope>

##### delete

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.soap_server.rbillard.fr/">
   <soapenv:Header/>
   <soapenv:Body>
      <ws:delete>
         <actorId>1</actorId>
         <movieId>1</movieId>
      </ws:delete>
   </soapenv:Body>
</soapenv:Envelope>

Réponse :
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
   <soap:Body>
      <ns2:deleteResponse xmlns:ns2="http://ws.soap_server.rbillard.fr/"/>
   </soap:Body>
</soap:Envelope>