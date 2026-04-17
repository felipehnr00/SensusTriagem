package br.com.javahealth.model;

public class ResultadoTriagem {

    private String prioridade;
    private String alertaIA;
    private boolean inconsistente;

    public ResultadoTriagem(String prioridade, String alertaIA, boolean inconsistente) {
        this.prioridade = prioridade;
        this.alertaIA = alertaIA;
        this.inconsistente = inconsistente;
    }
    public void exibirResultado() {
        System.out.println("=== RESULTADO DA TRIAGEM ===");
        System.out.println("Prioridade: " + prioridade);
        System.out.println("Análise IA: " + alertaIA);
        if (inconsistente) {
            System.out.println("ALERTA: Informações inconsistentes detectadas.");
        }
    }

    public String getPrioridade() {
        return prioridade;
    }
    public boolean isInconsistente() {
        return inconsistente;
    }
}
