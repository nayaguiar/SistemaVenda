
package Dao;

import Beans.FornecedorB;
import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class FornecedorDao {
    public void create(FornecedorB forne){
         Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO Tab_Fornecedor (nome_fornecedor, endereco, telefone) VALUES (?,?,?)");
            stmt.setString(1, forne.getNome());
            stmt.setString(2,forne.getEndereco());
            stmt.setString(3, forne.getTelefone());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Fornecedor Salvo com Sucesso!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro: "+e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
}
