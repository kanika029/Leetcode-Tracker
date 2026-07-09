-- Last updated: 7/9/2026, 3:06:57 PM
# Write your MySQL query statement below
SELECT actor_id, director_id from ActorDirector GROUP by actor_id, director_id HAVING COUNT(*) >= 3;
