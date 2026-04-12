# Write your MySQL query statement below
Select DISTINCT p.product_id,p.product_name
from Product as p
join Sales as s
ON p.product_id = s.product_id
Group by p.product_id,p.product_name
Having min(s.sale_date)>='2019-01-01'
And max(s.sale_date)<='2019-03-31';