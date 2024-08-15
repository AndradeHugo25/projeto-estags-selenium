#language: pt
#encoding: UTF-8

Funcionalidade: Pesquisar usuários

  Cenário: Pesquisar usuário pelo nome
    Dado que o usuário esteja na tela de pesquisa
    Quando pesquisar usuário pelo nome "Neemias"
    Então sistema exibe resultado da pesquisa

  Cenário: Pesquisar usuário pela idade
    Dado que o usuário esteja na tela de pesquisa
    Quando pesquisar usuário pelo idade aproximada de 45
    Então sistema exibe resultado da pesquisa



