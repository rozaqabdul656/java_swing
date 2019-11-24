/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import ENTITAS.entitaslogin;
import com.mysql.jdbc.Connection;
import crudiface.crudinloginiface;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import koneksi.abstrakinduk;
import koneksi.koneksi;
import view.menututama;


/**
 *
 * @author ASUS
 */
public class crudlogin extends abstrakinduk implements crudinloginiface{
    entitaslogin EnLo = new entitaslogin();
    
    
    public crudlogin(){
         buatkoneksi=ks.buatKoneksi();
    }    
    
    @Override
    public entitaslogin login(String pass, view.login login) {
            menututama m=new menututama();
           try {
                st = buatkoneksi.createStatement();
                r=st.executeQuery("SELECT *  from tb_admin where kode_admin='"+pass+"'");
            
               if (r.next()){
                   if (pass.equals(r.getString("kode_admin"))) {
                       JOptionPane.showMessageDialog(null, "berhasil login");
                       m.setVisible(true);
                       login.setVisible(false);
                   }else {
                       JOptionPane.showMessageDialog(null, "Password asalah");
                   }
                   
               }else {
                   JOptionPane.showMessageDialog(null, "Gagal Login");
               }
   
               
        }catch (HeadlessException | SQLException e) {   
            Logger.getLogger(crudlogin.class.getName()).log(Level.SEVERE,null,e);
     
                    
        }
            return EnLo;
    }

    @Override
    public entitaslogin GantiPassword(String pass) {
        entitaslogin jawab=new entitaslogin();
        jawab.setCari(false);
        
        try {
            st =buatkoneksi.createStatement();
            r = st.executeQuery("select * from tb_admin where kode_admin= '"+ pass+"'");
            while(r.next()){
                jawab.setPassword(r.getString(1));
                jawab.setCari(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
           
        }
        return jawab;
    
    }

    @Override
    public void changePassword(entitaslogin a) {
         try {
                st = buatkoneksi.createStatement();
                st.executeUpdate("update  tb_admin set kode_admin='" + a.getPassword()+ "'");
                JOptionPane.showMessageDialog(null, "sukses di ubah!!!");
            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, "gagal!!!" + e);
            }
        
    }
    
    
    
   
}
    

