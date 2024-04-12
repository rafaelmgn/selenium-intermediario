# Projeto Selenium WebDriver Java

Este é um projeto de exemplo utilizando **Selenium WebDriver** com **Java**, que inclui **Page Objects** e **Hooks** para automação de testes.

## Pré-requisitos

- **JDK (Java Development Kit)** instalado
- **Maven** instalado
- **Driver do Chrome** baixado e inserido na pasta raiz do projeto

## Configuração

1. Clone o repositório para o seu ambiente local.

2. Certifique-se de ter o **driver do Chrome (chromedriver)** baixado e inserido na pasta raiz do projeto.

3. Importe o projeto na sua IDE preferida como um projeto **Maven**.

## Estrutura do Projeto

O projeto segue uma estrutura de **Page Objects** para organizar os elementos da página e **Hooks** para configuração e limpeza de recursos antes e depois dos testes.

```
├───src
│   ├───main
│   │   ├───java
│   │   └───resources
│   └───test
│       ├───java
│       │   ├───pages           # Pacote contendo as classes de Page Objects
│       │   ├───runner          # Pacote contendo as classes de execução e configuração
│       │   ├───steps           # Pacote contendo as classes de Steps para testes Cucumber
|       |   |   └───Hooks.java
|       |   |
│       │   └───support         # Pacote contendo classes de suporte, como Utils
│       └───resources
│           └───features        # Diretório contendo arquivos de feature do Cucumber
└───target                      # Diretório de saída do Maven
```

## Executando os Testes

Os testes automatizados podem ser executados utilizando sua IDE ou por linha de comando usando Maven.

Para executar todos os testes, utilize o seguinte comando:

```
mvn test
```

## Contribuindo

Sinta-se à vontade para contribuir com novos testes, melhorias na estrutura do projeto ou correções de bugs. Basta enviar um **pull request**!
