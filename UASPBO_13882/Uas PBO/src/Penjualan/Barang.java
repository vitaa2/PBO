/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Penjualan;

/**
 *
 * @author gilan
 */
import db.Database;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
public class Barang extends javax.swing.JFrame {
    String selectedKodeBarang;
    int state = 0;
    /**
     * Creates new form Barang
     */
    public Barang() {
        
        initComponents();
        setTitle("Master Barang");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kodeTxt = new javax.swing.JTextField();
        namaTxt = new javax.swing.JTextField();
        satuanTxt = new javax.swing.JTextField();
        beliTxt = new javax.swing.JTextField();
        jualTxt = new javax.swing.JTextField();
        stokTxt = new javax.swing.JTextField();
        stokMinTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        insertBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        kodeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeTxtActionPerformed(evt);
            }
        });

        namaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaTxtActionPerformed(evt);
            }
        });

        satuanTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satuanTxtActionPerformed(evt);
            }
        });

        beliTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beliTxtActionPerformed(evt);
            }
        });

        jualTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jualTxtActionPerformed(evt);
            }
        });

        stokTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stokTxtActionPerformed(evt);
            }
        });

        stokMinTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stokMinTxtActionPerformed(evt);
            }
        });

        jLabel6.setText("Stok Minimum");

        jLabel9.setText("Stok Barang");

        jLabel10.setText("Harga Jual");

        jLabel11.setText("Harga Beli");

        jLabel12.setText("Satuan");

        jLabel13.setText("Nama Barang");

        jLabel14.setText("Kode Barang");

        insertBtn.setText("Insert");
        insertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBtnActionPerformed(evt);
            }
        });

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.setEnabled(false);
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.setEnabled(false);
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        tableData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableData);

        jMenu1.setText("Option");

        jMenuItem1.setText("Keluar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(stokTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(satuanTxt)
                                        .addComponent(namaTxt)
                                        .addComponent(kodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(beliTxt)
                                        .addComponent(jualTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(stokMinTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(insertBtn)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateBtn)
                            .addComponent(clearBtn))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(kodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(namaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(satuanTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(beliTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jualTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stokTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(stokMinTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(insertBtn)
                    .addComponent(clearBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteBtn)
                    .addComponent(updateBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kodeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodeTxtActionPerformed

    private void namaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaTxtActionPerformed

    private void satuanTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satuanTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_satuanTxtActionPerformed

    private void beliTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beliTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_beliTxtActionPerformed

    private void jualTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jualTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jualTxtActionPerformed

    private void stokTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stokTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stokTxtActionPerformed

    private void stokMinTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stokMinTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stokMinTxtActionPerformed

    private void insertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBtnActionPerformed
        // TODO add your handling code here:
        String kode = kodeTxt.getText().trim();
        String nama = namaTxt.getText();
        String satuan = satuanTxt.getText();
        int hrg_beli = Integer.parseInt(beliTxt.getText());
        int hrg_jual = Integer.parseInt(jualTxt.getText());
        int stok = Integer.parseInt(stokTxt.getText().trim());
        int stok_min = Integer.parseInt(stokMinTxt.getText().trim());
        if(Database.insert(kode, nama, satuan, hrg_beli, hrg_jual, stok, stok_min)){
            clear();
            showtable();
            JOptionPane.showMessageDialog(null,"Berhasil menambahkan data barang");
        }else{
            JOptionPane.showMessageDialog(null,"Gagal menambahkan data barang");
        }

    }//GEN-LAST:event_insertBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
        clear();

    }//GEN-LAST:event_clearBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int input = JOptionPane.showConfirmDialog(null, "Anda yakin ingin menghapus data?", "Warning", JOptionPane.YES_NO_OPTION);
        if(input == 0){
            boolean success = Database.delete(selectedKodeBarang);
            if(success){
                clear();
                showtable();
                JOptionPane.showMessageDialog(null, "Berhasil menghapus data barang");
            }else{
                JOptionPane.showMessageDialog(null, "Gagal menghapus data barang");
            }
        }

    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:

        //        selectedKodeBarang = kodeChangeTxt.getText().trim();
        //        showKode(selectedKodeBarang);
        String kode = kodeTxt.getText().trim();
        String nama = namaTxt.getText();
        String satuan = satuanTxt.getText();
        int hrg_beli = Integer.parseInt(beliTxt.getText());
        int hrg_jual = Integer.parseInt(jualTxt.getText());
        int stok = Integer.parseInt(stokTxt.getText().trim());
        int stok_min = Integer.parseInt(stokMinTxt.getText().trim());
        boolean success = Database.update(kode, nama, satuan, hrg_beli, hrg_jual, stok, stok_min, selectedKodeBarang);
        if(success){
            clear();
            showtable();
            JOptionPane.showMessageDialog(null, "Berhasil update data barang");
        } else {
            JOptionPane.showMessageDialog(null, "Gagal update data barang");
        }

    }//GEN-LAST:event_updateBtnActionPerformed

    private void tableDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDataMouseClicked
        // TODO add your handling code here:
        insertBtn.setEnabled(false);
        updateBtn.setEnabled(true);
        deleteBtn.setEnabled(true);
        getData();

    }//GEN-LAST:event_tableDataMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        showtable();
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public void getData(){
        int index = tableData.getSelectedRow();
        selectedKodeBarang = String.valueOf(tableData.getValueAt(index, 1));
        kodeTxt.setText(String.valueOf(tableData.getValueAt(index, 1)));
        namaTxt.setText(String.valueOf(tableData.getValueAt(index, 2)));
        satuanTxt.setText(String.valueOf(tableData.getValueAt(index, 3)));
        beliTxt.setText(String.valueOf(tableData.getValueAt(index, 4)));
        jualTxt.setText(String.valueOf(tableData.getValueAt(index, 5)));
        stokTxt.setText(String.valueOf(tableData.getValueAt(index, 6)));
        stokMinTxt.setText(String.valueOf(tableData.getValueAt(index, 7)));
    }
    
    public void clear(){
        kodeTxt.setText("");
        namaTxt.setText("");
        satuanTxt.setText("");
        beliTxt.setText("");
        jualTxt.setText("");
        stokTxt.setText("");
        stokMinTxt.setText("");
        insertBtn.setEnabled(true);
        deleteBtn.setEnabled(false);
        updateBtn.setEnabled(false);
    }
    
     public void showtable(){
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("No");
            model.addColumn("Kode Barang");
            model.addColumn("Nama Barang");
            model.addColumn("Satuan");
            model.addColumn("Harga Beli");
            model.addColumn("Harga Jual");
            model.addColumn("Stok Barang");
            model.addColumn("Stok Minimal");
            int i =1;
            ResultSet rs = Database.showBarang();
            try{
                while(rs.next()) {
                    model.addRow(new Object[] {
                            i,
                            rs.getString("kd_brg"),
                            rs.getString("nm_brg"),
                            rs.getString("satuan"),
                            rs.getInt("hrg_beli"),
                            rs.getInt("hrg_jual"),
                            rs.getInt("stok_brg"),
                            rs.getInt("stok_min")
                    });
                    i++;
                }
            } catch(Exception e){
                
            }
            
            tableData.setModel(model);
    }
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
            java.util.logging.Logger.getLogger(Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Barang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField beliTxt;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton insertBtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jualTxt;
    private javax.swing.JTextField kodeTxt;
    private javax.swing.JTextField namaTxt;
    private javax.swing.JTextField satuanTxt;
    private javax.swing.JTextField stokMinTxt;
    private javax.swing.JTextField stokTxt;
    private javax.swing.JTable tableData;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
