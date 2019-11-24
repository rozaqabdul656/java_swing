/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import CRUD.crudanggota;
import ENTITAS.entitasanggota;
import static java.awt.PageAttributes.MediaType.A;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.DocumentEvent;
import validasi.validasi;

/**
 *
 * @author ASUS
 */
public class anggotatambah extends javax.swing.JPanel {
    entitasanggota obj=new entitasanggota();
    crudanggota obc=new crudanggota();
    int savecek=0;
    validasi obv=new validasi();
    
    /**
     * Creates new form anggotatambah
     */
    public anggotatambah(){
        initComponents();
        disabled();
        save.setVisible(false);
        jk.addItem("-Pilih Jenis Kelamin-");
        jk.addItem("laki-laki");
        jk.addItem("Perempuan");
        
        refresh();
        kelas.addItem("7");
        kelas.addItem("8");
        kelas.addItem("9");
        
        
       
        

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
        alamat.setText("");
        id.setText("");
        jk.setSelectedItem("-Pilih Jenis Kelamin-");
        kelas.setSelectedItem("VII");
        tanggal.setDate(null);
        anggota.setModel(obc.tampil_data_table());
        simpanan.setText("");
        kelasvar.setText("");
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
        jLabel5 = new javax.swing.JLabel();
        jk = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        alamat = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        simpanan = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        anggota = new javax.swing.JTable();
        tambahbaru = new javax.swing.JLabel();
        save = new javax.swing.JLabel();
        editing = new javax.swing.JLabel();
        deleted = new javax.swing.JLabel();
        cari = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        kelas = new javax.swing.JComboBox();
        kelasvar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Anggota  Bank Sekolah");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(275, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(328, 328, 328))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(19, 19, 19))
        );

        jLabel2.setText("NIM");

        id.setNextFocusableComponent(nama);
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

        jLabel3.setText("Tanggal Masuk");

        tanggal.setDateFormatString("yyyy-MM-dd");

        jLabel4.setText("Nama ");

