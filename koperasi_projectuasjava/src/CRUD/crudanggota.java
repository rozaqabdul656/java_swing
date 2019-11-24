/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import ENTITAS.entitasanggota;
import com.mysql.jdbc.Connection;
import crudiface.crudanggotaiface;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.abstrakinduk;

/**
 *
 * @author ASUS
 */
public class crudanggota extends abstrakinduk implements crudanggotaiface{
    
           //Connection buatkoneksi;

           public crudanggota() {
       //        koneksi ks = new koneksi();
               buatkoneksi = (Connection) ks.buatKoneksi();

           }
        @Override
        public void addanggota(entitasanggota dp){
             //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            try {
                st = buatkoneksi.createStatement();
                st.executeUpdate("insert into tb_anggota values ('" + dp.getNim() + "','" + dp.getNama() + "','" + dp.getJenis_kelamin() +"','"+dp.getTanggal()+ "','" + dp.getAlamat() +"','"+dp.getKelas()+"','"+dp.getSaldo_awal()+"')");
                JOptionPane.showMessageDialog(null, "sukses di tambahkan!!!");
            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Gagal Di tambahkan!!!" + e);
            }

        }

     
        @Override
        public void updateanggota(entitasanggota dp){
            try {
                st = buatkoneksi.createStatement();
                st.executeUpdate("update  tb_anggota set nama='" + dp.getNama() + "',jenis_kelamin='" + dp.getJenis_kelamin() +"',tanggal='"+dp.getTanggal()+ "',alamat='" + dp.getAlamat() +"',kelas='"+dp.getKelas()+"',Saldo_awal='"+dp.getSaldo_awal()+"' where nim='"+dp.getNim()+"'");
                JOptionPane.showMessageDialog(null, "sukses di tambahkan!!!");
            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, "gagal!!!" + e);
            }
        }
        @Override
        public void deleteanggota(String nim){
             try {
                st = buatkoneksi.createStatement();
                st.executeUpdate("call hapusanggota ('"+nim+"')");
                JOptionPane.showMessageDialog(null, "Berhasil Dihapus !!!");
            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Gagal!!!" + e);
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
                tb.addColumn("Jenis Kelamin");
                tb.addColumn("Tanggal Masuk");
                tb.addColumn("Alamat");
                tb.addColumn("Kelas");
                tb.addColumn("Saldo");
                while (r.next()) {
                    tb.addRow(new Object[]{
                        r.getString("nim"),
                        r.getString("nama"),
                        r.getString("jenis_kelamin"),
                        r.getString("tanggal"),
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
                tb.addColumn("Jenis Kelamin");
                tb.addColumn("Tanggal Masuk");
                tb.addColumn("Alamat");
                tb.addColumn("Kelas");
                tb.addColumn("Saldo");
               
                while (r.next()) {
                    tb.addRow(new Object[]{
                        r.getString("nim"),
                        r.getString("nama"),
                        r.getString("jenis_kelamin"),
                        r.getString("tanggal"),
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
