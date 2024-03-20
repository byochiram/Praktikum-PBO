/*
 * MLingkaran.java 19/3/2024
 * Penulis : Rosidah Rahmati
 * Deskripsi : implementasi cara menghitung luas lingkaran 
 */

/* Input jejari tidak dari pengguna */
/* 
public class MLingkaran {
    public static void main(String[] args){
        Lingkaran l = new Lingkaran(10.2);
        System.out.println("Luas Lungkaran dengan jejari 10.2 satuan adalah " + l.hitungLuas());
    }
}
*/

/* Input jejari dari pengguna */ 
import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan panjang jejari lingkaran: ");
        double jejari = scanner.nextDouble();
        
        Lingkaran l = new Lingkaran(jejari);
        System.out.println("Luas Lingkaran dengan jejari " + jejari + " satuan adalah " + l.hitungLuas());
        
        scanner.close(); 
    }
}
