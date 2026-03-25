# Write your MySQL query statement below
SELECT(
SELECT salary 
FROM(
    SELECT  salary,
    DENSE_RANK() OVER (ORDER BY salary DESC) as rnk
    From Employee) t
where rnk=2
LIMIT 1
) AS SecondHighestSalary;
