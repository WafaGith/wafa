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
public abstract class Elektronik {
    //Abstract Method
    public abstract String Elektronik();
    
    //Atribut
    protected String nama,merek,bahan,warna;
    private int stok,harga,terjual;
    
    //contruktor tanpa parameter
    public void dataNama(String Nama){
        this.nama = Nama;
    }
    public void dataMerek(String Merek){
        this.merek = Merek;
    }
    public void dataBahan(String Bahan){
        this.bahan = Bahan;
    }
    public void setdataHarga(int Harga){
        this.harga = Harga;
    }
    public void dataWarna(String Warna){
        this.warna = Warna;
    }
    public void setdataStok(int Stok){
        this.stok = Stok;
    }
    public void setdatajual(int Terjual){
        this.terjual = Terjual;
    }
    
    public String cetakNama(){
  return nama;
 }
 public String cetakMerek(){
  return merek;
 }
 public String cetakBahan(){
  return bahan;
 }
 public String cetakWarna(){
  return warna;
 }
 public int getcetakHarga(){
  return harga;
 }
 public int getcetakStok(){
     return stok;
 }
 public int getcetakTerjual(){
     return terjual;
 }

 //method overloading
 public int jumlah(){
   int total;
   total = terjual*harga;
   return total;
 }
 public int jumlah(int a, int b){
   int Setok;
   Setok = stok - terjual;
   return Setok;
 }
}
