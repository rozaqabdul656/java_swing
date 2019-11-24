/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudiface;

import ENTITAS.entitaspinjaman;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public interface crudpinjamaniface {
        public void minjamanggota(entitaspinjaman ob);
        public void updateminjamanggota(entitaspinjaman ob);
        public void deleteminjamanggota(String nim);
        public DefaultTableModel tampil_data_table();
        public DefaultTableModel tampilBy_data_table(String id);
}
