/*
1. crie uma função que irá pedir "Use o prompt: a altura, o peso e o Nome" Esta função deverá
calcular o IMC (peso / h**2) e deverá mostrar

Nome: nomeDaVariavel
Altura: h
Peso: weight
IMC: (peso / h**2)

*/

function solicitaDados() {
    let nome = prompt("Digite seu nome")
    let altura = prompt("Digite sua Altura")
    let peso = prompt("Informe o seu peso")

    let imc = peso/(altura**2))

    document.write(`Nome: ${nome}` + "<br>")
    document.write(`Altura: ${altura} m` + "<br>")
    document.write(`Peso: ${peso} Kg`+ "<br>")
    document.write(`IMC: ${imc}`)
}

solicitaDados();