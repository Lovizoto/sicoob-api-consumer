/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.lovizoto.integracaosicoob.factory;

import java.io.File;
import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import main.java.br.com.lovizoto.integracaosicoob.config.SicoobConfig;
import main.java.br.com.lovizoto.integracaosicoob.exception.SicoobApiException;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

/**
 *
 * @author michel
 */
public class HttpClientFactory {

    public static CloseableHttpClient createHttpClient(SicoobConfig config) {

        try {
            KeyStore clientStore = KeyStore.getInstance("PKCS12");
            char[] password = config.getCertificadoSenha().toCharArray();
            clientStore.load(new FileInputStream(new File(config.getCertificadoPath())), password);
            
            KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            kmf.init(clientStore, password);
            KeyManager[] keyManagers = kmf.getKeyManagers();
            
            KeyStore trustStore = KeyStore.getInstance("JKS");
            char[] trustStorePassword = config.getTrustStoreSenha().toCharArray();
            trustStore.load(new FileInputStream(new File(config.getTrustStorePath())), trustStorePassword);
            
            TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            tmf.init(trustStore);
            TrustManager[] trustManagers = tmf.getTrustManagers();
            
            SSLContext sslContext = SSLContext.getInstance("TLSv1.2");
            sslContext.init(keyManagers, trustManagers, new SecureRandom());
            
            return HttpClients.custom()
                    .setSSLContext(sslContext)
                    .setSSLHostnameVerifier(NoopHostnameVerifier.INSTANCE)
                    .build();
            
        } catch (Exception ex) {
            throw new SicoobApiException("Falha ao criar HttpClient com contexto SSL", ex);
        }
        
    }

}
