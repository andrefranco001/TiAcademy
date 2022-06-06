import { produtos } from "./produtos.js";
import { clientes } from "./clientes.js";

window.onload = function () {

    // Mapeando os botoes do Menu para abrir os formularios
    const menuClientes = document.querySelector('#menuClientes');
    const menuProdutos = document.querySelector('#menuProdutos');
    const menuPedidos = document.querySelector('#menuPedidos');
    const formClientes = document.querySelector('#formClientes');
    const formProdutos = document.querySelector('#formProdutos');
    const formPedidos = document.querySelector('#formPedidos');
    const xClientes = document.querySelector('#xClientes');
    const xProdutos = document.querySelector('#xProdutos');
    const xPedidos = document.querySelector('#xPedidos');

    menuClientes.addEventListener('click', function () {
        if (formProdutos.classList.contains('aparecerForm') || (formPedidos.classList.contains('aparecerForm'))) {
            formProdutos.classList.replace('aparecerForm', 'sumirForm');
            formPedidos.classList.replace('aparecerForm', 'sumirForm');
            formClientes.classList.replace('sumirForm', 'aparecerForm');
        } else if (formClientes.classList.contains('sumirForm')) {
            formClientes.classList.replace('sumirForm', 'aparecerForm');
        } else {
            formClientes.classList.replace('aparecerForm', 'sumirForm');
        }
    });
    menuProdutos.addEventListener('click', function () {
        if (formClientes.classList.contains('aparecerForm') || (formPedidos.classList.contains('aparecerForm'))) {
            formClientes.classList.replace('aparecerForm', "sumirForm");
            formPedidos.classList.replace('aparecerForm', "sumirForm");
            formProdutos.classList.replace('sumirForm', 'aparecerForm');
        } else if (formProdutos.classList.contains('sumirForm')) {
            formProdutos.classList.replace('sumirForm', 'aparecerForm');
        } else {
            formProdutos.classList.replace('aparecerForm', 'sumirForm');
        }
    });
    menuPedidos.addEventListener('click', function () {
        if (formClientes.classList.contains('aparecerForm') || (formProdutos.classList.contains('aparecerForm'))) {
            formClientes.classList.replace('aparecerForm', "sumirForm");
            formProdutos.classList.replace('aparecerForm', "sumirForm");
            formPedidos.classList.replace('sumirForm', 'aparecerForm');
        } else if (formPedidos.classList.contains('sumirForm')) {
            formPedidos.classList.replace('sumirForm', 'aparecerForm');
        } else {
            formPedidos.classList.replace('aparecerForm', 'sumirForm');
        }
    });

    xClientes.addEventListener('click', function () {
        formClientes.classList.replace('aparecerForm', 'sumirForm');
    }); // Fechar o formulario do cliente com o X

    xProdutos.addEventListener('click', function () {
        formProdutos.classList.replace('aparecerForm', 'sumirForm');
    }); // Fechar o formulario do Produtos com o X

    xPedidos.addEventListener('click', function () {
        formPedidos.classList.replace('aparecerForm', 'sumirForm');
    }); // Fechar o formulario do Pedidos com o X

    // Mapeando os inputs e botoes do formulario dos Clientes
    const inputCodigoClientes = document.querySelector('#inputCodigoClientes');
    const inputNomeClientes = document.querySelector('#inputNomeClientes');
    const inputDataCadastroClientes = document.querySelector("#inputDataCadastroClientes");
    const botaoAnteriorClientes = document.querySelector('#botaoAnteriorClientes');
    const botaoProximoClientes = document.querySelector('#botaoProximoClientes');
    const botaoNovoClientes = document.querySelector('#botaoNovoClientes');
    const botaoSalvarClientes = document.querySelector('#botaoSalvarClientes');

    var contadorClientes = 0;
    const data = new Date();
    const dataAtual = data.toLocaleString('pt-BR', { year: "numeric", month: '2-digit', day: "2-digit" });

    // setar os valores iniciais a serem mostrados nos clientes // 
    inputCodigoClientes.value = clientes[contadorClientes].codCliente;
    inputNomeClientes.value = clientes[contadorClientes].nomeCliente;
    inputDataCadastroClientes.value = clientes[contadorClientes].dataCadCli;

    botaoAnteriorClientes.addEventListener('click', function () {
        if (contadorClientes > clientes.length) { // botao novo add um ao clientes.length, evita ao voltar com botão anterior, mostrar erro undefined por conta do index inexistente
            contadorClientes--;
        }
        if (contadorClientes >= 1) {
            contadorClientes--;
            inputCodigoClientes.value = clientes[contadorClientes].codCliente;
            inputNomeClientes.value = clientes[contadorClientes].nomeCliente;
            inputDataCadastroClientes.value = clientes[contadorClientes].dataCadCli;
        } else {
            alert('Você chegou ao inicio dos registros')
        }
    });

    botaoProximoClientes.addEventListener('click', function () {
        if (contadorClientes < clientes.length - 1) { // -1 para bater com o Index dos clientes
            contadorClientes++;
            inputCodigoClientes.value = clientes[contadorClientes].codCliente;
            inputNomeClientes.value = clientes[contadorClientes].nomeCliente;
            inputDataCadastroClientes.value = clientes[contadorClientes].dataCadCli;
        } else {
            alert('Você chegou ao fim dos Registros')
        }
    });

    botaoNovoClientes.addEventListener('click', function () {
        contadorClientes = clientes.length + 1;
        inputCodigoClientes.value = contadorClientes;
        inputNomeClientes.value = '';
        inputDataCadastroClientes.value = dataAtual;
    });

    botaoSalvarClientes.addEventListener('click', function () {
        var clientName = '';
        var nameIsEqual = false;
        // Validar se o nomes já está no array de objetos de clientes 
        for (let dados of clientes) {
            for (let nome in dados) {
                if (inputNomeClientes.value === dados.nomeCliente) {
                    nameIsEqual = true;
                    clientName = dados.nomeCliente;
                }
            }
        }
        // Validar se o codigo já está no array de objetos de clientes 
        var clienteCode = 0;
        var codeIsEqual = false;
        for (let dados of clientes) {
            for (let code in dados) {
                if (Number(inputCodigoClientes.value) === dados.codCliente) {
                    codeIsEqual = true;
                    clienteCode = dados.codCliente;
                }
            }
        }

        if (nameIsEqual) {
            alert(`O Cliente ${clientName} já existe no cadastro! clique no botão novo para inserir um cliente novo`);
            inputNomeClientes.value = '';
        } else if (codeIsEqual) {
            alert(`o Código ${clienteCode} já existe no cadastro!, clique no botão novo para inserir um código novo`);
        } else { // Salvar
            clientes.push({
                codCliente: inputCodigoClientes.value,
                nomeCliente: inputNomeClientes.value,
                dataCadCli: inputDataCadastroClientes.value
            })
            alert('Dados Salvos');

            // Após salvo resetar os valores pro primeiro do array
            contadorClientes = 0;
            inputCodigoClientes.value = clientes[contadorClientes].codCliente;
            inputNomeClientes.value = clientes[contadorClientes].nomeCliente;
            inputDataCadastroClientes.value = clientes[contadorClientes].dataCadCli;
        }
    });

    // Mapeando os inputs e botoes do formulario dos Produtos
    const inputCodigoProdutos = document.querySelector('#inputCodigoProdutos');
    const inputDescricaoProdutos = document.querySelector('#inputDescricaoProdutos');
    const inputPrecoProdutos = document.querySelector('#inputPrecoProdutos');
    const inputQuantidadeProdutos = document.querySelector('#inputQuantidadeProdutos');
    const botaoAnteriorProdutos = document.querySelector('#botaoAnteriorProdutos');
    const botaoProximoProdutos = document.querySelector('#botaoProximoProdutos');
    const botaoNovoProdutos = document.querySelector('#botaoNovoProdutos');
    const botaoSalvarProdutos = document.querySelector('#botaoSalvarProdutos');

    // Setando valores iniciais para serem mostrados no formulario Produtos
    var contadorProdutos = 0;
    inputCodigoProdutos.value = produtos[contadorProdutos].codProduto;
    inputDescricaoProdutos.value = produtos[contadorProdutos].descProduto;
    inputPrecoProdutos.value = produtos[contadorProdutos].precoProduto;
    inputQuantidadeProdutos.value = produtos[contadorProdutos].qtdEstoqueProd;

    botaoAnteriorProdutos.addEventListener('click', function () {
        if (contadorProdutos > produtos.length) { // botao novo add um ao produtos.length, evita ao voltar, mostrar erro undefined por conta do index inexistente
            contadorProdutos--;
        }
        if (contadorProdutos > 0) {
            contadorProdutos--;
            inputCodigoProdutos.value = produtos[contadorProdutos].codProduto;
            inputDescricaoProdutos.value = produtos[contadorProdutos].descProduto;
            inputPrecoProdutos.value = produtos[contadorProdutos].precoProduto;
            inputQuantidadeProdutos.value = produtos[contadorProdutos].qtdEstoqueProd;
        } else {
            alert('Você chegou ao Inicio dos Registros');
        }
    });

    botaoProximoProdutos.addEventListener('click', function () {
        if (contadorProdutos < produtos.length - 1) {
            contadorProdutos++;
            inputCodigoProdutos.value = produtos[contadorProdutos].codProduto;
            inputDescricaoProdutos.value = produtos[contadorProdutos].descProduto;
            inputPrecoProdutos.value = produtos[contadorProdutos].precoProduto;
            inputQuantidadeProdutos.value = produtos[contadorProdutos].qtdEstoqueProd;
        } else {
            alert('Você chegou ao Fim dos registros');
        }
    });

    botaoNovoProdutos.addEventListener('click', function () {
        contadorProdutos = produtos.length + 1;
        inputCodigoProdutos.value = contadorProdutos;
        inputDescricaoProdutos.value = '';
        inputPrecoProdutos.value = '';
        inputQuantidadeProdutos.value = '';
    });

    botaoSalvarProdutos.addEventListener('click', function () {
        var productName = '';
        var productIsEqual = false;
        // Validar se o produto já está cadastrado
        for (let dados of produtos) {
            for (let nome in dados) {
                if (inputDescricaoProdutos.value === dados.descProduto) {
                    productName = dados.descProduto;
                    productIsEqual = true;
                }
            }
        }
        // Validar se o código já está cadastrado
        var clienteCode = 0;
        var codeIsEqual = false;
        for (let dados of produtos) {
            for (let code in dados) {
                if (Number(inputCodigoProdutos.value) === dados.codProduto) {
                    codeIsEqual = true;
                    clienteCode = dados.codProduto;
                }
            }
        }

        if (inputPrecoProdutos.value <= 0) { // valor não pode ser negativo ou nulo
            alert('Preço minimo deve ser maior que 0');
        } else if (inputQuantidadeProdutos.value < 1) { // Quantidade não pode negativa, nula ou inferior a 1
            alert('Quantidade minima deve ser pelo menos 1');
        } else if (productIsEqual) { // Se Produto já cadastrado, dar um alerta para clicar no botão novo
            alert(`O produto ${productName} já existe no cadastro! Crie um novo Cliente ou verifique o código do cliente desejado`);
            inputNomeClientes.value = '';
        } else if (codeIsEqual) { // Se código já cadastrado, dar um alerta para clicar no botão novo
            alert(`Código ${clienteCode} já existe, clique no botão novo para criar um novo cadastro`);
        } else { // Salvar
            produtos.push({
                codProduto: inputCodigoProdutos.value,
                descProduto: inputDescricaoProdutos.value,
                precoProduto: inputPrecoProdutos.value,
                qtdEstoqueProd: inputQuantidadeProdutos.value
            });
            alert('Produto Salvo')

            // Após salvo resetar os valores pro primeiro do array
            contadorProdutos = 0;
            inputCodigoProdutos.value = produtos[contadorProdutos].codProduto;
            inputDescricaoProdutos.value = produtos[contadorProdutos].descProduto;
            inputPrecoProdutos.value = produtos[contadorProdutos].precoProduto;
            inputQuantidadeProdutos.value = produtos[contadorProdutos].qtdEstoqueProd;
        }

    });

    // Mapeando os inputs e botoes do formulario dos Produtos
    const inputCodigoPedido = document.querySelector('#inputCodigoPedido');
    const inputClientePedido = document.querySelector('#inputClientePedido');
    const primeiroElemento = document.querySelector('#primeiroElemento');
    const segundoElemento = document.querySelector('#segundoElemento');
    const terceiroElemento = document.querySelector('#terceiroElemento');
    const quartoElemento = document.querySelector('#quartoElemento');
    const quintoElemento = document.querySelector('#quintoElemento');
    const SectionTotal = document.querySelector('#SectionTotal');
    const inputTotal = document.querySelector('#inputTotal');
    const tbody = document.querySelector('#Pai');

    inputCodigoPedido.addEventListener('blur', function () {
        // Se o codigo não existir, mostrar cod min e cod max
        if (inputCodigoPedido.value < 1 || inputCodigoPedido.value > clientes.length) {
            inputClientePedido.value = `Código Inexistente! Codigo Min: ${clientes[0].codCliente}, Codigo Máx: ${clientes.length}`
        } else {
            var contadorPedidos = inputCodigoPedido.value - 1;
            inputClientePedido.value = clientes[contadorPedidos].nomeCliente;
        }
    });

    primeiroElemento.addEventListener('blur', function () {
        var valorInputCodigoProduto = primeiroElemento.value - 1;
        if (primeiroElemento.value < 1 || primeiroElemento.value > produtos.length) {
            segundoElemento.value = 'Código Inexistente';
            terceiroElemento.value = `min: ${produtos[0].codProduto}, max: ${produtos.length}`
        } else {
            segundoElemento.value = produtos[valorInputCodigoProduto].descProduto;
            terceiroElemento.value = produtos[valorInputCodigoProduto].precoProduto;
        }
    });

    var itenslancados = [];
    var somaTotal = 0;
    quintoElemento.addEventListener('click', function () {
        var contadorPedidos = primeiroElemento.value - 1; // -1 porque usarei o contadorPedidos como o index do array dos produtos
        if (Number(quartoElemento.value) > produtos[contadorPedidos].qtdEstoqueProd) {
            alert('Estoque não disponivel');
            quartoElemento.value = '';
        } else if (quartoElemento.value <= 0) { // evitar tabela com valor de Sub Total negativo ou nulo
            alert('Quantidade minima deve ser maior que 0');
            quartoElemento.value = ''
        } else {
            var itemIsEqual = false;
            for (let item in itenslancados) {
                if (Number(primeiroElemento.value) === itenslancados[item]) {
                    itemIsEqual = true;
                }
            }

            if (itemIsEqual) {
                alert('Item já lançado');
            } else {
                somaTotal += (Number(terceiroElemento.value) * Number(quartoElemento.value));

                if (SectionTotal.classList.contains('sumirSection')) {
                    SectionTotal.classList.replace('sumirSection', 'aparecerSection');
                }
                inputTotal.value = 'R$ ' + somaTotal.toFixed(2);

                const tr = document.createElement('tr');
                tbody.appendChild(tr);

                const tdItem = document.createElement('td');
                tdItem.textContent = primeiroElemento.value;
                tr.appendChild(tdItem);
                itenslancados.push(Number(primeiroElemento.value)); // add no array

                const tdDescricao = document.createElement('td');
                tdDescricao.textContent = segundoElemento.value;
                tr.appendChild(tdDescricao);

                const tdPreco = document.createElement('td');
                tdPreco.textContent = terceiroElemento.value;
                tr.appendChild(tdPreco);

                const tdQtd = document.createElement('td');
                tdQtd.textContent = quartoElemento.value;
                tr.appendChild(tdQtd);

                const tdSubTotal = document.createElement('td');
                tdSubTotal.textContent = (Number(terceiroElemento.value) * Number(quartoElemento.value)).toFixed(2);
                tr.appendChild(tdSubTotal);
            }
        }
    });
}