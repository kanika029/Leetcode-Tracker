-- Last updated: 7/9/2026, 3:06:13 PM
# Write your MySQL query statement below
SELECT user_id, COUNT(follower_id) AS followers_count FROM Followers
GROUP BY user_id order BY user_id ASC;
