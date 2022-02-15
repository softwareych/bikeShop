SELECT * --a.ORDER_ID, b.FIRST_NAME + b.LAST_NAME, c.FIRST_NAME + c.LAST_NAME, a.order_date, a.required_date, a.order_status
FROM dbanalisis.orders a
INNER JOIN dbanalisis.staffs b ON a.staff_id = b.staff_id
INNER JOIN dbanalisis.customers c ON a.customer_id = c.customer_id
inner join stores d ON a.store_id = d.store_id
WHERE d.store_id =
or a.order_status =
or a.order_date >=
or a.order_date <=
;