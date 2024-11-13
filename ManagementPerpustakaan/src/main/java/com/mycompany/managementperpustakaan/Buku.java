/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.managementperpustakaan;

/**
 * Kelas Buku merepresentasikan sebuah buku dalam perpustakaan
 * dengan informasi tentang judul, pengarang, tahun terbit, ISBN, dan status ketersediaan.
 * 
 * Kelas ini menjadi superclass untuk jenis buku lainnya seperti BukuFiksi dan BukuNonFiksi.
 * 
 * @author Zainal
 */
public class Buku {
    private String judul;         // Judul buku
    private String pengarang;     // Pengarang buku
    private int tahunTerbit;      // Tahun terbit buku
    private String isbn;          // ISBN buku
    private String status;        // Status ketersediaan buku ("tersedia" atau "dipinjam")

    /**
     * Konstruktor Buku untuk menginisialisasi buku baru dengan judul, pengarang, tahun terbit, dan ISBN.
     * Status awal buku adalah "tersedia".
     * 
     * @param judul Judul buku.
     * @param pengarang Nama pengarang buku.
     * @param tahunTerbit Tahun terbit buku.
     * @param isbn ISBN buku.
     */
    public Buku(String judul, String pengarang, int tahunTerbit, String isbn) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.isbn = isbn;
        this.status = "tersedia";
    }

    /**
     * Menampilkan informasi buku, termasuk judul, pengarang, tahun terbit, ISBN, dan status ketersediaan.
     */
    public void tampilkanInfoBuku() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("ISBN: " + isbn);
        System.out.println("Status: " + status);
    }

    /**
     * Mendapatkan status ketersediaan buku.
     * 
     * @return Status ketersediaan buku ("tersedia" atau "dipinjam").
     */
    public String getStatus() {
        return status;
    }

    /**
     * Mengatur status ketersediaan buku.
     * 
     * @param status Status baru untuk ketersediaan buku ("tersedia" atau "dipinjam").
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Mendapatkan ISBN buku.
     * 
     * @return ISBN buku.
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Mendapatkan judul buku.
     * 
     * @return Judul buku.
     */
    public String getJudul() {
        return judul;
    }
}

/**
 * Kelas BukuFiksi adalah subclass dari Buku, yang merepresentasikan buku fiksi dalam perpustakaan.
 * BukuFiksi memiliki atribut tambahan yaitu genre untuk mengidentifikasi genre dari buku fiksi tersebut.
 * 
 * @see Buku
 */
class BukuFiksi extends Buku {
    private String genre;  // Genre dari buku fiksi, misalnya: "Fantasi", "Sci-Fi", dll.

    /**
     * Konstruktor untuk menginisialisasi BukuFiksi dengan judul, pengarang, tahun terbit, ISBN, dan genre.
     *
     * @param judul Judul buku fiksi.
     * @param pengarang Nama pengarang buku.
     * @param tahunTerbit Tahun terbit buku.
     * @param isbn ISBN buku.
     * @param genre Genre dari buku fiksi.
     */
    public BukuFiksi(String judul, String pengarang, int tahunTerbit, String isbn, String genre) {
        super(judul, pengarang, tahunTerbit, isbn); // Memanggil konstruktor superclass Buku
        this.genre = genre;
    }

    /**
     * Mendapatkan genre dari buku fiksi.
     *
     * @return Genre buku fiksi.
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Menampilkan informasi buku fiksi, termasuk informasi dari superclass Buku
     * serta genre dari buku fiksi.
     */
    public void tampilkanInfoBukuFiksi() {
        super.tampilkanInfoBuku(); // Memanggil method tampilkanInfoBuku() dari superclass Buku
        System.out.println("Genre: " + genre);
    }
}

/**
 * Kelas BukuNonFiksi adalah subclass dari Buku, yang merepresentasikan buku non-fiksi dalam perpustakaan.
 * BukuNonFiksi memiliki atribut tambahan yaitu topik untuk menunjukkan topik dari buku non-fiksi tersebut.
 * 
 * @see Buku
 */
class BukuNonFiksi extends Buku {
    private String topik;  // Topik dari buku non-fiksi, misalnya: "Sains", "Sejarah", dll.

    /**
     * Konstruktor untuk menginisialisasi BukuNonFiksi dengan judul, pengarang, tahun terbit, ISBN, dan topik.
     *
     * @param judul Judul buku non-fiksi.
     * @param pengarang Nama pengarang buku.
     * @param tahunTerbit Tahun terbit buku.
     * @param isbn ISBN buku.
     * @param topik Topik dari buku non-fiksi.
     */
    public BukuNonFiksi(String judul, String pengarang, int tahunTerbit, String isbn, String topik) {
        super(judul, pengarang, tahunTerbit, isbn); // Memanggil konstruktor superclass Buku
        this.topik = topik;
    }

    /**
     * Menampilkan informasi buku non-fiksi, termasuk informasi dari superclass Buku
     * serta topik dari buku non-fiksi.
     */
    public void tampilkanInfoBukuNonFiksi() {
        super.tampilkanInfoBuku(); // Memanggil method tampilkanInfoBuku() dari superclass Buku
        System.out.println("Topik: " + topik);
    }
}