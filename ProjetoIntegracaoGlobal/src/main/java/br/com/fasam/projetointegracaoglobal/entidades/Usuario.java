/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fasam.projetointegracaoglobal.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *Entidade de cadastro de usuário
 * @author Stanley Dias Paulo
 */
public class Usuario {
    String nome;
    String email;
    String senha;
    String telefone;
    String cpf;  
    List<Artigo> artigos;
    List<Comentario> comentarios;
    
    /**
     * Metódo que retorna a lista de artigos
     * @return Retorna lista de artigos
     */
    public List<Artigo> getArtigos() {
        return artigos;
    }

    /**
     * Metódo utilizado para retornar a lista de comentários do usuário
     * @return retorna lista de comentários
     */
    public List<Comentario> getComentarios() {
        return comentarios;
    }
   
    /**
     * Adiciona artigo na lista
     * @param artigo 
     */
    public void addArtigo(Artigo artigo) {
        if(this.artigos == null){
            this.artigos = new ArrayList<Artigo>();
        }
        this.artigos.add(artigo);
    }
    
    /**
     * Retorna um determinando artigo do usuário
     * @param i
     * @return retorna o artigo do usuário
     */
    public Artigo getArtigo(Integer i){
        return artigos.get(i);
    }
    
    /**
     * Remove um dado artigo do usuário
     * @param artigo 
     */
    public void remArtigo(Artigo artigo){
        if (this.artigos != null ){
            artigos.remove(artigo);
        }
    }
    
    /**
     * Adiciona um comentário na lista de comentários
     * @param comentario 
     */
     public void addComentario(Comentario comentario) {
        if(this.comentarios == null){
            this.comentarios = new ArrayList<Comentario>();
        }
        this.comentarios.add(comentario);
    }
    
     /**
      * Retorna um dado comentário do usuário
      * @param i
      * @return retorna um comentário especifico do usuário
      */
    public Comentario getComentario(Integer i){
        return comentarios.get(i);
    }
    
    /**
     * Remove um comentário do usuáiro
     * @param comentario 
     */
    public void remComentario(Comentario comentario){
        if (this.comentarios != null ){
            comentarios.remove(comentario);
        }
    }
    

    /**
     * Retorno o nome do usuário
     * @return 
     */
    public String getNome() {
        return nome;
    }

    /**
     * Seta o nome do usuário
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o e-mail do usuário
     * @return 
     */
    public String getEmail() {
        return email;
    }

    /**
     * Seta o e-mail do usuário
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Retorna a senha do usuário
     * @return 
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Seta a senha do usuário
     * @param senha 
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * Retorna o telefone do usuário
     * @return 
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Seta o telefone do usuário
     * @param telefone 
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Retorna o cpf do usuário
     * @return 
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Seta o cpf do usuário
     * @param cpf 
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
           
}
