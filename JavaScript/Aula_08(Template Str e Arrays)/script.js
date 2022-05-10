// concatenação convencional //

/*
let str = "Qualquer conteúdo";
let str2 = "Uma outra string " + str;


 // Template String //
let str = `Qualquer conteudo!`;

let str2 = `uma outra string ${str}`;

console.log(str2);

// Arrays uma coleção de dados.
// o array é constituido por elementos
const frutas = ["Uva","Banana","Laranja", "Melancia"]; // len = 4

let euGosto = `eu gosto de ${frutas[3]}`

console.log(euGosto);*/

const Pessoa = [
    "José", // 0
    23, // 1
    "solteiro", // 2
    "Bola", // 3
    1.70,  // 4
    cores = ["azul", "preto", "vermelho", "salmão","ocre"] //5
];

let key = 3;
key++;

console.log("Marcelo"[0]);
console.log(Pessoa[5][key]); // array bidimensional


/*(function(p){
    const josé = `Meu nome é ${Pessoa[0]}, eu tenho ${Pessoa[1]} anos e sou ${Pessoa[2]}
    eu também gosto de jogar ${Pessoa[3]}. Minha altura é de ${Pessoa[4]}`;
    alert(josé)
})(Pessoa)*/
