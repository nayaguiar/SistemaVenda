package Dao;

import Beans.Login;
import Beans.UsuarioB;
import Connection.ConnectionFactory;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class UsuarioDao {
    
    public void create(UsuarioB user){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO Tab_Usuario (cod_funci, login, senha, nivel_acesso) VALUES (?,?,?,?)");
            stmt.setInt(1, user.getCod_funci());
            stmt.setString(2, user.getLogin());
            stmt.setString(3, user.getSenha());
            stmt.setString(4, user.getNivel_acesso());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Usuario Salvo com Sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro" + e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    public boolean BuscarLogin(String login, String senha){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet resu = null;
        boolean check = false;
        try {
            stmt = con.prepareStatement("SELECT * FROM Tab_Usuario WHERE login = ? AND senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            resu = stmt.executeQuery();
            
            
            if(resu.next()){
                check = true;
            }
            /*while(resu.next()){
                UsuarioB usuario = new UsuarioB();
                usuario.setCod_funci(resu.getInt("cod_funci"));
                usuario.setCod_usuario(resu.getInt("cod_usuario"));
                usuario.setLogin(resu.getString("login"));
                usuario.setSenha(resu.getString("senha"));
                usuario.setNivel_acesso(resu.getString("nivel_acesso"));
            }*/
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro:"+e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, resu);
        }
        
        return check;
    }
    
}
