select distinct author_id id
  from views
 where author_id = viewer_id
 order by id;
