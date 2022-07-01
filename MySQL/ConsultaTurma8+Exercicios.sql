SELECT nome FROM fornecedor;

SELECT oc.id, oc.data, f.nome, f.ie
FROM fornecedor as f, ordem_compra as oc;

SELECT oc.id, oc.data, f.nome, f.ie
FROM fornecedor as f, ordem_compra as oc
WHERE oc.idFornecedor = f.id;

SELECT oc.id, oc.data, f.nome, f.ie
FROM fornecedor as f, ordem_compra as oc
WHERE oc.idFornecedor = f.id
ORDER BY f.ie;

SELECT oc.id, oc.data, f.nome, f.ie
FROM fornecedor as f, ordem_compra as oc
WHERE oc.idFornecedor = f.id
ORDER BY f.ie DESC;

SELECT ioc.idOrdemCompra, ioc.idMaterial, m.nome
FROM item_ordem_compra as ioc, material as m
WHERE ioc.idMaterial = m.id
ORDER BY ioc.idOrdemCompra;

-- 1. Exiba os dados da compra (item_ordem_compra) de todos os materiais cuja quantidade seja maior que 10 --
SELECT *
FROM item_ordem_compra
WHERE quantidade > 10;

-- 2. Exiba os dados da compra (item_ordem_compra) de todos os materiais cujo valor seja menor que 50 --
SELECT *
FROM item_ordem_compra
WHERE valor < 50;

-- 3. Exibir os dados da compra de todos os materiais cuja quantidade seja maior que 100 e
-- o valor seja menor que 50, contendo o nome do material e o nome do fornecedor --
SELECT ioc.idOrdemCompra, ioc.idMaterial, ioc.quantidade, m.nome, f.nome
FROM item_ordem_compra as ioc, material as m, fornecedor as f, ordem_compra as oc
WHERE ioc.quantidade > 100 and ioc.valor < 50 and ioc.idMaterial = m.id
and ioc.idOrdemCompra = oc.id and oc.idFornecedor = f.id;
-- ************************************************** --
SELECT *, quantidade * valor as Subtotal
From item_ordem_compra;
-- ************************************************** --
-- 4. Exiba o subtotal de cada material vendido, o nome do material e o nome do fornecedor, para cada item_ordem_compra.
SELECT ioc.idOrdemCompra, ioc.idMaterial, m.nome, f.nome, ioc.valor, ioc.quantidade * ioc.valor as Subtotal
FROM item_ordem_compra as ioc, material as m, fornecedor as f, ordem_compra as oc
WHERE ioc.idMaterial = m.id and f.id = oc.idFornecedor and oc.id = ioc.idOrdemCompra
ORDER BY ioc.idOrdemCompra;
-- ************************************************** --
SELECT idOrdemCompra, SUM(quantidade * valor) as totalcompra
FROM item_ordem_compra
GROUP BY idOrdemCompra;

SELECT idOrdemCompra, SUM(quantidade * valor) as totalcompra
FROM item_ordem_compra
GROUP BY idOrdemCompra
HAVING totalcompra > 5000;
-- 5. O nome do fornecedor da ordem de compra, a ordem de compra e o total pago pela ordem de compra.

SELECT f.id, f.nome, SUM(quantidade * valor) as total
FROM ordem_compra as oc, item_ordem_compra as ioc, fornecedor as f
WHERE  oc.id = ioc.idOrdemCompra AND f.id = oc.idFornecedor
GROUP BY f.nome
ORDER BY f.id

-- 6. O nome do fornecedor da ordem de compra, a data da ordem de compra,
-- o total pago pela ordem de compra num determinado intervalo de datas.
SELECT ioc.idOrdemCompra, f.nome, oc.data, SUM(valor * quantidade) as total
FROM ordem_compra as oc, item_ordem_compra as ioc, fornecedor as f
WHERE f.id = oc.idFornecedor and oc.id = ioc.idOrdemCompra and oc.data BETWEEN '2022-05-15' and '2022-05-20'
GROUP BY ioc.idOrdemCompra


