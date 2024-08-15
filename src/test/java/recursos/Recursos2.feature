#language: pt
#encoding: UTF-8

@Recursos2
Funcionalidade: Edição

  @regressao @edit
  Cenário: Editar com sucesso
    Dado que o usuário esteja na tela tal
    Quando enviar dados válidos de edição
    Então sistema edita usuário com sucesso



