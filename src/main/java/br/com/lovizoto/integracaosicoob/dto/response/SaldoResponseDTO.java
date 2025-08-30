/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.lovizoto.integracaosicoob.dto.response;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import main.java.br.com.lovizoto.integracaosicoob.dto.shared.MensagemDTO;
import main.java.br.com.lovizoto.integracaosicoob.dto.shared.SaldoResultadoDTO;

/**
 *
 * @author michel
 */
public class SaldoResponseDTO {

    @SerializedName("mensagens")
    private List<MensagemDTO> mensagens;

    @SerializedName("resultado")
    private SaldoResultadoDTO resultado;

    
    public List<MensagemDTO> getMensagens() {
        return mensagens;
    }

    public void setMensagens(List<MensagemDTO> mensagens) {
        this.mensagens = mensagens;
    }

    public SaldoResultadoDTO getResultado() {
        return resultado;
    }

    public void setResultado(SaldoResultadoDTO resultado) {
        this.resultado = resultado;
    }
    
}


