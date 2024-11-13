## Identitas Mahasiswa
- Nama: Zainal Fattah
- NIM


# Aplikasi Manajemen Perpustakaan

Aplikasi ini adalah aplikasi manajemen perpustakaan sederhana yang dikembangkan dengan menggunakan konsep Object-Oriented Programming (OOP) dalam bahasa pemrograman Java. Aplikasi ini membantu mengelola data buku, anggota perpustakaan, menampilkan daftar buku dan anggota, serta proses peminjaman dan pengembalian buku melalui antarmuka teks interaktif.

## Fitur Utama
1. **Tambah Buku** - Menambahkan buku baru ke dalam perpustakaan.
2. **Tambah Anggota** - Mendaftarkan anggota perpustakaan baru.
3. **Peminjaman Buku** - Meminjam buku untuk anggota tertentu jika buku tersedia.
4. **Pengembalian Buku** - Mengembalikan buku yang telah dipinjam anggota.
5. **Daftar Buku** - Menampilkan daftar buku yang tersedia.
6. **Daftar Anggota** - Menampilkan informasi anggota beserta buku yang dipinjam.
7. **Exit** - Keluar dari program.

## Struktur Kelas
Aplikasi ini memiliki 4 kelas utama:
- **Buku** - Merepresentasikan buku dalam perpustakaan dengan atribut seperti `judul`, `pengarang`, `tahunTerbit`, `ISBN`, `status`. dan terdapat pewarisan Kelas Buku yaitu: BukuFiksi dan BukuNonFiksi
- **Anggota** - Merepresentasikan anggota perpustakaan dengan atribut `nama`, `nomorAnggota`, `alamat`, dan `daftarPinjaman`.
- **Perpustakaan** - Merepresentasikan perpustakaan yang mengelola daftar buku dan anggota. Menyediakan metode untuk menambah buku, menambah anggota, meminjam buku, dan mengembalikan buku.
- **Main** - Merepresentasikan antarmuka berbasis teks (console) yang interaktif dan mudah digunakan dan terdapat 7 Menu.

## Persyaratan Fungsional
Aplikasi ini memenuhi persyaratan fungsional berikut:
- Menambah buku baru ke dalam perpustakaan.
- Mendaftarkan anggota perpustakaan baru.
- Meminjam buku untuk anggota tertentu.
- Mengembalikan buku yang telah dipinjam.
- Menampilkan daftar buku yang tersedia.
- Menampilkan informasi anggota beserta
buku yang dipinjam.
- Keluar

## Persyaratan Teknis
1. **Penerapan Konsep OOP**: 
   - Menggunakan enkapsulasi dengan akses modifier yang sesuai (private, public).
   - Kelas `Buku` dapat diperluas untuk memiliki turunan seperti `BukuDigital` atau `BukuReferensi`.
2. **Antarmuka Pengguna**:
   - Antarmuka berbasis teks yang interaktif.
   - Menu untuk mengakses fungsi-fungsi utama aplikasi.

## Cara Menjalankan Aplikasi
1. Pastikan Java Development Kit (JDK) telah terinstall.
2. Clone repository ini dan buka direktori proyek.
3. Jalankan perintah berikut di terminal untuk menjalankan aplikasi:
   ```bash
   javac -d bin src/com/mycompany/managementperpustakaan/*.java
   java -cp bin com.mycompany.managementperpustakaan.Main
