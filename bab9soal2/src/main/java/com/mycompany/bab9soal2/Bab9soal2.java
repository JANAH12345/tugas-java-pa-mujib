/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab9soal2;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Bab9soal2 {
    
        public static void main(String[] args) {
            // TODO code application logic here
            Scanner scanner = new Scanner(System.in);

            // Meminta input dari pengguna untuk nilai awal dan nilai akhir
            System.out.print("Masukan bilangan awal: ");
            int nilaiAwal = scanner.nextInt();

            System.out.print("Masukan bilangan akhir: ");
            int nilaiAkhir = scanner.nextInt();

            System.out.println("Hasil deret bilangan:");

            // Memulai dari nilai awal dan menambah 5 setiap iterasi hingga mencapai atau melebihi nilai akhir
            int nilaiSekarang = nilaiAwal;
            while (nilaiSekarang <= nilaiAkhir) {
            System.out.print(nilaiSekarang);
            nilaiSekarang += 5;

            // Menambahkan koma setelah setiap bilangan kecuali bilangan terakhir
            if (nilaiSekarang <= nilaiAkhir) {
                System.out.print(", ");
            }
            }
        }
}
