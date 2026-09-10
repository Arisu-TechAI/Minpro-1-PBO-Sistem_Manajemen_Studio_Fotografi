/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studio_fotografi_app;

/**
 *
 * @author USER
 */
public class Transaksi {
    private String idTransaksi;
    private Client client; // Relasi ke class Client
    private JenisPaket paket; // Relasi ke class JenisPaket
    private String tanggalSesi;
    private String statusPembayaran; // Contoh: "Belum Lunas", "Lunas"

    // Constructor
    public Transaksi(String idTransaksi, Client client, JenisPaket paket, String tanggalSesi) {
        this.idTransaksi = idTransaksi;
        this.client = client;
        this.paket = paket;
        this.tanggalSesi = tanggalSesi;
        this.statusPembayaran = "Belum Lunas"; // Default saat awal pesan
    }

    // Getter dan Setter
    public String getIdTransaksi() { return idTransaksi; }
    public Client getClient() { return client; }
    public JenisPaket getPaket() { return paket; }
    
    public String getTanggalSesi() { return tanggalSesi; }
    public void setTanggalSesi(String tanggalSesi) { this.tanggalSesi = tanggalSesi; }

    public String getStatusPembayaran() { return statusPembayaran; }
    public void setStatusPembayaran(String statusPembayaran) { this.statusPembayaran = statusPembayaran; }

    // Method untuk menampilkan info struk
    public void cetakInfoTransaksi() {
        System.out.println("ID Transaksi  : " + idTransaksi);
        System.out.println("Nama Client   : " + client.getNamaClient() + " (" + client.getNoTelp() + ")");
        System.out.println("Paket Dipilih : " + paket.getNamaPaket());
        System.out.println("Harga Paket   : Rp" + paket.getHarga());
        System.out.println("Tanggal Sesi  : " + tanggalSesi);
        System.out.println("Status Bayar  : " + statusPembayaran);
        System.out.println("-------------------------------------------------");
    }
}