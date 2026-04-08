Select name
from Employee
where id in (
    SELECT managerId
    FROM Employee
    Group by managerId
    having count(*)>=5
)
