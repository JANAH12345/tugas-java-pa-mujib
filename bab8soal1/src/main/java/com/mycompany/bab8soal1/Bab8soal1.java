/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab8soal1;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Bab8soal1 {
    public class PertambahanLimaBerurut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input nilai awal dan nilai akhir dari pengguna
        System.out.print("Nilai Awal ?: ");
        int nilaiAwal = scanner.nextInt();
        
        System.out.print("Nilai Akhir ?: ");
        int nilaiAkhir = scanner.nextInt();
        
        System.out.println("Hasilnya :");
        
        // Loop untuk menampilkan bilangan dengan pertambahan 5 dan menambahkan nomor urut
        int nomorUrut = 1;
        for (int i = nilaiAwal; i <= nilaiAkhir; i += 5) {
            System.out.println(nomorUrut + ". " + i);
            nomorUrut++;
        }
        
        scanner.close();
    }
}
    }

