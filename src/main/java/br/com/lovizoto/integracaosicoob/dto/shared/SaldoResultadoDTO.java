/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.lovizoto.integracaosicoob.dto.shared;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;

/**
 *
 * @author michel
 */
public class SaldoResultadoDTO {

    @SerializedName("saldo")
    private BigDecimal saldo;

    @SerializedName("saldoLimite")
    private BigDecimal saldoLimite;

    @SerializedName("saldoBloqueado")
    private BigDecimal saldoBloqueado;

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getSaldoLimite() {
        return saldoLimite;
    }

    public void setSaldoLimite(BigDecimal saldoLimite) {
        this.saldoLimite = saldoLimite;
    }

    public BigDecimal getSaldoBloqueado() {
        return saldoBloqueado;
    }

    public void setSaldoBloqueado(BigDecimal saldoBloqueado) {
        this.saldoBloqueado = saldoBloqueado;
    }
    
    
}
