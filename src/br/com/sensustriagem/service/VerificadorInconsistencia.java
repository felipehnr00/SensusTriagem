package br.com.sensustriagem.service;

import br.com.sensustriagem.model.Paciente;

public class VerificadorInconsistencia {

    public boolean verificar(Paciente paciente) {

        String principal   = paciente.getSintomaPrincipal().toLowerCase();
        String secundario  = paciente.getSintomaSecundario().toLowerCase();
        int dor            = paciente.getNivelDor();

        if (secundario.contains("desmaio") && dor <= 2) {
            System.out.println("Inconsistência: desmaio com dor nível " + dor);
            return true;
        }

        if (principal.contains("tosse seca") && secundario.contains("secreção")) {
            System.out.println("Inconsistência: tosse seca + secreção abundante");
            return true;
        }

        if (principal.contains("febre alta") && secundario.contains("me sinto bem")) {
            System.out.println("Inconsistência: febre alta + 'me sinto bem'");
            return true;
        }

        switch (principal) {
            case "dor no peito":
                if (dor < 4) {
                    System.out.println("Inconsistência: dor no peito com nível " + dor);
                    return true;
                }
                break;
            case "fratura":
                if (dor < 5) {
                    System.out.println("Inconsistência: fratura com dor nível " + dor);
                    return true;
                }
                break;
        }

        return false;
    }
}