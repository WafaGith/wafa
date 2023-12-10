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
//public class Riwayat_Transaksi {
    
//}
import javax.swing.JTextField;

/**
 *
 * @author 
 */
public class Riwayat_Transaksi extends Elektronik {
    //Atribut Riwayat Transaksi
    protected String namaS,Tgl, pecahan;
    
    //Constructornya
   public void dataTanggal(String Tgl){
 this.Tgl = Tgl ;
    }
   public void dataBarang(String barang){
 this.nama = barang ;
    }
   public void datanamaSales(String namaS){
 this.namaS = namaS;
    }
   
    //method
   public String cetakTanggal(){
 return Tgl;
 }
   public String cetakBarang(){
 return nama;
 }
   public String cetaknamaSales(){
 return namaS;
   }
   
   @Override
   public int jumlah(){
   int total = 58000*getcetakTerjual();
   return total;
}
   @Override
   public String Elektronik(){
       if(jumlah() <= 10000 ){
           pecahan = "Rp10000";
       }else if (jumlah() <= 20000){
           pecahan = "Rp20000";
       }else if (jumlah() <= 50000){
           pecahan = "Rp50000";
       }else if (jumlah() <= 100000){
           pecahan = "Rp100000";
       }else if (jumlah() <= 200000){
           pecahan = "Rp100000*2";
       }else if (jumlah() <= 500000){
           pecahan = "Rp100000*5";
       }else if (jumlah() <= 1000000){
           pecahan = "Rp100000*10";
       }else if (jumlah() <= 1500000){
           pecahan = "Rp100000*15";
       }else{
           pecahan = "Pembayaran Menggunakan Kartu Debit";
       }
    return pecahan;
   }
}