/*function Pessoa (nome){
    this.nome = nome;
}

Pessoa.prototype.msg = function(){
    alert("Olá " + this.nome);
}

let NovaPessoa = new Pessoa("André Franco");
let OutraPessoa = new Pessoa("Maria");

NovaPessoa.msg();
OutraPessoa.msg();
// console.log(NovaPessoa.nome) //

console.log(NovaPessoa);

let Pessoa2 = {
    "nome": "",
    "idade": ""
}

// console.log(Pessoa2)

Pessoa2.__proto__.msg = function(){
    alert("Olá "+ Pessoa2.nome);
}

let P = Pessoa2;
P.nome = "André Franco"
P.msg();
console.log(P);*/


let Pessoa3  = [
    {
    "nome": "André",
    "idade": 23,
    "Sexo": "M"
    },
    {
    "nome": "Kelly",
    "idade": 52,
     "Sexo": "F"
    },
    {
    "nome": "Marcos",
    "idade": 40,
    "Sexo": "M"
    },
    {
    "nome": "Danubia",
    "idade": 40,
    "Sexo": "F"
    }
]

let NPessoa = Pessoa3;
console.log(`Existem ${NPessoa.length} pessoas cadastradas`)
console.log(NPessoa[0].nome);







