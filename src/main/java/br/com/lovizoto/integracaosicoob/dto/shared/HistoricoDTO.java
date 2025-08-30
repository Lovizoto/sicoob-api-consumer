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
public class HistoricoDTO {
    
    @SerializedName("dataHistorico")
    private String dataHistorico;
    
    @SerializedName("tipoHistorico")
    private String tipoHistorico;
    
    @SerializedName("descricaoHistorico")
    private String descricaoHistorico;

    public String getDataHistorico() {
        return dataHistorico;
    }

    public void setDataHistorico(String dataHistorico) {
        this.dataHistorico = dataHistorico;
    }

    public String getTipoHistorico() {
        return tipoHistorico;
    }

    public void setTipoHistorico(String tipoHistorico) {
        this.tipoHistorico = tipoHistorico;
    }

    public String getDescricaoHistorico() {
        return descricaoHistorico;
    }

    public void setDescricaoHistorico(String descricaoHistorico) {
        this.descricaoHistorico = descricaoHistorico;
    }
    
}