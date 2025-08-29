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
public class AlteracaoBoletoRequestDTO {

    @SerializedName("numeroCliente")
    private Long numeroCliente;

    @SerializedName("codigoModalidade")
    private Integer codigoModalidade;

    @SerializedName("numeroContratoCobranca")
    private Integer numeroContratoCobranca;

    @SerializedName("especieDocumento")
    private EspecieDocumentoDTO especieDocumento;

    @SerializedName("seuNumero")
    private SeuNumeroDTO seuNumero;

    @SerializedName("desconto")
    private DescontoDTO desconto;

    @SerializedName("abatimento")
    private AbatimentoDTO abatimento;

    @SerializedName("multa")
    private MultaDTO multa;

    @SerializedName("jurosMora")
    private JurosMoraDTO jurosMora;

    @SerializedName("rateioCredito")
    private RateioCreditoAlteracaoDTO rateioCredito;

    @SerializedName("pix")
    private PixAlteracaoDTO pix;

    @SerializedName("prorrogacaoVencimento")
    private ProrrogacaoVencimentoDTO prorrogacaoVencimento;

    @SerializedName("prorrogacaoLimitePagamento")
    private ProrrogacaoLimitePagamentoDTO prorrogacaoLimitePagamento;

    @SerializedName("valorNominal")
    private ValorNominalDTO valorNominal;

}

class EspecieDocumentoDTO {
    
    @SerializedName("codigoEspecieDocumento")
    private String codigoEspecieDocumento;

    public String getCodigoEspecieDocumento() {
        return codigoEspecieDocumento;
    }

    public void setCodigoEspecieDocumento(String codigoEspecieDocumento) {
        this.codigoEspecieDocumento = codigoEspecieDocumento;
    }
        
    
}

class SeuNumeroDTO {
    
    
    @SerializedName("seuNumero")
    private String seuNumero;
    
    @SerializedName("identificacaoBoletoEmpresa")
    private String identificacaoBoletoEmpresa;

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
        
}

class DescontoDTO {
    
   @SerializedName("tipoDesconto")
   private Integer tipoDesconto;
   
   @SerializedName("dataPrimeiroDesconto")
   private String dataPrimeiroDesconto;
   
   @SerializedName("valorPrimeiroDesconto")
   private Double valorPrimeiroDesconto;

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
    
}

class AbatimentoDTO {
    
    @SerializedName("valorAbatimento")
    private Double valorAbatimento;

    public Double getValorAbatimento() {
        return valorAbatimento;
    }

    public void setValorAbatimento(Double valorAbatimento) {
        this.valorAbatimento = valorAbatimento;
    }
    
}

class MultaDTO {
    
    @SerializedName("tipoMulta")
    private Integer tipoMulta;
    
    @SerializedName("dataMulta")
    private String dataMulta;
    
    @SerializedName("valorMulta")
    private Double valorMulta;

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
    
}


class JurosMoraDTO {
    
    @SerializedName("tipoJurosMora")
    private Integer tipoJurosMora;
    
    @SerializedName("dataJurosMora")
    private String dataJurosMora;
    
    @SerializedName("valorJurosMora")
    private Double valorJurosMora;

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
    
}

class RateioCreditoAlteracaoDTO {
    
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

class PixAlteracaoDTO {
    
    @SerializedName("utilizarPix")
    private Boolean utilizarPix;

    public Boolean getUtilizarPix() {
        return utilizarPix;
    }

    public void setUtilizarPix(Boolean utilizarPix) {
        this.utilizarPix = utilizarPix;
    }
    
}

class ProrrogacaoVencimentoDTO {
    
    @SerializedName("dataVencimento")
    private String dataVencimento;

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
    
}


class ProrrogacaoLimitePagamentoDTO {
    
    @SerializedName("dataLimitePagamento")
    private String dataLimitePagamento;

    public String getDataLimitePagamento() {
        return dataLimitePagamento;
    }

    public void setDataLimitePagamento(String dataLimitePagamento) {
        this.dataLimitePagamento = dataLimitePagamento;
    }    
    
}

class ValorNominalDTO {
    
    @SerializedName("valor")
    private Double valor;

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    
}







