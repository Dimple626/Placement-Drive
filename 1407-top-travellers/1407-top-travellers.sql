# Write your MySQL query statement below
select name,ifnull(sum(distance),0) as travelled_distance
from Users as u
left join Rides as r
on u.id=r.user_id
group by name,u.id
order by sum(distance) desc , name asc;