/*
 * TestSenjata.java 7/5/2024
 * Penulis : Rosidah Rahmati 
 * NIM : 24060122140121
 * Lab : B2
 * Deskripsi : Main program class TestSenjata
 */

package latihanMedium;

/**
 *
 * @author USER
 */
public class TestSenjata {
    public static void main(String[] args) {
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");
        KontrolSenjata kontrolAK47 = new KontrolSenjata(ak47);
        KontrolSenjata kontrolM16 = new KontrolSenjata(m16);
        
        kontrolAK47.menembak(2);
        kontrolAK47.isiPeluru(3);
        kontrolAK47.menembak(5);
        
        System.out.println("===============================");
        
        kontrolM16.menembak(1);
        kontrolM16.isiPeluru(5);
        kontrolM16.menembak(2);
    }  
}
