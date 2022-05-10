
window.onload = function() {

        const botao = document.getElementById("btn");
        const txtbox = document.querySelector("#txtbox");
        const caixa = document.querySelector("#caixa");
    
        botao.addEventListener('click', function() {
            caixa.innerHTML = txtbox.value;
        })
    }

function Tabuada(numero){
if (typeof(numero) !== 'number'){
        alert("Digite um valor númerico")
} else {
        if (numero < 1 || numero > 10) {
                alert("Favor informar um número entre 1 e 10")
        } else {
                for (i=0; i <=10; i++){
                        caixa.innerHTML = `${numero} * ${i} = ${numero * i}`
                }
        }
}
}