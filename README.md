# Prototype

Documentação da API para o teste da API de patrimônio da Prototype Ideas.

## Descrição API

A API contém o CRUD para Patrimônio e Marca. Um endpoint para criação de usuário e endpoint de autenticação de usuário existente.

Requisitos  
  Patrimônio  
    Campos:  
      Nome - obrigatório  
      MarcaId – obrigatório 
      Descrição  
      Nº do tombo 
Regras: O nº do tombo deve ser gerado automaticamente pelo sistema e não pode ser alterado pelos usuários.  

Marca  
  Campos:  
    Nome – obrigatório  
    MarcaId - obrigatório  
Regras: Não deve permitir a existência de duas marcas com o mesmo nome.  

Usuário 
  Campos:  
    Nome – obrigatório  
    Email – obrigatório  
    Senha - obrigatório  
Regras: Não permitir e-mail repetido 

## Funcionamento 

### Endpoints de autenticação

localhost:{xxxx}/usuario [POST] 
input:
 {
    "username":"Piercarlo",
    "email":"pierhett@gmail.com",
    "password":"piercarlo"
}

localhost:{xxxx}/authenticate [POST]
input:
 {
    "username":"Piercarlo",
    "password":"piercarlo"
}
output: token {xxxx} [Utilizado para acesso aos endpoints]

### Endpoints de CRUD (Patrimônio e Marca)

 
