/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
/**
 *
 
 */
public class ConnectionFactory {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/MeuSystem";
    private static final String USER = "root";
    private static final String PASS = "";
    
    
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            Connection conexao = DriverManager.getConnection(URL, USER, PASS);
            return conexao;
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão:", ex);

        }
    }
    
    public static void closeConnection(Connection con){
        
        if(con != null){
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println("Erro: "+ex);
            }
        }
    }
    public static void closeConnection(Connection con, PreparedStatement stmt){
        
        if(stmt != null){
            try {
                stmt.close();
            } catch (SQLException ex) {
               System.err.println("Erro: "+ex);

            }
        }
        closeConnection(con);
    }
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet resu){
        
        if(resu != null){
            try {
                resu.close();
            } catch (SQLException ex) {
                System.err.println("Erro: "+ex);

            }
        }
        closeConnection(con, stmt);
    }


}
