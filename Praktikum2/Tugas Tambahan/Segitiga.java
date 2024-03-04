/*  
*   Nama      = Segitiga.java 2/3/2024    
*   Penulis   = Rosidah Rahmati 24060122140121
*   Deskripsi = Program class Segitiga
*/

public class Segitiga {

    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getAlas() {
        return alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double hitungLuas() {
        return (alas * tinggi) / 2;
    }

    public double getSisiMiring() {
        return Math.sqrt(Math.pow(getAlas() / 2, 2) + Math.pow(getTinggi(), 2));
    }
}