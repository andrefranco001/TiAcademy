let palavra = prompt("Digite uma palavra que será invertida");

function invertePalavra(p, t="") {
    for(let i=(p.length-1); i >= 0; i--){
        console.log(p[i])
    }
}

invertePalavra(palavra);