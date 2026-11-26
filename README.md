# Gestão e Priorização de Demandas em Java (POO)

<!-- kg-personal-portfolio-v1 -->

[KG Professional Portfolio 1.0 — Portfólio pessoal / Personal portfolio](https://kgasil.github.io/portfolio/) · [Estudo de caso / Case study](https://kgasil.github.io/portfolio/cases.html#priority) · [Demonstração ilustrativa / Illustrative demo](https://kgasil.github.io/portfolio/lab.html#priority)

<!-- kg-current-training -->
[Formação e experiência atualizadas / Updated education and experience](https://kgasil.github.io/portfolio/resume.html).


Projeto demonstrativo em **Java** aplicando **Programação Orientada a Objetos (POO)**, encapsulamento, validação de dados e regras de negócio para pontuação de prioridade, classificação de urgência e triagem de aprovação por custo.
> 🌐 *English version available below:* [Jump to English Version](#english-version)
---

## Estrutura e Regras de Negócio

* **`Demanda`:** Modela atributos da solicitação (título, área, custo estimado, dias restantes de SLA e impacto operacional crítico) com validação no construtor.
* **`CalculadoraPrioridadeService`:** Calcula um *score* de 0 a 100 considerando criticidade operacional, proximidade do SLA e faixa de custo, classificando a prioridade em **ALTA**, **MÉDIA** ou **BAIXA** e sinalizando casos que exigem revisão adicional.
* **`GestaoPrioridadeApp`:** Executa um cenário demonstrativo listando o resultado consolidado de cada demanda.

---

## Como executar

Requer JDK 11 ou superior. Na pasta do projeto:

```bash
javac -encoding UTF-8 GestaoPrioridadeApp.java
java GestaoPrioridadeApp
```

O programa executa três demandas fictícias e imprime pontuação, prioridade e avaliação de aprovação. As regras são ilustrativas, não um processo de aprovação em produção.

---

<a id="english-version"></a>

# Demand Management & Prioritization in Java (OOP)

Demonstrative project in **Java** applying **Object-Oriented Programming (OOP)**, encapsulation, input validation, and business rules for priority scoring, urgency classification, and cost-based approval screening.

## Structure & Business Rules

* `Demanda`: Models request attributes (title, department, estimated cost, remaining SLA days, and critical operational impact) with validation in the constructor.
* `CalculadoraPrioridadeService`: Calculates a score from 0 to 100 based on operational criticality, SLA proximity, and cost tier, classifying priority as **HIGH**, **MEDIUM**, or **LOW** and flagging cases that require additional review.
* `GestaoPrioridadeApp`: Runs a demonstrative scenario listing the consolidated result for each demand.

## Run locally

Requires JDK 11 or later.

```bash
javac -encoding UTF-8 GestaoPrioridadeApp.java
java GestaoPrioridadeApp
```

The example prints priority and approval assessments for three synthetic demands. Business rules are illustrative.
