/*  
*   Nama      = MPrismaSegitiga.java 2/3/2024    
*   Penulis   = Rosidah Rahmati 24060122140121
*   Deskripsi = Program class MPrismaSegitiga
*/

public class MPrismaSegitiga {

    public static void main(String[] args) {
        // Membuat objek Segitiga
        Segitiga alas = new Segitiga(3, 4);

        // Membuat objek PrismaSegitiga
        PrismaSegitiga prismaSegitiga = new PrismaSegitiga(alas, 5);

        // Menghitung volume dan luas permukaan
        double volume = prismaSegitiga.hitungVolume();
        double luasPermukaan = prismaSegitiga.hitungLuasPermukaan();

        // Menampilkan hasil
        System.out.println("Volume Prisma Segitiga: " + volume);
        System.out.println("Luas Permukaan Prisma Segitiga: " + luasPermukaan);
    }
}