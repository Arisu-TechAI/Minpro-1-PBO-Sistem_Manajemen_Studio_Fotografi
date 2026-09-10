/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studio_fotografi_app;

/**
 *
 * @author USER
 */
public class JenisPaket {
    // Encapsulation dengan access modifier private
    private String kodePaket;
    private String namaPaket;
    private double harga;

    // Constructor
    public JenisPaket(String kodePaket, String namaPaket, double harga) {
        this.kodePaket = kodePaket;
        this.namaPaket = namaPaket;
        this.harga = harga;
    }

    // Getter dan Setter untuk Encapsulation
    public String getKodePaket() { return kodePaket; }
    public void setKodePaket(String kodePaket) { this.kodePaket = kodePaket; }

    public String getNamaPaket() { return namaPaket; }
    public void setNamaPaket(String namaPaket) { this.namaPaket = namaPaket; }

    public double getHarga() { return harga; }
    public void setHarga(double harga) { this.harga = harga; }
}