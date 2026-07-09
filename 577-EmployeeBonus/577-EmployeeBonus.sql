-- Last updated: 7/9/2026, 3:07:30 PM
# Write your MySQL query statement below
SELECT e.name, b.bonus 
FROM Employee e left JOIN Bonus b ON e.empId = b.empId where b.bonus < 1000 OR b.bonus IS NULL;
