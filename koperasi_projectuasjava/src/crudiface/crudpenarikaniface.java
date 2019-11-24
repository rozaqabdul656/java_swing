/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudiface;

import ENTITAS.entitaspenarikan;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public interface crudpenarikaniface {
        public void penarikan(entitaspenarikan ob);
        public void updatepenarikan(entitaspenarikan ob);
        public void deletepenarikan(String nim);
        public DefaultTableModel tampil_data_table();
        public DefaultTableModel tampilBy_data_table(String id);
}
