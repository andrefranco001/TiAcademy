window.onload = function(){
        
        usuarioSenha = [
                {User: 'André', 
                Senha: '12345'},
                {User: 'Master',
                Senha: 'Master'},
                {User: 'Thyago',
                Senha: '987654321'},

                       ]

        const inputUser = document.querySelector('#user');
        const inputSenha = document.querySelector('#senha');
        const botaoEntrar = document.querySelector('#button');

        botaoEntrar.addEventListener('click', function(){
                let userDigitado = inputUser.value;
                let senhaDigitada = inputSenha.value;

                for (dados of usuarioSenha){
                        if ((dados.User === userDigitado) && (dados.Senha === senhaDigitada)){
                                location.href = 'http://localhost/Desafios_HTML_CSS_JS/Flash-Js/painel.html';
                        } else {
                                location.href = 'http://localhost/Desafios_HTML_CSS_JS/Flash-Js';
                        }
                }
        });
}