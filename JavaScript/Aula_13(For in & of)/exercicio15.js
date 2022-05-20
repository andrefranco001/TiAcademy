let frutas = [
   {fruta: "Maça", preco: 3.36},
   {fruta: 'Melao', preco: 6.36}
]

function listaFrutas (f) {
    for (let produto of f) {
        for (let p in produto) {
            console.log(` ${p} -->  ${produto[p]}`);
        }
    }
}

listaFrutas(frutas);