
package br.com.fasam.projetointegracaoglobal.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe Tag
 * @author Frederiko Oliveira
 */
public class Tag {
    private String descricao;   
    private String nome;
    private List<Artigo> artigos;
    
    /*
     * @return descrição da tag
     */
   public String getDesricao() {
        return descricao;
    }

   /*
     * @return insere uma descrição na tag
     * @param  Descrição da tag.
     */
    public void setDesricao(String desricao) {
        this.descricao = desricao;
    }
    
    /*
     * @return Nome da tag
     */
    public String getNome() {
        return nome;
    }

    /*
     * @return insere um nome na tag
     * @param  Nome da tag.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
   
    /*
     * @return artigo de uma lista de artigos.
     * @param  posição do artigo na lista.
     */
    public Artigo getArtigos(Integer i){
        return artigos.get(i);
    }
    
    /*
     * @return Adiciona um artigo na lista de artigos.
     * @param  Artigo.
     */
    public void addArtigo(Artigo artigo){
        if (this.artigos == null){
            this.artigos = new ArrayList<Artigo>();            
        }
        this.artigos.add(artigo);
    }
    
    /*
     * @return Remove um artigo na lista de artigos.
     * @param  Artigo.
     */
    public void remArtigo(Artigo artigo){
        if (this.artigos != null){
            this.artigos.remove(artigo);
        }
    }
}
