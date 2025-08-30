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
public class DescontoDTO {
    
   @SerializedName("tipoDesconto")
   private Integer tipoDesconto;
   
   @SerializedName("dataPrimeiroDesconto")
   private String dataPrimeiroDesconto;
   
   @SerializedName("valorPrimeiroDesconto")
   private Double valorPrimeiroDesconto;

    public Integer getTipoDesconto() {
        return tipoDesconto;
    }

    public void setTipoDesconto(Integer tipoDesconto) {
        this.tipoDesconto = tipoDesconto;
    }

    public String getDataPrimeiroDesconto() {
        return dataPrimeiroDesconto;
    }

    public void setDataPrimeiroDesconto(String dataPrimeiroDesconto) {
        this.dataPrimeiroDesconto = dataPrimeiroDesconto;
    }

    public Double getValorPrimeiroDesconto() {
        return valorPrimeiroDesconto;
    }

    public void setValorPrimeiroDesconto(Double valorPrimeiroDesconto) {
        this.valorPrimeiroDesconto = valorPrimeiroDesconto;
    }
    
}