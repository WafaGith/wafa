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
import java.util.ArrayList;
import java.util.Scanner;

class Elektronik {
    String merek;
    String bahan;
    double harga;
    String warna;
    int stok;

    public Elektronik(String merek, String bahan, double harga, String warna, int stok) {
        this.merek = merek;
        this.bahan = bahan;
        this.harga = harga;
        this.warna = warna;
        this.stok = stok;
    }

    public void tambahStok(int jumlah) {
        stok += jumlah;
    }

    public void kurangiStok(int jumlah) {
        if (stok >= jumlah) {
            stok -= jumlah;
        } else {
            System.out.println("Stok tidak mencukupi.");
        }
    }

    public void tampilkanInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("Bahan: " + bahan);
        System.out.println("Harga: Rp" + harga);
        System.out.println("Warna: " + warna);
        System.out.println("Stok: " + stok);
    }
}

public class ProgramElektronik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Elektronik> stokElektronik = new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Barang Elektronik ke Stok");
            System.out.println("2. Tampilkan Stok Elektronik");
            System.out.println("3. Jual Barang Elektronik");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1/2/3/4): ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Merek: ");
                    String merek = input.next();
                    System.out.print("Bahan: ");
                    String bahan = input.next();
                    System.out.print("Harga: ");
                    double harga = input.nextDouble();
                    System.out.print("Warna: ");
                    String warna = input.next();
                    System.out.print("Stok awal: ");
                    int stokAwal = input.nextInt();

                    Elektronik elektronikBaru = new Elektronik(merek, bahan, harga, warna, stokAwal);
                    stokElektronik.add(elektronikBaru);

                    System.out.println("Barang Elektronik berhasil ditambahkan ke stok.");
                    break;

                case 2:
                    System.out.println("Stok Barang Elektronik:");
                    for (Elektronik elektronik : stokElektronik) {
                        elektronik.tampilkanInfo();
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.print("Masukkan merek barang yang akan dijual: ");
                    String merekDijual = input.next();
                    System.out.print("Masukkan jumlah yang dijual: ");
                    int jumlahDijual = input.nextInt();

                    for (Elektronik elektronik : stokElektronik) {
                        if (elektronik.merek.equalsIgnoreCase(merekDijual)) {
                            elektronik.kurangiStok(jumlahDijual);
                            System.out.println("Barang berhasil dijual.");
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih! Keluar dari program.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
