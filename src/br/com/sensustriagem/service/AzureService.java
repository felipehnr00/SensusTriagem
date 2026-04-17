package br.com.sensustriagem.service;

import br.com.sensustriagem.util.Constantes;
import okhttp3.*;
import java.io.IOException;

public class AzureService {

    public String analisarSintomas(String texto) {

        OkHttpClient client = new OkHttpClient();

        String json = "{\"documents\": [{\"id\": \"1\", \"language\": \"pt\", \"text\": \"" + texto + "\"}]}";

        RequestBody body = RequestBody.create(
                json, MediaType.get("application/json")
        );

        Request request = new Request.Builder()
                .url(Constantes.AZURE_ENDPOINT + "text/analytics/v3.1/keyPhrases")
                .post(body)
                .addHeader("Ocp-Apim-Subscription-Key", Constantes.AZURE_KEY)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (response.body() != null) {
                return response.body().string();
            }
            return "Sem resposta da Azure.";
        } catch (IOException e) {
            return "Erro ao conectar com a Azure: " + e.getMessage();
        }
    }
}