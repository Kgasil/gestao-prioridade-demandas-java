# Gestão e Priorização de Demandas em Java (POO)

Projeto demonstrativo em **Java** aplicando **Programação Orientada a Objetos (POO)**, encapsulamento, validação de dados e regras de negócio para pontuação de prioridade, classificação de urgência e triagem de aprovação por custo.
> 🌐 *English version available below:* [Jump to English Version](#english-version)
---

## Estrutura e Regras de Negócio

* **`Demanda`:** Modela atributos da solicitação (título, área, custo estimado, dias restantes de SLA e impacto operacional crítico) com validação no construtor.
* **`CalculadoraPrioridadeService`:** Calcula um *score* de 0 a 100 considerando criticidade operacional, proximidade do SLA e faixa de custo, classificando a prioridade em **ALTA**, **MÉDIA** ou **BAIXA** e sinalizando casos que exigem revisão adicional.
* **`GestaoPrioridadeApp`:** Executa um cenário demonstrativo listando o resultado consolidado de cada demanda.

---

## Como Executar Localmente (Opcional)

1. Compile:
   ```bash
   javac GestaoPrioridadeApp.java
---

<a id="english-version"></a>

# Demand Management & Prioritization in Java (OOP)[cite: 8]

Demonstrative project in **Java** applying **Object-Oriented Programming (OOP)**, encapsulation, input validation, and business rules for priority scoring, urgency classification, and cost-based approval screening[cite: 8].

## Structure & Business Rules[cite: 8]

* `Demanda`: Models request attributes (title, department, estimated cost, remaining SLA days, and critical operational impact) with validation in the constructor[cite: 8].
* `CalculadoraPrioridadeService`: Calculates a score from 0 to 100 based on operational criticality, SLA proximity, and cost tier, classifying priority as **HIGH**, **MEDIUM**, or **LOW** and flagging cases that require additional review[cite: 8].
* `GestaoPrioridadeApp`: Runs a demonstrative scenario listing the consolidated result for each demand[cite: 8].

## How to Run Locally (Optional)[cite: 8]

1. Compile[cite: 8]:

```bash
javac GestaoPrioridadeApp.java
