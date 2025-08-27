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
public class ConsultaBoletoResponseDTO {
    
    @SerializedName("resultado")
    private ResultadoBoletoDTO resultado;
    
    
    public ResultadoBoletoDTO getResultado() {
        return resultado;
    }

    public void setResultado(ResultadoBoletoDTO resultado) {
        this.resultado = resultado;
    }
    
}

class ResultadoBoletoDTO {
    
    @SerializedName("numeroCliente")
    private Long numeroCliente;
    
    @SerializedName("codigoModalidade")
    private Integer codigoModalidade;
    
    @SerializedName("numeroContaCorrente")
    private Integer numeroContaCorrente;
    
    @SerializedName("codigoEspecieDocumento")
    private String codigoEspecieDocumento;
    
    @SerializedName("dataEmissao")
    private String dataEmissao;
    
    @SerializedName("nossoNumero")
    private Long nossoNumero;
    
    @SerializedName("seuNumero")
    private String seuNumero;
    
    @SerializedName("identificacaoBoletoEmpresa")
    private String identificacaoBoletoEmpresa;
    
    @SerializedName("codigoBarras")
    private String codigoBarras;
    
    @SerializedName("linhaDigitavel")
    private String linhaDigitavel;
    
    @SerializedName("identificacaoEmissaoBoleto")
    private Integer identificacaoEmissaoBoleto;
    
    @SerializedName("identificacaoDistribuicaoBoleto")
    private Integer identificacaoDistribuicaoBoleto;
    
    @SerializedName("valor")
    private Double valor;
    
    @SerializedName("dataVencimento")
    private String dataVencimento;
    
    @SerializedName("dataLimitePagamento")
    private String dataLimitePagamento;
    
    @SerializedName("valorAbatimento")
    private Double valorAbatimento;
    
    @SerializedName("tipoDesconto")
    private Integer tipoDesconto;
    
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
    
    @SerializedName("tipoMulta")
    private Integer tipoMulta;
    
    @SerializedName("dataMulta")
    private String dataMulta;
    
    @SerializedName("valorMulta")
    private Double valorMulta;
    
    @SerializedName("tipoJurosMora")
    private Integer tipoJurosMora;
    
    @SerializedName("dataJurosMora")
    private String dataJurosMora;
    
    @SerializedName("valorJurosMora")
    private Double valorJurosMora;
    
    @SerializedName("numeroParcela")
    private Integer numeroParcela;
    
    @SerializedName("aceite")
    private Boolean aceite;
    
    @SerializedName("numeroDiasNegativacao")
    private Integer numeroDiasNegativacao;
    
    @SerializedName("numeroDiasProtesto")
    private Integer numeroDiasProtesto;
    
    @SerializedName("quantidadeDiasFloat")
    private Integer quantidadeDiasFloat;
    
    @SerializedName("pagador")
    private PagadorDTO pagador;
    
    @SerializedName("beneficiarioFinal")
    private BeneficiarioFinalDTO beneficiarioFinal;
    
    @SerializedName("mensagensInstrucao")
    private List<String> mensagensInstrucao;
    
    @SerializedName("listaHistorico")
    private List<HistoricoDTO> listaHistorico;
    
    @SerializedName("situacaoBoleto")
    private String situacaoBoleto;
    
    @SerializedName("rateioCreditos")
    private List<RateioCreditoDTO> rateioCreditos;
    
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

    public Integer getNumeroContaCorrente() {
        return numeroContaCorrente;
    }

    public void setNumeroContaCorrente(Integer numeroContaCorrente) {
        this.numeroContaCorrente = numeroContaCorrente;
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

    public String getIdentificacaoBoletoEmpresa() {
        return identificacaoBoletoEmpresa;
    }

    public void setIdentificacaoBoletoEmpresa(String identificacaoBoletoEmpresa) {
        this.identificacaoBoletoEmpresa = identificacaoBoletoEmpresa;
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

    public String getDataLimitePagamento() {
        return dataLimitePagamento;
    }

    public void setDataLimitePagamento(String dataLimitePagamento) {
        this.dataLimitePagamento = dataLimitePagamento;
    }

    public Double getValorAbatimento() {
        return valorAbatimento;
    }

    public void setValorAbatimento(Double valorAbatimento) {
        this.valorAbatimento = valorAbatimento;
    }

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

    public Integer getTipoMulta() {
        return tipoMulta;
    }

    public void setTipoMulta(Integer tipoMulta) {
        this.tipoMulta = tipoMulta;
    }

    public String getDataMulta() {
        return dataMulta;
    }

    public void setDataMulta(String dataMulta) {
        this.dataMulta = dataMulta;
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

    public String getDataJurosMora() {
        return dataJurosMora;
    }

    public void setDataJurosMora(String dataJurosMora) {
        this.dataJurosMora = dataJurosMora;
    }

    public Double getValorJurosMora() {
        return valorJurosMora;
    }

    public void setValorJurosMora(Double valorJurosMora) {
        this.valorJurosMora = valorJurosMora;
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

    public Integer getNumeroDiasNegativacao() {
        return numeroDiasNegativacao;
    }

    public void setNumeroDiasNegativacao(Integer numeroDiasNegativacao) {
        this.numeroDiasNegativacao = numeroDiasNegativacao;
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

    public List<HistoricoDTO> getListaHistorico() {
        return listaHistorico;
    }

    public void setListaHistorico(List<HistoricoDTO> listaHistorico) {
        this.listaHistorico = listaHistorico;
    }

    public String getSituacaoBoleto() {
        return situacaoBoleto;
    }

    public void setSituacaoBoleto(String situacaoBoleto) {
        this.situacaoBoleto = situacaoBoleto;
    }

    public List<RateioCreditoDTO> getRateioCreditos() {
        return rateioCreditos;
    }

    public void setRateioCreditos(List<RateioCreditoDTO> rateioCreditos) {
        this.rateioCreditos = rateioCreditos;
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




class HistoricoDTO {
    
    @SerializedName("dataHistorico")
    private String dataHistorico;
    
    @SerializedName("tipoHistorico")
    private String tipoHistorico;
    
    @SerializedName("descricaoHistorico")
    private String descricaoHistorico;

    public String getDataHistorico() {
        return dataHistorico;
    }

    public void setDataHistorico(String dataHistorico) {
        this.dataHistorico = dataHistorico;
    }

    public String getTipoHistorico() {
        return tipoHistorico;
    }

    public void setTipoHistorico(String tipoHistorico) {
        this.tipoHistorico = tipoHistorico;
    }

    public String getDescricaoHistorico() {
        return descricaoHistorico;
    }

    public void setDescricaoHistorico(String descricaoHistorico) {
        this.descricaoHistorico = descricaoHistorico;
    }
    
}


