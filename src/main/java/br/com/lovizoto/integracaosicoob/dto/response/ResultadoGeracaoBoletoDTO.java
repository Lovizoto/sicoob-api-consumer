/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.lovizoto.integracaosicoob.dto.response;

import com.google.gson.annotations.SerializedName;
import main.java.br.com.lovizoto.integracaosicoob.dto.shared.ResultadoDTO;

/**
 *
 * @author michel
 */
public class ResultadoGeracaoBoletoDTO {
    
    @SerializedName("resultado")
    private ResultadoDTO resultado;

    public ResultadoDTO getResultado() {
        return resultado;
    }

    public void setResultado(ResultadoDTO resultado) {
        this.resultado = resultado;
    }    
    
}