        nama.setNextFocusableComponent(alamat);
        nama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                namaKeyTyped(evt);
            }
        });

        jLabel5.setText("Jenis Kelamin ");

        jLabel6.setText("Alamat  ");

        alamat.setNextFocusableComponent(kelasvar);
        alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatActionPerformed(evt);
            }
        });

        jLabel9.setText("Saldo");

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

        editing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_edit_64px.png"))); // NOI18N
        editing.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editing.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editingMouseClicked(evt);
            }
        });

        deleted.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_delete_40px.png"))); // NOI18N
        deleted.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleted.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletedMouseClicked(evt);
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

        kelasvar.setNextFocusableComponent(simpanan);
        kelasvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelasvarActionPerformed(evt);
            }
        });
        kelasvar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                kelasvarKeyTyped(evt);
            }
        });

        jLabel8.setText("Kelas");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Cetak Data Daftar Nasabah");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(33, 33, 33)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel4))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel3)))
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(35, 35, 35)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(id)
                                    .addComponent(nama)
                                    .addComponent(alamat)
                                    .addComponent(jk, 0, 185, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(kelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(kelasvar, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                                    .addComponent(simpanan)
                                    .addComponent(cari)))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deleted, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tambahbaru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(editing))
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(kelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kelasvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel10)
                                        .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(simpanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tambahbaru)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editing)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleted, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatActionPerformed

    private void simpananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_simpananActionPerformed
    private void disabled(){
        nama.setEnabled(false);
        alamat.setEnabled(false);
        id.setEnabled(false);
        jk.setEnabled(false);
        simpanan.setEnabled(false);
        tanggal.setEnabled(false);
        kelas.setEnabled(false);
        kelasvar.setEnabled(false);
        anggota.setEnabled(true);
        cari.setEnabled(true);
        simpanan.setText("");
        kelasvar.setText("");
       
    }
    private void enabled(){
        nama.setEnabled(true);
        alamat.setEnabled(true);
        id.setEnabled(true);
        jk.setEnabled(true);
        tanggal.setEnabled(true);
        kelas.setEnabled(true);
        kelasvar.setEnabled(true);
        anggota.setEnabled(false);
        cari.setEnabled(false);
        simpanan.setEnabled(true);
        
    }
    private void tambahbaruMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambahbaruMouseClicked
        save.setVisible(true);
        tambahbaru.setVisible(false);
        editing.setVisible(false);
        deleted.setVisible(false);
        enabled();
        refresh();
        savecek=2;
        
    }//GEN-LAST:event_tambahbaruMouseClicked

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
        obj.setNama(nama.getText().toUpperCase());
        obj.setNim(id.getText());
        obj.setAlamat(alamat.getText().toUpperCase());
        obj.setKelas(kelas.getSelectedItem() +" - "+ kelasvar.getText().toUpperCase());
        obj.setJenis_kelamin((String) jk.getSelectedItem());
        obj.setSaldo_awal(simpanan.getText());
        
        
        if (id.getText().length() ==11) {
                   
            if (tanggal.getDate() == null||" ".equals(kelasvar.getText())||"".equals(simpanan.getText()) || jk.getSelectedItem()=="-Pilih Jenis Kelamin-"||"".equals(nama.getText()) || "".equals(id.getText()) || "".equals(alamat.getText()) || "".equals(simpanan.getText()) ) {
                 JOptionPane.showMessageDialog(null, "Lengkapi Data Dengan Lengkap");  
                 
            } else {
                    obj.setTanggal(new SimpleDateFormat("yyyy-MM-dd").format(tanggal.getDate()));
                    if (savecek%2 == 0){
                        if(obv.val_tanggal(new SimpleDateFormat("dd-MM-yyyy").format(tanggal.getDate()))==false)  {
                                JOptionPane.showMessageDialog(null, "Tanggal Tidak Boleh tidak sama  dari hari sekarang !");  
                                
                          }else{ 
                            obc.addanggota(obj);
                               refresh();
                            disabled();
                            tambahbaru.setVisible(true);
                            editing.setVisible(true);
                            deleted.setVisible(true);
                            save.setVisible(false);
                        }
                    }else {
                        obc.updateanggota(obj);
                    
                        refresh();
                        disabled();
                        tambahbaru.setVisible(true);
                        editing.setVisible(true);
                        deleted.setVisible(true);
                        save.setVisible(false);
                    }
                 }
        }else {
             JOptionPane.showMessageDialog(null, "Masukan NIM Anda 11 digit");  
   
        }
        
    }//GEN-LAST:event_saveMouseClicked

    private void cariInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_cariInputMethodTextChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cariInputMethodTextChanged

    public static Date getTanggalFromTable(JTable table, int kolom){
        JTable tabel = table;
        String str_tgl = String.valueOf(tabel.getValueAt(tabel.getSelectedRow(), kolom));
        Date tanggal = null;
        try {
            tanggal = new SimpleDateFormat("yyyy-mm-dd").parse(str_tgl);
        } catch (ParseException ex) {
            Logger.getLogger(anggotatambah.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tanggal;
    }
    
    private void anggotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anggotaMouseClicked
        // TODO add your handling code here:
        int a = anggota.getSelectedRow();
        id.setText(anggota.getValueAt(a, 0).toString());
       
        tanggal.setDate(getTanggalFromTable(anggota,3));
        String tam=(String)anggota.getValueAt(a, 5);
        
        kelas.setSelectedItem(tam.substring(0, 1));
     
        kelasvar.setText(tam.substring(4,5));
       
        nama.setText((String) anggota.getValueAt(a, 1));
        jk.setSelectedItem(anggota.getValueAt(a, 2));
        alamat.setText((String) anggota.getValueAt(a, 4));
        
        simpanan.setText((String) anggota.getValueAt(a,6));
        
    }//GEN-LAST:event_anggotaMouseClicked

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cariActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel10MouseClicked

    private void editingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editingMouseClicked
        // TODO add your handling code here:
        
        if (nama.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Pilih Data Yang Ingin Anda edit");  
        }else {
            savecek=1;
            save.setVisible(true);
            tambahbaru.setVisible(false);
            editing.setVisible(false);
            deleted.setVisible(false);
            enabled();
            id.setEnabled(false);
        }
        
      
        
    }//GEN-LAST:event_editingMouseClicked

    private void kelasvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelasvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kelasvarActionPerformed

    private void kelasvarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kelasvarKeyTyped
       obv.cek_nama(evt);
        if(kelasvar.getText().length()>0 ){ 
       JOptionPane.showMessageDialog(null,"Maaf Masukan kelas yang benar!"); // --- Memunculkan Pesan ke User
       evt.consume(); // --- Karakter tidak akan di Input
   }
        
    }//GEN-LAST:event_kelasvarKeyTyped

    private void deletedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletedMouseClicked
      if ("".equals(simpanan.getText()) || jk.getSelectedItem()=="-Pilih Jenis Kelamin-"||"".equals(nama.getText()) || "".equals(id.getText()) || "".equals(alamat.getText()) ) {
             JOptionPane.showMessageDialog(null, "Pilih Data Yang Ingin Anda Hapus !");  
   
        }else {
            obc.deleteanggota(id.getText());
            refresh();
      }
    }//GEN-LAST:event_deletedMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MessageFormat judul=new MessageFormat("Data Nasabah");
        MessageFormat footer=new MessageFormat("Page(0,number,integer)");
        try {
            anggota.print(JTable.PrintMode.FIT_WIDTH, judul, footer);
        } catch (PrinterException ex) {
            Logger.getLogger(anggotatambah.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyTyped
        
        obv.cek_angka(evt);
       if(id.getText().length()>10){ 
       JOptionPane.showMessageDialog(null,"Masukan NIM Anda anda 11 digit"); // --- Memunculkan Pesan ke User
       evt.consume(); // --- Karakter tidak akan di Input
   }
    }//GEN-LAST:event_idKeyTyped

    private void namaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namaKeyTyped
        obv.cek_nama(evt);
    }//GEN-LAST:event_namaKeyTyped

    private void simpananKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_simpananKeyTyped
        obv.cek_angka(evt);
    }//GEN-LAST:event_simpananKeyTyped

    private void cariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariKeyTyped
       obv.cek_angka(evt);
    }//GEN-LAST:event_cariKeyTyped
    
   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JTable anggota;
    private javax.swing.JTextField cari;
    private javax.swing.JLabel deleted;
    private javax.swing.JLabel editing;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox jk;
    private javax.swing.JComboBox kelas;
    private javax.swing.JTextField kelasvar;
    private javax.swing.JTextField nama;
    private javax.swing.JLabel save;
    private javax.swing.JTextField simpanan;
    private javax.swing.JLabel tambahbaru;
    private com.toedter.calendar.JDateChooser tanggal;
    // End of variables declaration//GEN-END:variables
}
