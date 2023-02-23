-- Part 1: Test it with SQL
--columns | datatype
id INT(11)
employer VARCHAR(255)
name VARCHAR(255)
skills VARCHAR(255)
--Look in Field Types on the Right Side
-- Part 2: Test it with SQL
SELECT name
FROM employer
WHERE location = "St. Louis City";
--Per test have to put St. Louis "City" otherwise it fails.
-- Part 3: Test it with SQL
DROP TABLE job;
-- Part 4: Test it with SQL
SELECT name, description
FROM skill
INNER JOIN job_skills ON skill.id = job_skills.skills_id
WHERE job_skills.jobs_id IS NOT NULL
ORDER BY name ASC;