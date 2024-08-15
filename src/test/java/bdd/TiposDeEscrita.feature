#language: pt
#enconding: UTF-8

Funcionalidade: Cadastrar usuário
  Como usuário admin
  Ele deseja realizar o cadastro
  Para obter lista de diferentes perfis de usuários do sistema

  Cenário: Cadastrar de usuário com sucesso
    Dado que o usuário ainda não tenha cadastro
    Quando o cadastro for realizado
    Então o usuário deverá ter acesso a aplicação

  Cenário: Cadastro de usuário com sucesso
    Dado que o usuário esteja na tela de cadastro
    E ele clique no botão "Novo Usuário"
    E preencha o campo "nome"
    E preencha o campo "email"
    E preencha o campo "senha"
    E preencha o campo "telefone"
    Quando ele clica no botão "Salvar"
    Então o sistema exibe mensagem "Cadastro com sucesso!"


