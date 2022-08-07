select u.name,
       ifnull(sum(r.distance), 0) as travelled_distance
  from users u
  left outer join rides r on u.id = r.user_id
 group by u.id
 order by 2 desc, 1;
