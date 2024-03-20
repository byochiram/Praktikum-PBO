/*
 * Lingkaran.java 19/3/2024
 * Penulis : Rosidah Rahmati
 * Deskripsi : kelas implementasi IArea berupa cara menghitung luas lingkaran 
 */

import static java.lang.Math.PI;

public class Lingkaran  implements IArea {
    private double jejari;

    public Lingkaran (double r){
        jejari = r;
    }

    public double hitungLuas() {
        return PI*jejari*jejari;
    }
}
