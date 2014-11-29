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
public class existeArtigoDoUsuario extends TestCase {
    
    public existeArtigoDoUsuario(String testName) {
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
    
    public void testUsuarioPossuiArtigo() {
        Usuario usuario = new Usuario();
        usuario.setNome("Stanley Dias Paulo");
        usuario.setEmail("sdph2007@gmail.com");
        usuario.setCpf("81580584187");
        usuario.setSenha("123");
        usuario.setTelefone("(62)32555566");
        
        Artigo artigo = new Artigo(new Usuario());
        artigo.setNome("Integração");
        artigo.setDescricao("");
        artigo.setUsuario(usuario);
       
        usuario.addArtigo(artigo);

        assertNotNull(usuario.getArtigos());
        
    }
    
    public void testNomeDoUsuarioEstaPreenchido() {
        Usuario usuario = new Usuario();
        usuario.setNome("Stanley");
        
        assertEquals("Stanley", usuario.getNome());
    }    
}
