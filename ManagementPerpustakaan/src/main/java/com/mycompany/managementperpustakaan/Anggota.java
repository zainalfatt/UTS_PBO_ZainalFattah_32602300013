/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.managementperpustakaan;

import java.util.ArrayList;
import java.util.List;

/**
 * Kelas Anggota merepresentasikan anggota perpustakaan dengan informasi 
 * nama, nomor anggota, alamat, dan daftar pinjaman buku yang dipinjam.
 * 
 * @author Zainal
 */
public class Anggota {
    private String nama;                    // Nama anggota
    private String nomorAnggota;            // Nomor anggota
    private String alamat;                  // Alamat anggota
    private List<Buku> daftarPinjaman;      // Daftar buku yang dipinjam oleh anggota

    /**
     * Konstruktor Anggota untuk menginisialisasi anggota baru dengan nama, nomor anggota, dan alamat.
     * 
     * @param nama Nama anggota.
     * @param nomorAnggota Nomor anggota perpustakaan.
     * @param alamat Alamat anggota.
     */
    public Anggota(String nama, String nomorAnggota, String alamat) {
        this.nama = nama;
        this.nomorAnggota = nomorAnggota;
        this.alamat = alamat;
        this.daftarPinjaman = new ArrayList<>();
    }

    /**
     * Menampilkan informasi anggota, termasuk nama, nomor anggota, alamat, 
     * dan daftar buku yang sedang dipinjam.
     */
    public void tampilkanInfoAnggota() {
        System.out.println("Nama: " + nama);
        System.out.println("Nomor Anggota: " + nomorAnggota);
        System.out.println("Alamat: " + alamat);
        System.out.println("Daftar Pinjaman: ");
        for (Buku buku : daftarPinjaman) {
            System.out.print(" -" + buku.getJudul());
        }
        System.out.println();
    }

    /**
     * Menambahkan buku ke dalam daftar pinjaman anggota.
     * 
     * @param buku Buku yang akan dipinjam oleh anggota.
     */
    public void tambahPinjaman(Buku buku) {
        daftarPinjaman.add(buku);
    }

    /**
     * Menghapus buku dari daftar pinjaman anggota.
     * 
     * @param buku Buku yang dikembalikan oleh anggota.
     */
    public void hapusPinjaman(Buku buku) {
        daftarPinjaman.remove(buku);
    }

    /**
     * Mendapatkan daftar buku yang sedang dipinjam oleh anggota.
     * 
     * @return Daftar buku yang dipinjam oleh anggota.
     */
    public List<Buku> getDaftarPinjaman() {
        return daftarPinjaman;
    }

    /**
     * Mendapatkan nomor anggota.
     * 
     * @return Nomor anggota perpustakaan.
     */
    public String getNomorAnggota() {
        return nomorAnggota;
    }

    /**
     * Mendapatkan nama anggota.
     * 
     * @return Nama anggota.
     */
    public String getNama() {
        return nama;
    }
}
