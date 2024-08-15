#language: pt
#encoding: UTF-8

@Recursos
Funcionalidade: Cadastro

  @regressao @smoke
  Cenário: Cadastro com sucesso
    Dado que o usuário esteja na tela tal
    Quando enviar dados válidos de cadastro
    Então sistema cadastra usuário com sucesso

  @smoke
  Cenário: Exceção campos obrigatórios
    Dado que o usuário esteja na tela tal
    Mas ele não preenche os valores
    Quando enviar dados inválidos de cadastro
    Então sistema exibe crítica dos campos obrigatórios




