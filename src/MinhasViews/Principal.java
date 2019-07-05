
package MinhasViews;

import Connection.ConnectionFactory;
import Utilitario.FundoTela;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JFrame;
import java.sql.*;
import javax.swing.JOptionPane;
//import net.sf.jasperreports.engine.JasperFillManager;
//import net.sf.jasperreports.engine.JasperPrint;
//import net.sf.jasperreports.view.JasperViewer;

public class Principal extends javax.swing.JFrame {
    FundoTela tela;
    
    Connection conexao = null;
    
    public Principal() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(new GridLayout());
        tela = new FundoTela("imagens/MinhaTelaCopy02.jpg");
        getContentPane().add(tela);
        
        
        setIcon();
        
        conexao = ConnectionFactory.getConnection();
        
        /*URL caminho = getClass().getResource("Utilitario/iconPrincipal.png");
        Image iconTitulo = Toolkit.getDefaultToolkit().getImage(caminho);
        this.setIconImage(iconTitulo);*/
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        Cadastrar = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        ItemCliente = new javax.swing.JMenuItem();
        ItemFuncionario = new javax.swing.JMenuItem();
        ItemProduto = new javax.swing.JMenuItem();
        ItemFornecedor = new javax.swing.JMenuItem();
        ItemMenu = new javax.swing.JMenuItem();
        Buscar = new javax.swing.JMenu();
        Relatorio = new javax.swing.JMenu();
        RelaClien = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        Sair = new javax.swing.JMenu();
        ItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setResizable(false);

        Cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/pasta-tic.png"))); // NOI18N
        Cadastrar.setText("Cadastrar");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cadeado.png"))); // NOI18N
        jMenuItem1.setText("Criar Login");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Cadastrar.add(jMenuItem1);

        ItemCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/clien.png"))); // NOI18N
        ItemCliente.setText("Cliente");
        ItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemClienteActionPerformed(evt);
            }
        });
        Cadastrar.add(ItemCliente);

        ItemFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/funci.png"))); // NOI18N
        ItemFuncionario.setText("Funcionário");
        ItemFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemFuncionarioActionPerformed(evt);
            }
        });
        Cadastrar.add(ItemFuncionario);

        ItemProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/sexta.png"))); // NOI18N
        ItemProduto.setText("Produto");
        ItemProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemProdutoActionPerformed(evt);
            }
        });
        Cadastrar.add(ItemProduto);

        ItemFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/caminhao.png"))); // NOI18N
        ItemFornecedor.setText("Fornecedor");
        ItemFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemFornecedorActionPerformed(evt);
            }
        });
        Cadastrar.add(ItemFornecedor);

        ItemMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/empresa.png"))); // NOI18N
        ItemMenu.setText("Empresa");
        ItemMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuActionPerformed(evt);
            }
        });
        Cadastrar.add(ItemMenu);

        jMenuBar1.add(Cadastrar);

        Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/lupa.png"))); // NOI18N
        Buscar.setText("Buscar");
        jMenuBar1.add(Buscar);

        Relatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/r.png"))); // NOI18N
        Relatorio.setText("Relatórios");

        RelaClien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        RelaClien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/relatorio2.png"))); // NOI18N
        RelaClien.setText("Relatório Clientes");
        RelaClien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelaClienActionPerformed(evt);
            }
        });
        Relatorio.add(RelaClien);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/relatorio2.png"))); // NOI18N
        jMenuItem4.setText("Relatório de Produtos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        Relatorio.add(jMenuItem4);

        jMenuBar1.add(Relatorio);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/caaroo.png"))); // NOI18N
        jMenu1.setText("Vendas");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/nova.png"))); // NOI18N
        jMenuItem2.setText("Nova Venda");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/nova.png"))); // NOI18N
        jMenuItem3.setText("Venda");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/x.png"))); // NOI18N
        Sair.setText("Sair");

        ItemSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/x.png"))); // NOI18N
        ItemSair.setText("Sair");
        ItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemSairActionPerformed(evt);
            }
        });
        Sair.add(ItemSair);

        jMenuBar1.add(Sair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 762, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ItemProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemProdutoActionPerformed

    private void ItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_ItemSairActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new TelaCriarUsuario().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void ItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemClienteActionPerformed
        new CadastroCliente().setVisible(true);
    }//GEN-LAST:event_ItemClienteActionPerformed

    private void ItemFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemFuncionarioActionPerformed
        new CadastroFuncionario().setVisible(true);
    }//GEN-LAST:event_ItemFuncionarioActionPerformed

    private void ItemMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuActionPerformed
        new CadastrarEmpresa().setVisible(true);
    }//GEN-LAST:event_ItemMenuActionPerformed

    private void ItemFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemFornecedorActionPerformed
        new CadastrarFornecedor().setVisible(true);
    }//GEN-LAST:event_ItemFornecedorActionPerformed

    private void RelaClienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelaClienActionPerformed
        // Gerando um relatório de clientes
        
        int confirma = JOptionPane.showConfirmDialog(null,"confirma a impressão?","Atenção",JOptionPane.YES_NO_OPTION);
        
        if(confirma == JOptionPane.YES_OPTION){
            //imprimindo o relatório
            try {
                //Estanciando a classe JasperPrint
                //JasperPrint print = JasperFillManager.fillReport("C:/Users/járdesson/Documents/NetBeansProjects/MeuSystem/Ireport/Teste.jasper",null,conexao);
                //JasperViewer.viewReport(print, false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            
        }
    }//GEN-LAST:event_RelaClienActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new TelaDeVendas().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        int confirma = JOptionPane.showConfirmDialog(null,"confirma a impressão do relatório de Produto?","Atenção",JOptionPane.YES_NO_OPTION);
        
        if(confirma == JOptionPane.YES_OPTION){
            //imprimindo o relatório
            try {
                //Estanciando a classe JasperPrint
                //JasperPrint print = JasperFillManager.fillReport("C:/Users/járdesson/Documents/NetBeansProjects/MeuSystem/Ireport/RelatoriodeProdutos.jasper",null,conexao);
               // JasperViewer.viewReport(print, false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Buscar;
    private javax.swing.JMenu Cadastrar;
    private javax.swing.JMenuItem ItemCliente;
    private javax.swing.JMenuItem ItemFornecedor;
    private javax.swing.JMenuItem ItemFuncionario;
    private javax.swing.JMenuItem ItemMenu;
    private javax.swing.JMenuItem ItemProduto;
    private javax.swing.JMenuItem ItemSair;
    private javax.swing.JMenuItem RelaClien;
    private javax.swing.JMenu Relatorio;
    private javax.swing.JMenu Sair;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("MinhaLogoPng02.png")));
        
    }
}
