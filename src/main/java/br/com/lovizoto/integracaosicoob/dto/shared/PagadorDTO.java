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
public class PagadorDTO {
    
     @SerializedName("numeroCpfCnpj")
    private String numeroCpfCnpj;
    
    @SerializedName("nome")
    private String nome;
    
    @SerializedName("endereco")
    private String endereco;
    
    @SerializedName("bairro")
    private String bairro;
    
    @SerializedName("cidade")
    private String cidade;
    
    @SerializedName("cep")
    private String cep;
    
    @SerializedName("uf")
    private String uf;
    
    @SerializedName("email")
    private String email;

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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
