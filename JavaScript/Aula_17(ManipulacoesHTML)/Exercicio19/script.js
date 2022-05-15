window.onload = function(){

    let veiculos = ["Ônibus","Motocicletas","Patinete",];
    
    const btn = document.querySelector("#mostrarlista");
    const listaOrdenada = document.querySelector("#listaOrdenada");

    btn.addEventListener("click", function(){

    for(i=0; i < veiculos.length; i++){
        const filholistaOrdenada = document.createElement("li");
        listaOrdenada.appendChild(filholistaOrdenada).textContent = `${veiculos[i]}`;
    }
    })
}