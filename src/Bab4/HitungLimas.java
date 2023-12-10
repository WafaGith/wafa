/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab4;

/**
 *
 * @author HP
 */
public class HitungLimas {
  //  public class HitungLimas {
    private double LuasAlas;
    public double tinggi;
    double volume;
    
    public double getLuasAlas() {
       return LuasAlas;
    }
    public void setLuasAlas(double LuasAlas) {
        this.LuasAlas = LuasAlas;
    }
    double volumeLimas() {
        volume = ( getLuasAlas() * tinggi ) / 3;
        return volume;
 }
}

