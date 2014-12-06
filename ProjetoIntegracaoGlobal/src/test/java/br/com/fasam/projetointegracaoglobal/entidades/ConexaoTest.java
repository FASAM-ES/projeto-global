/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fasam.projetointegracaoglobal.entidades;

import br.com.fasam.projetointegracaoglobal.conexao.Conexao;
import java.sql.Connection;
import junit.framework.TestCase;

/**
 *
 * @author Aluno
 */
public class ConexaoTest extends TestCase {
    
    public ConexaoTest(String testName) {
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

    /* Verificação de conexão com banco de dados 
    public void testConexao() {
        Connection con = Conexao.getConexao();
        assertNotNull(con);
    }*/
}
