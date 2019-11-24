/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudiface;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public interface crudprinteriface {
    public DefaultTableModel tampilBy_data_table(String id);
    public void cetak_tr(String id);
    public DefaultTableModel tampilBy_data_table();
    public void cetak_pinj(String id);
}
