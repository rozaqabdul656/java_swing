/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudiface;

import ENTITAS.entitastabungan;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public interface crudtabunganiface {
        public void nabunganggota(entitastabungan ob);
        public void updatenabunganggota(entitastabungan ob);
        public void deletenabunganggota(String nim);
        public DefaultTableModel tampil_data_table();
        public DefaultTableModel tampilBy_data_table(String id);
}
