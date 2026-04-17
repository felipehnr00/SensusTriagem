package br.com.javahealth.service;

import br.com.javahealth.model.Paciente;
import br.com.javahealth.model.ResultadoTriagem;

public class Triagem {

    public ResultadoTriagem realizarTriagem(Paciente paciente) {

        VerificadorInconsistencia verificador = new VerificadorInconsistencia();
        boolean temInconsistencia = verificador.verificar(paciente);

        String textoparaIA = paciente.gerarTextoParaAnalise();
        AzureService azure = new AzureService();
        String respostaAzure = azure.analisarSintomas(textoparaIA);

        String prioridade = definirPrioridade(paciente.getNivelDor());

        return new ResultadoTriagem(prioridade, respostaAzure, temInconsistencia);
    }
    private String definirPrioridade(int nivelDor) {
        if (nivelDor >= 8) {
            return "VERMELHO";
        } else if (nivelDor >=5) {
            return "AMARELO";
        }
        else {
            return "VERDE";
        }
    }
}
