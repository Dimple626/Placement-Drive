SELECT id,count(*) as num
from(
    Select requester_id as id from RequestAccepted
    Union all
    Select accepter_id as id from RequestAccepted
) t
Group By id
Order By num DESC
LIMIT 1;



