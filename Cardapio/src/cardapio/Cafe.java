/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cardapio;

import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableRowSorter;
import model.bean.Cafe1;
import model.bean.Pedido1;
import model.dao.CafeDAO;
import model.dao.TCafeDAO;

/**
 *
 * @author laila
 */
public class Cafe extends javax.swing.JFrame {

    /** Creates new form Cafes */
    
    ConsCafe cafe = new ConsCafe();
    
    public Cafe() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        DefaultTableModel modelo = (DefaultTableModel) Tabela.getModel();
        Tabela.setRowSorter(new TableRowSorter(modelo));
        
        JTableHeader tableHeader = Tabela.getTableHeader();
        Font headerFont = new Font("Microsoft JhengHei UI", Font.PLAIN, 18);
        tableHeader.setFont(headerFont);
        
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();        
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        Tabela.getColumnModel().getColumn(0).setCellRenderer(centralizado);
        Tabela.getColumnModel().getColumn(1).setCellRenderer(centralizado);
        //Tabela.getColumnModel().getColumn(2).setCellRenderer(centralizado);
        
        ((DefaultTableCellRenderer)Tabela.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        
        Tabela.getColumnModel().getColumn(0).setPreferredWidth(617);
        Tabela.getColumnModel().getColumn(1).setPreferredWidth(145);
        //Tabela.getColumnModel().getColumn(2).setPreferredWidth(145);
        
        readTable();
    }

    public void readTable(){
        DefaultTableModel modelo = (DefaultTableModel) Tabela.getModel();
        modelo.setNumRows(0);
        CafeDAO pdao = new CafeDAO();
            for(Cafe1 a: pdao.read()){
            modelo.addRow(new Object[]{
               a.getNome(),
               a.getValor(),
               a.getId()
            });
            }}
    
    public void readTableForDesc(String desc){
        DefaultTableModel modelo = (DefaultTableModel) Tabela.getModel();
        modelo.setNumRows(0);
        CafeDAO pdao = new CafeDAO();
            
        for(Cafe1 a: pdao.readForDesc(desc)){
            modelo.addRow(new Object[]{               
               a.getNome(),
               a.getValor(),
               a.getId()
            });
            }}
    
