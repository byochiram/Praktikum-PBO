/*
 * MBujurSangkar.java 19/3/2024
 * Penulis : Rosidah Rahmati
 * Deskripsi : kelas yang mengimplementasikan cara menghitung luas bujur sangkar
 */

import java.util.Scanner;

class MBujurSangkar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukkan sisi bujur sangkar : ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " + sisi + " satuan adalah " + bs.hitungLuas(sisi));
        
        // Close the Scanner object
        scan.close();
    }
}

/* PERTANYAAN
 * Apa yang terjadi apablia kelas BujurSangkar tidak membuat implementasi metode abstrak yang ada pada kelas BangunDatar ? jelaskan !
 * Jika kelas BujurSangkar tidak memberikan implementasi untuk metode abstrak hitungLuas yang ada pada kelas BangunDatar, maka akan 
 * terjadi kesalahan kompilasi (compile error). Hal ini karena kelas BujurSangkar merupakan subclass dari kelas BangunDatar, yang 
 * berarti harus memberikan implementasi untuk semua metode abstrak yang dideklarasikan di kelas induknya.
 */
