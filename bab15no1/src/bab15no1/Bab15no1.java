/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab15no1;

/**
 *
 * @author USER
 */
public class Bab15no1 {

    // Method pertambahan
    public int pertambahan(int a, int b) {
        return a + b;
    }
    
    // Method pengurangan
    public int pengurangan(int a, int b) {
        return a - b;
    }
    
    // Method pembagian
    public float pembagian(float a, float b) {
        if (b == 0) {
            throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan");
        }
        return a / b;
    }
    
    // Method perkalian
    public float perkalian(float a, float b) {
        return a * b;
    }

    // Method utama untuk menguji metode Bab15soall1
    public static void main(String[] args) {
        // Membuat objek Bab15soall1
        Bab15no1 obj = new Bab15no1();
        
        // Menampilkan hasil pertambahan
        System.out.println("Pertambahan: " + obj.pertambahan(55, 5));
        
        // Menampilkan hasil pengurangan
        System.out.println("Pengurangan: " + obj.pengurangan(130, 75));
        
        // Menampilkan hasil pembagian
        try {
            System.out.println("Pembagian: " + obj.pembagian(65.0f, 5.0f));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        
        // Menampilkan hasil perkalian
        System.out.println("Perkalian: " + obj.perkalian(8.0f, 8.0f));
    }
    
}
