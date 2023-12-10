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
public class Lingkaran {
    //atribut
    int r ;
    double phi, luas;
    
    //condtruktor
    public Lingkaran(){
        r = 7;
        phi = 3.14;
    }
    
    //method
    void Deskripsi(){
        System.out.println("Ini adalah hasil menghitung");
    }
    
    //mehod untuk menghitung
    double hitLuasLingkaran(){
        luas =(phi*r*r);
        return luas;
    }
}
