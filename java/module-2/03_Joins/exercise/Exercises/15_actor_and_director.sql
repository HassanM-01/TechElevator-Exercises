-- 15. The title of the movie and the name of director for movies where the director was also an actor in the same movie (73 rows)
SELECT *
FROM movie
JOIN person ON person.person_id = movie.director_id
JOIN movie_actor ON actor_id = person.person_id

