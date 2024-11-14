# Write your MySQL query statement below
select emp.name from Employee emp inner join Employee manager on emp.id = manager.managerId group by 
manager.managerId having count(manager.managerId) >=5 ;