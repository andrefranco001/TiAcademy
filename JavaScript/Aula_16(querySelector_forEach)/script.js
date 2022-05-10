window.onload = function(){

    const ulPai = document.querySelectorAll("#ulPai");

    ulPai.forEach(function(lista){
        lista.addEventListener("click",function(elemento){
            alert(elemento.target.innerHTML);
        })
    });
}