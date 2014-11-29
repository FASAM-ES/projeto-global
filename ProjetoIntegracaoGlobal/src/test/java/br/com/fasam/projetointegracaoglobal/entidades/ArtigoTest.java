/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fasam.projetointegracaoglobal.entidades;

import junit.framework.TestCase;

/**
 * Classe de Testes dos Artigos
 * @author Evelyn Rodrigues
 */
public class ArtigoTest extends TestCase {
    
    public ArtigoTest(String testName) {
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

    /* Verificação de usuário preenchido no artigo */
    public void testUsuarioEmArtigo() {
        Artigo artigo = new Artigo(new Usuario());
        
        assertNotNull(artigo.getUsuario());
    }
    
    /* Verificação de preenchimento do nome do artigo */
    public void testNomeEmArtigo() {
        Artigo artigo = new Artigo(new Usuario());
        
        artigo.setNome("Artigo Global");
        
        assertNotNull(artigo.getNome());
    }
    
}
