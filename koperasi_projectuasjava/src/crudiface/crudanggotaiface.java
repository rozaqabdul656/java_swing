/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudiface;

import ENTITAS.entitasanggota;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public interface crudanggotaiface {
        public void addanggota(entitasanggota ob);
        public void updateanggota(entitasanggota ob);
        public void deleteanggota(String nim);
        public DefaultTableModel tampil_data_table();
        public DefaultTableModel tampilBy_data_table(String id);
   
}
