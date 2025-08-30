/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.lovizoto.integracaosicoob.client;

import com.google.gson.Gson;
import java.io.IOException;
import main.java.br.com.lovizoto.integracaosicoob.config.SicoobConfig;
import main.java.br.com.lovizoto.integracaosicoob.exception.SicoobApiException;
import main.java.br.com.lovizoto.integracaosicoob.dto.response.ErroResponseDTO;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.util.EntityUtils;

/**
 *
 * @author michel
 */
public abstract class AbstractSicoobClient {

    protected final String baseUrl;
    protected final HttpClient httpClient;
    protected final SicoobConfig config;
    protected final Gson gson;

    public AbstractSicoobClient(HttpClient httpClient, SicoobConfig config) {
        this.httpClient = httpClient;
        this.config = config;
        this.baseUrl = config.getBaseUrl();
        this.gson = new Gson();
    }

    protected <T> T executeRequest(HttpUriRequest request, String accessToken, Class<T> responseType) {

        try {
            request.setHeader("Content-Type", "application/json");
            request.setHeader("Accept", "application/json");
            request.setHeader("Authorization", "Bearer " + accessToken);
            request.setHeader("client_id", config.getClientId());

            HttpResponse response = httpClient.execute(request);
            int statusCode = response.getStatusLine().getStatusCode();
            String responseBody = EntityUtils.toString(response.getEntity(), "UTF-8");

            if (statusCode < 200 || statusCode >= 300) {
                ErroResponseDTO erro = gson.fromJson(responseBody, ErroResponseDTO.class);
                throw new SicoobApiException("API retornou erro. Status: " + statusCode + ", Mensagens: " + erro.getMensagens());
            }

            return gson.fromJson(responseBody, responseType);

        } catch (IOException e) {
            throw new SicoobApiException("Falha na comunicação com a API Sicoob.", e);
        }

    }

    protected void executeRequestVoid(HttpUriRequest request, String accessToken) {

        try {
            request.setHeader("Content-Type", "application/json");
            request.setHeader("Accept", "application/json");
            request.setHeader("Authorization", "Bearer " + accessToken);
            request.setHeader("client_id", config.getClientId());

            HttpResponse response = httpClient.execute(request);
            int statusCode = response.getStatusLine().getStatusCode();

            if (statusCode < 200 || statusCode >= 300) {
                String responseBody = EntityUtils.toString(response.getEntity(), "UTF-8");
                ErroResponseDTO erro = gson.fromJson(responseBody, ErroResponseDTO.class);
                throw new SicoobApiException("API retornou erro. Status: " + statusCode + ", Mensagens: " + erro.getMensagens());
            }           
           

        } catch (IOException e) {
            throw new SicoobApiException("Falha na comunicação com a API Sicoob.", e);
        }

    }

}
