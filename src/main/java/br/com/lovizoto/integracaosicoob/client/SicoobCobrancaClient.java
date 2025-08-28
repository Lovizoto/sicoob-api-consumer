/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.lovizoto.integracaosicoob.client;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import main.java.br.com.lovizoto.integracaosicoob.config.SicoobConfig;
import main.java.br.com.lovizoto.integracaosicoob.exception.SicoobApiException;
import main.java.br.com.lovizoto.integracaosicoob.model.BaixaBoletoRequestDTO;
import main.java.br.com.lovizoto.integracaosicoob.model.ConsultaBoletoWrapperDTO;
import main.java.br.com.lovizoto.integracaosicoob.model.CriacaoBoletoRequestDTO;
import main.java.br.com.lovizoto.integracaosicoob.model.ResultadoGeracaoBoletoDTO;
import main.java.br.com.lovizoto.integracaosicoob.model.SegundaViaBoletoWrapperDTO;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;

/**
 *
 * @author michel
 */
public class SicoobCobrancaClient extends AbstractSicoobClient {

    public SicoobCobrancaClient(HttpClient httpClient, SicoobConfig config) {
        super(httpClient, config);
    }

    public ResultadoGeracaoBoletoDTO gerarBoletos(String acessToken, List<CriacaoBoletoRequestDTO> boletoRequest) {

        String endpoint = this.baseUrl + "/cobranca-bancaria/v3/boletos";
        HttpPost post = new HttpPost(endpoint);

        try {
//            List<CriacaoBoletoRequestDTO> listaBoletos = List.of(boletoRequest);
            String jsonPayload = gson.toJson(boletoRequest);
            StringEntity entity = new StringEntity(jsonPayload, "UTF-8");
            post.setEntity(entity);

            return executeRequest(post, acessToken, ResultadoGeracaoBoletoDTO.class);

        } catch (Exception e) {
            throw new SicoobApiException("Erro ao construir requisição para gerar boleto", e);
        }

    }

    public ConsultaBoletoWrapperDTO consultarBoleto(String accessToken, Long nossoNumero) {

        String endpoint = this.baseUrl + "/cobranca-bancaria/v3/boletos";

        try {
            URI uri = new URIBuilder(endpoint)
                    .addParameter("numeroCliente", String.valueOf(config.getNumeroContrato()))
                    .addParameter("codigoModalidade", "1") //fixado em 1, simples com registro
                    .addParameter("nossoNumero", String.valueOf(nossoNumero))
                    .build();

            HttpGet get = new HttpGet(uri);

            return executeRequest(get, accessToken, ConsultaBoletoWrapperDTO.class);

        } catch (Exception e) {
            throw new SicoobApiException("Erro ao construir a URL para consulta de boleto", e);
        }

    }

    public SegundaViaBoletoWrapperDTO gerarSegundaViaBoleto(String accessToken, Long nossoNumero) {

        String endpoint = baseUrl + "/cobranca-bancaria/v3/boletos/segunda-via";

        try {
            URI uri = new URIBuilder(endpoint)
                    .addParameter("numeroCliente", String.valueOf(config.getNumeroContrato()))
                    .addParameter("codigoModalidade", "1") //fixado em 1, simples com registro
                    .addParameter("nossoNumero", String.valueOf(nossoNumero))
                    .addParameter("gerarPdf", "true")
                    .build();

            HttpGet get = new HttpGet(uri);

            return executeRequest(get, accessToken, SegundaViaBoletoWrapperDTO.class);

        } catch (URISyntaxException e) {
            throw new SicoobApiException("Erro ao construir URL para gerar a segunda via do boleto", e);
        }

    }

    public void baixarBoleto(String accessToken, Long nossoNumero) {

        String endpoint = baseUrl + "/cobranca-bancaria/v3/boletos/" + nossoNumero + "/baixar";

        HttpPost post = new HttpPost(endpoint);
        
        try {
            BaixaBoletoRequestDTO requestBody = new BaixaBoletoRequestDTO(config.getNumeroContrato(), 1);
            
            String jsonPayload = gson.toJson(requestBody);
            post.setEntity(new StringEntity(jsonPayload, "UTF-8"));
            
            executeRequestVoid(post, accessToken);            
        } catch (Exception e) {
            throw new SicoobApiException("Erro ao construir a requisição para baixa de boleto.", e);
        }

    }
    
    
    
    
    
    

}
