# Write your MySQL query statement below

Select Distinct num as ConsecutiveNums
from(
    Select num,
    Lag(num,1) over(order by id) as prev1,
    lag(num,2) over(order by id) as prev2
    from logs
) t
where num=prev1 and num=prev2;