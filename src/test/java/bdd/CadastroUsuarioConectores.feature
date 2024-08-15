#language: pt
#encoding: UTF-8

Funcionalidade: Cadastrar usuário
  Como usuário admin
  Ele deseja realizar o cadastro
  Para obter lista de diferentes perfis de usuários do sistema

  Cenário: Cadastrar usuário sem email
    Dado que o admin esteja na tela de cadastro
    E que preencha os dados sem o email
    Quando clicar em Enviar
    Então o sistema permite cadastro
    Mas exibe alerta para o usuário




