window.onload = function(){
        
        const cxProduto = document.querySelector("#produto");
        const btnCadastrar = document.querySelector("#cadastrar");
        const lista = document.querySelector("#listaDeProdutos");

        btnCadastrar.addEventListener("click", function(){
                let li = document.createElement("li");
                lista.appendChild(li).setAttribute("class", "listaDeFrutas")
                lista.appendChild(li).textContent = cxProduto.value;
        })
}

