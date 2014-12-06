/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fasam.projetointegracaoglobal.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe Artigo
 * @author Evelyn Rodrigues Sales Barbosa
 */
public class Artigo {
    
    /* Definições dos atributos */
    String nome;
    String descricao;
    Usuario usuario;
    List<Comentario> comentarios;
    List<Tag> tags;
    
    /* Construtor com parâmetros */
    public Artigo(Usuario usuario) {
        this.usuario = usuario;
    }
    
    /* Nome */ 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /* Descrição */ 
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }  

    /* Usuário */ 
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /* Comentários */ 
    public Comentario getComentario(Integer i) {
        return comentarios.get(i);
    }
    
    public void addComentario(Comentario comentario) {
        if (this.comentarios == null) {
            this.comentarios = new ArrayList<Comentario>();
        }
        this.comentarios.add(comentario);
    }
    
    public void remComentario(Comentario comentario) {
        if (this.comentarios != null) {
            this.comentarios.remove(comentario);
        }
    }

    /* Tags */
    public Tag getTag(Integer i) {
        return tags.get(i);
    }
    
    public void addTag(Tag tag) {
        if (this.tags == null) {
            this.tags = new ArrayList<Tag>();
        }
        this.tags.add(tag);
    }
    
    public void remTag(Tag tag) {
        if (this.tags != null) {
            this.tags.remove(tag);
        }
    }
    
}
