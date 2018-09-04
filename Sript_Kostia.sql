Select c.name, count(r.name) reg_number
from country c
left join region r
on c.id=r.country_id
group by country_id
order by reg_number DESC
limit 5;

select c.name, count(distinct cit.name) city_number
from country c
left join region r
on c.id=r.country_id
left join city cit
on r.id=cit.region_id
group by c.name
order by city_number DESC
limit 5;

select c.name, count(distinct r.name ) reg_number, count(distinct cit.name) city_number
from country c
left join region r
on c.id=r.country_id
left join city cit
on r.id=cit.region_id
group by c.name
order by city_number Desc;
