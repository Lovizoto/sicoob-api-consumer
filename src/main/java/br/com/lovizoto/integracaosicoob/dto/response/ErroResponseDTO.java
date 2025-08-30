/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.lovizoto.integracaosicoob.dto.response;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import main.java.br.com.lovizoto.integracaosicoob.dto.shared.MensagemDTO;

/**
 *
 * @author michel
 */
public class ErroResponseDTO {
    
    private List<MensagemDTO> mensagens;

    public List<MensagemDTO> getMensagens() {
        return mensagens;
    }

    public void setMensagens(List<MensagemDTO> mensagens) {
        this.mensagens = mensagens;
    }
    
}


