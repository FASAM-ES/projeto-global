/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fasam.projetointegracaoglobal.entidades;

import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;

/**
 *
 * @author Aluno
 */
public class TagTest extends TestCase {
    
    public TagTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testArtigosDaTag(){
        Tag instance;
        Artigo artigo = null;
        boolean result;
        
        instance = new Tag();
        instance.setNome("NSFW");
        instance.setDesricao("Not safe to work");
        
        artigo = new Artigo(new Usuario());
        artigo.setNome("Artigo teste");
        artigo.setDescricao("blá blá");
        artigo.setUsuario(new Usuario());
        
        instance.addArtigo(artigo);
        
        if (instance.getArtigos(0) != null){
            result = true;
        }else{
            result = false;
        }
        
        assertEquals(true, result);
        
        
    }
    
   
}
