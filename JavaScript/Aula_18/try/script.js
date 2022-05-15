// precisa ser inteiro (não float) não negativo
let m = 1;
try { //tenta 
        if (typeof(m) != "number") throw new Error("Digite um número");
        if (m < 0) throw new Error ("O Número não pode ser negativo");
        if (m % 1 !== 0) throw new Error("Digite um número inteiro");

} catch (erro){ //mostrar o erro
        console.log(`O Erro é: ${erro}`);

} finally{ //acontece dando ou não erro
        console.log("Cheguei no Finally");
        
}