-- ORDERING RESULTS

-- Populations of all states from largest to smallest.
SELECT population
FROM state
ORDER BY population desc;

-- States sorted alphabetically (A-Z) within their census region. The census regions are sorted in reverse alphabetical (Z-A) order.
SELECT state_name, census_region
FROM state
ORDER BY census_region desc, state_name asc;


-- The biggest park by area
SELECT park_name, area
FROM park
ORDER BY area desc
LIMIT 1;



-- LIMITING RESULTS

-- The 10 largest cities by populations
SELECT city_name, population
FROM city
ORDER BY population desc
LIMIT 10;

-- The 20 oldest parks from oldest to youngest in years, sorted alphabetically by name.
SELECT park_name, date_established
FROM park
ORDER BY date_established asc, park_name asc;



-- CONCATENATING OUTPUTS

-- All city names and their state abbreviation.
SELECT city_name || ', ' || state_abbreviation AS city_state
FROM city;

-- The all parks by name and date established.
SELECT park_name || ', established in ' || date_established
FROM park;

-- The census region and state name of all states in the West & Midwest sorted in ascending order.
SELECT census_region || ' ' || state_name
FROM state
WHERE census_region IN ('West', 'Midwest')
ORDER BY census_region ASC, state_name ASC;



-- AGGREGATE FUNCTIONS

-- Average population across all the states. Note the use of alias, common with aggregated values.
SELECT AVG (population) AS avg_population
FROM state;

-- Total population in the West and South census regions
SELECT SUM (population)
FROM state
WHERE census_region IN ('West', 'South');

-- The number of cities with populations greater than 1 million
SELECT COUNT (city_name)
FROM city
WHERE population > 1000000;

-- The number of state nicknames.
SELECT COUNT (state_nickname)
FROM state;

-- The area of the smallest and largest parks.
SELECT MAX(area) AS largest_park, MIN (area) AS smallest_park
FROM park;


-- GROUP BY

-- Count the number of cities in each state, ordered from most cities to least.
SELECT COUNT (city_name), state_abbreviation
FROM city
GROUP BY state_abbreviation
ORDER BY COUNT desc;

-- Determine the average park area depending upon whether parks allow camping or not.
SELECT AVG(area) AS avg_area, has_camping
FROM park
GROUP BY has_camping;

-- Sum of the population of cities in each state ordered by state abbreviation.
SELECT SUM(population) AS city_population, state_abbreviation
FROM city
GROUP BY state_abbreviation
ORDER BY state_abbreviation;

-- The smallest city population in each state ordered by city population.
--SELECT MIN(population) AS smallest_city, state_abbreviation
--FROM city
--GROUP BY state_abbreviation
--ORDER BY population asc;


-- Miscelleneous

-- While you can use LIMIT to limit the number of results returned by a query,
-- it's recommended to use OFFSET and FETCH if you want to get
-- "pages" of results.
-- For instance, to get the first 10 rows in the city table
-- ordered by the name, you could use the following query.
-- (Skip 0 rows, and return only the first 10 rows from the sorted result set.)



-- SUBQUERIES (optional)

-- Include state name rather than the state abbreviation while counting the number of cities in each state,
SELECT COUNT (city_name) AS cities,(
SELECT state_name FROM state WHERE state_abbreviation = city.state_abbreviation
)
FROM city
GROUP BY state_abbreviation;



-- Include the names of the smallest and largest parks


-- List the capital cities for the states in the Northeast census region.

