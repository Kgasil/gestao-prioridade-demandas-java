# Gestão e Priorização de Demandas em Java (POO)

Projeto demonstrativo em **Java** aplicando **Programação Orientada a Objetos (POO)**, encapsulamento, validação de dados e regras de negócio para pontuação de prioridade, classificação de urgência e triagem de aprovação por custo.

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
