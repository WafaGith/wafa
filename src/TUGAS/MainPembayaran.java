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
public class MainPembayaran {

    public static void main(String[] args) {
       MetodePembayaran buy = new MetodePembayaran();
       buy.datanamapembeli("wafa");
       buy.datanamaSales("Yanto");
       buy.dataDiskon(95000);
       buy.dataHarga(2899000);

    System.out.println("Metode Pembayaran ");
    System.out.println("------------------------------------");
    System.out.println("Nama Pembeli: " + buy.cetaknamapembeli()+"\n"); 
    System.out.println("Nama Sales : "+ buy.cetaknamaSales()+"\n"); 
    System.out.println("Potongan : "+ buy.cetakDiskon()+"\n"); 
    System.out.println("Total Harga: "+ buy.Totaldiskon()+"\n"); 
}
}
