# soap-server
=============

Application Java EE utilisant les technologies Web Services SOAP. Elle permet de gérer des acteurs, des films et des rôles.


## Technologies

Spring 4.1.1

CXF 3.0.2

Dozer 5.5.1

Hibernate 4.3.6

Spring JPA 1.7.0

HSQLDB 2.3.2


## Serveur

Tomcat 8


## Outils

IDE Eclipse STS 3.6.2


## Utilisation
Une fois installée sur un serveur, le WSDl est accessible depuis ADRESSE_DU_SERVEUR/soap-server/services.
Les requêtes sont envoyées à l'adresse : ADRESSE_DU_SERVEUR/soap-server/services/cinema.

Il existe 1 service permettant de gérer les acteurs, les films et les rôles.

### Requêtes SOAP

#### Actor

##### Create

&lt;soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.soap_server.rbillard.fr/"&gt;\n
   \t&lt;soapenv:Header/&gt;
   &lt;soapenv:Body&gt;
      &lt;ws:createActor&gt;
         &lt;firstName&gt;Johnny&lt;/firstName&gt;
         &lt;lastName&gt;DEPP&lt;/lastName&gt;
         &lt;birthDate&gt;1963-06-09&lt;/birthDate&gt;
      &lt;/ws:createActor&gt;
   &lt;/soapenv:Body&gt;
&lt;/soapenv:Envelope&gt;

Réponse :

&lt;soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"&gt;
   &lt;soap:Body&gt;
      &lt;ns2:createActorResponse xmlns:ns2="http://ws.soap_server.rbillard.fr/"&gt;
         &lt;return&gt;
            &lt;id&gt;1&lt;/id&gt;
            &lt;firstName&gt;Johnny&lt;/firstName&gt;
            &lt;lastName&gt;DEPP&lt;/lastName&gt;
            &lt;birthDate&gt;1963-06-09T00:00:00+01:00&lt;/birthDate&gt;
         &lt;/return&gt;
      &lt;/ns2:createActorResponse&gt;
   &lt;/soap:Body&gt;
&lt;/soap:Envelope&gt;

##### Update

&lt;soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.soap_server.rbillard.fr/"&gt;
   &lt;soapenv:Header/&gt;
   &lt;soapenv:Body&gt;
      &lt;ws:updateActor&gt;
         &lt;id&gt;1&lt;/id&gt;
         &lt;firstName&gt;Johnny&lt;/firstName&gt;
         &lt;lastName&gt;DEPP&lt;/lastName&gt;
         &lt;birthDate&gt;1963-06-09&lt;/birthDate&gt;
      &lt;/ws:updateActor&gt;
   &lt;/soapenv:Body&gt;
&lt;/soapenv:Envelope&gt;

Réponse :

&lt;soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"&gt;
   &lt;soap:Body&gt;
      &lt;ns2:updateActorResponse xmlns:ns2="http://ws.soap_server.rbillard.fr/"&gt;
         &lt;return&gt;
            &lt;id&gt;1&lt;/id&gt;
            &lt;firstName&gt;Johnny&lt;/firstName&gt;
            &lt;lastName&gt;DEPP&lt;/lastName&gt;
            &lt;birthDate&gt;1963-06-09T00:00:00+01:00&lt;/birthDate&gt;
         &lt;/return&gt;
      &lt;/ns2:updateActorResponse&gt;
   &lt;/soap:Body&gt;
&lt;/soap:Envelope&gt;

##### findOne

&lt;soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.soap_server.rbillard.fr/"&gt;
   &lt;soapenv:Header/&gt;
   &lt;soapenv:Body&gt;
      &lt;ws:findOneActor&gt;
         &lt;id&gt;1&lt;/id&gt;
      &lt;/ws:findOneActor&gt;
   &lt;/soapenv:Body&gt;
&lt;/soapenv:Envelope&gt;

Réponse :

&lt;soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"&gt;
   &lt;soap:Body&gt;
      &lt;ns2:findOneActorResponse xmlns:ns2="http://ws.soap_server.rbillard.fr/"&gt;
         &lt;return&gt;
            &lt;id&gt;1&lt;/id&gt;
            &lt;firstName&gt;Johnny&lt;/firstName&gt;
            &lt;lastName&gt;DEPP&lt;/lastName&gt;
            &lt;birthDate&gt;1963-06-09T00:00:00+01:00&lt;/birthDate&gt;
            &lt;roles&gt;
               &lt;roles&gt;
                  &lt;firstName&gt;Jack&lt;/firstName&gt;
                  &lt;lastName&gt;SPARROW&lt;/lastName&gt;
                  &lt;movie&gt;
                     &lt;id&gt;1&lt;/id&gt;
                     &lt;title&gt;Pirates of the Caribbean&lt;/title&gt;
                  &lt;/movie&gt;
               &lt;/roles&gt;
            &lt;/roles&gt;
         &lt;/return&gt;
      &lt;/ns2:findOneActorResponse&gt;
   &lt;/soap:Body&gt;
