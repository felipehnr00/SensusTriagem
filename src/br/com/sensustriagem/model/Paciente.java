package br.com.sensustriagem.model;

public class Paciente {

    private String nome;
    private int idade;
    private String sintomaPrincipal;
    private String sintomaSecundario;
    private int nivelDor;

    public Paciente(String nome, int idade, String sintomaPrincipal, String sintomaSecundario, int nivelDor) {
        this.nome = nome;
        this.idade = idade;
        this.sintomaPrincipal = sintomaPrincipal;
        this.sintomaSecundario = sintomaSecundario;
        this.nivelDor = nivelDor;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getSintomaPrincipal() {
        return sintomaPrincipal;
    }
    public String getSintomaSecundario() {
        return sintomaSecundario;
    }
    public int getNivelDor() {
        return nivelDor;
    }

    public String gerarTextoParaAnalise() {
        return "Paciente relata: " + sintomaPrincipal + " e " + sintomaSecundario + "Nível de dor: " + nivelDor + "/10.";
    }
}
