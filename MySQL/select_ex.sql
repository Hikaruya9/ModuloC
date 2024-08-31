USE megabazar;

SELECT * FROM antique_store;

-- ORDER BY
SELECT * FROM antique_store
ORDER BY antique_year DESC; -- Order by a specified way

-- WHERE: Filter results
SELECT * FROM antique_store
WHERE quantity < 20; -- show values with quantity below 20

-- SELECT with more columns
SELECT category, quantity, antique_year FROM antique_store
WHERE quantity > 10 && antique_year < 1980; -- shows columns with the conditions typed

-- SELECT between values
SELECT * FROM antique_store
WHERE quantity BETWEEN 10 AND 30; -- search values with quantity between 10 and 30

-- IN
SELECT category, antique_year FROM antique_store
WHERE antique_year IN ('1940','1960'); -- search for values in antique_year column filled with 1940 and 1960

-- LIKE % _
SELECT * FROM antique_store
WHERE category LIKE '%g%'; -- % acts like a joker where will search any value with G letter

SELECT * FROM antique_store
WHERE category NOT LIKE 'v%'; -- Opposed to only like, show all values but those with v at beggining

SELECT * FROM antique_store
WHERE category LIKE 'd_ink'; -- _ acts as a space for a indefinied character

-- DISTINCT
SELECT DISTINCT quantity FROM antique_store; -- doesn't show dupes



-- AGGREGATE FUNCTIONS
SELECT count(*) FROM antique_store
WHERE antique_year > '1940'; -- Count how many values with this condition are in the table

SELECT MAX(antique_year) FROM antique_store; -- Shows the max value in a category

SELECT MAX(antique_year) FROM antique_store; -- Shows the min value in a category

SELECT SUM(quantity) FROM antique_store; -- Shows the max value in a category

SELECT AVG(quantity) FROM antique_store; -- Shows the average value in a category



-- GROUP BY
SELECT quantity, count(*) FROM antique_store
GROUP BY quantity HAVING count(quantity) = 2;