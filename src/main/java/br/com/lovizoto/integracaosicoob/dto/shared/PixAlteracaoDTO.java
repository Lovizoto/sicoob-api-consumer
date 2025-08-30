/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.lovizoto.integracaosicoob.dto.shared;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author michel
 */
public class PixAlteracaoDTO {
    
    @SerializedName("utilizarPix")
    private Boolean utilizarPix;

    public Boolean getUtilizarPix() {
        return utilizarPix;
    }

    public void setUtilizarPix(Boolean utilizarPix) {
        this.utilizarPix = utilizarPix;
    }
    
}