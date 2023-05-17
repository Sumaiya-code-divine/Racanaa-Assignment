//creating a table
CREATE TABLE gittable ( ID INT PRIMARY KEY, Name VARCHAR(255));

//insert into table
INSERT INTO gittable (ID, Name) VALUES ('KA', 'Andhra');

//list cities to sort in ascending by using ORDER BY ASC:
SELECT Name FROM gittable ORDER BY Name ASC;

//List of states with count of cities by using COUNT, assuming state column already exists we select it using select

SELECT State, COUNT(*) AS Count
FROM cgittable
GROUP BY State;

