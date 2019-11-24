/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class koneksi {
    public Connection con=null;
    public Connection buatKoneksi() {
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_bank_sekolah", "root", "");
       
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Koneksi Gagal");
        }
        return con;
    }
    public static void main(String[] args) {
        koneksi k= new koneksi();
        k.buatKoneksi();
    }
    private static Connection connection;
 
   
}
