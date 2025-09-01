/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.lovizoto.integracaosicoob.dto.shared;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author michel
 */
public class ExtratoResultadoDTO {

    @SerializedName("saldo")
    private BigDecimal saldo;

    @SerializedName("transacoes")
    private List<TransacaoDTO> transacoes;

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public List<TransacaoDTO> getTransacoes() {
        return transacoes;
    }

    public void setTransacoes(List<TransacaoDTO> transacoes) {
        this.transacoes = transacoes;
    }

}
