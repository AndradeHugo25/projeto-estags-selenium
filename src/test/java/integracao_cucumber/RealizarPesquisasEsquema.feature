#language: pt
#encoding: UTF-8

Funcionalidade: Pesquisar usuários

  Esquema do Cenário: Pesquisar usuário por idade
    Dado que o usuário esteja na tela de pesquisa
    Quando pesquisar usuário por idade de <idade> anos
    Então sistema exibe resultado da pesquisa

    Exemplos:
      | idade |
      | 12    |
      | 15    |
      | 71    |


    


