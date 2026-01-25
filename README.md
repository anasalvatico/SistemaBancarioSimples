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

- **Conta**
  - Representa a conta bancária
  - Possui saldo e está associada a um cliente
  - Contém as regras de negócio para saque e depósito

---

## 🔗 Conceitos de Orientação a Objetos Aplicados

- Associação entre classes (`Conta` possui um `Cliente`)
- Encapsulamento inicial de responsabilidades
- Separação de responsabilidades (regra de negócio vs interface)
- Uso de métodos para operações bancárias

---

## 📚 Objetivo do Projeto

Este projeto foi desenvolvido com fins educacionais, como parte do aprendizado em Java e Programação Orientada a Objetos, servindo como base para evoluções futuras, como:

- Encapsulamento completo (private, getters/setters)
- Uso de construtores
- Suporte a múltiplas contas por cliente
- Persistência de dados
- Interface gráfica ou API REST
