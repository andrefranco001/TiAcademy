param = Number(prompt("Digite um numero de 1 a 10"));

function Tabuada(numero){
    if (typeof(numero) !== "number"){
        alert("Digite um valor númerico válido")
    } else {
        if (numero < 1 || numero > 10) {
            alert("Digite um valor entre 1 e 10")
        } else {
            console.log(`Tabuada do ${numero}`)
            for (i=0; i<=10; i++){
                console.log(`${numero} X ${i} = ${numero * i}`)
            }
        }
    }
}

Tabuada(param);