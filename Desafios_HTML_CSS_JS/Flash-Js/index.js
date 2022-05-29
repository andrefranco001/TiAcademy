        const inputUser = document.querySelector('#user');
        const inputSenha = document.querySelector('#senha');
        const botaoEntrar = document.querySelector('#button');

        function validaUser() {
                fetch('./usuario.json').then(function(response){
                        return response.json();

                }).then(function(data){
                        const users = data.users;                        
                        const findUser = users.find((item) => {
                                return item.user === inputUser.value && item.pws === inputSenha.value;
                                });         
                        if (findUser) {
                                location.href = 'panel.html';
                        } else{
                                alert('Usuario ou senha incorreta')
                        }
                });
        }
       
        botaoEntrar.addEventListener('click', function(event){
                event.preventDefault();
                console.log('click')
                validaUser();
        });