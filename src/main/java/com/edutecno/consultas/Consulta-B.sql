SELECT customer_id , last_name , first_name , phone , email , street , city , state , zip_code
FROM dbanalisis.customers
WHERE email like "%yahoo%"
and phone is null
ORDER BY last_name, first_name ;