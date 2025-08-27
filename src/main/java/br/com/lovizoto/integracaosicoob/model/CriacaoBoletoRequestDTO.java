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
public class CriacaoBoletoRequestDTO {

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

    @SerializedName("codigoNegativacao")
    private Integer codigoNegativacao;

    @SerializedName("numeroDiasNegativacao")
    private Integer numeroDiasNegativacao;

    @SerializedName("codigoProtesto")
    private Integer codigoProtesto;

    @SerializedName("numeroDiasProtesto")
    private Integer numeroDiasProtesto;

    @SerializedName("pagador")
    private PagadorDTO pagador;

    @SerializedName("beneficiarioFinal")
    private BeneficiarioFinalDTO beneficiarioFinal;

    @SerializedName("mensagensInstrucao")
    private List<String> mensagensInstrucao;

    @SerializedName("gerarPdf")
    private Boolean gerarPdf;

    @SerializedName("rateioCreditos")
    private List<RateioCreditoDTO> rateioCreditos;

    @SerializedName("codigoCadastrarPIX")
    private Integer codigoCadastrarPIX;

    @SerializedName("numeroContratoCobranca")
    private Integer numeroContratoCobranca;

    // Gere os Getters e Setters para todos os campos
}






