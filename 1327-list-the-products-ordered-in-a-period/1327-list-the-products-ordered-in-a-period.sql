SElect p.product_name,sum(o.unit) as unit
from Products as p
join Orders as o
on p.product_id=o.product_id
where Month(o.order_date)=2
And year(o.order_date)=2020
group by p.product_id
having sum(o.unit)>=100


