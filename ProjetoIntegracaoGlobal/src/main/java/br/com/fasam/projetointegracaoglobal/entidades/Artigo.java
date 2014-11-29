/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fasam.projetointegracaoglobal.entidades;

/**
 * Classe Artigo
 * @author Evelyn Rodrigues
 */
public class Artigo {
    
    /* Definições dos atributos */
    String nome;
    String descricao;

    /* Definições das propriedades */    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }  
    
}
