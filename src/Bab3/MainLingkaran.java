/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab3;

/**
 *
 * @author HP
 */
public class MainLingkaran {
    public static void main(String[]args){
        Lingkaran L = new Lingkaran ();//memanggil konstruktor
        L.Deskripsi();
        System.out.println("Hasil nya adalah : "+ L.hitLuasLingkaran());
    }

}
