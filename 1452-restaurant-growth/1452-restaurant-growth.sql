# Write your MySQL query statement below
with visited_on_group as (select visited_on,sum(amount) as amount from Customer 
group by visited_on),
moving_avg as (select visited_on,
    sum(amount) over (order by visited_on rows between 6 preceding and current row) amount,
    round(avg(amount) over (order by visited_on rows between 6 preceding and current row),2) average_amount,
    row_number() over (order by visited_on) row_num
    from visited_on_group)

select visited_on,amount,average_amount from moving_avg
where row_num>6;
    