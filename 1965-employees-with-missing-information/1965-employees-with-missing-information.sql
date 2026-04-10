# Write your MySQL query statement below
Select coalesce(s.employee_id,e.employee_id) as employee_id
from Employees as e
Left join Salaries as s
on e.employee_id=s.employee_id
where s.salary is Null
Union
Select coalesce(s.employee_id,e.employee_id) as employee_id
from Employees as e
right join Salaries as s
on e.employee_id=s.employee_id
where e.name is Null
Order by employee_id;