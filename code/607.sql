select s.name
  from salesperson s
 where s.sales_id not in (select o.sales_id
                          from company c
                          join orders o on c.com_id = o.com_id
                         where name = 'RED'
                        )
