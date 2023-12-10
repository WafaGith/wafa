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
public class MainElektronik {
    public static void main(String[] args) {
        //Membuat Object
       Elektronik alat = new Elektronik();
       
       //Object
    System.out.println("");
       alat.dataNama("Monitor ");
       alat.dataMerek("Samsung");
       alat.dataBahan("Karbon Fiber + Metal");
       alat.dataWarna("Hitam");
       alat.dataHarga(3990000);
       alat.datajual(10);
       alat.dataStok(32);
 System.out.println("Penjualan Elektronik ");
 System.out.println("---------------------");
 System.out.println("Nama Barang   : "+ alat.cetakNama()); 
 System.out.println("Merek         : "+ alat.cetakMerek()); 
 System.out.println("Bahan         : "+ alat.cetakBahan()); 
 System.out.println("Warna         : "+ alat.cetakWarna());
 System.out.println("Harga         : Rp"+ alat.cetakHarga());
 System.out.println("Barang Terjual: "+ alat.cetakTerjual()); 
 System.out.println("Stok          : "+ alat.cetakStok());
 alat.total();

 //Object2
   System.out.println("");
       alat.dataNama("Monitor ");
       alat.dataMerek("Samsung");
       alat.dataBahan("Karbon Fiber + Metal");
       alat.dataWarna("Hitam");
       alat.dataHarga(3990000);
       alat.datajual(6);
       alat.dataStok(32);
 System.out.println("Penjualan Elektronik ");
 System.out.println("---------------------");
 System.out.println("Nama Barang  : "+ alat.cetakNama()); 
 System.out.println("Merek        : "+ alat.cetakMerek()); 
 System.out.println("Bahan        : "+ alat.cetakBahan()); 
 System.out.println("Warna        : "+ alat.cetakWarna()); 
 System.out.println("Harga        : Rp"+ alat.cetakHarga()); 
 System.out.println("Barang Terjual: "+ alat.cetakTerjual());
 System.out.println("Stok         : "+ alat.cetakStok()); 
      
    }   
}
