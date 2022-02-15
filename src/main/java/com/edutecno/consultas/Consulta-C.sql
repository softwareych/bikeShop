SELECT b.store_name as tienda , COUNT(*) as cantidadOrdenes
FROM dbanalisis.orders  a
INNER JOIN dbanalisis.stores b on a.store_id = b.store_id
GROUP BY  b.store_name
ORDER BY cantidadOrdenes DESC;
