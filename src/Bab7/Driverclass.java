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
public class Driverclass {
    public static void main(String[] args) {
        Manusia manusia = new Manusia();
        
        Buah apel = new Apel();
        Buah pisang = new pisang();
        
        manusia.makanBuah(apel);
        manusia.makanBuah(pisang);
        
    }
}
