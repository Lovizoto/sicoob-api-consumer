/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.lovizoto.integracaosicoob;

import java.io.IOException;
import main.java.br.com.lovizoto.integracaosicoob.client.SicoobAuthClient;
import main.java.br.com.lovizoto.integracaosicoob.client.SicoobCobrancaClient;
import main.java.br.com.lovizoto.integracaosicoob.client.SicoobContaCorrenteClient;
import main.java.br.com.lovizoto.integracaosicoob.config.SicoobConfig;
import main.java.br.com.lovizoto.integracaosicoob.dto.response.ConsultaBoletoWrapperDTO;
import main.java.br.com.lovizoto.integracaosicoob.exception.SicoobApiException;
import main.java.br.com.lovizoto.integracaosicoob.factory.HttpClientFactory;
import main.java.br.com.lovizoto.integracaosicoob.dto.response.SaldoResponseDTO;
import main.java.br.com.lovizoto.integracaosicoob.dto.shared.ConsultaBoletoResponseDTO;
import org.apache.http.impl.client.CloseableHttpClient;

/**
 *
 * @author michel
 */
public class APISicoobV3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            SicoobConfig config = new SicoobConfig("src/resources/sicoob.properties");

            try (CloseableHttpClient httpClient = HttpClientFactory.createHttpClient(config)) {

                SicoobAuthClient sicoobAuth = new SicoobAuthClient(httpClient, config);
                String tokenContaCorrente = sicoobAuth.getAuthTokenForContaCorrente().getAccessToken();
                String tokenCobranca = sicoobAuth.getAuthTokenForCobranca().getAccessToken();
                
                
                
                
            

                
            }

        } catch (SicoobApiException e) {
            //captura de erros específicos da api
            System.err.println("Erro da Api Sicoob: " + e.getMessage());
        } catch (IOException e) {
            //captura de erros I/O, não encontrar arquivos
            System.err.println("Erro de configuração: não foi possível ler o arquivo de propriedades: " + e.getMessage());
        } catch (Exception e) {
            //captura de qualquer outro erro possível
            System.err.println("Ocoreu um erro inesperado na aplicação: " + e.getMessage());
            e.printStackTrace();
        }

    }

}
