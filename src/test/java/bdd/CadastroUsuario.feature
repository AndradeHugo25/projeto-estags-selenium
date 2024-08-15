#language: pt
#encoding: UTF-8

@Cadastro
Funcionalidade: Cadastrar usuário
  Como usuário admin
  Ele deseja realizar o cadastro
  Para obter lista de diferentes perfis de usuários do sistema

  Contexto:
    Dado que o admin esteja logado
    E que acesse o menu de cadastro

  @regressao @smoke @weekly
  Cenário: Cadastrar usuário com sucesso
    E que preencha valores válidos
    Quando clicar em Enviar
    Então o sistema exibe mensagem de sucesso

  @regressao @weekly
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
  Cenário:
    E que preencha dados válidos
    E que preencha vários telefones
      | descricao | ddd | numero    |
      | Pessoal   | 21  | 995676554 |
      | Home      | 21  | 22345678  |
      | Trabalho  | 31  | 987699873 |
    Quando clicar em Enviar
    Então o sistema exibe mensagem de sucesso


