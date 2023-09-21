# Projeto Spring Security com Persistência de Dados
Visão Geral
Este projeto é uma aplicação web que utiliza o Spring Security para implementar autenticação e autorização, persistindo dados relacionados aos usuários e suas permissões em um banco de dados. Além disso, ele inclui um sistema client-server para acessar recursos no servidor de recursos e um servidor de autenticação que garante a autenticação dos usuários antes de qualquer solicitação de acesso a recursos protegidos.

## Funcionalidades Principais
Autenticação de Usuários: O projeto utiliza o Spring Security para autenticar usuários, garantindo que apenas usuários autenticados tenham acesso aos recursos protegidos.

- Autorização com Base em Papéis: As permissões dos usuários são armazenadas no banco de dados, permitindo a autorização com base em papéis (roles). Isso significa que diferentes usuários podem ter diferentes níveis de acesso aos recursos.

- Persistência de Dados: Utiliza um banco de dados para armazenar informações de usuários, senhas criptografadas e dados relacionados a permissões. O projeto escolhe o banco de dados [insira o nome do banco de dados aqui], mas você pode configurá-lo de acordo com suas necessidades.

- Cliente-Servidor para Acesso a Recursos: O sistema inclui um cliente que faz solicitações a um servidor de recursos protegidos. O servidor de recursos verifica as credenciais do cliente antes de conceder acesso aos recursos.

- Servidor de Autenticação: Antes de qualquer solicitação de acesso a recursos protegidos, o servidor de autenticação garante que o cliente (usuário) esteja autenticado. Isso é essencial para manter a segurança.

## Pré-requisitos
Antes de começar a usar o projeto, certifique-se de ter as seguintes ferramentas e tecnologias instaladas:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Spring Framework](https://spring.io/)
- [Banco de Dados](https://www.mysql.com/)

## Configuração
Clone este repositório para sua máquina local usando o seguinte comando:

bash

git clone https://github.com/MiguelNunes3344/Oauth2Authentication.git

## Uso

Configure as informações de conexão com o banco de dados no arquivo application.properties ou application.yml.

Execute o servidor de autenticação.

Execute o servidor de recursos.

Execute o cliente para acessar os recursos protegidos.



