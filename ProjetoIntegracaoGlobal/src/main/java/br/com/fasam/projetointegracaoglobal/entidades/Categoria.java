/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fasam.projetointegracaoglobal.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fernando
 * 
 */
public class Categoria {
   
    /* Definições dos atributos */
    String nome;
    String descricao;    
    List<Artigo> artigos;
    
    /* Nome */ 
    public String getNome() {
        return nome;
    }
   
    /* Construtor com parâmetros  - Nome*/
    public void setNome(String nome) {
        this.nome = nome;
    }
    /* Descrição */  
    public String getDescricao() {
        return descricao;
    }
 
    /* Construtor com parâmetros  - Descricao*/    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    /**
     * Obtém os dados do artigo
     * @param i Indice do artigo
     * @return Retorna os dados artigo
     */
    public Artigo getArtigos(Integer i){
        return artigos.get(i);
    }
    
    /* Construtor com parâmetros  - Artigo*/    
    public void addArtigo(Artigo artigo){
        if (this.artigos == null){
            this.artigos = new ArrayList<Artigo>();            
        }
        this.artigos.add(artigo);
    }
  
    /**
     * Remove o artigo
     * @param artigo Dados do artigo
     */
    public void remArtigo(Artigo artigo){
        if (this.artigos != null){
            this.artigos.remove(artigo);
        }
    }
}
     

