window.onload = function(){

        //função calcular
        function calcular(idProduto, resultado) {
                const preco = document.querySelectorAll(`#${idProduto} > li`);
                const valorResultado = document.querySelector(`#${resultado}`)

                let totalzinho = 0;
                for (let i of preco){
                        totalzinho += Number(i.dataset.preco); 
                        console.log(i.dataset.preco);
                }

                valorResultado.value = totalzinho;
        }

        function removerProdutos(id){
                const lista = document.querySelectorAll(`#${id} > li`);

                for(let produto of lista){
                        produto.addEventListener('click', function(){
                                produto.remove();
                                calcular("produtos","somatotal");
                        })
                }
        }

        removerProdutos("produtos");
        calcular("produtos","somatotal");       
}
export {calcular, removerProdutos};
