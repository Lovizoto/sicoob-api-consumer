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
public class RateioCreditoDTO {
    
    @SerializedName("numeroBanco")
    private Integer numeroBanco;
    
    @SerializedName("numeroAgencia")
    private Integer numeroAgencia;
    
    @SerializedName("numeroContaCorrente")
    private String numeroContaCorrente;
    
    @SerializedName("contaPrincipal")
    private Boolean contaPrincipal;
    
    @SerializedName("codigoTipoValorRateio")
    private Integer codigoTipoValorRateio;
    
    @SerializedName("valorRateio")
    private String valorRateio;
    
    @SerializedName("codigoTipoCalculoRateio")
    private Integer codigoTipoCalculoRateio;
    
    @SerializedName("numeroCpfCnpjTitular")
    private String numeroCpfCnpjTitular;
    
    @SerializedName("nomeTitular")
    private String nomeTitular;
    
    @SerializedName("codigoFinalidadeTed")
    private String codigoFinalidadeTed;
    
    @SerializedName("codigoTipoContaDestinoTed")
    private String codigoTipoContaDestinoTed;
    
    @SerializedName("dataFloatCredito")
    private String dataFloatCredito;

    public Integer getNumeroBanco() {
        return numeroBanco;
    }

    public void setNumeroBanco(Integer numeroBanco) {
        this.numeroBanco = numeroBanco;
    }

    public Integer getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(Integer numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNumeroContaCorrente() {
        return numeroContaCorrente;
    }

    public void setNumeroContaCorrente(String numeroContaCorrente) {
        this.numeroContaCorrente = numeroContaCorrente;
    }

    public Boolean getContaPrincipal() {
        return contaPrincipal;
    }

    public void setContaPrincipal(Boolean contaPrincipal) {
        this.contaPrincipal = contaPrincipal;
    }

    public Integer getCodigoTipoValorRateio() {
        return codigoTipoValorRateio;
    }

    public void setCodigoTipoValorRateio(Integer codigoTipoValorRateio) {
        this.codigoTipoValorRateio = codigoTipoValorRateio;
    }

    public String getValorRateio() {
        return valorRateio;
    }

    public void setValorRateio(String valorRateio) {
        this.valorRateio = valorRateio;
    }

    public Integer getCodigoTipoCalculoRateio() {
        return codigoTipoCalculoRateio;
    }

    public void setCodigoTipoCalculoRateio(Integer codigoTipoCalculoRateio) {
        this.codigoTipoCalculoRateio = codigoTipoCalculoRateio;
    }

    public String getNumeroCpfCnpjTitular() {
        return numeroCpfCnpjTitular;
    }

    public void setNumeroCpfCnpjTitular(String numeroCpfCnpjTitular) {
        this.numeroCpfCnpjTitular = numeroCpfCnpjTitular;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getCodigoFinalidadeTed() {
        return codigoFinalidadeTed;
    }

    public void setCodigoFinalidadeTed(String codigoFinalidadeTed) {
        this.codigoFinalidadeTed = codigoFinalidadeTed;
    }

    public String getCodigoTipoContaDestinoTed() {
        return codigoTipoContaDestinoTed;
    }

    public void setCodigoTipoContaDestinoTed(String codigoTipoContaDestinoTed) {
        this.codigoTipoContaDestinoTed = codigoTipoContaDestinoTed;
    }

    public String getDataFloatCredito() {
        return dataFloatCredito;
    }

    public void setDataFloatCredito(String dataFloatCredito) {
        this.dataFloatCredito = dataFloatCredito;
    }
    
    
    
}
