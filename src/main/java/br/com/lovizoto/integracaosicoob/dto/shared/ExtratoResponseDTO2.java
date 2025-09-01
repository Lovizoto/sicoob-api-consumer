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
public class ExtratoResponseDTO2 {
    
    @SerializedName("saldoAtual")
    private String saldoAtual;
    
    @SerializedName("saldoBloqueado")    
    private String saldoBloqueado;
    
    @SerializedName("saldoLimite")
    private String saldoLimite;
    
    @SerializedName("saldoAnterior")
    private String saldoAnterior;
    
    @SerializedName("saldoBloqueioJudicial")
    private String saldoBloqueioJudicial;
    
    @SerializedName("saldoBloqueioJudicialAnterior")
    private String saldoBloqueioJudicialAnterior;
    
    @SerializedName("transacoes")
    private List<TransacaoDTO> transacoes;

    public String getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(String saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public String getSaldoBloqueado() {
        return saldoBloqueado;
    }

    public void setSaldoBloqueado(String saldoBloqueado) {
        this.saldoBloqueado = saldoBloqueado;
    }

    public String getSaldoLimite() {
        return saldoLimite;
    }

    public void setSaldoLimite(String saldoLimite) {
        this.saldoLimite = saldoLimite;
    }

    public String getSaldoAnterior() {
        return saldoAnterior;
    }

    public void setSaldoAnterior(String saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    public String getSaldoBloqueioJudicial() {
        return saldoBloqueioJudicial;
    }

    public void setSaldoBloqueioJudicial(String saldoBloqueioJudicial) {
        this.saldoBloqueioJudicial = saldoBloqueioJudicial;
    }

    public String getSaldoBloqueioJudicialAnterior() {
        return saldoBloqueioJudicialAnterior;
    }

    public void setSaldoBloqueioJudicialAnterior(String saldoBloqueioJudicialAnterior) {
        this.saldoBloqueioJudicialAnterior = saldoBloqueioJudicialAnterior;
    }

    public List<TransacaoDTO> getTransacoes() {
        return transacoes;
    }

    public void setTransacoes(List<TransacaoDTO> transacoes) {
        this.transacoes = transacoes;
    }
    
    
}


