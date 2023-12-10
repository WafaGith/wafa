/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab7;

/**
 *
 * @author HP
 */
public abstract class pembayaran {
    abstract double hitPembayaran(double bayar);
    abstract double cekKode(String Input);
    abstract void tampilkanMember();
    
    String member (G0001 member){
        return "gold";
    }
    String member(P0001 member){
        return "Platinum";
    }
    String member (S0001){
        return "Silver";
    }
}
