Select ifnull(
    (Select num
from MyNumbers
Group by num
Having count(*)=1
Order By num DESC
LIMIT 1), null
) as num;
