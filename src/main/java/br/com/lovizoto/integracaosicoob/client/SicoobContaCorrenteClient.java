/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.lovizoto.integracaosicoob.client;

import java.net.URI;
import java.net.URISyntaxException;
import main.java.br.com.lovizoto.integracaosicoob.config.SicoobConfig;
import main.java.br.com.lovizoto.integracaosicoob.exception.SicoobApiException;
import main.java.br.com.lovizoto.integracaosicoob.dto.shared.ExtratoResponseDTO;
import main.java.br.com.lovizoto.integracaosicoob.dto.response.SaldoResponseDTO;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;

/**
 *
 * @author michel
 */
public class SicoobContaCorrenteClient extends AbstractSicoobClient {

    public SicoobContaCorrenteClient(HttpClient httpClient, SicoobConfig config) {
        super(httpClient, config);
    }   
    
    
    public ExtratoResponseDTO consultarExtrato(String accessToken, int mes, int ano) {
        
        String endpoint = baseUrl + "/conta-corrente/v2/extrato/" + mes + "/" + ano;        
        try {
            URI uri = new URIBuilder(endpoint)
                    .addParameter("numeroContaCorrente", String.valueOf(config.getNumeroConta()))
                    .build();
            
            HttpGet get = new HttpGet(uri);
            
            return executeRequest(get, accessToken, ExtratoResponseDTO.class);
            
        } catch (URISyntaxException e) {
            throw new SicoobApiException("Erro ao construir URL para consulta de extrato", e);           
        }        
    }
    
    public SaldoResponseDTO consultarSaldo(String accessToken) {
        
        String endPoint = baseUrl + "/conta-corrente/v2/saldo";
        
        try {
            URI uri = new URIBuilder(endPoint)                   
                    .addParameter("numeroContaCorrente", String.valueOf(config.getNumeroConta()))
                    .build();
            
            HttpGet get = new HttpGet(uri);
            return executeRequest(get, accessToken, SaldoResponseDTO.class);
            
        } catch (Exception e) {
            throw new SicoobApiException("Erro ao construir URL para consulta de saldo", e);
        }
        
    }
    
    
    
}
