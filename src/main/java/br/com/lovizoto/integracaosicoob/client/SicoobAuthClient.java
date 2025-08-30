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
import java.util.ArrayList;
import java.util.List;
import main.java.br.com.lovizoto.integracaosicoob.config.SicoobConfig;
import org.apache.http.HttpEntity;
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

    private static final String TOKEN_ENDPOINT = "https://auth.sicoob.com.br/auth/realms/cooperado/protocol/openid-connect/token";
    private static final String GRANT_TYPE = "client_credentials";
    private static final String SCOPE_SALDO_EXTRATO = "openid cco_extrato cco_saldo";

    private final HttpClient httpClient;
    private final SicoobConfig config;
    private final Gson gson = new Gson();

    public SicoobAuthClient(HttpClient httpClient, SicoobConfig config) {
        this.httpClient = httpClient;
        this.config = config;
    }  

    public String getTokenParaSaldoExtrato() {

        HttpPost httpPost = new HttpPost(TOKEN_ENDPOINT);

        List<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair("client_id", config.getClientId()));
        params.add(new BasicNameValuePair("grant_type", GRANT_TYPE));
        params.add(new BasicNameValuePair("scope", SCOPE_SALDO_EXTRATO));

        try {
            httpPost.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));
            String responseBody = executeRequest(httpPost);

            TokenResponse tokenResponse = gson.fromJson(responseBody, TokenResponse.class);

            return tokenResponse.getAccessToken();

        } catch (Exception e) {
            throw new SicoobApiException("Erro interno com encoding de caracteres", e);
        }

    }

    private String executeRequest(HttpPost request) {

        try {
            HttpResponse httpResponse = this.httpClient.execute(request);
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            HttpEntity entity = httpResponse.getEntity();
            String responseBody = EntityUtils.toString(entity, "UTF-8");

            if (statusCode < 200 || statusCode >= 300) {
                throw new SicoobApiException("API retornou erro. Status: " + statusCode + ", Body: " + responseBody);
            }

            return responseBody;

        } catch (IOException e) {
            throw new SicoobApiException("Falha na comunicação com a API Sicoob.", e);
        }

    }

    private static class TokenResponse {

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
