# Write your MySQL query statement below
Update Salary
Set sex=CASE
when sex='f' then 'm'
when sex='m' then 'f'
End;