&lt;/soap:Envelope&gt;

##### find

&lt;soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.soap_server.rbillard.fr/"&gt;
   &lt;soapenv:Header/&gt;
   &lt;soapenv:Body&gt;
      &lt;ws:findActors&gt;
         &lt;firstName&gt;Johnny&lt;/firstName&gt;
         &lt;lastName&gt;DEPP&lt;/lastName&gt;
      &lt;/ws:findActors&gt;
   &lt;/soapenv:Body&gt;
&lt;/soapenv:Envelope&gt;

Réponse :

&lt;soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"&gt;
   &lt;soap:Body&gt;
      &lt;ns2:findActorsResponse xmlns:ns2="http://ws.soap_server.rbillard.fr/"&gt;
         &lt;return&gt;
            &lt;id&gt;1&lt;/id&gt;
            &lt;firstName&gt;Johnny&lt;/firstName&gt;
            &lt;lastName&gt;DEPP&lt;/lastName&gt;
            &lt;birthDate&gt;1963-06-09T00:00:00+01:00&lt;/birthDate&gt;
         &lt;/return&gt;
      &lt;/ns2:findActorsResponse&gt;
   &lt;/soap:Body&gt;
&lt;/soap:Envelope&gt;

##### findAll

&lt;soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.soap_server.rbillard.fr/"&gt;
   &lt;soapenv:Header/&gt;
   &lt;soapenv:Body&gt;
      &lt;ws:findAllActors/&gt;
   &lt;/soapenv:Body&gt;
&lt;/soapenv:Envelope&gt;

Réponse:

&lt;soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"&gt;
   &lt;soap:Body&gt;
      &lt;ns2:findAllActorsResponse xmlns:ns2="http://ws.soap_server.rbillard.fr/"&gt;
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
      &lt;/ns2:findAllActorsResponse&gt;
   &lt;/soap:Body&gt;
&lt;/soap:Envelope&gt;

##### delete

&lt;soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.soap_server.rbillard.fr/"&gt;
   &lt;soapenv:Header/&gt;
   &lt;soapenv:Body&gt;
      &lt;ws:deleteActor&gt;
         &lt;id&gt;1&lt;/id&gt;
      &lt;/ws:deleteActor&gt;
   &lt;/soapenv:Body&gt;
&lt;/soapenv:Envelope&gt;

Réponse :

&lt;soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"&gt;
   &lt;soap:Body&gt;
      &lt;ns2:deleteActorResponse xmlns:ns2="http://ws.soap_server.rbillard.fr/"/&gt;
   &lt;/soap:Body&gt;
&lt;/soap:Envelope&gt;


#### Movie

##### create

&lt;soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.soap_server.rbillard.fr/"&gt;
   &lt;soapenv:Header/&gt;
   &lt;soapenv:Body&gt;
      &lt;ws:createMovie&gt;
         &lt;title&gt;Pirates of the Caribbean&lt;/title&gt;
      &lt;/ws:createMovie&gt;
   &lt;/soapenv:Body&gt;
&lt;/soapenv:Envelope&gt;

Réponse:

&lt;soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"&gt;
   &lt;soap:Body&gt;
      &lt;ns2:createMovieResponse xmlns:ns2="http://ws.soap_server.rbillard.fr/"&gt;
         &lt;return&gt;
            &lt;id&gt;2&lt;/id&gt;
            &lt;title&gt;Pirates of the Caribbean&lt;/title&gt;
         &lt;/return&gt;
      &lt;/ns2:createMovieResponse&gt;
   &lt;/soap:Body&gt;
&lt;/soap:Envelope&gt;

##### update

&lt;soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.soap_server.rbillard.fr/"&gt;
   &lt;soapenv:Header/&gt;
   &lt;soapenv:Body&gt;
      &lt;ws:updateMovie&gt;
         &lt;id&gt;1&lt;/id&gt;
         &lt;title&gt;Pirates of the Caribbean&lt;/title&gt;
      &lt;/ws:updateMovie&gt;
   &lt;/soapenv:Body&gt;
