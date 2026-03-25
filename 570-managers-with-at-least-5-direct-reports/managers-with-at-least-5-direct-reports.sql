# Write your MySQL query statement below
SELECT e1.name 
FROM Employee e1
JOIN Employee e2
WHERE e2.managerID=e1.id
GROUP BY e2.managerID
HAVING COUNT(*)>=5;