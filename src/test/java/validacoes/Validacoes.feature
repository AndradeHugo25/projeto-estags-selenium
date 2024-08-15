#language:pt
#encoding:UTF-8

Funcionalidade: Cadastro

  Cenário: Cadastro com sucesso
    Dado que o usuário esteja na tela tal
    Quando enviar dados válidos de cadastro
    Então o sistema cadastra usuário com sucesso
    E exibe mensagem de sucesso "Cadastrado!"
    E redireciona para home do sistema

