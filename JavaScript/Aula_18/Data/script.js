let meses = [
    "Janeiro","Fevereiro","Março","Abril","Maio","Junho",
    "Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"
];

let diaSemana = [
    'Domingo',"Segunda-Feira","Terça-Feira","Quarta-Feira",
    "Quinta-Feira","Sexta-Feira","Sabado"
];

let data = new Date();
console.log(`Hoje é ${diaSemana[data.getDay()]} de ${meses[data.getMonth()]} de ${data.getFullYear()}`);

let dataFormatada = data.toLocaleString('pt-BR', {year:"numeric", month:'2-digit', day:"2-digit"});
console.log(dataFormatada);

// Métodos Getters (DATA) //
/*
getDate() traz o resultado do dia
getMonth() retorna o mes utilizado
getFullYear() retorna o ano com os 4 digitos
getHours() retorna o valor das horas
getMinutes() traz os minutos informados


//Metodos Setters (Data) (Alteram os valores dos getters)

setDate() Modifica o valor dia
setMonth() modifica o valor mes
setFullYear() modifica o valor do ano com os 4 digitos
setHours() modifica o valor das horas
setMinutes() modifica os minutos
*/