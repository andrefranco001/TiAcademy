window.onload = function (){

    // Mapeando os botoes do Menu para abrir os formularios
    const menuClientes = document.querySelector('#menuClientes');
    const menuProdutos = document.querySelector('#menuProdutos');
    const menuPedidos  = document.querySelector('#menuPedidos');
    const formClientes = document.querySelector('#formClientes');1
    const formProdutos = document.querySelector('#formProdutos');
    const formPedidos  = document.querySelector('#formPedidos');
    const xClientes    = document.querySelector('#xClientes');
    const xProdutos    = document.querySelector('#xProdutos');
    const xPedidos     = document.querySelector('#xPedidos');

    menuClientes.addEventListener('click',function(){
        if (formProdutos.classList.contains('aparecerForm') || (formPedidos.classList.contains('aparecerForm'))){
        formProdutos.classList.replace('aparecerForm','sumirForm');
        formPedidos.classList.replace('aparecerForm','sumirForm');
        formClientes.classList.replace('sumirForm','aparecerForm');
        }  else if (formClientes.classList.contains('sumirForm')){
            formClientes.classList.replace('sumirForm','aparecerForm')
        } else {
            formClientes.classList.replace('aparecerForm','sumirForm');
        }}); // Abrir o formulario de Clientes e fechar se algum tiver aberto, pode fechar a si ele proprio
    menuProdutos.addEventListener('click',function(){ 
        if (formClientes.classList.contains('aparecerForm') || (formPedidos.classList.contains('aparecerForm'))){
            formClientes.classList.replace('aparecerForm',"sumirForm");
            formPedidos.classList.replace('aparecerForm',"sumirForm");
            formProdutos.classList.replace('sumirForm','aparecerForm');
        } else if (formProdutos.classList.contains('sumirForm')){
            formProdutos.classList.replace('sumirForm','aparecerForm')
        } else {
            formProdutos.classList.replace('aparecerForm','sumirForm');
        }}); // Abrir o formulario de Produtos e fechar se algum tiver aberto, pode fechar a si ele proprio
    menuPedidos.addEventListener('click',function(){
        if (formClientes.classList.contains('aparecerForm') || (formProdutos.classList.contains('aparecerForm'))){
            formClientes.classList.replace('aparecerForm',"sumirForm");
            formProdutos.classList.replace('aparecerForm',"sumirForm");
            formPedidos.classList.replace('sumirForm','aparecerForm');
        } else if (formPedidos.classList.contains('sumirForm')){
            formPedidos.classList.replace('sumirForm','aparecerForm')
        } else {
            formPedidos.classList.replace('aparecerForm','sumirForm');
        }}); // Abrir o formulario de Pedidos e fechar se algum tiver aberto, pode fechar a si ele proprio

    xClientes.addEventListener('click', function(){
        formClientes.classList.replace('aparecerForm','sumirForm');
    }); // Fechar o formulario do cliente com o X
    xProdutos.addEventListener('click', function(){
        formProdutos.classList.replace('aparecerForm','sumirForm');
    }); // Fechar o formulario do Produtos com o X
    xPedidos.addEventListener('click', function(){
        formPedidos.classList.replace('aparecerForm','sumirForm');
    }); // Fechar o formulario do Pedidos com o X
    // Fim do mapeamento dos botoes do Menu para abrir os formularios


    // Mapeando os inputs e botoes do formulario dos Clientes
    const inputCodigoClientes = document.querySelector('#inputCodigoClientes');
    const inputNomeClientes = document.querySelector('#inputNomeClientes');
    const inputDataCadastroClientes = document.querySelector("#inputDataCadastroClientes");
    const botaoAnteriorClientes = document.querySelector('#botaoAnteriorClientes');
    const botaoProximoClientes = document.querySelector('#botaoProximoClientes');
    const botaoNovoClientes = document.querySelector('#botaoNovoClientes');
    const botaoSalvarClientes = document.querySelector('#botaoSalvarClientes');

    contadorClientes = 0; // contador para 
    var codigosClientes = [];
    var nomes = [];
    var datas = [];

    const data = new Date();
    const dataAtual = data.toLocaleString('pt-BR',{year:"numeric", month:'2-digit', day:"2-digit"});

    inputCodigoClientes.value = '1';
    inputNomeClientes.value = '';
    inputDataCadastroClientes.value = dataAtual;

    botaoAnteriorClientes.addEventListener('click', function(){
        if (contadorClientes > codigosClientes.length){
            contadorClientes--;
        }
        if (contadorClientes >= 1 ) {
            contadorClientes--;
            inputCodigoClientes.value = codigosClientes[contadorClientes];
            inputNomeClientes.value = nomes[contadorClientes];
            inputDataCadastroClientes.value = datas[contadorClientes];
        } else{
            alert('Você chegou ao inicio dos registros')
        }
    });
    botaoProximoClientes.addEventListener('click', function(){
        if (contadorClientes < codigosClientes.length-1){ // -1 para validar com o Index dos clientes
            contadorClientes++;
            inputCodigoClientes.value = codigosClientes[contadorClientes];
            inputNomeClientes.value = nomes[contadorClientes];
            inputDataCadastroClientes.value = datas[contadorClientes];
        } else {
            alert('Você chegou ao fim dos Registros')
        }
    });
    botaoNovoClientes.addEventListener('click', function(){  
        contadorClientes = codigosClientes.length+1;
        inputCodigoClientes.value = contadorClientes;
        inputNomeClientes.value = '';
        inputDataCadastroClientes.value = dataAtual;         
    });
    botaoSalvarClientes.addEventListener('click', function(){

    clientName = '';
    isEqual = false; // Validar se o Cliente já está na lista nomes
    for (let nomeClientes in nomes){
        if (inputNomeClientes.value === nomes[nomeClientes]){
            isEqual = true;
            clientName = nomes[nomeClientes];

        }
    }

    codeIsEqual = false;
    for (code in codigosClientes){ // Validar se o Código já está na lista codigoClientes
        if (inputCodigoClientes.value === codigosClientes[code]){
            codeIsEqual = true;
        }
    }

    if (isEqual){
        // se existir, não cadastrar
        alert(`O Cliente ${clientName} já existe! Crie um novo Cliente ou verifique o código do Cliente desejado.`)
        inputNomeClientes.value = '';
    } else if (codeIsEqual){
        alert('Código já existente, Clique no botão Novo para criar um novo cadastro ');
    /* else if (inputDescricaoProdutos.value.length <= 3 || inputDescricaoProdutos.value == ''){
        alert('Descrição não pode estar vazio ou conter abreviação')*/
    } else { // Se não existir, cadastrar
        alert('Cliente Cadastrado com Sucesso');
        codigosClientes.push(inputCodigoClientes.value);
        nomes.push(inputNomeClientes.value);
        datas.push(inputDataCadastroClientes.value); 
        
        /* Resetar o contador para que possa navegar pro proximo cadastro
            e após salvo mostrar o primeiro cadastro*/
        contadorClientes = 0;
        inputCodigoClientes.value = codigosClientes[contadorClientes];
        inputNomeClientes.value = nomes[contadorClientes];
        inputDataCadastroClientes.value = datas[contadorClientes];
    }
    });


    // Fim das funcoes do formulario Clientes

    // Funcoes do formulario Produtos
    const inputCodigoProdutos = document.querySelector('#inputCodigoProdutos');
    const inputDescricaoProdutos = document.querySelector('#inputDescricaoProdutos');
    const inputPrecoProdutos = document.querySelector('#inputPrecoProdutos');
    const inputQuantidadeProdutos = document.querySelector('#inputQuantidadeProdutos');
    const botaoAnteriorProdutos = document.querySelector('#botaoAnteriorProdutos');
    const botaoProximoProdutos = document.querySelector('#botaoProximoProdutos');
    const botaoNovoProdutos = document.querySelector('#botaoNovoProdutos');
    const botaoSalvarProdutos = document.querySelector('#botaoSalvarProdutos');

    var contadorProdutos = 1;
    var codigoProdutos = [];
    var descricaoProdutos = [];
    var precoProdutos = [];
    var quantidadeProdutos = [];

    inputCodigoProdutos.value = '1';
    inputDescricaoProdutos.value = '';
    inputPrecoProdutos.value = '';
    inputQuantidadeProdutos.value = '';

    botaoAnteriorProdutos.addEventListener('click', function(){
        if (contadorProdutos > codigoProdutos.length){
            contadorProdutos--;
        }
        if (contadorProdutos > 0){
            contadorProdutos--;
            inputCodigoProdutos.value = codigoProdutos[contadorProdutos];
            inputDescricaoProdutos.value = descricaoProdutos[contadorProdutos];
            inputPrecoProdutos.value = precoProdutos[contadorProdutos];
            inputQuantidadeProdutos.value = quantidadeProdutos[contadorProdutos];
        } else {
            alert('Você chegou ao Inicio');
        }
    });

    botaoProximoProdutos.addEventListener('click', function(){
        if (contadorProdutos < codigoProdutos.length-1){
            contadorProdutos++;
            inputCodigoProdutos.value = codigoProdutos[contadorProdutos];
            inputDescricaoProdutos.value = descricaoProdutos[contadorProdutos];
            inputPrecoProdutos.value = precoProdutos[contadorProdutos];
            inputQuantidadeProdutos.value = quantidadeProdutos[contadorProdutos];
        } else {
            alert('Você chegou ao Fim');
        }
        });

    botaoNovoProdutos.addEventListener('click', function(){
        contadorProdutos = codigoProdutos.length+1;
        inputCodigoProdutos.value = contadorProdutos;
        inputDescricaoProdutos.value = '';
        inputPrecoProdutos.value = '';
        inputQuantidadeProdutos.value = '';
    });

    botaoSalvarProdutos.addEventListener('click', function(){
        productName = '';
        isEqual = false; // Validar se o Produto já está na lista descricaoProdutos
        for (let nomeProduto in descricaoProdutos){
            if (inputDescricaoProdutos.value === descricaoProdutos[nomeProduto]){
                isEqual = true;
                productName = descricaoProdutos[nomeProduto];
            }
        }
        codeIsEqual = false;
        for (code in codigoProdutos){ // Validar se o Código já está na lista codigoProdutos
            if (inputCodigoProdutos.value === codigoProdutos[code]){
                codeIsEqual = true;
            }
        }

        if (inputPrecoProdutos.value <= 0){ // Validar se o preço é maior que 0
            alert('Preço minimo deve ser maior do que 0'); 
        } else if (inputQuantidadeProdutos.value <= 0) {  // Validar se o preço é maior que 0
            alert('Quantidade minima deve ser maior do que 0');
        } else if (isEqual){ // se produto já existir, não cadastrar
            alert(`O Produto ${productName} já existe! Crie um novo produto ou verifique o código do Produto desejado.`)
            inputDescricaoProdutos.value = '';
        } else if (codeIsEqual){ // se código já existir, não cadastrar
            alert('Código já existe, Clique no botão Novo');
            inputCodigoProdutos.value = codigoProdutos[contadorProdutos];
        /* else if (inputDescricaoProdutos.value.length <= 3 || inputDescricaoProdutos.value == ''){
            alert('Descrição não pode estar vazio ou conter abreviação')*/
        } else { // se não existir, cadastar
            alert('Produto Cadastrado com Sucesso');
            codigoProdutos.push(inputCodigoProdutos.value);
            descricaoProdutos.push(inputDescricaoProdutos.value);
            precoProdutos.push(inputPrecoProdutos.value);
            quantidadeProdutos.push(inputQuantidadeProdutos.value)    
            
            /* Resetar o contador para que possa navegar pro proximo cadastro
            e após salvo mostrar o primeiro cadastro*/
            contadorProdutos = 0;
            inputCodigoProdutos.value = codigoProdutos[contadorProdutos];
            inputDescricaoProdutos.value = descricaoProdutos[contadorProdutos];
            inputPrecoProdutos.value = precoProdutos[contadorProdutos];
            inputQuantidadeProdutos.value = quantidadeProdutos[contadorProdutos];
        } 
    });
    // Funcoes do formulario Pedidos

    const inputCodigoPedido = document.querySelector('#inputCodigoPedido');
    const inputClientePedido = document.querySelector('#inputClientePedido');
    const primeiroElemento = document.querySelector('#primeiroElemento');
    const segundoElemento = document.querySelector('#segundoElemento');
    const terceiroElemento = document.querySelector('#terceiroElemento');
    const quartoElemento = document.querySelector('#quartoElemento');
    const quintoElemento = document.querySelector('#quintoElemento');

    inputCodigoPedido.addEventListener('blur', function(){
        if (inputCodigoPedido.value < 1 ||inputCodigoPedido.value > codigosClientes.length){
            inputClientePedido.value = `Código Inexistente! Codigo Min: ${codigosClientes[0]}, Codigo Máx: ${codigosClientes.length}`
        } else {
            valorInputCodigoCliente = inputCodigoPedido.value;
            inputClientePedido.value = nomes[valorInputCodigoCliente-1];
        }
        
    });

    primeiroElemento.addEventListener('blur',function(){
        if (primeiroElemento.value < 1 || primeiroElemento.value > codigoProdutos.length) {
            segundoElemento.value = 'Código Inexistente';
            terceiroElemento.value = `min: ${codigosClientes[0]}, max: ${codigosClientes.length}`

        } else {
            valorInputCodigoProduto = primeiroElemento.value;
            segundoElemento.value = descricaoProdutos[valorInputCodigoProduto-1];
            terceiroElemento.value = Number(precoProdutos[valorInputCodigoProduto-1])
        }
        
    });

    quintoElemento.addEventListener('click',function(){
        alert('Teste')
    });


}