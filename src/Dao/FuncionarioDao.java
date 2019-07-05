
package Dao;

import Beans.FuncionarioB;
import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class FuncionarioDao {
    public void create(FuncionarioB func){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO Tab_Funcionario (nome_funcir, cargo, admissao, salario) VALUES (?,?,?,?)");
            stmt.setString(1, func.getNome_funci());
            stmt.setString(2,func.getCargo());
            stmt.setString(3, func.getAdmissao());
            stmt.setDouble(4, func.getSalario());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Salvo com sucesso!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro: "+e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    public String buscarVenda(int codigo){
        String nome = "invalido";
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt =  null;
        ResultSet resu = null;
        
        try {
            stmt = con.prepareStatement("SELECT nome_funcir FROM Tab_Funcionario WHERE cod_funci = ?");
            stmt.setInt(1, codigo);
            resu = stmt.executeQuery();
            if(resu.next()){
                 nome = resu.getString("nome_funcir");
            }
           return nome;
        } catch (Exception e) {
            
            return nome;
            //JOptionPane.showMessageDialog(null, resu.getString("nome_cliente"));
        }finally{
            ConnectionFactory.closeConnection(con, stmt, resu);
        }
        
        
    }

    public String BuscarCliente(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
