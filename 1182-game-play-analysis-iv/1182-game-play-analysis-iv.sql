# Write your MySQL query statement below
select round(count(player_id)/(select count(distinct player_id) from Activity),2)
as fraction from Activity 
where (player_id,DATE_SUB(event_date, interval 1 day)) in  
(select player_id,min(event_date) from Activity group by player_id);

