
package Dao;

import Beans.ProdutoB;
import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.ir.TryNode;

public class ProdutoDao {
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    ResultSet resu = null;
    ProdutoB pro = new ProdutoB();
    
    public ProdutoB buscapro(int codigo){
        try{
            stmt = con.prepareStatement("SELECT nome_produto, valor FROM Tab_Produto WHERE cod_produto = ?");
            stmt.setInt(1, codigo);
            resu = stmt.executeQuery();
            
            if(resu.next()){
                pro.setNome_produto(resu.getString("nome_produto"));
                pro.setValor(Double.parseDouble(resu.getString("valor")));
                
                return pro;
            }else{
                JOptionPane.showMessageDialog(null, "codigo do produto não encontrado!");
            }
    
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Erro"+ e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, resu);
        }
        return null;
        
    }
    
    public void cadastrarProduto(ProdutoB produ){
        
        try {
            stmt = con.prepareStatement("INSERT INTO Tab_Produto(nome_produto, quanti, valor, cod_fornecedor) VALUES (?, ? ,? , ?);");
            stmt.setString(1, produ.getNome_produto());
            stmt.setInt(2, produ.getQuanti());
            stmt.setDouble(3, produ.getValor());
            stmt.setInt(4, produ.getCod_fornecedor());
            
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Produto "+produ.getNome_produto()+" Cadastrado!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no Produto Dao:"+e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    

}
