-- INNER JOIN

-- Write a query to retrieve the name and state abbreviation for the 2 cities named "Columbus" in the database
SELECT city_name, city.state_abbreviation, state_name
FROM city
JOIN state ON city.state_abbreviation = state.state_abbreviation
WHERE city_name = 'Columbus';

-- Modify the previous query to retrieve the names of the states (rather than their abbreviations).


-- Write a query to retrieve the names of all the national parks with their state abbreviations.
-- (Some parks will appear more than once in the results, because they cross state boundaries.)
SELECT park_state.state_abbreviation, park_name
FROM park
JOIN park_state ON park.park_id = park_state.park_id;

-- The park_state table is an associative table that can be used to connect the park and state tables.
-- Modify the previous query to retrieve the names of the states rather than their abbreviations.
SELECT park_name, state_name
FROM park
JOIN park_state ON park.park_id = park_state.park_id
JOIN state on park_state.state_abbreviation = state.state_abbreviation;

-- Modify the previous query to include the name of the state's capital city.
SELECT park_name, state_name, city_name
FROM park
JOIN park_state ON park.park_id = park_state.park_id
JOIN state on park_state.state_abbreviation = state.state_abbreviation
JOIN city ON state.capital = city_id;


-- Modify the previous query to include the area of each park.
SELECT park_name, state_name, city_name, park.area
FROM park
JOIN park_state ON park.park_id = park_state.park_id
JOIN state on park_state.state_abbreviation = state.state_abbreviation
JOIN city ON state.capital = city_id;


-- Write a query to retrieve the names and populations of all the cities in the Midwest census region.
SELECT city_name, city.population, census_region
FROM city
JOIN state ON state.state_abbreviation = city.state_abbreviation
WHERE census_region = 'Midwest';

-- Write a query to retrieve the number of cities in the city table for each state in the Midwest census region.
SELECT COUNT(city_name), city.state_abbreviation
FROM city
JOIN state ON state.state_abbreviation = city.state_abbreviation
WHERE census_region = 'Midwest'
GROUP BY city.state_abbreviation;

-- Modify the previous query to sort the results by the number of cities in descending order.
SELECT COUNT(city_name), city.state_abbreviation
FROM city
JOIN state ON state.state_abbreviation = city.state_abbreviation
WHERE census_region = 'Midwest'
GROUP BY city.state_abbreviation
ORDER BY count desc;


-- LEFT JOIN

-- Write a query to retrieve the state name and the earliest date a park was established in that state (or territory) for every record in the state table that has park records associated with it.


-- Modify the previous query so the results include entries for all the records in the state table, even if they have no park records associated with them.



-- UNION

-- Write a query to retrieve all the place names in the city and state tables that begin with "W" sorted alphabetically. (Washington is the name of a city and a state--how many times does it appear in the results?)


-- Modify the previous query to include a column that indicates whether the place is a city or state.



-- MovieDB
-- After creating the MovieDB database and running the setup script, make sure it is selected in DbVisualizer and confirm it is working correctly by writing queries to retrieve...

-- The names of all the movie genres


-- The titles of all the Comedy movies

