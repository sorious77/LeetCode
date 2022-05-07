UPDATE Salary
   SET sex = (case when sex = 'f' then 'm'
              else 'f' end)
;


