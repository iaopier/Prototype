# Prototype

Documentação da API para o teste da API de patrimônio da Prototype Ideas. A solução adotada foi criar a API utilizando Spring Boot com Autenticação JWT e PostgreSQL. Dentro do arquivo Scripts estão arquivos de geração de banco de dados e um Docker compose para subir no container docker o PostgreSQL. Para o funcionamento da API deve ser criado um banco de dados chamado "patrimonio_db". No arquivo application.properties deve ser configurada senha e usuário do banco de dados.

Os teste realizados foram feitos com o Postman. Não foram realizados testes unitários com JUnit.

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

Para acesso aos CRUDs é necessário input com o token gerado na autenticação, para todos os métodos do CRUD.

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

OBS: Somente é adicionado um patrimonio se a marca já existe. Caso não exista uma exceção será gerada.

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

#### CRUD Marca

localhost:{xxxx}/api/v1/marca [GET]
input: vazia
output: JSON com a lista de marcas

localhost:{xxxx}/api/v1/marca [POST]
input:

```json
{
  "nome":"nome",
}
``` 
localhost:{xxxx}/api/v1/marca/{id} [PUT]
input: o campo que deseja alterar
```json
{
  "nome":"nome",
}
```
localhost:{xxxx}/api/v1/marca/{id} [DELETE]
input: o id da marca que deve ser deletado



