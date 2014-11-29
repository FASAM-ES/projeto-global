/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fasam.projetointegracaoglobal.entidades;

import junit.framework.TestCase;

/**
 *
 * @author Aluno
 */
public class ComentarioTest extends TestCase {
    
    public ComentarioTest(String testName) {
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

    /**
     * Test of getUsuario method, of class Comentario.
     */
    public void testGetUsuario() {
        System.out.println("getUsuario");
        Comentario instance = new Comentario();
        String expResult = "";
        String result = instance.getUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuario method, of class Comentario.
     */
    public void testSetUsuario() {
        System.out.println("setUsuario");
        String usuario = "";
        Comentario instance = new Comentario();
        instance.setUsuario(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArtigo method, of class Comentario.
     */
    public void testGetArtigo() {
        System.out.println("getArtigo");
        Comentario instance = new Comentario();
        String expResult = "";
        String result = instance.getArtigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArtigo method, of class Comentario.
     */
    public void testSetArtigo() {
        System.out.println("setArtigo");
        String artigo = "";
        Comentario instance = new Comentario();
        instance.setArtigo(artigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitulo method, of class Comentario.
     */
    public void testGetTitulo() {
        System.out.println("getTitulo");
        Comentario instance = new Comentario();
        String expResult = "";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitulo method, of class Comentario.
     */
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String titulo = "";
        Comentario instance = new Comentario();
        instance.setTitulo(titulo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescricao method, of class Comentario.
     */
    public void testGetDescricao() {
        System.out.println("getDescricao");
        Comentario instance = new Comentario();
        String expResult = "";
        String result = instance.getDescricao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescricao method, of class Comentario.
     */
    public void testSetDescricao() {
        System.out.println("setDescricao");
        String descricao = "";
        Comentario instance = new Comentario();
        instance.setDescricao(descricao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
