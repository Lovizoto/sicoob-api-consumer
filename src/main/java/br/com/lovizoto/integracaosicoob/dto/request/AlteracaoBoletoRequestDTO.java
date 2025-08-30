/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.lovizoto.integracaosicoob.dto.request;

import com.google.gson.annotations.SerializedName;
import main.java.br.com.lovizoto.integracaosicoob.dto.shared.AbatimentoDTO;
import main.java.br.com.lovizoto.integracaosicoob.dto.shared.DescontoDTO;
import main.java.br.com.lovizoto.integracaosicoob.dto.shared.EspecieDocumentoDTO;
import main.java.br.com.lovizoto.integracaosicoob.dto.shared.JurosMoraDTO;
import main.java.br.com.lovizoto.integracaosicoob.dto.shared.MultaDTO;
import main.java.br.com.lovizoto.integracaosicoob.dto.shared.PixAlteracaoDTO;
import main.java.br.com.lovizoto.integracaosicoob.dto.shared.ProrrogacaoLimitePagamentoDTO;
import main.java.br.com.lovizoto.integracaosicoob.dto.shared.ProrrogacaoVencimentoDTO;
import main.java.br.com.lovizoto.integracaosicoob.dto.shared.RateioCreditoAlteracaoDTO;
import main.java.br.com.lovizoto.integracaosicoob.dto.shared.SeuNumeroDTO;
import main.java.br.com.lovizoto.integracaosicoob.dto.shared.ValorNominalDTO;

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






























