/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.lovizoto.integracaosicoob.factory;

import java.security.KeyStore;
import java.security.KeyStoreException;
import main.java.br.com.lovizoto.integracaosicoob.config.SicoobConfig;
import org.apache.http.impl.client.CloseableHttpClient;

/**
 *
 * @author michel
 */
public class HttpClientFactory {

    public static CloseableHttpClient createHttpClient(SicoobConfig config) {

        try {
            KeyStore clientStore = KeyStore.getInstance("PKCS12");
//        char[] pas

            return null;
        } catch (Exception ex) {

        }
        
        return null;
    }

}
