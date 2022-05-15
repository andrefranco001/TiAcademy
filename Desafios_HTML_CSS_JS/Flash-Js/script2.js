window.onload = function (){

    const menuClientes = document.querySelector("#menuClientes");
    const menuProdutos = document.querySelector('#menuProdutos');
    const menuPedidos = document.querySelector('#menuPedidos');

    menuClientes.addEventListener('click',function(){
        alert("Menu dos Clientes")
    });

    menuProdutos.addEventListener('click',function(){
        alert("Menu dos Produtos")
    });

    menuPedidos.addEventListener('click',function(){
        alert("Menu dos Pedidos")
    });

}