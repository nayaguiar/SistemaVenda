
package Dao;

import Beans.Login;
import Connection.ConnectionFactory;
import java.awt.List;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Beans.Login;


public class LoginDao {
    public void create(Login log){
        
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
      // JOptionPane.showMessageDialog(null, con);
       
        try {
            stmt = con.prepareStatement("INSERT INTO login(login, senha) VALUES (?, ?)");
            stmt.setString(1, log.getLogin());
            stmt.setString(2,log.getSenha());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Salvo com sucesso");
                    
                    
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro"+ex);
            //Logger.getLogger(LoginDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
       
       
    }
    
    

    
        

}