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
public class ProrrogacaoLimitePagamentoDTO {
    
    @SerializedName("dataLimitePagamento")
    private String dataLimitePagamento;

    public String getDataLimitePagamento() {
        return dataLimitePagamento;
    }

    public void setDataLimitePagamento(String dataLimitePagamento) {
        this.dataLimitePagamento = dataLimitePagamento;
    }    
    
}
