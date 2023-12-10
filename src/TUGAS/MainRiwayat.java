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
public class MainRiwayat {
  //  public class MainPembayaran {
    public static void main(String[] args) {
       Riwayat_Transaksi Rwt = new Riwayat_Transaksi();
     //  Rwt.datanamapembeli("wafa");
       Rwt.datanamaSales("Yanto");
       Rwt.dataTanggal("19 Juli 2023");
       Rwt.dataBarang("Laptop");
       Rwt.dataHarga(2899000);

    System.out.println("Riwayat Pembelian Customer ");
    System.out.println("------------------------------------"); 
    System.out.println("Nama Sales : "+ Rwt.cetaknamaSales());
    System.out.println("Tanggal : " + Rwt.cetakTanggal());
    System.out.println("Barang Yang di Beli : "+ Rwt.cetakBarang()); 
    System.out.println("Total Harga: "+ Rwt.cetakTotal()); 
}
}
