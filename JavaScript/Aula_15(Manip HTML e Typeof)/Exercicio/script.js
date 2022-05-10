window.onload = function (){

const input = document.querySelector("#input");
const calcular = document.querySelector("#calcular");
const resposta = document.querySelector("#resposta");

calcular.addEventListener("click", function(){
        let numero = Number(input.value);
        if (isNaN(numero)){
                resposta.innerHTML = "Digite um valor númerico";
        } else {
                if (numero < 1 || numero > 10) {
                        resposta.innerHTML = "Favor informar um número entre 1 e 10"
                } else {
                        resposta.innerHTML = `Tabuada do ${numero}:<br>`
                        for (i=0; i <=10; i++){
                                resposta.innerHTML += `${numero} x ${i} = ${numero * i} <br>`
                        }
                }
        }
        })
}
