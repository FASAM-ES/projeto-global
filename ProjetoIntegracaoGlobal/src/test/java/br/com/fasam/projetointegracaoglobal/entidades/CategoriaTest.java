/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fasam.projetointegracaoglobal.entidades;

import static junit.framework.Assert.assertNotNull;
import junit.framework.TestCase;

/**
 *
 * @author Aluno
 */
public class CategoriaTest extends TestCase {
    
    public CategoriaTest(String testName) {
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
    // TODO add test methods here. The name must begin with 'test'. For example:
    
    
    /* Verificação de preenchimento do nome do artigo */
    public void testNomeEmCategoria() {
        Categoria categoria = new Categoria();
        
        categoria.setNome("nomeDela");
        
        assertNotNull(categoria.getNome());
    }
}
     
     

