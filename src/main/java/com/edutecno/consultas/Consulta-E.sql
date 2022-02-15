SELECT b.last_name as last_name, b.first_name as first_name , SUM(d.quantity * list_price) as monto
FROM dbanalisis.stores a
INNER JOIN dbanalisis.staffs b on a.store_id = b.store_id
inner join dbanalisis.orders c on b.store_id = c.store_id and b.staff_id = c.staff_id
inner join dbanalisis.order_items d on c.order_id = d.order_id
WHERE a.store_id = 2
GROUP BY 1
ORDER BY 2 ;