# GajiKaryawan

Aplikasi sederhana berbasis Java untuk menghitung total gaji karyawan berdasarkan **golongan** dan **jam lembur**.

## Fitur

- Input golongan karyawan (`A`, `B`, atau `C`)
- Input jumlah jam lembur
- Perhitungan gaji pokok berdasarkan golongan:
  - Golongan A: Rp. 5.000.000
  - Golongan B: Rp. 6.500.000
  - Golongan C: Rp. 9.500.000
- Perhitungan gaji lembur berdasarkan persentase:
  - 1 jam: 30%
  - 2 jam: 32%
  - 3 jam: 34%
  - 4 jam: 36%
  - 5 jam atau lebih: 38%
- Menampilkan hasil berupa:
  - Golongan
  - Jam lembur
  - Gaji pokok
  - Gaji lembur
  - Total gaji

## Cara Menjalankan

1. Pastikan Java Development Kit (JDK) telah terinstal di komputer Anda.
2. Simpan file `GajiKaryawan.java` dalam folder `gaji/karyawan/`.
3. Buka terminal atau command prompt, lalu compile dan jalankan:

```bash
javac gaji/karyawan/GajiKaryawan.java
java gaji.karyawan.GajiKaryawan


4. Masukkan golongan dan jam lembur saat diminta.
Contoh Output

Masukkan Golongan (A/B/C): B
Masukkan Jam Lembur: 2

=== HASIL PERHITUNGAN GAJI ===
Golongan: B
Jam Lembur: 2 jam
Gaji Pokok: Rp. 6500000
Gaji Lembur: Rp. 2080000
Total Gaji: Rp. 8580000


Lisensi

Jika kamu ingin saya tambahkan badge GitHub, informasi penulis, atau instruksi tambahan lainnya, tinggal beri tahu saja!
