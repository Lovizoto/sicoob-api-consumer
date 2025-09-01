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
public class TransacaoDTO {

    @SerializedName("transactionId")
    private String transactionId;

    @SerializedName("tipo")
    private String tipo;

    @SerializedName("valor")
    private BigDecimal valor;

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

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
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
