<h1 align="center">Credit Card Validator</h1>

<p align="center">
  <img src="https://img.shields.io/static/v1?label=&message=Java&color=gray&style=for-the-badge&logo=oracle"/>
  <img src="https://img.shields.io/static/v1?label=&message=Maven&color=gray&style=for-the-badge&logo=apachemaven"/>
  <img src="https://img.shields.io/static/v1?label=&message=Spring%20Boot&color=gray&style=for-the-badge&logo=spring"/>
  <img src="https://img.shields.io/static/v1?label=&message=JaCoCo&color=gray&style=for-the-badge&logo=jacoco"/>
  <img src="https://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=red&style=for-the-badge"/>
</p>

## :mag: Índice

:small_blue_diamond: [Descrição do projeto](#pushpin-descrição-do-projeto)  
:small_blue_diamond: [Funcionalidades](#hammer-funcionalidades)  
:small_blue_diamond: [Acesso ao Projeto](#file_folder-acesso-ao-projeto)  
:small_blue_diamond: [Tecnologias utilizadas](#heavy_check_mark-tecnologias-utilizadas)  
:small_blue_diamond: [Pré-requisitos](#books-pré-requisitos)  
:small_blue_diamond: [Como rodar a aplicação](#arrow_forward-como-rodar-a-aplicação)  
:small_blue_diamond: [Desenvolvedores e Contribuintes](#octocat-desenvolvedores-e-contribuintes)  
:small_blue_diamond: [Tarefas em aberto](#memo-tarefas-em-aberto)

## :pushpin: Descrição do projeto

<p align="justify">
  O Credit Card Validator é um projeto que permite validar números de cartões de crédito e identificar o tipo do cartão com base em padrões específicos.
</p>
<p align="justify">
  O sistema utiliza expressões regulares para identificar os tipos de cartões e oferece um serviço REST para validação.
</p>

## :hammer: Funcionalidades

- :credit_card: Validação de números de cartões de crédito.
- :mag: Identificação do tipo de cartão:
    - Mastercard
    - Visa
    - American Express
    - Diners Club
    - Discover
    - Enroute
    - JCB
    - Voyager
    - Hipercard
    - Aura
    - Desconhecido
- :page_facing_up: Exibição do tipo do cartão validado.

## :file_folder: Acesso ao projeto

Você pode acessar o [código fonte do projeto](https://github.com/wkyoshimatsu/credit-card-validator) ou [baixar o projeto](https://github.com/wkyoshimatsu/credit-card-validator/archive/refs/heads/main.zip).

## :heavy_check_mark: Tecnologias utilizadas

- `Java 17`:
  > Linguagem de programação utilizada para o desenvolvimento do projeto.

- `Spring Boot`:
  > Framework utilizado para criar o serviço REST e gerenciar a aplicação.

- `Maven`:
  > Utilizado como gerenciador de dependências e automação de compilação.

- `JaCoCo`:
  > Ferramenta utilizada para análise de cobertura de testes.

## :books: Pré-requisitos

- Java 17 instalado.
- Maven configurado.

## :arrow_forward: Como rodar a aplicação

1. Clone o repositório do projeto ou [baixe o arquivo ZIP](https://github.com/wkyoshimatsu/credit-card-validator/archive/refs/heads/main.zip):

```bash
git clone https://github.com/wkyoshimatsu/credit-card-validator
```
2. Entre na pasta do projeto:

```bash
cd credit-card-validator
```
3. Execute o Maven para compilar o projeto:

```bash
mvn clean install
```
4. Execute a aplicação:

```bash
mvn spring-boot:run
```
5. Acesse a aplicação no navegador ou via ferramenta de testes REST (como Postman) no seguinte endereço:

   - Validação de Cartão
     - URL: /api/validate-card
     -  Método: POST
     - Entrada: Número do cartão no corpo da requisição (JSON).
     - Saída: Tipo do cartão (JSON).

Exemplo de requisição:
```bash
"HIPERCARD"
```
:octocat: Desenvolvedores e Contribuintes
<img src="https://avatars2.githubusercontent.com/u/101765683?v=4"></img>
<sub>Washington Yoshimatsu</sub>
:memo: Tarefas em aberto
:small_blue_diamond: Implementar suporte a novos tipos de cartões.
:small_blue_diamond: Adicionar documentação Swagger para os endpoints REST.

<hr></hr> Copyright :copyright: 2025 - Credit Card Validator