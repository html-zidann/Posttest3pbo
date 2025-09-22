    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Zidan
 */
public class ServisWarga {
    private final ArrayList<Warga> daftarWarga = new ArrayList<>();
    private final Scanner input = new Scanner(System.in);
    private int nextId = 1;

    public void tambahWarga() {
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Umur: ");
        int umur = Integer.parseInt(input.nextLine());
        System.out.print("Masukkan Status Keluarga (Kepala Keluarga/Anggota): ");
        String status = input.nextLine();

        Warga warga = new Warga(nextId++, nama, umur, status);
        daftarWarga.add(warga);
        System.out.println("Data warga berhasil ditambahkan.");
    } 

    public void tampilkanWarga() {
        if (daftarWarga.isEmpty()) {
            System.out.println("Belum ada data warga.");
        } else {
            for (Warga w : daftarWarga) {
                System.out.println(w);
            }
        }
    }

    public void updateWarga() {
        tampilkanWarga();
        System.out.print("Masukkan ID Warga yang ingin diupdate: ");
        int id = Integer.parseInt(input.nextLine());

        for (Warga w : daftarWarga) {
            if (w.getId() == id) {
                System.out.print("Nama baru: ");
                w.setNama(input.nextLine());
                System.out.print("Umur baru: ");
                w.setUmur(Integer.parseInt(input.nextLine()));
                System.out.print("Status baru: ");
                w.setStatusKeluarga(input.nextLine());
                System.out.println("Data warga berhasil diperbarui.");
                return;
            }
        }
        System.out.println("Warga dengan ID tersebut tidak ditemukan.");
    }

    public void hapusWarga() {
        tampilkanWarga();
        System.out.print("Masukkan ID Warga yang ingin dihapus: ");
        int id = Integer.parseInt(input.nextLine());

        boolean removed = daftarWarga.removeIf(w -> w.getId() == id);
        if (removed) {
            System.out.println("Data warga berhasil dihapus.");
        } else {
            System.out.println("Data tidak ditemukan.");
        }
    }

    public void cariWarga() {
        System.out.print("Masukkan nama yang dicari: ");
        String keyword = input.nextLine().toLowerCase();

        boolean found = false;
        for (Warga w : daftarWarga) {
            if (w.getNama().toLowerCase().contains(keyword)) {
                System.out.println(w);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Tidak ada warga dengan nama tersebut.");
        }
    }
}