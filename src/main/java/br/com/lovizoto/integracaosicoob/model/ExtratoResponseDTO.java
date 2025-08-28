/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.lovizoto.integracaosicoob.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 *
 * @author michel
 */
public class ExtratoResponseDTO {
    
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

class TransacaoDTO {
    
    @SerializedName("transactionId")
    private String transactionId;
    
    @SerializedName("tipo")
    private String tipo;
    
    @SerializedName("valor")
    private String valor;
    
    @SerializedName("data")
    private String data;
    
    @SerializedName("dataLote")
    private String dataLote;
    
    @SerializedName("descricao")
    private String descricao;
    
    @SerializedName("numeroDocumento")
    private String numeroDocumento;
    
    @SerializedName("cpfCnpj")
    private String cpfCnpj;
    
    @SerializedName("descInfComplementar")
    private String descInfComplementar;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDataLote() {
        return dataLote;
    }

    public void setDataLote(String dataLote) {
        this.dataLote = dataLote;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getDescInfComplementar() {
        return descInfComplementar;
    }

    public void setDescInfComplementar(String descInfComplementar) {
        this.descInfComplementar = descInfComplementar;
    }
    
    
    
}
