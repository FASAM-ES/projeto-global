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

    /**
     * Test of getNome method, of class Categoria.
     */
    public void testGetNome() {
        System.out.println("getNome");
        Categoria instance = new Categoria();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Categoria.
     */
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Categoria instance = new Categoria();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArtigos method, of class Categoria.
     */
    public void testGetArtigos() {
        System.out.println("getArtigos");
        Integer i = null;
        Categoria instance = new Categoria();
        Artigo expResult = null;
        Artigo result = instance.getArtigos(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addArtigo method, of class Categoria.
     */
    public void testAddArtigo() {
        System.out.println("addArtigo");
        Artigo artigo = null;
        Categoria instance = new Categoria();
        instance.addArtigo(artigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remArtigo method, of class Categoria.
     */
    public void testRemArtigo() {
        System.out.println("remArtigo");
        Artigo artigo = null;
        Categoria instance = new Categoria();
        instance.remArtigo(artigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
