/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fasam.projetointegracaoglobal.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Categoria {
    String nome;
    String Descricao;
    
     List<Artigo> artigos;
    
     public String getNome() {
        return nome;
    }
     
      public void setNome(String nome) {
        this.nome = nome;
    }
        public Artigo getArtigos(Integer i){
        return artigos.get(i);
    }
    
    public void addArtigo(Artigo artigo){
        if (this.artigos == null){
            this.artigos = new ArrayList<Artigo>();            
        }
        this.artigos.add(artigo);
    }
    
    public void remArtigo(Artigo artigo){
        if (this.artigos != null){
            this.artigos.remove(artigo);
        }
    }
}
     

