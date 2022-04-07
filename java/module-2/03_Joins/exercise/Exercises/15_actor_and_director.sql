-- 15. The title of the movie and the name of director for movies where the director was also an actor in the same movie (73 rows)
SELECT title, actor_id, director_id, movie.movie_id
FROM movie
JOIN person ON movie.director_id = person.person_id
JOIN movie_actor ON movie_actor.actor_id = movie.movie_id


