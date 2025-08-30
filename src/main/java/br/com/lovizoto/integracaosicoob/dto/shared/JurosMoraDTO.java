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
public class JurosMoraDTO {
    
    @SerializedName("tipoJurosMora")
    private Integer tipoJurosMora;
    
    @SerializedName("dataJurosMora")
    private String dataJurosMora;
    
    @SerializedName("valorJurosMora")
    private Double valorJurosMora;

    public Integer getTipoJurosMora() {
        return tipoJurosMora;
    }

    public void setTipoJurosMora(Integer tipoJurosMora) {
        this.tipoJurosMora = tipoJurosMora;
    }

    public String getDataJurosMora() {
        return dataJurosMora;
    }

    public void setDataJurosMora(String dataJurosMora) {
        this.dataJurosMora = dataJurosMora;
    }

    public Double getValorJurosMora() {
        return valorJurosMora;
    }

    public void setValorJurosMora(Double valorJurosMora) {
        this.valorJurosMora = valorJurosMora;
    }
    
}