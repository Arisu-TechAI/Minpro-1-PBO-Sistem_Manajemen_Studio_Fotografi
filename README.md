# Mini Project 1 PBO - Sistem Manajemen Studio Fotografi

Program ini dibuat untuk memenuhi tugas Mini Project 1 mata kuliah Pemrograman Berbasis Objek (PBO) program studi S1 Sistem Informasi. Program ini mengimplementasikan konsep *Object-Oriented Programming* (OOP) menggunakan bahasa Java dan dikembangkan melalui Apache NetBeans.

## 1. Deskripsi Singkat Program
**Sistem Manajemen Studio Fotografi** adalah program berbasis *Console* (CLI) (berbasis teks) yang dirancang untuk membantu pihak studio dalam mengelola data pemesanan jasa fotografi dari pelanggan. 

Program ini menjalankan fungsi CRUD (*Create, Read, Update, Delete*) dengan menyimpan data sementara di dalam memori menggunakan struktur data `ArrayList`. Terdapat tiga entitas utama yang saling berelasi di dalam sistem ini, yaitu:
*   **JenisPaket**: Menyimpan opsi layanan jasa yang tersedia (misal: Paket Single Person, Couple, Wisuda, Wedding) beserta harganya.
*   **Client**: Menyimpan informasi identitas pelanggan yang memesan.
*   **Transaksi**: Menggabungkan entitas Client dan JenisPaket untuk menghasilkan riwayat pemesanan yang utuh, lengkap dengan tanggal sesi dan status pembayaran.

## 2. Penjelasan Alur Program
Saat program `Main.java` (sebagai *entry point*) dijalankan, program akan menampilkan Menu Utama. Alur interaksi program berjalan sebagai berikut:

1.  **Inisialisasi Data Awal:** Program secara otomatis memuat daftar paket fotografi yang tersedia ke dalam sistem melalui *constructor* di class `ManajemenPemesanan`.
2.  **Perulangan Menu (Looping):** Program menggunakan perulangan `do-while` sehingga Menu Utama akan terus muncul setelah sebuah aksi selesai dilakukan, dan baru akan berhenti jika *user* memilih menu "Keluar".
3.  **Pemilihan Menu (Percabangan):** Menggunakan struktur `switch-case` untuk menangani inputan angka dari *user*:
    *   **Menu 1 (Tambah Pesanan / Create):** User diminta menginput ID Transaksi, identitas Client, memilih Kode Paket, dan tanggal sesi. Data ini kemudian digabungkan menjadi satu objek `Transaksi` dan disimpan ke `ArrayList`.
    *   **Menu 2 (Lihat Daftar Pesanan / Read):** Program menggunakan perulangan `for-each` untuk menampilkan seluruh riwayat transaksi yang tersimpan di dalam `ArrayList`.
    *   **Menu 3 (Lunasi Pembayaran / Update):** User memasukkan ID Transaksi. Program akan mencari ID tersebut di `ArrayList` dan mengubah atribut status pembayarannya dari "Belum Lunas" menjadi "Lunas".
    *   **Menu 4 (Batalkan Pesanan / Delete):** User memasukkan ID Transaksi. Program akan mencari dan menghapus objek transaksi tersebut secara permanen dari `ArrayList`.
    *   **Menu 5 (Keluar):** Menghentikan perulangan dan menutup program.

## 3. Penjelasan Letak Penerapan Nilai Tambah
Program ini telah menerapkan kaidah pilar OOP, khususnya dalam penggunaan **Access Modifier** dan **Encapsulation**. Penerapannya dapat dilihat secara penuh pada class model/entitas, yaitu `Client.java`, `JenisPaket.java`, dan `Transaksi.java`.

*   **Penerapan Access Modifier:**
    *   Semua variabel/atribut pada class entitas dideklarasikan dengan access modifier `private` (contoh: `private String namaClient;`). Ini memastikan data tidak dapat diakses atau diubah sembarangan dari luar class.
    *   *Constructor* dan *Method* dideklarasikan dengan access modifier `public` agar dapat dipanggil dan digunakan oleh class lain (seperti class `ManajemenPemesanan` dan `Main`).
*   **Penerapan Encapsulation:**
    *   Data di dalam program dibungkus (di-enkapsulasi) dengan rapi. Untuk membaca atau memanipulasi data atribut yang di-set `private` tadi, program wajib melewati method *Getter* (contoh: `getNamaClient()`) dan *Setter* (contoh: `setStatusPembayaran()`). 
    *   Pendekatan ini memberikan kontrol penuh terhadap bagaimana data diisi dan diambil, sesuai dengan standar keamanan dan kebersihan kode dalam *Object-Oriented Programming*.
