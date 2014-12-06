/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fasam.projetointegracaoglobal.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que contém informações do Artigo
 * @author Evelyn Rodrigues Sales Barbosa
 */
public class Artigo {
    
    /**
     * Nome do Artigo
     */
    String nome;
    
    /**
     * Descrição do Artigo
     */
    String descricao;
    
    /**
     * Dados do Usuário do Artigo
     */
    Usuario usuario;
    
    /**
     * Lista de Comentários do Artigo
     */
    List<Comentario> comentarios;
    
    /**
     * Lista de Tags do Artigo
     */
    List<Tag> tags;
    
    /* Construtor da classe artigo
     * @param usuario Dados do usuario
     */
    public Artigo(Usuario usuario) {
        this.usuario = usuario;
    }
    
    /* Obtém o nome do artigo */ 
    public String getNome() {
        return nome;
    }

    /**
     * Atribui o nome do artigo 
     * @param nome Nome do artigo
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /* 
     * Obtém a descrição do artigo
     */ 
    public String getDescricao() {
        return descricao;
    }

    /*
     * Atribui a descrição do artigo
     * @param descricao Descrição do artigo
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }  

    /**
     * Obtém o usuário do artigo
     * @return Retorna os dados do usuário
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Atribui o usuário do artigo
     * @param usuario Dados do usuário do artigo
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * Obtém o comentário do artigo
     * @param i Índice do comentário
     * @return Retorna determinado comentário
     */
    public Comentario getComentario(Integer i) {
        return comentarios.get(i);
    }
    
    /**
     * Adiciona o comentário para determinado artigo
     * @param comentario Dados do comentário
     */
    public void addComentario(Comentario comentario) {
        if (this.comentarios == null) {
            this.comentarios = new ArrayList<Comentario>();
        }
        this.comentarios.add(comentario);
    }
    
    /**
     * Remove o comentário para determinado artigo
     * @param comentario Dados do comentário
     */
    public void remComentario(Comentario comentario) {
        if (this.comentarios != null) {
            this.comentarios.remove(comentario);
        }
    }

    /**
     * Obtém a tag para determinado artigo
     * @param i Indice da tag
     * @return Retorna determinada tag do artigo
     */
    public Tag getTag(Integer i) {
        return tags.get(i);
    }
    
    /**
     * Adiciona determina tag para o artigo
     * @param tag Dados da tag
     */
    public void addTag(Tag tag) {
        if (this.tags == null) {
            this.tags = new ArrayList<Tag>();
        }
        this.tags.add(tag);
    }
    
    /**
     * Remove a tag para determinado artigo
     * @param tag Dados da Tag
     */
    public void remTag(Tag tag) {
        if (this.tags != null) {
            this.tags.remove(tag);
        }
    }
    
}
