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
public class Tabung extends Lingkaran{
    int t;
    double volume, luasPermukaan;

public Tabung(){
    t = 20;
} 
void keterangan(){
    Deskripsi();
    System.out.println("Menghitung Volume Tabung");
    }
double HitVolumeTabung(){
    volume = ((phi*r*r)*t);
    return volume;
}
}
