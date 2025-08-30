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
public abstract class AbstractBoletoDTO {
    
    @SerializedName("numeroCliente")
    private Long numeroCliente;

    @SerializedName("codigoModalidade")
    private Integer codigoModalidade;

    @SerializedName("codigoEspecieDocumento")
    private String codigoEspecieDocumento;

    @SerializedName("dataEmissao")
    private String dataEmissao;

    @SerializedName("nossoNumero")
    private Long nossoNumero;

    @SerializedName("seuNumero")
    private String seuNumero;

    @SerializedName("codigoBarras")
    private String codigoBarras;

    @SerializedName("linhaDigitavel")
    private String linhaDigitavel;

    @SerializedName("valor")
    private Double valor;

    @SerializedName("dataVencimento")
    private String dataVencimento;

    @SerializedName("valorAbatimento")
    private Double valorAbatimento;

    @SerializedName("numeroParcela")
    private Integer numeroParcela;

    @SerializedName("aceite")
    private Boolean aceite;
    
    @SerializedName("tipoDesconto")
    private Integer tipoDesconto;

    @SerializedName("tipoMulta")
    private Integer tipoMulta;

    @SerializedName("valorMulta")
    private Double valorMulta;

    @SerializedName("tipoJurosMora")
    private Integer tipoJurosMora;

    @SerializedName("valorJurosMora")
    private Double valorJurosMora;

    @SerializedName("pagador")
    private PagadorDTO pagador;

    @SerializedName("beneficiarioFinal")
    private BeneficiarioFinalDTO beneficiarioFinal;

    @SerializedName("mensagensInstrucao")
    private List<String> mensagensInstrucao;

    @SerializedName("qrCode")
    private String qrCode;

    @SerializedName("numeroContratoCobranca")
    private Integer numeroContratoCobranca;

    public Long getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(Long numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public Integer getCodigoModalidade() {
        return codigoModalidade;
    }

    public void setCodigoModalidade(Integer codigoModalidade) {
        this.codigoModalidade = codigoModalidade;
    }

    public String getCodigoEspecieDocumento() {
        return codigoEspecieDocumento;
    }

    public void setCodigoEspecieDocumento(String codigoEspecieDocumento) {
        this.codigoEspecieDocumento = codigoEspecieDocumento;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Long getNossoNumero() {
        return nossoNumero;
    }

    public void setNossoNumero(Long nossoNumero) {
        this.nossoNumero = nossoNumero;
    }

    public String getSeuNumero() {
        return seuNumero;
    }

    public void setSeuNumero(String seuNumero) {
        this.seuNumero = seuNumero;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getLinhaDigitavel() {
        return linhaDigitavel;
    }

    public void setLinhaDigitavel(String linhaDigitavel) {
        this.linhaDigitavel = linhaDigitavel;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Double getValorAbatimento() {
        return valorAbatimento;
    }

    public void setValorAbatimento(Double valorAbatimento) {
        this.valorAbatimento = valorAbatimento;
    }

    public Integer getNumeroParcela() {
        return numeroParcela;
    }

    public void setNumeroParcela(Integer numeroParcela) {
        this.numeroParcela = numeroParcela;
    }

    public Boolean getAceite() {
        return aceite;
    }

    public void setAceite(Boolean aceite) {
        this.aceite = aceite;
    }

    public Integer getTipoDesconto() {
        return tipoDesconto;
    }

    public void setTipoDesconto(Integer tipoDesconto) {
        this.tipoDesconto = tipoDesconto;
    }

    public Integer getTipoMulta() {
        return tipoMulta;
    }

    public void setTipoMulta(Integer tipoMulta) {
        this.tipoMulta = tipoMulta;
    }

    public Double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(Double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public Integer getTipoJurosMora() {
        return tipoJurosMora;
    }

    public void setTipoJurosMora(Integer tipoJurosMora) {
        this.tipoJurosMora = tipoJurosMora;
    }

    public Double getValorJurosMora() {
        return valorJurosMora;
    }

    public void setValorJurosMora(Double valorJurosMora) {
        this.valorJurosMora = valorJurosMora;
    }

    public PagadorDTO getPagador() {
        return pagador;
    }

    public void setPagador(PagadorDTO pagador) {
        this.pagador = pagador;
    }

    public BeneficiarioFinalDTO getBeneficiarioFinal() {
        return beneficiarioFinal;
    }

    public void setBeneficiarioFinal(BeneficiarioFinalDTO beneficiarioFinal) {
        this.beneficiarioFinal = beneficiarioFinal;
    }

    public List<String> getMensagensInstrucao() {
        return mensagensInstrucao;
    }

    public void setMensagensInstrucao(List<String> mensagensInstrucao) {
        this.mensagensInstrucao = mensagensInstrucao;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public Integer getNumeroContratoCobranca() {
        return numeroContratoCobranca;
    }

    public void setNumeroContratoCobranca(Integer numeroContratoCobranca) {
        this.numeroContratoCobranca = numeroContratoCobranca;
    }
    
    
    
}
