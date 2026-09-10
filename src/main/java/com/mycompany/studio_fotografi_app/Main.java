/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studio_fotografi_app;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manajemen_Pemesanan manajemen = new Manajemen_Pemesanan();
        int pilihanMenu;

        // Main Menu Program
        do {
            System.out.println("\n======================================");
            System.out.println("SISTEM MANAJEMEN STUDIO FOTOGRAFI");
            System.out.println("======================================");
            System.out.println("1. Tambah Pesanan Baru ");
            System.out.println("2. Lihat Daftar Pesanan ");
            System.out.println("3. Pembayaran Pesanan ");
            System.out.println("4. Batalkan/Hapus Pesanan ");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihanMenu = scanner.nextInt();
            scanner.nextLine();

            // percabangan untuk memilih menu
            switch (pilihanMenu) {
                // Menu 1
                case 1:
                    System.out.println("\n--- TAMBAH PESANAN ---");
                    System.out.print("Masukkan ID Transaksi (Cth: T01) : ");
                    String idTrans = scanner.nextLine();
                    
                    System.out.print("Masukkan ID Client               : ");
                    String idClient = scanner.nextLine();
                    System.out.print("Masukkan Nama Client             : ");
                    String namaClient = scanner.nextLine();
                    System.out.print("Masukkan No Telepon              : ");
                    String noTelp = scanner.nextLine();
                    
                    Client clientBaru = new Client(idClient, namaClient, noTelp);

                    System.out.println();
                    manajemen.tampilkanDaftarPaket();
                    System.out.print("Masukkan Kode Paket yang dipilih : ");
                    String kodePaket = scanner.nextLine();
                    
                    JenisPaket paketDipilih = manajemen.cariPaketBerdasarkanKode(kodePaket);
                    
                    if (paketDipilih != null) {
                        System.out.print("Masukkan Tanggal Sesi (DD-MM-YYYY) : ");
                        String tanggal = scanner.nextLine();
                        
                        Transaksi pesananBaru = new Transaksi(idTrans, clientBaru, paketDipilih, tanggal);
                        manajemen.tambahPesanan(pesananBaru);
                    } else {
                        System.out.println("Gagal! Kode Paket tidak valid.");
                    }
                    break;

                // Menu 2
                case 2:
                    System.out.println("\n--- LIHAT DAFTAR PESANAN ---");
                    manajemen.lihatSemuaPesanan();
                    break;

                // MEnu 3
                case 3:
                    System.out.println("\n--- UPDATE STATUS PEMBAYARAN ---");
                    System.out.print("Masukkan ID Transaksi yang ingin dilunasi: ");
                    String idLunas = scanner.nextLine();
                    manajemen.Pembayaran_Pesanan(idLunas);
                    break;

                // Menu 4
                case 4:
                    System.out.println("\n--- BATALKAN PESANAN ---");
                    System.out.print("Masukkan ID Transaksi yang ingin dibatalkan: ");
                    String idBatal = scanner.nextLine();
                    manajemen.batalkanPesanan(idBatal);
                    break;

                // Menu 5
                case 5:
                    System.out.println("\nTerima kasih telah menggunakan sistem Manajemen Studio Fotografi.");
                    break;

                default:
                    System.out.println("\nPilihan tidak valid. Silakan pilih 1-5.");
            }
        } while (pilihanMenu != 5); // Tutup program jika user memilih menu 5
        
        scanner.close();
    }
}