&lt;/soapenv:Envelope&gt;

Réponse :

&lt;soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"&gt;
   &lt;soap:Body&gt;
      &lt;ns2:updateMovieResponse xmlns:ns2="http://ws.soap_server.rbillard.fr/"&gt;
         &lt;return&gt;
            &lt;id&gt;1&lt;/id&gt;
            &lt;title&gt;Pirates of the Caribbean&lt;/title&gt;
         &lt;/return&gt;
      &lt;/ns2:updateMovieResponse&gt;
   &lt;/soap:Body&gt;
&lt;/soap:Envelope&gt;

##### findOne

&lt;soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.soap_server.rbillard.fr/"&gt;
   &lt;soapenv:Header/&gt;
   &lt;soapenv:Body&gt;
      &lt;ws:findOneMovie&gt;
         &lt;id&gt;1&lt;/id&gt;
      &lt;/ws:findOneMovie&gt;
   &lt;/soapenv:Body&gt;
&lt;/soapenv:Envelope&gt;

Réponse :

&lt;soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"&gt;
   &lt;soap:Body&gt;
      &lt;ns2:findOneMovieResponse xmlns:ns2="http://ws.soap_server.rbillard.fr/"&gt;
         &lt;return&gt;
            &lt;id&gt;1&lt;/id&gt;
            &lt;title&gt;Pirates of the Caribbean&lt;/title&gt;
            &lt;roles&gt;
               &lt;roles&gt;
                  &lt;firstName&gt;Jack&lt;/firstName&gt;
                  &lt;lastName&gt;SPARROW&lt;/lastName&gt;
                  &lt;actor&gt;
                     &lt;id&gt;1&lt;/id&gt;
                     &lt;firstName&gt;Johnny&lt;/firstName&gt;
                     &lt;lastName&gt;DEPP&lt;/lastName&gt;
                     &lt;birthDate&gt;1963-06-09T00:00:00+01:00&lt;/birthDate&gt;
                  &lt;/actor&gt;
               &lt;/roles&gt;
               &lt;roles&gt;
                  &lt;firstName&gt;Will&lt;/firstName&gt;
                  &lt;lastName&gt;TURNER&lt;/lastName&gt;
                  &lt;actor&gt;
                     &lt;id&gt;2&lt;/id&gt;
                     &lt;firstName&gt;Orlando&lt;/firstName&gt;
                     &lt;lastName&gt;BLOOM&lt;/lastName&gt;
                     &lt;birthDate&gt;1977-01-13T00:00:00+01:00&lt;/birthDate&gt;
                  &lt;/actor&gt;
               &lt;/roles&gt;
            &lt;/roles&gt;
         &lt;/return&gt;
      &lt;/ns2:findOneMovieResponse&gt;
   &lt;/soap:Body&gt;
&lt;/soap:Envelope&gt;

##### find

&lt;soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.soap_server.rbillard.fr/"&gt;
   &lt;soapenv:Header/&gt;
   &lt;soapenv:Body&gt;
      &lt;ws:findMovies&gt;
         &lt;title&gt;Pirates of the Caribbean&lt;/title&gt;
      &lt;/ws:findMovies&gt;
   &lt;/soapenv:Body&gt;
&lt;/soapenv:Envelope&gt;

Réponse :

&lt;soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"&gt;
   &lt;soap:Body&gt;
      &lt;ns2:findMoviesResponse xmlns:ns2="http://ws.soap_server.rbillard.fr/"&gt;
         &lt;return&gt;
            &lt;id&gt;1&lt;/id&gt;
            &lt;title&gt;Pirates of the Caribbean&lt;/title&gt;
         &lt;/return&gt;
      &lt;/ns2:findMoviesResponse&gt;
   &lt;/soap:Body&gt;
&lt;/soap:Envelope&gt;

#### findAll

&lt;soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.soap_server.rbillard.fr/"&gt;
   &lt;soapenv:Header/&gt;
   &lt;soapenv:Body&gt;
      &lt;ws:findAllMovies/&gt;
   &lt;/soapenv:Body&gt;
&lt;/soapenv:Envelope&gt;

Réponse :

&lt;soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"&gt;
   &lt;soap:Body&gt;
      &lt;ns2:findAllMoviesResponse xmlns:ns2="http://ws.soap_server.rbillard.fr/"&gt;
         &lt;return&gt;
            &lt;id&gt;1&lt;/id&gt;
            &lt;title&gt;Pirates of the Caribbean&lt;/title&gt;
         &lt;/return&gt;
      &lt;/ns2:findAllMoviesResponse&gt;
   &lt;/soap:Body&gt;
