/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab14soal1;

/**
 *
 * @author USER
 */
public class Bab14soal1 {
        public static void main(String[] args) {
        AbstrakHewan kucing = new Kucing();
        kucing.suara(); // Panggil method abstract yang diimplementasikan
        kucing.suara2(); // Panggil method konkrit dari parent class

        AbstrakHewan anjing = new Anjing();
        anjing.suara(); // Panggil method abstract yang diimplementasikan
        anjing.suara2(); // Panggil method konkrit dari parent class
    }
}

abstract class AbstrakHewan {
    public abstract void suara();

    public void suara2() {
        System.out.println("Ini method konkrit dari parent class");
    }
}

class Kucing extends AbstrakHewan {
    @Override
    public void suara() {
        System.out.println("Kucing bersuara: Meow");
    }
}

class Anjing extends AbstrakHewan {
    @Override
    public void suara() {
        System.out.println("Anjing bersuara: Guk Guk");
    }
}