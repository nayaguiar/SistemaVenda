
package Dao;

import Beans.VendasB;
import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VendasDao {
    
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    ResultSet resu = null;
    
    public void criarvenda(VendasB venda){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO Tab_Vendas(cod_cliente, cod_funci, data_compra, valor_total) VALUES (?,?,?,?);");
            stmt.setInt(1, venda.getCod_cliente());
            stmt.setInt(2, venda.getCod_funci());
            stmt.setString(3, venda.getData_compra());
            stmt.setDouble(4, venda.getValor_total());
            
            stmt.executeUpdate();
            //JOptionPane.showMessageDialog(null, "Venda iniciada!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro:"+e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    public String UltiVenda(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet resu = null;
        try {
           stmt = con.prepareStatement("SELECT * FROM Tab_Vendas ORDER BY cod_venda DESC LIMIT 1;");
           resu = stmt.executeQuery();
           
           if(resu.next()){
               return (Integer.parseInt(resu.getString("cod_venda")))+"";
           }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro"+e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, resu);
        }
        return null;
    }
    
    public void EncerrarConta(double valor, int cod_venda){
        try {
            stmt = con.prepareStatement("UPDATE Tab_Vendas SET valor_total = ? WHERE cod_venda = ?");
            stmt.setDouble(1, valor);
            stmt.setInt(2, cod_venda);
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Venda Encerrada!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    public void VancelarVendaVenda( int codigoVenda){
        try {
            stmt = con.prepareStatement("DELETE FROM Tab_Vendas WHERE cod_venda = ?;");
            stmt.setInt(1, codigoVenda);

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Venda Cancelada!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

}
