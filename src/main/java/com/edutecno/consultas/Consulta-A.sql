SELECT customer_id , last_name , first_name , phone , email , street , city , state , zip_code
FROM dbanalisis.customers
WHERE state="NY"
ORDER BY last_name, first_name ;