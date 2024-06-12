# Projeto Banco - Desafio de Programação Orientada a Objetos

## Descrição do Projeto

Este projeto foi desenvolvido como parte de um desafio do curso da Digital Innovation One (DIO) sobre Programação Orientada a Objetos (POO) em Java. O objetivo foi abstrair uma solução bancária, modelando e implementando as funcionalidades de contas correntes e poupança, que incluem operações de depósito, saque e transferência.

## Funcionalidades Implementadas

### Contas Bancárias
- **Conta Corrente**
  - Métodos: `depositar(double valor)`, `sacar(double valor)`, `transferir(double valor, IConta contaDestino)`, `imprimirExtrato()`

- **Conta Poupança**
  - Métodos: `depositar(double valor)`, `sacar(double valor)`, `transferir(double valor, IConta contaDestino)`, `imprimirExtrato()`

### Operações Bancárias
- Depósito
- Saque
- Transferência entre contas da mesma instituição

## Estrutura do Projeto

/BancoProjeto
|-- src
| |-- Banco.java
| |-- Cliente.java
| |-- Conta.java
| |-- ContaCorrente.java
| |-- ContaPoupanca.java
| |-- IConta.java
| |-- Main.java

scss
Copy code

## Diagrama UML

Foi criado um diagrama UML para representar as classes e interfaces das funcionalidades acima mencionadas. Abaixo está uma visualização do diagrama:

```mermaid
classDiagram
    class IConta {
        <<interface>>
        +depositar(double valor)
        +sacar(double valor)
        +transferir(double valor, IConta contaDestino)
        +imprimirExtrato()
    }

    class Cliente {
        -String nome
        +Cliente(nome)
        +getNome()
        +setNome(nome)
    }

    class Conta {
        #int agencia
        #int numero
        #double saldo
        #Cliente cliente
        +Conta(cliente)
        +depositar(double valor)
        +sacar(double valor)
        +transferir(double valor, IConta contaDestino)
        +imprimirInfosComuns()
    }

    Conta <|-- ContaCorrente
    Conta <|-- ContaPoupanca
    IConta <|-- Conta
    Conta --> Cliente

    class ContaCorrente {
        +imprimirExtrato()
    }

    class ContaPoupanca {
        +imprimirExtrato()
    }

    class Banco {
        -String nome
        -List<Conta> contas
        +Banco(nome)
        +getNome()
        +setNome(nome)
        +getContas()
        +adicionarConta(conta)
    }