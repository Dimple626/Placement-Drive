# Write your MySQL query statement below
select sell_date,
count(Distinct product) as num_sold,
group_concat(Distinct product) as products
from Activities
Group by sell_date;

