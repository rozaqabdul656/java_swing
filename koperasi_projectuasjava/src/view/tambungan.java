/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import CRUD.crudtabungan;
import ENTITAS.entitastabungan;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import validasi.validasi;

/**
 *
 * @author ASUS
 */
public class tambungan extends javax.swing.JPanel {
    entitastabungan obj=new entitastabungan();
    crudtabungan obc=new crudtabungan();
    int savecek=0;
    validasi obv=new validasi();
   
    public tambungan(){
        initComponents();
        disabled();
        save.setVisible(false);
        tambahbaru.setVisible(false);
        refresh();
        
        
       
        

    cari.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {

                @Override
                public void insertUpdate(DocumentEvent e) {
                    // ketika teks dimasukkan
                   anggota.setModel(obc.tampilBy_data_table(cari.getText()));
     
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    // ketika teks diubah
                    anggota.setModel(obc.tampilBy_data_table(cari.getText()));
        }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    // ketika teks diubah
                    anggota.setModel(obc.tampilBy_data_table(cari.getText()));
            }
            });

        
    }

    
    public void refresh(){
        nama.setText("");
        id.setText("");
        simpanan.setText("");
        tanggal.setDate(null);
        anggota.setModel(obc.tampil_data_table());
 
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tanggal = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        simpanan = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        anggota = new javax.swing.JTable();
        tambahbaru = new javax.swing.JLabel();
        save = new javax.swing.JLabel();
        cari = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Setoran Tabungan Anggota");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(275, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(282, 282, 282))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(19, 19, 19))
        );

        jLabel2.setText("NIM");

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idKeyTyped(evt);
            }
        });

        jLabel3.setText("Tanggal Penyetoran");

        tanggal.setDateFormatString("yyyy-MM-dd");

        jLabel4.setText("Nama ");

        jLabel9.setText("Besar Setoran");

        simpanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpananActionPerformed(evt);
            }
        });
        simpanan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                simpananKeyTyped(evt);
            }
        });

        anggota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        anggota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                anggotaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(anggota);

        tambahbaru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_add_48px.png"))); // NOI18N
        tambahbaru.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tambahbaru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tambahbaruMouseClicked(evt);
            }
        });

        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_save_50px.png"))); // NOI18N
        save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
        });

        cari.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                cariInputMethodTextChanged(evt);
            }
        });
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });
        cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cariKeyTyped(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_search_32px.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_refresh_16px.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(tambahbaru, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(103, 103, 103)
                                        .addComponent(save)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                            .addComponent(nama))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(39, 39, 39))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(51, 51, 51)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(simpanan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cari, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(65, 65, 65)
                                .addComponent(jLabel6)
                                .addGap(35, 35, 35))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(simpanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tambahbaru)
                            .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(85, 85, 85)
                        .addComponent(jLabel6)
                        .addGap(8, 8, 8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addGap(58, 58, 58))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void simpananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_simpananActionPerformed
    private void disabled(){
        nama.setEnabled(false);
        id.setEnabled(false);
        simpanan.setEnabled(false);
        tanggal.setEnabled(false);
        anggota.setEnabled(true);
        simpanan.setEnabled(false);
        cari.setEnabled(true);
    }
    private void enabled(){
     //   nama.setEnabled(true);
      //  id.setEnabled(true);
        tanggal.setEnabled(true);
        simpanan.setEnabled(true);
        anggota.setEnabled(false);
        cari.setEnabled(false);
    }
    private void tambahbaruMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambahbaruMouseClicked
        save.setVisible(true);
        tambahbaru.setVisible(false);
        enabled();
//        refresh();
        savecek=2;
       
    }//GEN-LAST:event_tambahbaruMouseClicked

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
        if (simpanan.getText().isEmpty() || tanggal.getDate() == null){
            JOptionPane.showMessageDialog(null, "Masukan Data Dengan Lengkap");
        }else if(obv.val_tanggal(new SimpleDateFormat("dd-MM-yyyy").format(tanggal.getDate()))==false)  {
            JOptionPane.showMessageDialog(null, "Tanggal Tidak Boleh tidak sama  dari hari sekarang !");  
        }else{
            obj.setNim(id.getText());
            obj.setSetoran(simpanan.getText());
            obj.setDate(new SimpleDateFormat("yyyy-MM-dd").format(tanggal.getDate()));
            obc.nabunganggota(obj);
            refresh();
            disabled();
            tambahbaru.setVisible(false);
            save.setVisible(false);
        }   
    }//GEN-LAST:event_saveMouseClicked

    private void cariInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_cariInputMethodTextChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cariInputMethodTextChanged

    private void anggotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anggotaMouseClicked
        // TODO add your handling code here:
        int a = anggota.getSelectedRow();
        id.setText(anggota.getValueAt(a, 0).toString());
      //  tanggal.setDate((Date) (anggota.getValueAt(a, 5)));
        //new SimpleDateFormat("yyyy-MM-dd").format(tanggalbeli.getDate());
       
        tambahbaru.setVisible(true);
        nama.setText((String) anggota.getValueAt(a, 1));
        
        
    }//GEN-LAST:event_anggotaMouseClicked

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cariActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel10MouseClicked

    private void idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyTyped
        obv.cek_angka(evt);
        
    }//GEN-LAST:event_idKeyTyped

    private void simpananKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_simpananKeyTyped
      
        obv.cek_angka(evt);
    }//GEN-LAST:event_simpananKeyTyped

    private void cariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariKeyTyped
        obv.cek_angka(evt);
    }//GEN-LAST:event_cariKeyTyped

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        anggota.setModel(obc.tampil_data_table());
    }//GEN-LAST:event_jLabel6MouseClicked
    
   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable anggota;
    private javax.swing.JTextField cari;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nama;
    private javax.swing.JLabel save;
    private javax.swing.JTextField simpanan;
    private javax.swing.JLabel tambahbaru;
    private com.toedter.calendar.JDateChooser tanggal;
    // End of variables declaration//GEN-END:variables
}