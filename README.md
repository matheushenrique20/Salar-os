# Sistema de Gestão de Colaboradores e Folha de Pagamento

## Integrantes da Equipe

Matheus Henrique Silveira Gonçalves

---

## Descrição do Projeto

O Sistema de Gestão de Colaboradores e Folha de Pagamento foi desenvolvido em Java com o objetivo de cadastrar colaboradores e calcular seus salários de acordo com o tipo de vínculo empregatício.

O sistema permite armazenar informações dos colaboradores em uma lista dinâmica (ArrayList), realizar cálculos automáticos de salários, gerar relatórios e gerenciar os registros por meio de um menu interativo no terminal.

---

## Objetivos

* Aplicar conceitos de programação orientada a objetos.
* Utilizar estruturas condicionais e de repetição.
* Manipular listas dinâmicas com ArrayList.
* Realizar entrada e saída de dados utilizando Scanner e System.out.
* Desenvolver um sistema de cadastro funcional e organizado.

---

## Funcionalidades

### Cadastro de Colaboradores

O usuário pode cadastrar colaboradores informando:

* Nome
* CPF
* Salário Base
* Tipo de vínculo

### Tipos de Colaboradores

#### Funcionário Padrão

Recebe apenas o salário base.

**Fórmula:**

Salário Final = Salário Base

#### Funcionário Comissionado

Recebe salário base acrescido de comissão sobre vendas.

**Dados necessários:**

* Valor total de vendas
* Percentual de comissão

**Fórmula:**

Comissão = (Vendas × Percentual) ÷ 100

Salário Final = Salário Base + Comissão

#### Funcionário de Produção

Recebe salário base acrescido de bônus por produtividade.

**Dados necessários:**

* Valor por peça produzida
* Quantidade produzida

**Fórmula:**

Bônus = Valor por Peça × Quantidade Produzida

Salário Final = Salário Base + Bônus

---

## Funcionalidades Implementadas

* Cadastro de colaboradores
* Listagem de colaboradores
* Busca por nome
* Exclusão de colaboradores
* Cálculo automático de salários
* Relatório geral
* Armazenamento utilizando ArrayList
* Menu interativo utilizando switch-case

---

## Conceitos Aplicados

### Tipos de Dados

* int
* double
* String
* boolean

### Estruturas de Decisão

* if
* else if
* else
* switch

### Estruturas de Repetição

* for
* while
* do-while

### Coleções

* ArrayList

### Entrada e Saída de Dados

* Scanner
* System.out.println()

---

## Estrutura do Projeto

```text
src/
│
├── Colaborador.java
├── FuncionarioPadrao.java
├── FuncionarioComissionado.java
├── FuncionarioProducao.java
└── SistemaFolhaPagamento.java
```

---

## Como Executar

### Pré-requisitos

* Java JDK 17 ou superior
* IDE Java (NetBeans, Eclipse ou VS Code)

### Passos

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/sistema-folha-pagamento.git
```

2. Abra o projeto na IDE.

3. Execute a classe:

```java
SistemaFolhaPagamento.java
```

4. Utilize o menu para cadastrar e gerenciar colaboradores.

---

## Exemplo de Uso

```text
=== MENU ===

1 - Cadastrar Colaborador
2 - Listar Colaboradores
3 - Buscar Colaborador
4 - Excluir Colaborador
5 - Relatório Geral
0 - Sair
```

---

## Relatório Geral

O sistema exibe:

* Quantidade total de colaboradores
* Soma dos salários
* Maior salário
* Menor salário
* Média salarial

---

## Tecnologias Utilizadas

* Java
* Programação Orientada a Objetos (POO)
* Collections Framework (ArrayList)

---

## Conclusão

Este projeto foi desenvolvido para consolidar conhecimentos fundamentais da linguagem Java, incluindo manipulação de dados, estruturas de controle, coleções dinâmicas e organização de código em classes e métodos, simulando um sistema simples de gestão de colaboradores e folha de pagamento.
