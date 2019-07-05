
package Dao;

import Beans.EmpresaB;
import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class EmpresaDao {
    public void create(EmpresaB empresa){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO Tab_Empresa (nome_empresa, razao, endereco, cnpj) VALUES (?,?,?,?)");
            stmt.setString(1, empresa.getNome_empresa());
            stmt.setString(2,empresa.getRazao());
            stmt.setString(3, empresa.getEndereco());
            stmt.setString(4, empresa.getCnpj());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Empresa Salva com Sucesso!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro: "+e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
}
