/*  
*   Nama      = PrismaSegitiga.java 2/3/2024    
*   Penulis   = Rosidah Rahmati 24060122140121
*   Deskripsi = Program class PrismaSegitiga
*/

public class PrismaSegitiga {

    private Segitiga alas;
    private double tinggiPrisma;

    public PrismaSegitiga(Segitiga alas, double tinggiPrisma) {
        this.alas = alas;
        this.tinggiPrisma = tinggiPrisma;
    }

    public Segitiga getAlas() {
        return alas;
    }

    public double getTinggiPrisma() {
        return tinggiPrisma;
    }

    public double hitungVolume() {
        return alas.hitungLuas() * tinggiPrisma;
    }

    public double hitungLuasPermukaan() {
        return (2 * alas.hitungLuas() + ((alas.getSisiMiring() + alas.getAlas() + alas.getTinggi()) * tinggiPrisma));
    }
}