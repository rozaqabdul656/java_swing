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
public class entitaspembayran {
    private String nim;
    private String besar_pembayaran;
    private String date;
    private String besar_saldo;

    public String getBesar_saldo() {
        return besar_saldo;
    }

    public void setBesar_saldo(String besar_saldo) {
        this.besar_saldo = besar_saldo;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getBesar_pembayaran() {
        return besar_pembayaran;
    }

    public void setBesar_pembayaran(String besar_pembayaran) {
        this.besar_pembayaran = besar_pembayaran;
    }

    
}
