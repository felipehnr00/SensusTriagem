package br.com.javahealth.main;

import br.com.javahealth.model.Paciente;
import br.com.javahealth.model.ResultadoTriagem;
import br.com.javahealth.service.Triagem;

public class Main {

    public static void main(String[] args) {

        // Caso 1: paciente com inconsistência (desmaio + dor nível 1)
        Paciente p1 = new Paciente(
                "João Silva", 45, "dor no peito", "desmaio", 1
        );

        // Caso 2: paciente sem inconsistência, alta prioridade
        Paciente p2 = new Paciente(
                "Maria Souza", 32, "febre alta", "dor no corpo", 8
        );

        Triagem triagem = new Triagem();

        System.out.println("========== PACIENTE 1 ==========");
        ResultadoTriagem r1 = triagem.realizarTriagem(p1);
        r1.exibirResultado();

        System.out.println("\n========== PACIENTE 2 ==========");
        ResultadoTriagem r2 = triagem.realizarTriagem(p2);
        r2.exibirResultado();
    }
}