/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.managementperpustakaan;

/**
  * Kelas Perpustakaan untuk mengelola daftar buku dan anggota perpustakaan,
 * termasuk fitur menambah buku, menampilkan daftar buku, menambah anggota, meminjam buku, dan mengembalikan buku.
 *
 * @author zainal
 */
import java.util.ArrayList;
import java.util.List;

/**

 */
public class Perpustakaan {
    private List<Buku> daftarBuku; // Daftar buku yang ada di perpustakaan
    private List<Anggota> daftarAnggota; // Daftar anggota perpustakaan
    
    /**
     * Konstruktor Perpustakaan untuk inisialisasi daftar buku dan daftar anggota.
     */
    public Perpustakaan() {
        daftarBuku = new ArrayList<>();
        daftarAnggota = new ArrayList<>();
    }
    
    /**
     * Menambahkan buku baru ke dalam daftar buku perpustakaan.
     * 
     * @param buku Buku yang ingin ditambahkan ke perpustakaan.
     */
    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }
    
    /**
     * Menampilkan daftar buku yang tersedia di perpustakaan.
     * Hanya menampilkan buku yang berstatus "tersedia".
     */
    public void daftarBukuTersedia() {
        System.out.println("Buku Fiksi:");
        for (Buku buku : daftarBuku) {
            // Mengecek apakah buku adalah instance dari BukuFiksi dan statusnya "tersedia"
            if (buku instanceof BukuFiksi && buku.getStatus().equals("tersedia")) {
                ((BukuFiksi) buku).tampilkanInfoBukuFiksi();
            }
        }

        System.out.println("Buku Non Fiksi:");
        for (Buku buku : daftarBuku) {
            // Mengecek apakah buku adalah instance dari BukuNonFiksi dan statusnya "tersedia"
            if (buku instanceof BukuNonFiksi && buku.getStatus().equals("tersedia")) {
                ((BukuNonFiksi) buku).tampilkanInfoBukuNonFiksi();
            }
        }

        System.out.println();
    }
    
    /**
     * Menampilkan daftar anggota perpustakaan.
     * Menampilkan informasi anggota.
     */
    public void DaftarAnggota(){
        System.out.println("Daftar Anggota: ");
        for(Anggota anggota : daftarAnggota){
            anggota.tampilkanInfoAnggota();
            System.out.print("\n");
        }
    }
    
    /**
     * Menambahkan anggota baru ke dalam daftar anggota perpustakaan.
     * 
     * @param anggota Anggota baru yang ingin ditambahkan ke perpustakaan.
     */
    public void tambahAnggota(Anggota anggota) {
        daftarAnggota.add(anggota);
    }
    
    /**
     * Meminjam buku berdasarkan nomor anggota dan ISBN buku.
     * Jika buku tersedia dan anggota ditemukan, buku akan ditambahkan ke daftar pinjaman anggota.
     * 
     * @param nomorAnggota Nomor anggota yang ingin meminjam buku.
     * @param isbn ISBN buku yang ingin dipinjam.
     */
    public void pinjamBuku(String nomorAnggota, String isbn) {
        Anggota anggota = cariAnggota(nomorAnggota);
        Buku buku = cariBuku(isbn);

        if (anggota != null && buku != null && buku.getStatus().equals("tersedia")) {
            anggota.tambahPinjaman(buku);
            buku.setStatus("dipinjam");
            System.out.println("Buku '" + buku.getJudul() + "' berhasil dipinjam oleh " + anggota.getNama() + ".");
        } else {
            System.out.println("Peminjaman gagal. Pastikan anggota dan buku tersedia.");
        }
    }
    
    /**
     * Mengembalikan buku yang telah dipinjam berdasarkan nomor anggota dan ISBN buku.
     * Jika buku ada dalam daftar pinjaman anggota, status buku akan dikembalikan menjadi "tersedia".
     * 
     * @param nomorAnggota Nomor anggota yang mengembalikan buku.
     * @param isbn ISBN buku yang ingin dikembalikan.
     */
    public void kembalikanBuku(String nomorAnggota, String isbn) {
        Anggota anggota = cariAnggota(nomorAnggota);

        if (anggota != null) {
            Buku buku = anggota.getDaftarPinjaman().stream().filter(b -> b.getIsbn().equals(isbn)).findFirst().orElse(null);
            if (buku != null) {
                anggota.hapusPinjaman(buku);
                buku.setStatus("tersedia");
                System.out.println("Buku '" + buku.getJudul() + "' telah dikembalikan.");
            } else {
                System.out.println("Buku tidak ditemukan dalam daftar pinjaman anggota.");
            }
        } else {
            System.out.println("Anggota tidak ditemukan.");
        }
    }

    /**
     * Mencari anggota berdasarkan nomor anggota.
     * 
     * @param nomorAnggota Nomor anggota yang ingin dicari.
     * @return Objek Anggota jika ditemukan, null jika tidak ditemukan.
     */
    private Anggota cariAnggota(String nomorAnggota) {
        return daftarAnggota.stream().filter(a -> a.getNomorAnggota().equals(nomorAnggota)).findFirst().orElse(null);
    }

    /**
     * Mencari buku berdasarkan ISBN.
     * 
     * @param isbn ISBN buku yang ingin dicari.
     * @return Objek Buku jika ditemukan, null jika tidak ditemukan.
     */
    private Buku cariBuku(String isbn) {
        return daftarBuku.stream().filter(b -> b.getIsbn().equals(isbn)).findFirst().orElse(null);
    }
}
