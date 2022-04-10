DELETE
  FROM PERSON
 WHERE ID NOT IN (SELECT *
                    FROM (SELECT MIN(P.ID)
                            FROM PERSON P
                           GROUP BY P.EMAIL
                         ) AS PP
                  )
