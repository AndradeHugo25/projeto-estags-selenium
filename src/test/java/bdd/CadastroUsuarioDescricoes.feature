#language: pt
#encoding: UTF-8

Funcionalidade: Cadastrar usuário
  Como usuário admin
  Ele deseja realizar o cadastro
  Para obter lista de diferentes perfis de usuários do sistema

  Contexto:
    Dado que o admin esteja logado
    E que acesse o menu de cadastro

  Cenário: Cadastrar usuário com sucesso
    E que preencha valores válidos
    Quando clicar em Enviar
    Então o sistema exibe mensagem de sucesso

  Esquema do Cenário: Cadastrar vários usuários
    E que preencha nome "<nome>" e cpf <cpf>
    Quando clicar em Enviar
    Então o sistema exibe mensagem de sucesso

    Exemplos:
      | nome   | cpf   |
      | Maria  | 12345 |
      | Jonas  | 99999 |
      | Carlos | 54321 |


  Cenário: Cadastrar usuário sem email
    E que preencha os dados sem o email
    Quando clicar em Enviar
    Então o sistema permite cadastro
    Mas exibe alerta para o usuário

  @regressao
  Esquema do Cenário: Cadastrar vários usuários
    E que preencha nome "<nome>" e cpf <cpf>
    Quando clicar em Enviar
    Então o sistema exibe mensagem de sucesso

    Exemplos:
      | nome   | cpf   |
      | Maria  | 12345 |
      | Jonas  | 99999 |
      | Carlos | 54321 |

  @datatableExample


