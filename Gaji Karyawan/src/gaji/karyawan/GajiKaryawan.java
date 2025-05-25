/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gaji.karyawan;

import java.util.Scanner;

/**
 *
 * @author ACER NITRO V15
 */
public class GajiKaryawan {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input golongan dan jam lembur
        System.out.print("Masukkan Golongan (A/B/C): ");
        char golongan = input.next().charAt(0);
        
        System.out.print("Masukkan Jam Lembur: ");
        int jamLembur = input.nextInt();
        
        // Variabel untuk menyimpan gaji pokok dan gaji lembur
        int gajiPokok = 0;
        int gajiLembur = 0;
        
        // Menentukan gaji pokok berdasarkan golongan
        switch(golongan) {
            case 'A':
            case 'a':
                gajiPokok = 5000000;
                break;
            case 'B':
            case 'b':
                gajiPokok = 6500000;
                break;
            case 'C':
            case 'c':
                gajiPokok = 9500000;
                break;
            default:
                System.out.println("Golongan tidak valid!");
                input.close();
                return;
        }
        
        // Menentukan gaji lembur berdasarkan jam lembur
        if (jamLembur == 1) {
            gajiLembur = (int)(gajiPokok * 0.30);
        } else if (jamLembur == 2) {
            gajiLembur = (int)(gajiPokok * 0.32);
        } else if (jamLembur == 3) {
            gajiLembur = (int)(gajiPokok * 0.34);
        } else if (jamLembur == 4) {
            gajiLembur = (int)(gajiPokok * 0.36);
        } else if (jamLembur >= 5) {
            gajiLembur = (int)(gajiPokok * 0.38);
        } else if (jamLembur == 0) {
            gajiLembur = 0;
        } else {
            System.out.println("Jam lembur tidak valid (harus >= 0)!");
            input.close();
            return;
        }
        
        // Menghitung total gaji
        int totalGaji = gajiPokok + gajiLembur;
        
        // Menampilkan output
        System.out.println("\n=== HASIL PERHITUNGAN GAJI ===");
        System.out.println("Golongan: " + golongan);
        System.out.println("Jam Lembur: " + jamLembur + " jam");
        System.out.println("Gaji Pokok: Rp. " + String.format("%,d", gajiPokok));
        System.out.println("Gaji Lembur: Rp. " + String.format("%,d", gajiLembur));
        System.out.println("Total Gaji: Rp. " + String.format("%,d", totalGaji));
        
        input.close();
    }
}