# Write your MySQL query statement below
Select id,
    CASE
    when p_id is Null then 'Root'
    when id in (Select  p_id from Tree) then 'Inner'
    else 'Leaf'
    End as Type
    from Tree;
