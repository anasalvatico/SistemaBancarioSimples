# 💳 Sistema Bancário em Java (Console)

Projeto simples em Java desenvolvido com o objetivo de praticar **Programação Orientada a Objetos (POO)**, controle de fluxo e entrada de dados via console, simulando operações básicas de um sistema bancário.

---

## 📌 Funcionalidades

- Cadastro de cliente (nome e CPF)
- Criação de conta associada a um cliente
- Exibição de saldo
- Depósito em conta
- Saque em conta
- Menu interativo em loop
- Validação básica de valores

---

## 🧱 Estrutura do Projeto

O projeto é composto pelas seguintes classes:

- **Main**
  - Responsável pela interação com o usuário via console
  - Controla o menu e o fluxo da aplicação

- **Cliente**
  - Representa o cliente do banco
  - Contém dados como nome e CPF
  - Utiliza encapsulamento com atributos privados, construtor e getters/setters

- **Conta**
  - Representa a conta bancária
  - Possui saldo e está associada a um cliente
  - Contém as regras de negócio para saque e depósito
  - Utiliza encapsulamento e construtor para associação com o cliente

- **Menu**

  - Responsável pela exibição do menu interativo no console
  - Apresenta as opções de operações disponíveis para o usuário
  - Centraliza a lógica de apresentação do menu, separando interface do fluxo principal

---

## 🔗 Conceitos de Orientação a Objetos Aplicados

- Associação entre classes (`Conta` possui um `Cliente`)
- Encapsulamento (`private`, getters e setters)
- Uso de construtores para inicialização de objetos
- Separação de responsabilidades (regra de negócio vs interface)
- Controle de fluxo com estruturas de repetição e condição

---

## 📚 Objetivo do Projeto

Este projeto foi desenvolvido com fins educacionais, com foco no aprendizado de Java e Programação Orientada a Objetos, servindo como base para evoluções futuras, como:

- Suporte a múltiplas contas por cliente
- Persistência de dados (arquivo ou banco de dados)
- Interface gráfica ou API REST
- Tratamento de exceções mais avançado
