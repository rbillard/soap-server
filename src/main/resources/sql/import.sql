INSERT INTO Actor (id, firstName, lastName, birthDate) VALUES (1, 'Johnny', 'DEPP', '1963-06-09 00:00:00');
INSERT INTO Actor (id, firstName, lastName, birthDate) VALUES (2, 'Orlando', 'BLOOM', '1977-01-13 00:00:00');
INSERT INTO Movie (id, title) VALUES (1, 'Pirates of the Caribbean');
INSERT INTO Movie (id, title) VALUES (2, 'Edward Scissorhands');
INSERT INTO Role (id, ACTOR_ID, MOVIE_ID, firstName, lastName) VALUES (1, 1, 1, 'Jack', 'SPARROW');
INSERT INTO Role (id, ACTOR_ID, MOVIE_ID, firstName, lastName) VALUES (2, 2, 1, 'Will', 'TURNER');
INSERT INTO Role (id, ACTOR_ID, MOVIE_ID, firstName, lastName) VALUES (3, 1, 2, 'Edward', 'Scissorhands');