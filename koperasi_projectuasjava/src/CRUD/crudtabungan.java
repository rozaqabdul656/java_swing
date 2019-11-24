/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import ENTITAS.entitastabungan;
import com.mysql.jdbc.Connection;
import crudiface.crudtabunganiface;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.abstrakinduk;

/**
 *
 * @author ASUS
 */
public class crudtabungan extends abstrakinduk implements crudtabunganiface{
    
    
    public crudtabungan(){
        buatkoneksi = (Connection) ks.buatKoneksi();

    }
    @Override
    public  void nabunganggota(entitastabungan ob) {
            try {
                    
                st = buatkoneksi.createStatement();
                String ss = null ;
                st.executeUpdate("insert into tb_setoran(nim,besar_setoran,tanggal) values ('" + ob.getNim() + "','" + ob.getSetoran() +"','"+ob.getDate()+ "')");
               
                JOptionPane.showMessageDialog(null, "sukses di tambahkan!!!");
            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, "GAGAL dI INPUTKAN!!!" + e);
            }
    }

    @Override
    public void updatenabunganggota(entitastabungan ob) {
//           try {
//                st = buatkoneksi.createStatement();
//                st.executeUpdate("update  tb_penarikan set tanggal_penarikan='" + ob.getTanggal_penarikan()+ "',besar_penarikan='" + ob.getBesar_penarikan() +"' where nim='"+ob.getNim()+"'");
//                JOptionPane.showMessageDialog(null, "sukses di tambahkan!!!");
//            } catch (SQLException | HeadlessException e) {
//                JOptionPane.showMessageDialog(null, "gagal!!!" + e);
//            }
      
    }

    @Override
    public void deletenabunganggota(String nim) {
        try {
                st = buatkoneksi.createStatement();
                st.executeUpdate("DELETE from tb_penarikan where nim='"+ nim +"'");
                JOptionPane.showMessageDialog(null, "sukses Dihapus !!!");
            }catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Gagal !!!" + e);
            }
    }

    @Override
    public DefaultTableModel tampil_data_table() {
            DefaultTableModel tb = new DefaultTableModel();

            try {
                st = buatkoneksi.createStatement();
                r = st.executeQuery("SELECT * FROM tb_anggota ");
                tb.addColumn("NIM");
                tb.addColumn("Nama Anggota");
                tb.addColumn("Alamat");
                tb.addColumn("Kelas");
                tb.addColumn("Saldo");
                while (r.next()) {
                    tb.addRow(new Object[]{
                        r.getString("nim"),
                        r.getString("nama"),
                        r.getString("alamat"),
                        r.getString("kelas"),
                        r.getString("saldo_awal")
                    });

                }

            } catch (SQLException ex) {
                // Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex);
            }

            return tb;
        
    }

    @Override
    public DefaultTableModel tampilBy_data_table(String id) {
           DefaultTableModel tb = new DefaultTableModel();
            try {
                st = buatkoneksi.createStatement();
                r = st.executeQuery("SELECT * FROM tb_anggota where nim like '%"+id+"%'");
                tb.addColumn("NIM");
                tb.addColumn("Nama Anggota");
                tb.addColumn("Alamat");
                tb.addColumn("Kelas");
                tb.addColumn("Saldo");
                while (r.next()) {
                    tb.addRow(new Object[]{
                        r.getString("nim"),
                        r.getString("nama"),
                        r.getString("alamat"),
                        r.getString("kelas"),
                        r.getString("saldo_awal")
                    });

                }

            } catch (SQLException ex) {
                // Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex);
            }

            return tb;
        }
        
    }
    

