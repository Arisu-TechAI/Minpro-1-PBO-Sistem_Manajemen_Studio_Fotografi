/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studio_fotografi_app;

/**
 *
 * @author USER
 */
public class Client {
    // properties
    private String idClient;
    private String namaClient;
    private String noTelp;

    // Constructor
    public Client(String idClient, String namaClient, String noTelp) {
        this.idClient = idClient;
        this.namaClient = namaClient;
        this.noTelp = noTelp;
    }

    // Getter dan Setter
    public String getIdClient() { return idClient; }
    public void setIdClient(String idClient) { this.idClient = idClient; }

    public String getNamaClient() { return namaClient; }
    public void setNamaClient(String namaClient) { this.namaClient = namaClient; }

    public String getNoTelp() { return noTelp; }
    public void setNoTelp(String noTelp) { this.noTelp = noTelp; }
}