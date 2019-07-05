package Dao;

import Beans.ClienteB;
import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ClienteDao {
    public void create(ClienteB cliente){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt =  null;
        
        try {
            stmt =  con.prepareStatement("INSERT INTO Tab_cliente(nome_cliente,cpf, endereco,telefone, nascimento) VALUES (?,?,?,?,?);");
            stmt.setString(1, cliente.getNome_cliente());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getEndereco());
            stmt.setString(4, cliente.getTelefone());
            stmt.setString(5, cliente.getNascimento());
       
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Cliente salvo com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro:" +e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
                
    }
    
    public void excluir(int cpf){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt =  null;
        
        try{
            stmt = con.prepareStatement("delete from Tab_Cliente where cod_cliente = ?");
            stmt.setInt(1, cpf);
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Cliente Excluido com sucesso");
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Erro:" +e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
            
    }
    
    public void buscar(int cod){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt =  null;
        ResultSet resu = null;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM Tab_Cliente WHERE cod_cliente = ?");
            stmt.setInt(1, cod);
            resu = stmt.executeQuery();
            
            JOptionPane.showMessageDialog(null, resu.getString("nome_cliente"));
            
        } catch (Exception e) {
        }
    }
    public String BuscarCliente(String cod){
        String nome = "invalido!";
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt =  null;
        ResultSet resu = null;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM Tab_Cliente WHERE cod_cliente = ?");
            stmt.setString(1, cod);
            resu = stmt.executeQuery();
            if(resu.next()){
                 nome = resu.getString("nome_cliente");
            }
           return nome;
        } catch (Exception e) {
            
            return nome;
            //JOptionPane.showMessageDialog(null, resu.getString("nome_cliente"));
        }finally{
            ConnectionFactory.closeConnection(con, stmt, resu);
        }
        
        
    }
        
}
