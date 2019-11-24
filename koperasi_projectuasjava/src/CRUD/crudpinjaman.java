/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import ENTITAS.entitaspinjaman;
import com.mysql.jdbc.Connection;
import crudiface.crudpinjamaniface;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.abstrakinduk;

/**
 *
 * @author ASUS
 */
public class crudpinjaman extends abstrakinduk implements crudpinjamaniface{

    
    public crudpinjaman(){
         buatkoneksi = (Connection) ks.buatKoneksi();


    }    
    @Override
    public void minjamanggota(entitaspinjaman ob) {
             try {
                    
                st = buatkoneksi.createStatement();
                st.executeUpdate("insert into tb_pinjaman(nim,besar_pinjaman,tanggal,jaminan)values ('" + ob.getNim() + "','" + ob.getBesar_pinjaman() +"','"+ob.getDate()+"','"+ob.getJaminan()+ "')");
               
                JOptionPane.showMessageDialog(null, "sukses di tambahkan!!!");
            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, "User Tidak Bisa Meminjam 2 Kali " );
            }
    
    }
    @Override
    public void deleteminjamanggota(String nim) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
                tb.addColumn("Saldo Bank");
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
                tb.addColumn("Saldo Bank");
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
    public void updateminjamanggota(entitaspinjaman ob) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
