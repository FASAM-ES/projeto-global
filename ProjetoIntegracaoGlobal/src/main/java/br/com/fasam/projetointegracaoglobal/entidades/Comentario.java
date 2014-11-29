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
public class Comentario {
 
    String titulo;
    String descricao;
    List<Usuario> usuario;
    List<Artigo> artigo;
    private Usuario ArrayList;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    public Usuario getUsuario(Integer i ) {
        return usuario.get(i);
    
    }
    
    public void addUsuario(Usuario usuario) {
        if(this.usuario == null){
            this.usuario = ArrayList<usuario>();
        }
    }
    
    public void remUsuario(Usuario usuario){
        if (this.usuario != null){
            this.usuario.remove(usuario);
            
        }
        
    }
   
}
