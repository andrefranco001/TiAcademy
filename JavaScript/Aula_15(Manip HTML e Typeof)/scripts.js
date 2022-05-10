/*let m = '5';

// console.log(typeof(m));

if (typeof(m) === 'number'){
    console.log(`O dado informado é um number: ${m}`)
} else {
    console.log(`O dado informado não é um number: ${m} : ${typeof(m)}`)
}*/


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