# Write your MySQL query statement below
Select s.name
from SalesPerson as s
where sales_Id NOT in (
    Select sales_id
    from Company as c
    join Orders as o
    on c.com_id=o.com_id
    where c.name='RED'
);