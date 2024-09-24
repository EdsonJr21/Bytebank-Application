# Bytebank Application

## Descrição

A aplicação Bytebank é um sistema bancário simples desenvolvido em Java, utilizando Maven como gerenciador de dependências. O sistema permite a abertura, encerramento, consulta de saldo, saques, depósitos e transferências entre contas bancárias.

## Funcionalidades

- Listar contas abertas
- Abertura de conta
- Encerramento de conta
- Consultar saldo de uma conta
- Realizar saque em uma conta
- Realizar depósito em uma conta
- Realizar transferência entre contas

## Executando a Aplicação

1. Clone o repositório.
2. Configure as variáveis de ambiente diretamente no seu sistema operacional:
    - `DB_JDBC_URL`: URL de conexão JDBC do banco de dados.
    - `DB_USERNAME`: Nome de usuário do banco de dados.
    - `DB_PASSWORD`: Senha do banco de dados.
3. Execute a aplicação através da classe `BytebankApplication`.

## Dependências

- Java
- Maven
- MySQL
- HikariCP