    public void KeyReleased(){
        if(Tabela.getSelectedRow() != -1){          
            Nome.setText(Tabela.getValueAt(Tabela.getSelectedRow(),0).toString());
            Valor.setText(Tabela.getValueAt(Tabela.getSelectedRow(),1).toString());
        }
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Buscar = new javax.swing.JButton();
        Atualizar = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        Cadastrar = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        Nome = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        Valor = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Voltar = new javax.swing.JMenu();
        Volta = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51), 2));

        jLabel17.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        jLabel17.setText("Valor: R$");

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardapio/caf.png"))); // NOI18N

        Buscar.setBackground(new java.awt.Color(255, 153, 51));
        Buscar.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        Buscar.setForeground(new java.awt.Color(255, 255, 255));
        Buscar.setText("Buscar");
        Buscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        Buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarBuscarActionPerformed(evt);
            }
        });

        Atualizar.setBackground(new java.awt.Color(255, 153, 51));
        Atualizar.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        Atualizar.setForeground(new java.awt.Color(255, 255, 255));
        Atualizar.setText("Atualizar");
        Atualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        Atualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarAtualizarActionPerformed(evt);
            }
        });

        Tabela.setBackground(new java.awt.Color(204, 204, 204));
        Tabela.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Item", "Valor"
            }
        ));
        Tabela.setRowHeight(30);
        jScrollPane5.setViewportView(Tabela);

        Cadastrar.setBackground(new java.awt.Color(255, 153, 51));
        Cadastrar.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        Cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        Cadastrar.setText("Cadastrar");
        Cadastrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        Cadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarCadastrarActionPerformed(evt);
            }
        });

        Excluir.setBackground(new java.awt.Color(255, 153, 51));
        Excluir.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        Excluir.setForeground(new java.awt.Color(255, 255, 255));
        Excluir.setText("Excluir");
        Excluir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        Excluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirExcluirActionPerformed(evt);
            }
        });

        Editar.setBackground(new java.awt.Color(255, 153, 51));
        Editar.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        Editar.setForeground(new java.awt.Color(255, 255, 255));
        Editar.setText("Editar");
        Editar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        Editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarEditarActionPerformed(evt);
            }
        });

        Nome.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Cadastro de novos itens");

        Valor.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        jLabel16.setText("Item:");

        jPanel6.setBackground(new java.awt.Color(255, 153, 51));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102)));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardapio/logo.png"))); // NOI18N
        jLabel11.setOpaque(true);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(250, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(274, 274, 274))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Editar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Buscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Cadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Nome))
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 895, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(311, 311, 311))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(44, 44, 44))
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Voltar.setText("Opções");
        Voltar.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N

        Volta.setText("Voltar");
        Volta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltaActionPerformed(evt);
            }
        });
        Voltar.add(Volta);

        jMenuBar1.add(Voltar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AtualizarAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarAtualizarActionPerformed
        if(evt.getSource() == Atualizar){
            if(Nome.getText().equals("")==true || Valor.getText().equals("")==true){
                JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Aviso", 2);
            }else
            if(Tabela.getSelectedRow() != -1){
                Cafe1 p = new Cafe1();
                CafeDAO dao = new CafeDAO();
                Pedido1 l = new Pedido1();
                TCafeDAO d = new TCafeDAO();

                p.setNome(Nome.getText());
                l.setNome(Nome.getText());
                String str = Valor.getText();
                float f = Float.valueOf(str).floatValue();
                p.setValor(f);
                l.setValor(f);
                p.setNome((String) Tabela.getValueAt(Tabela.getSelectedRow(),0));
                
                d.update2(l);
                dao.update(p);
                

                Nome.setText("");
                Valor.setText("");
                readTable();
                cafe.readTable3();
            }
        }
    }//GEN-LAST:event_AtualizarAtualizarActionPerformed

    private void CadastrarCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarCadastrarActionPerformed
        if(evt.getSource() == Cadastrar){
            if(Nome.getText().equals("")==true || Valor.getText().equals("")==true){
                JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Aviso", 2);
            }else

            if(evt.getSource() == Cadastrar){
                Cafe1 p = new Cafe1();
                CafeDAO dao = new CafeDAO();
                Pedido1 l = new Pedido1();
                TCafeDAO d = new TCafeDAO();
                p.setNome(Nome.getText());
                l.setNome(Nome.getText());
                String str = Valor.getText();
                float f = Float.valueOf(str).floatValue();
                p.setValor(f);
                l.setValor(f);
                dao.create(p);
                d.create(l);
                readTable();
                cafe.readTable3();

                Nome.setText("");
                Valor.setText("");
            }
        }
    }//GEN-LAST:event_CadastrarCadastrarActionPerformed

    private void ExcluirExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirExcluirActionPerformed
        if(evt.getSource() == Excluir){
            if(Tabela.getSelectedRow() != -1){
                Cafe1 p = new Cafe1();
                CafeDAO dao = new CafeDAO();

                p.setNome((String) Tabela.getValueAt(Tabela.getSelectedRow(),0));
                dao.delete(p);
                readTable();

                Nome.setText("");
                Valor.setText("");
            }
        }
    }//GEN-LAST:event_ExcluirExcluirActionPerformed

    private void EditarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarEditarActionPerformed
        if(evt.getSource() == Editar){
            KeyReleased();
        }
    }//GEN-LAST:event_EditarEditarActionPerformed

    private void BuscarBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarBuscarActionPerformed
        if(evt.getSource()==Buscar){
            readTableForDesc(Nome.getText());
        }
    }//GEN-LAST:event_BuscarBuscarActionPerformed

    private void VoltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltaActionPerformed
        if(evt.getSource() == Volta){
            new Cadastro().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_VoltaActionPerformed

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
            java.util.logging.Logger.getLogger(Cafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cafe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atualizar;
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Cadastrar;
    private javax.swing.JButton Editar;
    private javax.swing.JButton Excluir;
    private javax.swing.JTextField Nome;
    public javax.swing.JTable Tabela;
    private javax.swing.JTextField Valor;
    private javax.swing.JMenuItem Volta;
    private javax.swing.JMenu Voltar;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables

}
