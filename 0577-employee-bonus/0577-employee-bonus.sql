SELECT e.name, b.bonus
FROM employee AS e
left JOIN bonus AS b
ON e.empId = b.empId
WHERE b.bonus < 1000 OR b.bonus IS NULL;

