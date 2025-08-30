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
public class AbatimentoDTO {
    
    @SerializedName("valorAbatimento")
    private Double valorAbatimento;

    public Double getValorAbatimento() {
        return valorAbatimento;
    }

    public void setValorAbatimento(Double valorAbatimento) {
        this.valorAbatimento = valorAbatimento;
    }
    
}