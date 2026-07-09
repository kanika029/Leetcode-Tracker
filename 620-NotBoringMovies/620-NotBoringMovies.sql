-- Last updated: 7/9/2026, 3:07:21 PM
# Write your MySQL query statement below
SELECT * fROM cinema c
where c.id % 2 =1 AND c.description != 'boring'
oRDER BY c.rating DESC;