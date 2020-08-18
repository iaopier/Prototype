# Prototype

Documentação da API para o teste da API de patrimônio da Prototype Ideas.

## Descrição API

A API contém o CRUD para Patrimônio e Marca. Um endpoint para criação de usuário e endpoint de autenticação de usuário existente.

Requisitos  
- Patrimônio  
- Campos:  
  - Nome - obrigatório  
  - MarcaId – obrigatório 
  - Descrição  
  - Nº do tombo 
Regras: O nº do tombo deve ser gerado automaticamente pelo sistema e não pode ser alterado pelos usuários.  

- Marca  
- Campos:  
   - Nome – obrigatório  
   - MarcaId - obrigatório  
Regras: Não deve permitir a existência de duas marcas com o mesmo nome.  

- Usuário 
-  Campos:  
   - Nome – obrigatório  
   - Email – obrigatório  
   - Senha - obrigatório  
Regras: Não permitir e-mail repetido 

## Funcionamento 

### Endpoints de autenticação

localhost:{xxxx}/usuario [POST] 
input:
```json 
{
    "username":"Piercarlo",
    "email":"pierhett@gmail.com",
    "password":"piercarlo"
}
```
localhost:{xxxx}/authenticate [POST]
input:
```json 
{
    "username":"Piercarlo",
    "password":"piercarlo"
}
```
output: token {xxxx} [Utilizado para acesso aos endpoints]

### Endpoints de CRUD (Patrimônio e Marca)

#### CRUD Patrimônio

localhost:{xxxx}/api/v1/patrimonio [GET]
input: vazia
output: JSON com a lista de patrimônio

localhost:{xxxx}/api/v1/patrimonio [POST]
input:

```json
{
  "nome":"nome",
  "marca_id":"marca_id",
  "descricao":"descricao"
}
``` 
localhost:{xxxx}/api/v1/patrimonio/{id} [PUT]
input: o campo que deseja alterar
```json
{
  "nome":"nome",
  "marca_id":"marca_id",
  "descricao":"descricao"
}
```
localhost:{xxxx}/api/v1/patrimonio/{id} [DELETE]
input: o id do patrimônio que deve ser deletado
