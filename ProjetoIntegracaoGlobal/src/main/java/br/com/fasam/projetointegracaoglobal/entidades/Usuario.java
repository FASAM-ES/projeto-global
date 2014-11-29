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

    public void addArtigo(Artigo artigo) {
        if(this.artigos == null){
            this.artigos = new ArrayList<Artigo>();
        }
        this.artigos.add(artigo);
    }
    
    public Artigo getArtigo(Integer i){
        return artigos.get(i);
    }
    
    public void remArtigo(Artigo artigo){
        if (this.artigos != null ){
            artigos.remove(artigo);
        }
    }
    
     public void addComentario(Comentario comentario) {
        if(this.comentarios == null){
            this.comentarios = new ArrayList<Comentario>();
        }
        this.comentarios.add(comentario);
    }
    
    public Comentario getComentario(Integer i){
        return comentarios.get(i);
    }
    
    public void remComentario(Comentario comentario){
        if (this.comentarios != null ){
            comentarios.remove(comentario);
        }
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
           
}
