# Write your MySQL query statement below
with users as (select requester_id from RequestAccepted
union all
select accepter_id as id from RequestAccepted)
select requester_id as id,count(requester_id) as num from users
group by requester_id
order by count(requester_id) desc limit 1;