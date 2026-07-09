-- Last updated: 7/9/2026, 3:05:55 PM
# Write your MySQL query statement below
Select  teacher_id ,count(distinct subject_id ) as cnt from Teacher
group by teacher_id