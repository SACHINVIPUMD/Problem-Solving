# Write your MySQL query statement below
with leadCTE as (select num,lead(num,1) over() num1,lead(num,2) over() num2 from Logs)
select distinct num as ConsecutiveNums from leadCTE where num = num1 and num = num2;