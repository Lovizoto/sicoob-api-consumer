/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.lovizoto.integracaosicoob.client;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import main.java.br.com.lovizoto.integracaosicoob.exception.SicoobApiException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import main.java.br.com.lovizoto.integracaosicoob.config.SicoobConfig;
import main.java.br.com.lovizoto.integracaosicoob.dto.response.ErroResponseDTO;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

/**
 *
 * @author michel
 */
public class SicoobAuthClient {

    // Constantes para os parâmetros do request
    private static final String GRANT_TYPE = "client_credentials";

    // Constantes para os escopos. O de cobrança é bem extenso.
    private static final String SCOPE_CONTA_CORRENTE = "openid cco_extrato cco_saldo";
    private static final String SCOPE_COBRANCA = "cobranca_boletos_consultar cobranca_boletos_incluir "
            + "cobranca_boletos_pagador cobranca_boletos_segunda_via cobranca_boletos_descontos "
            + "cobranca_boletos_abatimentos cobranca_boletos_valor_nominal cobranca_boletos_seu_numero "
            + "cobranca_boletos_especie_documento cobranca_boletos_baixa cobranca_boletos_rateio_credito";
    // Adicione outros escopos de cobrança se necessário.

    private final HttpClient httpClient;
    private final SicoobConfig config;
    private final Gson gson = new Gson();

    public SicoobAuthClient(HttpClient httpClient, SicoobConfig config) {
        this.httpClient = httpClient;
        this.config = config;
    }

    public TokenResponseDTO getAuthTokenForContaCorrente() {
        return getAccessToken(SCOPE_CONTA_CORRENTE);
    }

    public TokenResponseDTO getAuthTokenForCobranca() {
        return getAccessToken(SCOPE_COBRANCA);
    }

    private TokenResponseDTO getAccessToken(String scope) {
        // A URL agora vem do arquivo de configuração, tornando o cliente mais flexível
        HttpPost httpPost = new HttpPost(config.getAuthUrl());

        List<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair("client_id", config.getClientId()));
        params.add(new BasicNameValuePair("grant_type", GRANT_TYPE));
        params.add(new BasicNameValuePair("scope", scope));

        try {
            httpPost.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));

            HttpResponse httpResponse = this.httpClient.execute(httpPost);
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            String responseBody = EntityUtils.toString(httpResponse.getEntity(), "UTF-8");

            if (statusCode < 200 || statusCode >= 300) {
                // Tenta fazer o parse do erro antes de lançar a exceção
                ErroResponseDTO erro = gson.fromJson(responseBody, ErroResponseDTO.class);
                throw new SicoobApiException("API de autenticação retornou erro. Status: " + statusCode + ", Mensagens: " + erro.getMensagens());
            }

            return gson.fromJson(responseBody, TokenResponseDTO.class);

        } catch (UnsupportedEncodingException e) {
            // Este erro é muito raro com "UTF-8", mas deve ser tratado.
            throw new SicoobApiException("Erro interno: Encoding de caracteres não suportado.", e);
        } catch (IOException e) {
            throw new SicoobApiException("Falha de comunicação ao tentar obter token de acesso.", e);
        }
    }

    private static class TokenResponseDTO {

        @SerializedName("access_token")
        private String accessToken;

        @SerializedName("expires_in")
        private Integer expiresIn;

        @SerializedName("refresh_expires_in")
        private Integer refreshExpiresIn;

        @SerializedName("token_type")
        private String tokenType;

        @SerializedName("id_token")
        private String idToken;

        @SerializedName("not-before-policy")
        private Integer notBeforePolicy;

        @SerializedName("scope")
        private String scope;

        public String getAccessToken() {
            return accessToken;
        }

        public void setAccessToken(String accessToken) {
            this.accessToken = accessToken;
        }

        public Integer getExpiresIn() {
            return expiresIn;
        }

        public void setExpiresIn(Integer expiresIn) {
            this.expiresIn = expiresIn;
        }

        public Integer getRefreshExpiresIn() {
            return refreshExpiresIn;
        }

        public void setRefreshExpiresIn(Integer refreshExpiresIn) {
            this.refreshExpiresIn = refreshExpiresIn;
        }

        public String getTokenType() {
            return tokenType;
        }

        public void setTokenType(String tokenType) {
            this.tokenType = tokenType;
        }

        public String getIdToken() {
            return idToken;
        }

        public void setIdToken(String idToken) {
            this.idToken = idToken;
        }

        public Integer getNotBeforePolicy() {
            return notBeforePolicy;
        }

        public void setNotBeforePolicy(Integer notBeforePolicy) {
            this.notBeforePolicy = notBeforePolicy;
        }

        public String getScope() {
            return scope;
        }

        public void setScope(String scope) {
            this.scope = scope;
        }

    }

}
