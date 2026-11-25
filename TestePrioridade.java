public class TestePrioridade {
    public static void main(String[] args) {
        var service = new GestaoPrioridadeApp.CalculadoraPrioridadeService();
        var alta = new GestaoPrioridadeApp.Demanda(1, "Teste", "Dados", 100, 2, true);
        var baixa = new GestaoPrioridadeApp.Demanda(2, "Teste", "Dados", 100, 10, false);
        if (service.calcularScore(alta) != 100) throw new AssertionError("Score alto");
        if (!service.classificarPrioridade(service.calcularScore(baixa)).equals("BAIXA"))
            throw new AssertionError("Prioridade baixa");
        try {
            new GestaoPrioridadeApp.Demanda(3, "Teste", "Dados", Double.NaN, 2, false);
            throw new AssertionError("NaN deveria ser rejeitado");
        } catch (IllegalArgumentException expected) {
            // Entrada inválida corretamente rejeitada.
        }
        System.out.println("Testes de priorização concluídos.");
    }
}
