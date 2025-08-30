/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.lovizoto.integracaosicoob.dto.shared;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author michel
 */
public class SeuNumeroDTO {
    
    
    @SerializedName("seuNumero")
    private String seuNumero;
    
    @SerializedName("identificacaoBoletoEmpresa")
    private String identificacaoBoletoEmpresa;

    public String getSeuNumero() {
        return seuNumero;
    }

    public void setSeuNumero(String seuNumero) {
        this.seuNumero = seuNumero;
    }

    public String getIdentificacaoBoletoEmpresa() {
        return identificacaoBoletoEmpresa;
    }

    public void setIdentificacaoBoletoEmpresa(String identificacaoBoletoEmpresa) {
        this.identificacaoBoletoEmpresa = identificacaoBoletoEmpresa;
    }   
        
}