&lt;/soap:Envelope&gt;

##### delete

&lt;soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.soap_server.rbillard.fr/"&gt;
   &lt;soapenv:Header/&gt;
   &lt;soapenv:Body&gt;
      &lt;ws:deleteMovie&gt;
         &lt;id&gt;1&lt;/id&gt;
      &lt;/ws:deleteMovie&gt;
   &lt;/soapenv:Body&gt;
&lt;/soapenv:Envelope&gt;

Réponse :

&lt;soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"&gt;
   &lt;soap:Body&gt;
      &lt;ns2:deleteMovieResponse xmlns:ns2="http://ws.soap_server.rbillard.fr/"/&gt;
   &lt;/soap:Body&gt;
&lt;/soap:Envelope&gt;


#### Role

##### create

&lt;soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.soap_server.rbillard.fr/"&gt;
   &lt;soapenv:Header/&gt;
   &lt;soapenv:Body&gt;
      &lt;ws:createRole&gt;
         &lt;actorId&gt;1&lt;/actorId&gt;
         &lt;movieId&gt;1&lt;/movieId&gt;
         &lt;firstName&gt;Jack&lt;/firstName&gt;
         &lt;lastName&gt;SPARROW&lt;/lastName&gt;
      &lt;/ws:createRole&gt;
   &lt;/soapenv:Body&gt;
&lt;/soapenv:Envelope&gt;

Réponse :

&lt;soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"&gt;
   &lt;soap:Body&gt;
      &lt;ns2:createRoleResponse xmlns:ns2="http://ws.soap_server.rbillard.fr/"&gt;
         &lt;return&gt;
            &lt;firstName&gt;Jack&lt;/firstName&gt;
            &lt;lastName&gt;SPARROW&lt;/lastName&gt;
            &lt;actor&gt;
               &lt;id&gt;1&lt;/id&gt;
               &lt;firstName&gt;Johnny&lt;/firstName&gt;
               &lt;lastName&gt;DEPP&lt;/lastName&gt;
               &lt;birthDate&gt;1963-06-09T00:00:00+01:00&lt;/birthDate&gt;
            &lt;/actor&gt;
            &lt;movie&gt;
               &lt;id&gt;1&lt;/id&gt;
               &lt;title&gt;Pirates of the Caribbean&lt;/title&gt;
            &lt;/movie&gt;
         &lt;/return&gt;
      &lt;/ns2:createRoleResponse&gt;
   &lt;/soap:Body&gt;
&lt;/soap:Envelope&gt;

##### delete

&lt;soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.soap_server.rbillard.fr/"&gt;
   &lt;soapenv:Header/&gt;
   &lt;soapenv:Body&gt;
      &lt;ws:deleteRole&gt;
         &lt;actorId&gt;1&lt;/actorId&gt;
         &lt;movieId&gt;1&lt;/movieId&gt;
      &lt;/ws:deleteRole&gt;
   &lt;/soapenv:Body&gt;
&lt;/soapenv:Envelope&gt;

Réponse :

&lt;soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"&gt;
   &lt;soap:Body&gt;
      &lt;ns2:deleteRoleResponse xmlns:ns2="http://ws.soap_server.rbillard.fr/"/&gt;
   &lt;/soap:Body&gt;
&lt;/soap:Envelope&gt;

##### findAll

&lt;soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.soap_server.rbillard.fr/"&gt;
   &lt;soapenv:Header/&gt;
   &lt;soapenv:Body&gt;
      &lt;ws:findAllRoles/&gt;
   &lt;/soapenv:Body&gt;
&lt;/soapenv:Envelope&gt;

Réponse :

