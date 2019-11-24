/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.mysql.jdbc.Connection;
import crudiface.crudprinteriface;
import java.io.FileOutputStream;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.abstrakinduk;

/**
 *
 * @author ASUS
 */
public class crudprinter extends abstrakinduk implements crudprinteriface{
    
    public crudprinter(){
            buatkoneksi = (Connection) ks.buatKoneksi();
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
    public void cetak_tr(String id) {
        try {
            String file_name="RekapFilePDF\\rekapsaldo.pdf";
            Document document=new Document();
            PdfWriter.getInstance(document,new FileOutputStream(file_name));
            document.open();
            ps=null;
            ps=buatkoneksi.prepareStatement("select * from tb_saldo where nim='"+id+"'");
            r=ps.executeQuery();
            PdfPTable table1=new PdfPTable(6);
                table1.addCell("NIM");
                table1.addCell("tanggal");
                table1.addCell("keterangan");
                table1.addCell("debit");
                table1.addCell("kredit");
                table1.addCell("saldo");
                document.add(table1);
           while(r.next()){
                PdfPTable table=new PdfPTable(6);
                table.addCell(r.getString("nim"));
                table.addCell(r.getString("tanggal"));
                table.addCell(r.getString("keterangan"));
                table.addCell(r.getString("debit"));
                table.addCell(r.getString("kredit"));
                table.addCell(r.getString("saldo"));
                document.add(table);
             
            }   
            
            document.close();
            JOptionPane.showMessageDialog(null,"Sukses");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
     
        }
        
        
    }

    @Override
    public DefaultTableModel tampilBy_data_table() {
     DefaultTableModel tb = new DefaultTableModel();
            try {
                st = buatkoneksi.createStatement();
                r = st.executeQuery("SELECT * FROM tb_anggota");
                tb.addColumn("NIM");
                tb.addColumn("Nama Anggota");
                tb.addColumn("Jenis Kelamin");
                tb.addColumn("Tanggal Masuk");
                tb.addColumn("Alamat");
                tb.addColumn("Kelas");
               
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
    public void cetak_pinj(String id) {
        try {
            String file_name="RekapFilePDF\\rekappinjaman.pdf";
            Document document=new Document();
            PdfWriter.getInstance(document,new FileOutputStream(file_name));
            document.open();
            ps=null;
            ps=buatkoneksi.prepareStatement("select * from tb_saldo_peminjaman where nim='"+id+"'");
            r=ps.executeQuery();
            PdfPTable table1=new PdfPTable(6);
                table1.addCell("NIM");
                table1.addCell("tanggal");
                table1.addCell("keterangan");
                table1.addCell("debit");
                table1.addCell("kredit");
                table1.addCell("saldo");
                document.add(table1);
           while(r.next()){
                PdfPTable table=new PdfPTable(6);
                table.addCell(r.getString("nim"));
                table.addCell(r.getString("tanggal"));
                table.addCell(r.getString("keterangan"));
                table.addCell(r.getString("debet"));
                table.addCell(r.getString("kredit"));
                table.addCell(r.getString("saldo"));
                document.add(table);
             
            }   
            
            document.close();
            JOptionPane.showMessageDialog(null,"Sukses");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
     
        }
    
    }
}
