/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ENTITAS;

/**
 *
 * @author ASUS
 */
public class entitaslogin {
    private String password;
    private boolean cari;

    public boolean isCari() {
        return cari;
    }

    public void setCari(boolean cari) {
        this.cari = cari;
    }
    
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
