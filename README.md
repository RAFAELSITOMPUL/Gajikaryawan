✅ Cara Menambahkan README.md di NetBeans:
1.Buka Proyekmu di NetBeans
Buka GajiKaryawan lewat menu File > Open Project dan pilih foldernya.
2.Tambahkan File Baru
- Klik kanan pada root folder project (biasanya ada ikon folder dan nama project kamu).
- Pilih New > Other...
- Pilih Other > Empty File, klik Next
- Masukkan nama file: README.md
- Klik Finish
3.Salin dan Tempel Isi README
Tempelkan isi berikut ke dalam file README.md yang baru kamu buat:

# GajiKaryawan

Aplikasi sederhana berbasis Java untuk menghitung total gaji karyawan berdasarkan golongan dan jumlah jam lembur.

## 📌 Deskripsi

Program ini dirancang untuk:
- Mengambil input golongan karyawan (`A`, `B`, atau `C`)
- Mengambil input jumlah jam lembur
- Menghitung gaji pokok berdasarkan golongan
- Menghitung gaji lembur berdasarkan jam lembur
- Menampilkan total gaji akhir

## 📋 Ketentuan Gaji

### Gaji Pokok Berdasarkan Golongan:
| Golongan | Gaji Pokok       |
|----------|------------------|
| A        | Rp. 5.000.000    |
| B        | Rp. 6.500.000    |
| C        | Rp. 9.500.000    |

### Persentase Gaji Lembur:
| Jam Lembur | Tambahan (%) |
|------------|---------------|
| 1 jam      | 30%           |
| 2 jam      | 32%           |
| 3 jam      | 34%           |
| 4 jam      | 36%           |
| ≥ 5 jam    | 38%           |

## ▶️ Cara Menjalankan

1. **Buka project ini di NetBeans**
2. **Jalankan file `GajiKaryawan.java` dengan klik kanan > Run File**

## 💻 Contoh Output

Masukkan Golongan (A/B/C): B
Masukkan Jam Lembur: 2

=== HASIL PERHITUNGAN GAJI ===
Golongan: B
Jam Lembur: 2 jam
Gaji Pokok: Rp. 6500000
Gaji Lembur: Rp. 2080000
Total Gaji: Rp. 8580000



## 🙋‍♂️ Author

- [RAFAELSITOMPUL](https://github.com/RAFAELSITOMPUL)

## 📄 License

Proyek ini bebas digunakan untuk pembelajaran dan pengembangan pribadi.

4. Simpan File
Tekan Ctrl + S atau klik File > Save.

🔁 Upload ke GitHub
Jika kamu ingin README.md tampil di GitHub repo kamu:
1.Buka File Explorer, salin file README.md dari folder proyek.
2.Masuk ke GitHub Desktop atau gunakan Git via Terminal:

git add README.md
git commit -m "Menambahkan README.md"
git push origin main

🧠 Syarat Awal
- Kamu sudah menginstal GitHub Desktop (kalau belum, download di desktop.github.com)
- Kamu sudah login akun GitHub di GitHub Desktop
- Proyek GajiKaryawan sudah pernah kamu push ke GitHub (seperti di repo: https://github.com/RAFAELSITOMPUL/Gajikaryawan)

  ✅ Langkah Upload README.md dengan GitHub Desktop
  1. Buka GitHub Desktop
  - Jalankan GitHub Desktop
  - Pilih Repository kamu (Gajikaryawan) di bagian kiri atas
 
  2. Tambahkan File README.md ke Folder Project
  - Buka folder proyek kamu di File Explorer
  - Simpan file README.md (yang kamu salin dari atas) ke dalam folder utama project (selevel dengan folder src/)

  3. Deteksi Perubahan di GitHub Desktop
  - GitHub Desktop akan langsung mendeteksi perubahan README.md
  - Di bagian bawah (kolom Summary), isi:

    Menambahkan file README.md

  - Klik Commit to main


  4. Push ke GitHub
  - Setelah commit, klik tombol Push origin di kanan atas
  - Tunggu proses selesai
 
    🚀 Hasilnya
    Sekarang buka repo kamu di browser:
👉 https://github.com/RAFAELSITOMPUL/Gajikaryawan

Kamu akan melihat README.md langsung tampil sebagai halaman utama!
