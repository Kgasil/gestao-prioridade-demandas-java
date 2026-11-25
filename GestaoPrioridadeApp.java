import java.util.ArrayList;
import java.util.List;

/**
 * Módulo de Regra de Negócio em Java (POO) para Avaliação e Priorização de Demandas.
 * Autor: Kaio Gabriel da Silva
 */
public class GestaoPrioridadeApp {

    static class Demanda {
        private final int id;
        private final String titulo;
        private final String area;
        private final double custoEstimado;
        private final int diasRestantesSla;
        private final boolean impactaOperacaoCritica;

        public Demanda(int id, String titulo, String area, double custoEstimado,
                       int diasRestantesSla, boolean impactaOperacaoCritica) {
            if (titulo == null || titulo.isBlank()) {
                throw new IllegalArgumentException("O título da demanda é obrigatório.");
            }
            if (!Double.isFinite(custoEstimado) || custoEstimado < 0) {
                throw new IllegalArgumentException("O custo estimado deve ser finito e não negativo.");
            }
            this.id = id;
            this.titulo = titulo.trim();
            this.area = area == null ? "Geral" : area.trim();
            this.custoEstimado = custoEstimado;
            this.diasRestantesSla = diasRestantesSla;
            this.impactaOperacaoCritica = impactaOperacaoCritica;
        }

        public int getId() { return id; }
        public String getTitulo() { return titulo; }
        public String getArea() { return area; }
        public double getCustoEstimado() { return custoEstimado; }
        public int getDiasRestantesSla() { return diasRestantesSla; }
        public boolean isImpactaOperacaoCritica() { return impactaOperacaoCritica; }
    }

    static class CalculadoraPrioridadeService {
        private static final double TETO_APROVACAO_DIRETA = 5000.0;

        public int calcularScore(Demanda d) {
            int score = 0;

            if (d.isImpactaOperacaoCritica()) {
                score += 50;
            }

            if (d.getDiasRestantesSla() <= 2) {
                score += 35;
            } else if (d.getDiasRestantesSla() <= 5) {
                score += 20;
            } else {
                score += 5;
            }

            if (d.getCustoEstimado() <= TETO_APROVACAO_DIRETA) {
                score += 15;
            } else {
                score += 5;
            }

            return Math.min(score, 100);
        }

        public String classificarPrioridade(int score) {
            if (score >= 75) return "ALTA";
            if (score >= 45) return "MÉDIA";
            return "BAIXA";
        }

        public String avaliarAprovacao(Demanda d) {
            if (d.getCustoEstimado() > TETO_APROVACAO_DIRETA && !d.isImpactaOperacaoCritica()) {
                return "Requer revisão financeira/gestão (custo acima do limite direto)";
            }
            return "Apto para fila de execução";
        }
    }

    public static void main(String[] args) {
        CalculadoraPrioridadeService service = new CalculadoraPrioridadeService();

        List<Demanda> demandas = new ArrayList<>();
        demandas.add(new Demanda(1, "Correção de gargalo em fluxo de dados", "Dados & BI", 1800.0, 2, true));
        demandas.add(new Demanda(2, "Padronização de planilha de custos", "Orçamentação", 950.0, 6, false));
        demandas.add(new Demanda(3, "Automação de rotina de backoffice", "Operações", 6400.0, 4, false));

        for (Demanda d : demandas) {
            int score = service.calcularScore(d);
            String prioridade = service.classificarPrioridade(score);
            String statusAprovacao = service.avaliarAprovacao(d);

            System.out.printf(
                "#%d | %s (%s) | Score: %d/100 | Prioridade: %s | %s%n",
                d.getId(), d.getTitulo(), d.getArea(), score, prioridade, statusAprovacao
            );
        }
    }
}
