/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studio_fotografi_app;

/**
 *
 * @author USER
 */
import java.util.ArrayList;

public class Manajemen_Pemesanan {
    // ArrayList 
    private ArrayList<Transaksi> daftarTransaksi;
    private ArrayList<JenisPaket> daftarPaketTersedia;

    // Constructor
    public Manajemen_Pemesanan() {
        daftarTransaksi = new ArrayList<>();
        daftarPaketTersedia = new ArrayList<>();
        
        // Jenis Paket
        daftarPaketTersedia.add(new JenisPaket("P01", "Paket Single Person", 250000));
        daftarPaketTersedia.add(new JenisPaket("P02", "Paket Couple", 400000));
        daftarPaketTersedia.add(new JenisPaket("P03", "Paket Wisuda", 550000));
        daftarPaketTersedia.add(new JenisPaket("P04", "Paket Wedding", 2500000));
    }

    public void tampilkanDaftarPaket() {
        System.out.println("=== DAFTAR PAKET STUDIO ===");
        
        // Looping untuk menampilkan paket
        for (JenisPaket p : daftarPaketTersedia) {
            System.out.println(p.getKodePaket() + " - " + p.getNamaPaket() + " (Rp" + p.getHarga() + ")");
        }
    }

    public JenisPaket cariPaketBerdasarkanKode(String kode) {
        for (JenisPaket p : daftarPaketTersedia) {
            if (p.getKodePaket().equalsIgnoreCase(kode)) {
                return p;
            }
        }
        return null;
    }

    // Buat Pesanan
    public void tambahPesanan(Transaksi transaksiBaru) {
        daftarTransaksi.add(transaksiBaru);
        System.out.println("Pesanan berhasil ditambahkan!");
    }

    // Lihat Pesanan
    public void lihatSemuaPesanan() {
        if (daftarTransaksi.isEmpty()) {
            System.out.println("Belum ada data pesanan.");
        } else {
            System.out.println("=== DAFTAR TRANSAKSI PESANAN ===");
            
            // Tampilkan data pesanan
            for (Transaksi t : daftarTransaksi) {
                t.cetakInfoTransaksi();
            }
        }
    }

    // Pembayaran Pesanan
    public void Pembayaran_Pesanan(String idTransaksi) {
        boolean ditemukan = false;
        for (Transaksi t : daftarTransaksi) {
            if (t.getIdTransaksi().equalsIgnoreCase(idTransaksi)) {
                t.setStatusPembayaran("Lunas");
                System.out.println("Pembayaran untuk transaksi " + idTransaksi + " berhasil dilunasi!");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("ID Transaksi tidak ditemukan.");
        }
    }

    // batalkan pesanan
    public void batalkanPesanan(String idTransaksi) {
        for (int i = 0; i < daftarTransaksi.size(); i++) {
            if (daftarTransaksi.get(i).getIdTransaksi().equalsIgnoreCase(idTransaksi)) {
                daftarTransaksi.remove(i);
                System.out.println("Pesanan " + idTransaksi + " berhasil dibatalkan/dihapus.");
                return;
            }
        }
        System.out.println("ID Transaksi tidak ditemukan.");
    }
}