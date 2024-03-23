/*  
*   Nama      = Rosidah Rahmati 
*   NIM       = 24060122140121
*   Nama File = Main.java 22/3/2024 
*   Deskripsi = Program class Main
*/

package bk.main;

import bk.buku.Buku;
import bk.bukuFiksi.*;
import bk.bukunonFiksi.*;

public class Main {

    public static void main(String[] args) {
        Buku buku1 = new bukuFiksi("Mimpi-mimpi Lintang", "Dee Lestari", "2018", 352, 95000, "Fantasi, Romantis");
        Buku buku2 = new bukuNovel("Harry Potter and the Philosopher's Stone", "J.K. Rowling", "1997", 352, 100000, "Fantasi, Petualangan");
        Buku buku3 = new bukuNonFiksi("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", "2014", 443, 175000, "Sejarah Manusia, Antropologi, Sosiologi");
        Buku buku4 = new bukuAkademik("Computer Networking: A Top-Down Approach", "James F. Kurose, Keith W. Ross", "2016", 864, 600000, "Jaringan Komputer, Teknologi Informasi, Ilmu Komputer");
        
        System.out.println("**Buku Fiksi**");
        buku1.view();
        System.out.println();
        
        System.out.println("**Buku Novel**");
        buku2.view();
        System.out.println();
        
        System.out.println("**Buku Non-Fiksi**");
        buku3.view();
        System.out.println();
        
        System.out.println("**Buku Akademik**");
        buku4.view();
        System.out.println();
        }
}