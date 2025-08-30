/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.lovizoto.integracaosicoob.dto.shared;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 *
 * @author michel
 */
public class RateioCreditoAlteracaoDTO {
    
    @SerializedName("tipoOperacao")
    private Integer tipoOperacao;
    
    @SerializedName("rateioCreditos")
    private List<RateioCreditoDTO> rateioCreditos;

    public Integer getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(Integer tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public List<RateioCreditoDTO> getRateioCreditos() {
        return rateioCreditos;
    }

    public void setRateioCreditos(List<RateioCreditoDTO> rateioCreditos) {
        this.rateioCreditos = rateioCreditos;
    }
    
}

