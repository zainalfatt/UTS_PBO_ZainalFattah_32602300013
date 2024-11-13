/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.managementperpustakaan;

import java.util.Scanner;

/**
 * Main class untuk menjalankan aplikasi perpustakaan.
 * Program ini memungkinkan pengguna untuk menambahkan buku dan anggota,
 * melakukan peminjaman dan pengembalian buku, serta melihat daftar buku
 * yang tersedia atau yang sedang dipinjam.
 * 
 * @author zainal
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();

        int pilihan = 0;
        while (pilihan != 7) {
            // Menampilkan menu utama
            System.out.println("\n--- Menu Perpustakaan ---");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tambah Anggota");
            System.out.println("3. Peminjaman Buku");
            System.out.println("4. Pengembalian Buku");
            System.out.println("5. Daftar Buku Tersedia");
            System.out.println("6. Menampilkan Daftar Anggota");
            System.out.println("7. Keluar");
            System.out.print("Pilih opsi (1-7): ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            // Menjalankan fungsi sesuai dengan pilihan pengguna
            if (pilihan == 1){
                // Tambah Buku
                System.out.print("Masukkan Judul Buku: ");
                String judul = scanner.nextLine();
                System.out.print("Masukkan Pengarang: ");
                String pengarang = scanner.nextLine();
                System.out.print("Masukkan Tahun Terbit: ");
                int tahunTerbit = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Masukkan ISBN: ");
                String isbn = scanner.nextLine();
                System.out.print("Apa Tipe Bukunnya?  Fiksi/NonFiksi: ");
                String tipeBuku = scanner.nextLine();
                
                if(tipeBuku.toLowerCase().equals("fiksi")){
                    System.out.print("Masukan Genre Buku: ");
                    String genre = scanner.nextLine();
                    BukuFiksi buku = new BukuFiksi(judul, pengarang, tahunTerbit, isbn, genre); // Menambahkan Buku FIksi
                    perpustakaan.tambahBuku(buku);
                    System.out.println("Buku berhasil ditambahkan.");
                }else if(tipeBuku.toLowerCase().equals("nonfiksi")){
                    System.out.print("Masukan Topik Buku: ");
                    String topik = scanner.nextLine();
                    BukuNonFiksi buku = new BukuNonFiksi(judul, pengarang, tahunTerbit, isbn, topik);//Menambahkan Buku Non Fiksi
                    perpustakaan.tambahBuku(buku);
                    System.out.println("Buku berhasil ditambahkan.");
                }else{
                    System.out.println("Tipe Buku Tidak Tersedia!");
                }

            } else if (pilihan == 2) {
                // Tambah Anggota
                System.out.print("Masukkan Nama Anggota: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan Nomor Anggota: ");
                String nomorAnggota = scanner.nextLine();
                System.out.print("Masukkan Alamat: ");
                String alamat = scanner.nextLine();

                Anggota anggota = new Anggota(nama, nomorAnggota, alamat);
                perpustakaan.tambahAnggota(anggota);
                System.out.println("Anggota berhasil ditambahkan.");

            } else if (pilihan == 3) {
                // Peminjaman Buku
                System.out.print("Masukkan Nomor Anggota: ");
                String nomorAnggota = scanner.nextLine();
                System.out.print("Masukkan ISBN Buku yang Ingin Dipinjam: ");
                String isbn = scanner.nextLine();

                perpustakaan.pinjamBuku(nomorAnggota, isbn);

            } else if (pilihan == 4) {
                // Pengembalian Buku
                System.out.print("Masukkan Nomor Anggota: ");
                String nomorAnggota = scanner.nextLine();
                System.out.print("Masukkan ISBN Buku yang Ingin Dikembalikan: ");
                String isbn = scanner.nextLine();

                perpustakaan.kembalikanBuku(nomorAnggota, isbn);

            } else if (pilihan == 5) {
                // Menampilkan daftar buku yang tersedia
                System.out.println("\nDaftar Buku Tersedia:");
                perpustakaan.daftarBukuTersedia();

            } else if (pilihan == 6) {
                //Menampilkan informasi anggota beserta buku yang dipinjam.
                perpustakaan.DaftarAnggota();
                
            }else if (pilihan == 7) {
                // Keluar dari program
                System.out.println("Terima kasih telah menggunakan aplikasi perpustakaan.");
            } else {
                // Menampilkan pesan jika pilihan tidak valid
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
        scanner.close();
    }
}