&lt;soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"&gt;
   &lt;soap:Body&gt;
      &lt;ns2:findAllRolesResponse xmlns:ns2="http://ws.soap_server.rbillard.fr/"&gt;
         &lt;return&gt;
            &lt;firstName&gt;Jack&lt;/firstName&gt;
            &lt;lastName&gt;SPARROW&lt;/lastName&gt;
            &lt;actor&gt;
               &lt;id&gt;1&lt;/id&gt;
               &lt;firstName&gt;Johnny&lt;/firstName&gt;
               &lt;lastName&gt;DEPP&lt;/lastName&gt;
               &lt;birthDate&gt;1963-06-09T00:00:00+01:00&lt;/birthDate&gt;
            &lt;/actor&gt;
            &lt;movie&gt;
               &lt;id&gt;1&lt;/id&gt;
               &lt;title&gt;Pirates of the Caribbean&lt;/title&gt;
            &lt;/movie&gt;
         &lt;/return&gt;
         &lt;return&gt;
            &lt;firstName&gt;Will&lt;/firstName&gt;
            &lt;lastName&gt;TURNER&lt;/lastName&gt;
            &lt;actor&gt;
               &lt;id&gt;2&lt;/id&gt;
               &lt;firstName&gt;Orlando&lt;/firstName&gt;
               &lt;lastName&gt;BLOOM&lt;/lastName&gt;
               &lt;birthDate&gt;1977-01-13T00:00:00+01:00&lt;/birthDate&gt;
            &lt;/actor&gt;
            &lt;movie&gt;
               &lt;id&gt;1&lt;/id&gt;
               &lt;title&gt;Pirates of the Caribbean&lt;/title&gt;
            &lt;/movie&gt;
         &lt;/return&gt;
      &lt;/ns2:findAllRolesResponse&gt;
   &lt;/soap:Body&gt;
&lt;/soap:Envelope&gt;

##### findOne

&lt;soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.soap_server.rbillard.fr/"&gt;
   &lt;soapenv:Header/&gt;
   &lt;soapenv:Body&gt;
      &lt;ws:findOneRole&gt;
         &lt;actorId&gt;1&lt;/actorId&gt;
         &lt;movieId&gt;1&lt;/movieId&gt;
      &lt;/ws:findOneRole&gt;
   &lt;/soapenv:Body&gt;
&lt;/soapenv:Envelope&gt;

Réponse :

&lt;soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"&gt;
   &lt;soap:Body&gt;
      &lt;ns2:findOneRoleResponse xmlns:ns2="http://ws.soap_server.rbillard.fr/"&gt;
         &lt;return&gt;
            &lt;firstName&gt;Jack&lt;/firstName&gt;
            &lt;lastName&gt;SPARROW&lt;/lastName&gt;
            &lt;actor&gt;
               &lt;id&gt;1&lt;/id&gt;
               &lt;firstName&gt;Johnny&lt;/firstName&gt;
               &lt;lastName&gt;DEPP&lt;/lastName&gt;
               &lt;birthDate&gt;1963-06-09T00:00:00+01:00&lt;/birthDate&gt;
            &lt;/actor&gt;
            &lt;movie&gt;
               &lt;id&gt;1&lt;/id&gt;
               &lt;title&gt;Pirates of the Caribbean&lt;/title&gt;
            &lt;/movie&gt;
         &lt;/return&gt;
      &lt;/ns2:findOneRoleResponse&gt;
   &lt;/soap:Body&gt;
&lt;/soap:Envelope&gt;

##### update

&lt;soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws.soap_server.rbillard.fr/"&gt;
   &lt;soapenv:Header/&gt;
   &lt;soapenv:Body&gt;
      &lt;ws:updateRole&gt;
         &lt;actorId&gt;1&lt;/actorId&gt;
         &lt;movieId&gt;1&lt;/movieId&gt;
         &lt;firstName&gt;Jack&lt;/firstName&gt;
         &lt;lastName&gt;SPARROW&lt;/lastName&gt;
      &lt;/ws:updateRole&gt;
   &lt;/soapenv:Body&gt;
&lt;/soapenv:Envelope&gt;

Réponse :

&lt;soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"&gt;
   &lt;soap:Body&gt;
      &lt;ns2:updateRoleResponse xmlns:ns2="http://ws.soap_server.rbillard.fr/"&gt;
         &lt;return&gt;
            &lt;firstName&gt;Jack&lt;/firstName&gt;
            &lt;lastName&gt;SPARROW&lt;/lastName&gt;
            &lt;actor&gt;
               &lt;id&gt;1&lt;/id&gt;
               &lt;firstName&gt;Johnny&lt;/firstName&gt;
               &lt;lastName&gt;DEPP&lt;/lastName&gt;
               &lt;birthDate&gt;1963-06-09T00:00:00+01:00&lt;/birthDate&gt;
            &lt;/actor&gt;
            &lt;movie&gt;
               &lt;id&gt;1&lt;/id&gt;
               &lt;title&gt;Pirates of the Caribbean&lt;/title&gt;
            &lt;/movie&gt;
         &lt;/return&gt;
      &lt;/ns2:updateRoleResponse&gt;
   &lt;/soap:Body&gt;
&lt;/soap:Envelope&gt;