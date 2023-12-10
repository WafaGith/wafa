/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS;

/**
 *
 * @author HP
 */

// Subclass MetodePembayaran yang merupakan turunan dari superclass Elektronik
import javax.swing.JTextField;

/**
 *
 * @author 
 */
public class MetodePembayaran extends Elektronik {
    //Atribut Pembayaran
    protected String namaP,namaS,Tgl,metode;
    public int Diskon; 
    //Constructornya
    public void dataTanggal(String Tgl){
 this.Tgl = Tgl ;
    }
    public void datanamapembeli(String namap){
 this.namaP = namap ;
    }
    public void datanamaSales(String namaS){
 this.namaS = namaS;
    }
    public void dataDiskon(int Diskon){
 this.Diskon = Diskon;
    }
    public void dataMetode(String Metode){
 this.metode = Metode;
    }
    
    public String cetakTanggal(){
 return Tgl;
 }
    public String cetaknamapembeli(){
 return namaP;
 }
    public String cetaknamaSales(){
 return namaS;
 }
    public int cetakDiskon(){
 return Diskon;
 }
    public String cetakMetode(){
 return metode;
    }
    
   //Method
   public int Totaldiskon(){
   int total;
   total = (int) (getcetakHarga()- cetakDiskon());
   return total;
 } 
   public String Elektronik(){
       return null;
   }
}



