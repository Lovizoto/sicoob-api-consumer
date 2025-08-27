/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.lovizoto.integracaosicoob.model;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author michel
 */
public class BeneficiarioFinalDTO {
    
    @SerializedName("numeroCpfCnpj")
    private String numeroCpfCnpj;
    
    @SerializedName("nome")
    private String nome;

    public String getNumeroCpfCnpj() {
        return numeroCpfCnpj;
    }

    public void setNumeroCpfCnpj(String numeroCpfCnpj) {
        this.numeroCpfCnpj = numeroCpfCnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
