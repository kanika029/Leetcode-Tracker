-- Last updated: 7/9/2026, 3:08:57 PM
# Write your MySQL query statement below
SELECT email
FROM Person
GROUP BY email
HAVING COUNT(email) > 1;