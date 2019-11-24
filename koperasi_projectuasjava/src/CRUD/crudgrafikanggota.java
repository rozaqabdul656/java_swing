/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import com.mysql.jdbc.Connection;
import crudiface.crudgrafikanggotaiface;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import koneksi.abstrakinduk;

/**
 *
 * @author ASUS
 */
public class crudgrafikanggota extends abstrakinduk implements crudgrafikanggotaiface{

    public crudgrafikanggota(){
          buatkoneksi = (Connection) ks.buatKoneksi();
    }
    @Override
    public int cetakperbulan(String mulai, String akhir) {
            int balk = 0;  
            try {
                st = buatkoneksi.createStatement();
                r = st.executeQuery("SELECT count(*) as jumlah FROM tb_anggota WHERE tanggal between '"+mulai+"' and '"+akhir+"'");
                
                while (r.next()) {
                        balk=Integer.parseInt(r.getString("jumlah"));
                      
                    };

                } catch (SQLException ex) {
                Logger.getLogger(crudgrafikanggota.class.getName()).log(Level.SEVERE, null, ex);
            }

            return balk;
    }

    @Override
    public void cetakperhari(String hari) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
