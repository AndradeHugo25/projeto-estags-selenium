#language: pt
#encoding: UTF-8

Funcionalidade: Pesquisar usuários

  Cenário: Pesquisar usuário pelo nome
    Dado que esteja na tela de pesquisa
    Quando pesquisar usuário pelo "Neemias"
    Então sistema exibe resultado pesquisa

  Cenário: Pesquisar usuário pela idade
    Dado que esteja na tela de pesquisa
    Quando pesquisar usuário pelo idade aproximada 45
    Então sistema exibe resultado pesquisa



