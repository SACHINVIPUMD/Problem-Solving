# Write your MySQL query statement below
select e1.name from Employee e1 join Employee e2 on e2.managerId = e1.id 
GROUP BY e1.id, e1.name
having count(e2.id) >=5;

-- # Write your MySQL query statement below
-- SELECT e.name 
-- FROM Employee e
-- JOIN Employee e2 
-- ON e.id = e2.managerId
-- GROUP BY e.id, e.name
-- HAVING COUNT(e2.id) >= 5;
