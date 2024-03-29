/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.plaf.DesktopPaneUI;

/**
 *
 * @author Mateus Moura
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        btVenda = new javax.swing.JButton();
        btCompra = new javax.swing.JButton();
        btProduto = new javax.swing.JButton();
        btCliente = new javax.swing.JButton();
        btFornecedor = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmCadastros = new javax.swing.JMenu();
        jmiCadastrarProduto = new javax.swing.JMenuItem();
        jmiCadastrarCliente = new javax.swing.JMenuItem();
        jmiCadastrarFornecedor = new javax.swing.JMenuItem();
        jmMovimentos = new javax.swing.JMenu();
        jmiRegistrarVenda = new javax.swing.JMenuItem();
        jmiRegistrarCompra = new javax.swing.JMenuItem();
        jmSistema = new javax.swing.JMenu();
        jmiSobre = new javax.swing.JMenuItem();
        jmiSair = new javax.swing.JMenuItem();

        jButton6.setText("jButton6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/venda-foco.png"))); // NOI18N
        btVenda.setText("Venda");
        btVenda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btVenda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVendaActionPerformed(evt);
            }
        });

        btCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/compra-foco.png"))); // NOI18N
        btCompra.setText("Compra");
        btCompra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCompra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCompraActionPerformed(evt);
            }
        });

        btProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/produto-foco.png"))); // NOI18N
        btProduto.setText("Produto");
        btProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btProduto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProdutoActionPerformed(evt);
            }
        });

        btCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente-foco.png"))); // NOI18N
        btCliente.setText("Cliente");
        btCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClienteActionPerformed(evt);
            }
        });

        btFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fornecedor-foco.png"))); // NOI18N
        btFornecedor.setText("Fornecedor");
        btFornecedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btFornecedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFornecedorActionPerformed(evt);
            }
        });

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sair-foco.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 383, Short.MAX_VALUE)
        );

        jmCadastros.setText("Cadastros");

        jmiCadastrarProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jmiCadastrarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/produto-foco.png"))); // NOI18N
        jmiCadastrarProduto.setText("Cadastrar Produto");
        jmiCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastrarProdutoActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiCadastrarProduto);

        jmiCadastrarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jmiCadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente-foco.png"))); // NOI18N
        jmiCadastrarCliente.setText("Cadastrar Cliente");
        jmiCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastrarClienteActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiCadastrarCliente);

        jmiCadastrarFornecedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jmiCadastrarFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fornecedor-foco.png"))); // NOI18N
        jmiCadastrarFornecedor.setText("Cadastrar Fornecedor");
        jmiCadastrarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastrarFornecedorActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiCadastrarFornecedor);

        jMenuBar1.add(jmCadastros);

        jmMovimentos.setText("Movimentos");

        jmiRegistrarVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jmiRegistrarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/venda-foco.png"))); // NOI18N
        jmiRegistrarVenda.setText("Registrar Venda");
        jmiRegistrarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRegistrarVendaActionPerformed(evt);
            }
        });
        jmMovimentos.add(jmiRegistrarVenda);

        jmiRegistrarCompra.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        jmiRegistrarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/compra-foco.png"))); // NOI18N
        jmiRegistrarCompra.setText("Registrar Compra");
        jmiRegistrarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRegistrarCompraActionPerformed(evt);
            }
        });
        jmMovimentos.add(jmiRegistrarCompra);

        jMenuBar1.add(jmMovimentos);

        jmSistema.setText("Sistema");

        jmiSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jmiSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sobre.png"))); // NOI18N
        jmiSobre.setText("Sobre");
        jmiSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSobreActionPerformed(evt);
            }
        });
        jmSistema.add(jmiSobre);

        jmiSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_MASK));
        jmiSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sair-foco.png"))); // NOI18N
        jmiSair.setText("Sair");
        jmiSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSairActionPerformed(evt);
            }
        });
        jmSistema.add(jmiSair);

        jMenuBar1.add(jmSistema);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDesktopPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCompra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSair)
                        .addGap(0, 205, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVenda)
                    .addComponent(btCompra)
                    .addComponent(btProduto)
                    .addComponent(btCliente)
                    .addComponent(btFornecedor)
                    .addComponent(btSair))
                .addGap(18, 18, 18)
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSobreActionPerformed
        Sobre s = new Sobre();
        jDesktopPane1.add(s);
        s.setVisible(true);
    }//GEN-LAST:event_jmiSobreActionPerformed

    private void jmiRegistrarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRegistrarVendaActionPerformed
        LancamentoVenda lv = new LancamentoVenda();
        jDesktopPane1.add(lv);
        lv.setVisible(true);
    }//GEN-LAST:event_jmiRegistrarVendaActionPerformed

    private void jmiCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastrarProdutoActionPerformed
        CadastroProduto cp = new CadastroProduto();
        jDesktopPane1.add(cp);
        cp.setVisible(true);
    }//GEN-LAST:event_jmiCadastrarProdutoActionPerformed

    private void jmiCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastrarClienteActionPerformed
        CadastroCliente cc = new CadastroCliente();
        jDesktopPane1.add(cc);
        cc.setVisible(true);
    }//GEN-LAST:event_jmiCadastrarClienteActionPerformed

    private void jmiCadastrarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastrarFornecedorActionPerformed
        CadastroFornecedor cf = new CadastroFornecedor();
        jDesktopPane1.add(cf);
        cf.setVisible(true);
    }//GEN-LAST:event_jmiCadastrarFornecedorActionPerformed

    private void jmiRegistrarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRegistrarCompraActionPerformed
       LancamentoCompra lc = new LancamentoCompra();
       jDesktopPane1.add(lc);
       lc.setVisible(true);
    }//GEN-LAST:event_jmiRegistrarCompraActionPerformed

    private void jmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmiSairActionPerformed

    private void btVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVendaActionPerformed
        LancamentoVenda lv = new LancamentoVenda();
        jDesktopPane1.add(lv);
        lv.setVisible(true);
    }//GEN-LAST:event_btVendaActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btSairActionPerformed

    private void btCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCompraActionPerformed
        LancamentoCompra lc = new LancamentoCompra();
       jDesktopPane1.add(lc);
       lc.setVisible(true);
    }//GEN-LAST:event_btCompraActionPerformed

    private void btProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProdutoActionPerformed
        CadastroProduto cp = new CadastroProduto();
        jDesktopPane1.add(cp);
        cp.setVisible(true);
    }//GEN-LAST:event_btProdutoActionPerformed

    private void btClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClienteActionPerformed
        CadastroCliente cc = new CadastroCliente();
        jDesktopPane1.add(cc);
        cc.setVisible(true);
    }//GEN-LAST:event_btClienteActionPerformed

    private void btFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFornecedorActionPerformed
        CadastroFornecedor cf = new CadastroFornecedor();
        jDesktopPane1.add(cf);
        cf.setVisible(true);
    }//GEN-LAST:event_btFornecedorActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCliente;
    private javax.swing.JButton btCompra;
    private javax.swing.JButton btFornecedor;
    private javax.swing.JButton btProduto;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btVenda;
    private javax.swing.JButton jButton6;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmCadastros;
    private javax.swing.JMenu jmMovimentos;
    private javax.swing.JMenu jmSistema;
    private javax.swing.JMenuItem jmiCadastrarCliente;
    private javax.swing.JMenuItem jmiCadastrarFornecedor;
    private javax.swing.JMenuItem jmiCadastrarProduto;
    private javax.swing.JMenuItem jmiRegistrarCompra;
    private javax.swing.JMenuItem jmiRegistrarVenda;
    private javax.swing.JMenuItem jmiSair;
    private javax.swing.JMenuItem jmiSobre;
    // End of variables declaration//GEN-END:variables
}
