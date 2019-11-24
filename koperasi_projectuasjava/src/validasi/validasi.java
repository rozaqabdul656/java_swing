/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validasi;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author ASUS
 */
public class validasi {
  public void cek_angka(java.awt.event.KeyEvent evt) {
        char karakter = evt.getKeyChar();
        if (!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))) {
            JOptionPane.showMessageDialog(null, "Masukan angka");
            
         //   getToolkit().beep();
            
            
            evt.consume();
        }
    }

    public void cek_nama(java.awt.event.KeyEvent evt) {
        char karakter = evt.getKeyChar();
        if (!(((karakter >= 'a') && (karakter <= 'z') || (karakter >= 'A') && (karakter <= 'Z') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE || karakter == KeyEvent.VK_SPACE)))) {
            evt.consume();
        }
    }

    public boolean ceklength(String no) {
        if (no.length() <= 12) {
            if (no.length() >= 12) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    private void JumlahKarakter(char karakter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void JumlahKarakter(KeyEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private ActionListener taskPerformer;
    public String JAM() {

        // ActionListener untuk Keperluan Timer
        String hasil;

        String jc_jam = "";
        String jc_menit = "";
        String jc_detik = "";
        // Membuat Date
        Date JC = new Date();

        Calendar dt = Calendar.getInstance();

        // Mengambil nilaj JAM, MENIT, dan DETIK Sekarang
        Date a = dt.getTime();

        String tgl1 = new SimpleDateFormat("EEEE,dd-MM-yyyy").format(a);
        // Mengambil nilaj JAM, MENIT, dan DETIK Sekarang
        int nilai_jam = JC.getHours();
        int nilai_menit = JC.getMinutes();
        int nilai_detik = JC.getSeconds();
        // Jika nilai JAM lebih kecil dari 10 (hanya 1 digit)
        if (nilai_jam <= 9) {
            // Tambahkan "0" didepannya
            jc_jam = "0";
        }
        // Jika nilai MENIT lebih kecil dari 10 (hanya 1 digit)
        if (nilai_menit <= 9) {
            // Tambahkan "0" didepannya
            jc_menit = "0";
        }
        // Jika nilai DETIK lebih kecil dari 10 (hanya 1 digit)
        if (nilai_detik <= 9) {
            // Tambahkan "0" didepannya
            jc_detik = "0";
        }
        // Membuat String JAM, MENIT, DETIK
        String jam = jc_jam + Integer.toString(nilai_jam);
        String menit = jc_menit + Integer.toString(nilai_menit);
        String detik = jc_detik + Integer.toString(nilai_detik);
        // Menampilkan pada Layar
        hasil = tgl1 + "  " + jam + " : " + menit + " : " + detik + "  ";

        // Timer
        new Timer(1000, taskPerformer).start();
        return hasil;
    }
    public boolean val_tanggal(String a){
        String tanggal = null;
        String bulan = null;
        Date ys=new Date();
        SimpleDateFormat s=new SimpleDateFormat("dd-MM-yyyy");
        tanggal=(s.format(ys));
        bulan=(s.format(ys).substring(3,5));
        if (!a.equals(tanggal)) {
            return false;
        }else {
            return true;
        }
    }
}
