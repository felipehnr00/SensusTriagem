package br.com.javahealth.util;

import io.github.cdimascio.dotenv.Dotenv;

public class Constantes {

    private static final Dotenv dotenv = Dotenv.load();

    public static final String AZURE_ENDPOINT = dotenv.get("AZURE_ENDPOINT");
    public static final String AZURE_KEY      = dotenv.get("AZURE_KEY");
}