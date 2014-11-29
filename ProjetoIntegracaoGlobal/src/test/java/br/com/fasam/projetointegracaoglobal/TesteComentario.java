/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fasam.projetointegracaoglobal;


import br.com.fasam.projetointegracaoglobal.entidades.Comentario;
import static junit.framework.Assert.assertNotNull;
import junit.framework.TestCase;

/**
 *
 * @author Aluno
 */
public class TesteComentario extends TestCase {
    
    public TesteComentario(String testName) {
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
    // public void testHello() {}
    
      /* Verificação  */
    public void testComentario() {
        Comentario comentario = new Comentario();
        
        assertNotNull(getName());
    }
     
 }
