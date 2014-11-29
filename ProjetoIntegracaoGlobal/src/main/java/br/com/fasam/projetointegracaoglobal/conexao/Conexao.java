/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fasam.projetointegracaoglobal.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Evelyn Rodrigues
 */
public class Conexao {
    
    private static String driver = "org.postgresql.Driver";
    private static String url = "jdbc:postgresql://localhost/fasam";
    private static String usuario = "postgres";
    private static String senha = "fasam";

    public static Connection getConexao() throws SQLException {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return DriverManager.getConnection(url, usuario, senha);
    }

}
