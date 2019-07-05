package Dao;

import Beans.ItensB;
import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ItensDao {
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    ResultSet resu = null;
    
    public void inserirItens(ItensB itens){
        try {
           stmt = con.prepareStatement("INSERT INTO Tab_Itens(cod_produto, cod_venda, quanti, val_por_pro) VALUES (?,?,?,?);");
           stmt.setInt(1, itens.getCod_produto());
           stmt.setInt(2, itens.getCod_venda());
           stmt.setInt(3, itens.getQuanti());
           stmt.setDouble(4, itens.getVal_por_pro());
           
           stmt.executeUpdate();
           JOptionPane.showMessageDialog(null,"Produto Inserido na compra!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro no itens dao:"+e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
    /**
     *
     * @param codVenda
     * @return
     */
//    public List<ItensB> buscarTabela(int codVenda){
//        Connection con = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null;
//        ResultSet resu = null;
//        
//        List<ItensB> ItensPro = new ArrayList<>();
//        
//        try {
//            stmt = con.prepareStatement("SELECT * FROM Tab_Itens WHERE cod_venda = ?");
//            stmt.setInt(1, codVenda);
//            
//            resu = stmt.executeQuery();
//            
//            while(resu.next()){
//                ItensB itens = new ItensB();
//                
//                itens.setCod_produto(resu.getInt("cod_produto"));
//                itens.setCod_venda(resu.getInt("cod_venda"));
//                itens.setQuanti(resu.getInt("quanti"));
//                itens.setVal_por_pro(resu.getDouble("val_por_pro"));
//                
//                ItensPro.add(itens);
//                
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null,"Erro no ItensDao:"+e);
//        }finally{
//            ConnectionFactory.closeConnection(con, stmt, resu);
//        }
//        
//        return ItensPro;
//        
//    }
    public List<ItensB> buscarTabela(int codVenda){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet resu = null;
        
        List<ItensB> ItensPro = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("select Tab_Produto.nome_produto, Tab_Itens.cod_venda, Tab_Itens.quanti, Tab_Itens.val_por_pro from Tab_Produto join Tab_Itens on Tab_Produto.cod_produto = Tab_Itens.cod_produto where cod_venda = ?;");
            stmt.setInt(1, codVenda);
            
            resu = stmt.executeQuery();
            
            while(resu.next()){
                ItensB itens = new ItensB();
                
                //itens.setCod_produto(resu.getInt("cod_produto"));
                itens.setNome_produto(resu.getString("nome_produto"));
                itens.setCod_venda(resu.getInt("cod_venda"));
                itens.setQuanti(resu.getInt("quanti"));
                itens.setVal_por_pro(resu.getDouble("val_por_pro"));
                
                ItensPro.add(itens);
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro no ItensDao:"+e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, resu);
        }
        
        return ItensPro;
        
    }
    public void CancelaVendaItens(int codigoVenda){
         try {
            stmt = con.prepareStatement("DELETE FROM Tab_Itens WHERE cod_venda = ?;");
            stmt.setInt(1, codigoVenda);
            
            stmt.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(ItensDao.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
             ConnectionFactory.closeConnection(con, stmt);
             
            }
        
    }
    
}
