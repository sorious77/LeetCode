SELECT IFNULL((SELECT SALARY
                 FROM (SELECT E.SALARY,
                              @rownum := @rownum + 1 AS RN
                         FROM (SELECT DISTINCT SALARY
                                 FROM EMPLOYEE
                                ORDER BY SALARY DESC) E
                         JOIN (SELECT @rownum := 0) R
                       ) X
                WHERE X.RN = 2), null) AS SecondHighestSalary
;
