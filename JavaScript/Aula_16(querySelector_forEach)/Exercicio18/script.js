window.onload = function(){

    const valor_1 = document.querySelector("#valor_1");
    const valor_2 = document.querySelector("#valor_2");
    const resultado = document.querySelector("#resultado");

    valor_2.addEventListener("blur", function(){
        let numero_1 = Number(valor_1.value);
        let numero_2 = Number(valor_2.value);

        if (isNaN(numero_1 && numero_2)){
            alert("Favor informar valor númerico válido")
        } else {
            resultado.value = (numero_1 + numero_2);
  
        }
        
    })
}