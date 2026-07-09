-- Last updated: 7/9/2026, 3:06:21 PM
# Write your MySQL query statement below
SELECT patient_id, patient_name, conditions frOM Patients wHERE conditions LIKE 'DIAB1%' OR conditions LIKE '% DIAB1%'