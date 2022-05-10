var listaNomes = ["André","José","Thyago","Francisco","Rodolfo"]


function naoSei(nomeLista, novoNome, indice){
    let tamanho = nomeLista.length;
    console.log(`Quantidade de elementos do array...: ${tamanho}`);
    nomeLista.push(novoNome);
    console.log(`Você inseriu o nome ${novoNome} para a lista`)
    console.log(`Você escolheu ${nomeLista[indice]} que é o ${indice}º nome na lista`)

}

naoSei(listaNomes, "Franco", 5);