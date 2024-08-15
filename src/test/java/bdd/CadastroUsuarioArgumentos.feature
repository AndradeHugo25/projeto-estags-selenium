#language: pt
#enconding: UTF-8

Funcionalidade: Cadastrar usuário
  Como usuário admin
  Ele deseja realizar o cadastro
  Para obter lista de diferentes perfis de usuários do sistema

  Cenário: Cadastro com vários telefones
    Dado que o admin esteja na tela de cadastro
    E que preencha dados válidos
    E que preencha vários telefones
      | descricao | ddd | numero    |
      | Pessoal   | 21  | 995676554 |
      | Home      | 21  | 22345678  |
      | Trabalho  | 31  | 987699873 |
    Quando clicar em Enviar
    Então o sistema exibe mensagem de sucesso


