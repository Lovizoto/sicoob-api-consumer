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
public class BaixaBoletoRequestDTO {
    
    @SerializedName("numeroCliente")
    private Integer numeroCliente;
    
    @SerializedName("codigoModalidade")
    private Integer codigoModalidade;

    public BaixaBoletoRequestDTO(Integer numeroCliente, Integer codigoModalidade) {
        this.numeroCliente = numeroCliente;
        this.codigoModalidade = codigoModalidade;
    }

    public Integer getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(Integer numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public Integer getCodigoModalidade() {
        return codigoModalidade;
    }

    public void setCodigoModalidade(Integer codigoModalidade) {
        this.codigoModalidade = codigoModalidade;
    }
    
    
    
}
