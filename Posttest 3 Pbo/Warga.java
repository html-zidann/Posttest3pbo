/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Zidan
 */

public class Warga extends Person {
    private String statusKeluarga;

    public Warga(int id, String nama, int umur, String statusKeluarga) {
        super(id, nama, umur); // panggil constructor Person
        this.statusKeluarga = statusKeluarga;
    }

    // Getter & Setter
    public String getStatusKeluarga() {
        return statusKeluarga;
    }

    public void setStatusKeluarga(String statusKeluarga) {
        this.statusKeluarga = statusKeluarga;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nama: " + nama + ", Umur: " + umur + ", Status: " + statusKeluarga;
    }
}
