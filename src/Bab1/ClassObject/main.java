/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab1.ClassObject;

/**
 *
 * @author HP
 */
public class main {
    public static void main(String[] args) {
        Kendaraan mobil = new Kendaraan();
        mobil.nama = "Mobil";
        mobil.warna = "Merah";
        mobil.merk = "Toyota";
        System.out.println("Nama Kendaraan : " + mobil.nama);
        System.out.println("Warna Kendaraan : " + mobil.warna);
        System.out.println("Merek Kendaraan : " + mobil.merk);
        System.out.println("Jumlah Roda : " + mobil.jmlRoda(4) + "\n");
        System.out.println("Cara Kendaraan Bergerak : ");
        System.out.print("Saat Maju : " + mobil.nama);
        mobil.kendaraanMaju();
        System.out.print("Saat Mundur : " + mobil.nama);
        mobil.kendaraanMundur();
        System.out.print("Saat Berhenti : " + mobil.nama);
        mobil.kendaraanBerhenti();
    }
}
