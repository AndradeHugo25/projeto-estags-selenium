#language: pt
#encoding: UTF-8

Funcionalidade: Recarga de cartão

  Cenário: Recarregar vários cartões na mesma compra
    Dado que o usuário esteja na tela de recarga
    E que o usuário preencha os dados da recarga
      | numeroCartao | valorRecarga |
      | 09.12345-66  | 55           |
      | 04.12345-77  | 10           |
      | 04.12345-88  | 150          |
    Quando confirmar recarga
    Então sistema exibe mensagem de sucesso da recarga
    E redireciona para tela home


    


