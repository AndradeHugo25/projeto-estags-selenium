#language: pt
#enconding: UTF-8

Funcionalidade: Cadastrar usuário
  Como usuário admin
  Ele deseja realizar o cadastro
  Para obter lista de diferentes perfis de usuários do sistema

  Cenário: Cadastrar usuário com sucesso
    Dado que o admin esteja na tela de cadastro
    Quando enviar valores válidos de cadastro
    Então o sistema exibe mensagem de sucesso


