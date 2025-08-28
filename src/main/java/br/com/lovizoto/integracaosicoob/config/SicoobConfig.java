/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.lovizoto.integracaosicoob.config;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author michel
 */
public class SicoobConfig {

    private final Properties properties = new Properties();

    public SicoobConfig(String propertyFilePath) throws FileNotFoundException, IOException {
        try (FileReader reader = new FileReader(propertyFilePath)) {
            properties.load(reader);
        }
    }

    public String getAuthUrl() {
        return properties.getProperty("sicoob.url.auth");
    }

    public String getBaseUrl() {
        return properties.getProperty("sicoob.url.base");
    }

    public String getClientId() {
        return properties.getProperty("sicoob.client.id");
    }

    public int getNumeroConta() {
        return Integer.parseInt(properties.getProperty("sicoob.conta.numero"));
    }

    public int getNumeroContrato() {
        return Integer.parseInt(properties.getProperty("sicoob.contrato.numero"));
    }

    public int getNumeroCooperado() {
        return Integer.parseInt(properties.getProperty("sicoob.cooperativa.numero"));
    }

    public String getCertificadoPath() {
        return properties.getProperty("sicoob.certificado.caminho");
    }

    public String getCertificadoSenha() {
        return properties.getProperty("sicoob.certificado.senha");
    }

    public String getTrustStorePath() {
        return properties.getProperty("sicoob.truststore.caminho");
    }

    public String getTrustStoreSenha() {
        return properties.getProperty("sicoob.truststore.senha");
    }

}
