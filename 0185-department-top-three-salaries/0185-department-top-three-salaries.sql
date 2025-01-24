# Write your MySQL query statement below
with emp as (select *,DENSE_RANK() over(partition by departmentId order by salary desc) as raank 
from 
Employee)

select d.name as Department,e.name as Employee,e.salary as Salary from emp e join 
Department d on e.departmentId = d.id where e.raank<=3;
