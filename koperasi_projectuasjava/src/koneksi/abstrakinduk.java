/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public abstract class abstrakinduk {
    protected ResultSet r;
    protected Statement st;
    protected String sql;
    protected koneksi ks = new koneksi();
    protected int hasil = 0;
    protected Connection buatkoneksi ;
    protected PreparedStatement ps;
    
           
//    protected DefaultTableModel tb = new DefaultTableModel();

   
    protected Statement aStatement() {
        try {
            buatkoneksi = ks.buatKoneksi();
            st = buatkoneksi.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Koneksi Gagal");
        }
        return st;
    }
}
