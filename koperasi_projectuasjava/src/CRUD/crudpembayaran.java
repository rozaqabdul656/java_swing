/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import ENTITAS.entitaspembayran;
import com.mysql.jdbc.Connection;
import crudiface.crudpembayaranpinjaman;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.abstrakinduk;

/**
 *
 * @author ASUS
 */
public class crudpembayaran extends abstrakinduk implements crudpembayaranpinjaman {

    public crudpembayaran() {
         buatkoneksi = (Connection) ks.buatKoneksi();

    }
    
    
    
    @Override
    public void bayaranggota(entitaspembayran ob) {
        try {
                st = buatkoneksi.createStatement();
                st.executeUpdate("insert into tb_pembayaran(nim,saldo,tanggal)values ('" + ob.getNim() + "','" + ob.getBesar_pembayaran()+"','"+ob.getDate()+ "')");

                JOptionPane.showMessageDialog(null, "sukses di tambahkan!!!");
            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, "gagal!!!" + e);
            }
       
        
    }

    @Override
    public void updateminjamanggota(entitaspembayran ob) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteminjamanggota(String nim) {
         try {
                st = buatkoneksi.createStatement();
                st.executeUpdate("call hapuspinjaman ('"+nim+"')");
                JOptionPane.showMessageDialog(null, "Berhasil !!!");
            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Gagal!!!" + e);
            }
    }

    @Override
    public DefaultTableModel tampil_data_table() {
       DefaultTableModel tb = new DefaultTableModel();

            try {
                st = buatkoneksi.createStatement();
                r = st.executeQuery("select a.*,b.*,c.* from tb_saldo_peminjaman a, tb_pinjaman b,tb_anggota c where a.nim=b.nim and a.nim=c.nim and b.nim=a.nim group by a.nim");
                
                tb.addColumn("NIM");
                tb.addColumn("Nama Anggota");
                tb.addColumn("Kelas");
                tb.addColumn("Saldo Pinjaman");
               
                while (r.next()) {
                    tb.addRow(new Object[]{
                        r.getString("nim"),
                        r.getString("nama"),
                        r.getString("kelas"),
                        r.getString("besar_pinjaman")
                     
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
                r = st.executeQuery("select a.*,b.*,c.* from tb_saldo_peminjaman a, tb_pinjaman b,tb_anggota c where a.nim=b.nim and a.nim=c.nim and b.nim=a.nim and a.nim like '%"+id+"%' group by a.nim");
                
                tb.addColumn("NIM");
                tb.addColumn("Nama Anggota");
                tb.addColumn("Kelas");
                tb.addColumn("Saldo Pinjaman");
               
                while (r.next()) {
                    tb.addRow(new Object[]{
                        r.getString("nim"),
                        r.getString("nama"),
                        r.getString("kelas"),
                        r.getString("besar_pinjaman")
                     
                    });

                }

            } catch (SQLException ex) {
                // Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex);
            }

            return tb;
    
    }
    
    
    
    
}
