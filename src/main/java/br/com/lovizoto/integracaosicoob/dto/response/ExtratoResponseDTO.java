/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.lovizoto.integracaosicoob.dto.response;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import main.java.br.com.lovizoto.integracaosicoob.dto.shared.ExtratoResultadoDTO;
import main.java.br.com.lovizoto.integracaosicoob.dto.shared.MensagemDTO;

/**
 *
 * @author michel
 */
public class ExtratoResponseDTO {
    
    @SerializedName("mensagens")
    private List<MensagemDTO> mensagens;
    
    @SerializedName("resultado")
    private ExtratoResultadoDTO resultado;

    public List<MensagemDTO> getMensagens() {
        return mensagens;
    }

    public void setMensagens(List<MensagemDTO> mensagens) {
        this.mensagens = mensagens;
    }

    public ExtratoResultadoDTO getResultado() {
        return resultado;
    }

    public void setResultado(ExtratoResultadoDTO resultado) {
        this.resultado = resultado;
    }
    
    
    
}
