SELECT m.nome, count(ioc.idMaterial) as contagem
FROM item_ordem_compra as ioc, material as m
WHERE ioc.idMaterial = m.id
GROUP BY ioc.idMaterial
ORDER BY contagem desc;

