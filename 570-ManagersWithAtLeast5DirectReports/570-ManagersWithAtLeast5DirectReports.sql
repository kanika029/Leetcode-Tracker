-- Last updated: 7/9/2026, 3:07:32 PM
SELECT name 
FROM Employee 
WHERE id IN (
    SELECT managerId 
    FROM Employee GROUP BY managerId HAVING COUNT(id) >= 5
);
