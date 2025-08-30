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
public class ConsultaBoletoResponseDTO extends AbstractBoletoDTO {
    
    @SerializedName("numeroContaCorrente")
    private Integer numeroContaCorrente;
    
    @SerializedName("identificacaoBoletoEmpresa")
    private String identificacaoBoletoEmpresa;

    @SerializedName("identificacaoEmissaoBoleto")
    private Integer identificacaoEmissaoBoleto;

    @SerializedName("identificacaoDistribuicaoBoleto")
    private Integer identificacaoDistribuicaoBoleto;

    @SerializedName("dataLimitePagamento")
    private String dataLimitePagamento;

    @SerializedName("dataPrimeiroDesconto")
    private String dataPrimeiroDesconto;

    @SerializedName("valorPrimeiroDesconto")
    private Double valorPrimeiroDesconto;

    @SerializedName("dataSegundoDesconto")
    private String dataSegundoDesconto;

    @SerializedName("valorSegundoDesconto")
    private Double valorSegundoDesconto;

    @SerializedName("dataTerceiroDesconto")
    private String dataTerceiroDesconto;

    @SerializedName("valorTerceiroDesconto")
    private Double valorTerceiroDesconto;
    
    @SerializedName("dataMulta")
    private String dataMulta;

    @SerializedName("dataJurosMora")
    private String dataJurosMora;
    
    @SerializedName("codigoNegativacao")
    private Integer codigoNegativacao;

    @SerializedName("numeroDiasNegativacao")
    private Integer numeroDiasNegativacao;
    
    @SerializedName("codigoProtesto")
    private Integer codigoProtesto;

    @SerializedName("numeroDiasProtesto")
    private Integer numeroDiasProtesto;

    @SerializedName("quantidadeDiasFloat")
    private Integer quantidadeDiasFloat;

    @SerializedName("situacaoBoleto")
    private String situacaoBoleto;

    @SerializedName("listaHistorico")
    private List<HistoricoDTO> listaHistorico;

    @SerializedName("rateioCreditos")
    private List<RateioCreditoDTO> rateioCreditos;

    public Integer getNumeroContaCorrente() {
        return numeroContaCorrente;
    }

    public void setNumeroContaCorrente(Integer numeroContaCorrente) {
        this.numeroContaCorrente = numeroContaCorrente;
    }

    public String getIdentificacaoBoletoEmpresa() {
        return identificacaoBoletoEmpresa;
    }

    public void setIdentificacaoBoletoEmpresa(String identificacaoBoletoEmpresa) {
        this.identificacaoBoletoEmpresa = identificacaoBoletoEmpresa;
    }

    public Integer getIdentificacaoEmissaoBoleto() {
        return identificacaoEmissaoBoleto;
    }

    public void setIdentificacaoEmissaoBoleto(Integer identificacaoEmissaoBoleto) {
        this.identificacaoEmissaoBoleto = identificacaoEmissaoBoleto;
    }

    public Integer getIdentificacaoDistribuicaoBoleto() {
        return identificacaoDistribuicaoBoleto;
    }

    public void setIdentificacaoDistribuicaoBoleto(Integer identificacaoDistribuicaoBoleto) {
        this.identificacaoDistribuicaoBoleto = identificacaoDistribuicaoBoleto;
    }

    public String getDataLimitePagamento() {
        return dataLimitePagamento;
    }

    public void setDataLimitePagamento(String dataLimitePagamento) {
        this.dataLimitePagamento = dataLimitePagamento;
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

    public String getDataSegundoDesconto() {
        return dataSegundoDesconto;
    }

    public void setDataSegundoDesconto(String dataSegundoDesconto) {
        this.dataSegundoDesconto = dataSegundoDesconto;
    }

    public Double getValorSegundoDesconto() {
        return valorSegundoDesconto;
    }

    public void setValorSegundoDesconto(Double valorSegundoDesconto) {
        this.valorSegundoDesconto = valorSegundoDesconto;
    }

    public String getDataTerceiroDesconto() {
        return dataTerceiroDesconto;
    }

    public void setDataTerceiroDesconto(String dataTerceiroDesconto) {
        this.dataTerceiroDesconto = dataTerceiroDesconto;
    }

    public Double getValorTerceiroDesconto() {
        return valorTerceiroDesconto;
    }

    public void setValorTerceiroDesconto(Double valorTerceiroDesconto) {
        this.valorTerceiroDesconto = valorTerceiroDesconto;
    }

    public String getDataMulta() {
        return dataMulta;
    }

    public void setDataMulta(String dataMulta) {
        this.dataMulta = dataMulta;
    }

    public String getDataJurosMora() {
        return dataJurosMora;
    }

    public void setDataJurosMora(String dataJurosMora) {
        this.dataJurosMora = dataJurosMora;
    }

    public Integer getCodigoNegativacao() {
        return codigoNegativacao;
    }

    public void setCodigoNegativacao(Integer codigoNegativacao) {
        this.codigoNegativacao = codigoNegativacao;
    }

    public Integer getNumeroDiasNegativacao() {
        return numeroDiasNegativacao;
    }

    public void setNumeroDiasNegativacao(Integer numeroDiasNegativacao) {
        this.numeroDiasNegativacao = numeroDiasNegativacao;
    }

    public Integer getCodigoProtesto() {
        return codigoProtesto;
    }

    public void setCodigoProtesto(Integer codigoProtesto) {
        this.codigoProtesto = codigoProtesto;
    }

    public Integer getNumeroDiasProtesto() {
        return numeroDiasProtesto;
    }

    public void setNumeroDiasProtesto(Integer numeroDiasProtesto) {
        this.numeroDiasProtesto = numeroDiasProtesto;
    }

    public Integer getQuantidadeDiasFloat() {
        return quantidadeDiasFloat;
    }

    public void setQuantidadeDiasFloat(Integer quantidadeDiasFloat) {
        this.quantidadeDiasFloat = quantidadeDiasFloat;
    }

    public String getSituacaoBoleto() {
        return situacaoBoleto;
    }

    public void setSituacaoBoleto(String situacaoBoleto) {
        this.situacaoBoleto = situacaoBoleto;
    }

    public List<HistoricoDTO> getListaHistorico() {
        return listaHistorico;
    }

    public void setListaHistorico(List<HistoricoDTO> listaHistorico) {
        this.listaHistorico = listaHistorico;
    }

    public List<RateioCreditoDTO> getRateioCreditos() {
        return rateioCreditos;
    }

    public void setRateioCreditos(List<RateioCreditoDTO> rateioCreditos) {
        this.rateioCreditos = rateioCreditos;
    }    
    
    
}







