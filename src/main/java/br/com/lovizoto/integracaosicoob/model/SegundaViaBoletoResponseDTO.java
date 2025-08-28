/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.lovizoto.integracaosicoob.model;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author michel
 */
public class SegundaViaBoletoResponseDTO extends AbstractBoletoDTO {
    
    @SerializedName("pdfBoleto")
    private String pdfBoleto;

    // Getter e Setter para o campo exclusivo
    public String getPdfBoleto() {
        return pdfBoleto;
    }

    public void setPdfBoleto(String pdfBoleto) {
        this.pdfBoleto = pdfBoleto;
    }
    
}
