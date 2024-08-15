#language: pt
#encoding: UTF-8

Funcionalidade: Pesquisar usuários

  Esquema do Cenário: Pesquisar usuário por idade
    Dado que esteja na tela de pesquisa
    Quando pesquisar usuário por idade <idade> anos
    Então sistema exibe resultado pesquisa

    Exemplos:
      | idade |
      | 12    |
      | 15    |
      | 71    |


    


