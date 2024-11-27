# Lava Jato - POO

## Introdução
O sistema de automação de lava jato foi desenvolvido para facilitar e melhorar a escala e o monitoramento dos serviços prestados por um lava jato. Este documento descreve a motivação, os objetivos, as qualidades essenciais do sistema e as funcionalidades principais do projeto.

---

## Motivação
A criação deste sistema visa automatizar as operações de um lava jato, proporcionando:
- **Eficiência no gerenciamento de serviços**: Registro dos dados de veículos, funcionários e clientes.
- **Facilidade no processo de pagamento**: Suporte a opções variadas com taxas específicas.
- **Otimização de tempo e recursos**: Melhor experiência para os clientes e organização para o negócio.

---

## Objetivo do Projeto
Automatizar um sistema de lava jato para permitir que as empresas possam:
- **Analisar** os serviços prestados de forma mais eficiente.
- **Organizar** as informações de clientes, veículos e funcionários autonomamente.
- **Aumentar a segurança** das operações para os clientes.
- **Facilitar pagamentos**, oferecendo múltiplas opções com cálculos automáticos de taxas.

---

## Qualidades Essenciais do Sistema
O sistema se destaca pela capacidade de integrar diversos processos operacionais em uma única solução coesa, incluindo:

- **Gestão de Funcionários**: Registro de informações dos atendentes.
- **Gestão de Veículos**: Armazenamento de dados dos veículos atendidos.
- **Gestão de Clientes**: Cadastro de clientes, incluindo mensalistas.
- **Gestão de Serviços**: Controle dos serviços oferecidos e cálculo do preço total.
- **Gestão de Pagamentos**: Suporte a diferentes métodos de pagamento (PIX, dinheiro, cartão), aplicando taxas conforme necessário.

---

## Funcionalidades do Sistema
### 1. **Registro de Dados**
- Entrada de dados dos funcionários.
- Registro de veículos e serviços solicitados.
- Cadastro de clientes e informações adicionais.

### 2. **Cálculo de Serviços**
- Determinação dos preços dos serviços escolhidos.
- Aplicação de descontos para clientes premium.

### 3. **Processamento de Pagamentos**
- Oferece múltiplos métodos de pagamento (PIX, dinheiro, cartão).
- Cálculo do valor final com ou sem taxa adicional, dependendo do método de pagamento escolhido.

---

## Conclusão
Este projeto de Orientação a Objetos foi desenvolvido para atender os requisitos do professor orientador e explorar os principais pilares da POO:
- **Abstração**: Identificação das entidades principais (cliente, veículo, funcionário, serviços).
- **Encapsulamento**: Organização do código e proteção de dados sensíveis.
- **Herança**: Reaproveitamento de código entre entidades relacionadas.
- **Polimorfismo**: Implementação de métodos flexíveis para atender diferentes cenários.

O projeto foi implementado em **Java** e fornece um sistema autônomo para gerenciar as operações de um lava jato.

---

## Tecnologias Utilizadas
- **Linguagem**: Java
- **Paradigma**: Programação Orientada a Objetos (POO)

---

## Estrutura do Projeto
src/
├── entidades/
│   ├── Cliente.java
│   ├── Funcionario.java
│   ├── Veiculo.java
│   └── Servico.java
├── serviços/
│   ├── Pagamento.java
│   └── CalculadoraDeTaxas.java
└── main/
    └── LavaJatoApp.java
