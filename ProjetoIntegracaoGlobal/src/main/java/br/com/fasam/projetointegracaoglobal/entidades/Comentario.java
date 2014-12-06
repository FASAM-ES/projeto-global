/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fasam.projetointegracaoglobal.entidades;

/**
 *
 * @author Gilmar Borges
 */
public class Comentario {

    String titulo;
    String descricao;
    String usuario;
    String artigo;
    
    /*
     * Construtor da classe.
     */
    public Comentario() {
        titulo = "Primeiro";

    }
    
    /*
     * Usuário que registrou o comentário
     * @return usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /*
     * Setar um usuário do comentário
     * @param usuario que registrou o comentário
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /*
     * Artigo onde foi feito o comentário
     * @return artigo 
     */    
    public String getArtigo() {
        return artigo;
    }

    /*
     * Inseri o artigo do comentário
     * @param artigo
     */
    public void setArtigo(String artigo) {
        this.artigo = artigo;
    }

   
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
}
