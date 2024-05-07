/*
 * KontrolSenjata.java 7/5/2024
 * Penulis : Rosidah Rahmati 
 * NIM : 24060122140121
 * Lab : B2
 * Deskripsi : Program class KontrolSenjata
 */

package latihanMedium;

/**
 *
 * @author USER
 */
public class KontrolSenjata extends Senjata {
    private Senjata senjata;
    
    public KontrolSenjata(Senjata s){
        super(s.getBunyi());
        this.senjata = s;
    }
    
    public boolean isAdaPeluru() {
        if (this.senjata.getPeluru() <= 0) {
            return false;
        }
        else {
            return true;
        }
    }
    
    public void isiPeluru(int jumPeluru) {
        this.senjata.setPeluru(jumPeluru);
        System.out.println(">> Peluru berhasil ditambah: " + jumPeluru);
    }
    
    public void menembak(int jumlah) {
        System.out.println(">> Siap menembak " + jumlah + " kali");
        if (this.senjata.getPeluru() == 0) {
            System.out.println("Peluru Habis");
        }
        else {
            for(int i = 0; i< jumlah; i++) {
                if(this.senjata.getPeluru() > 0) {
                    System.out.println(this.senjata.getBunyi());
                    this.senjata.setPeluru(this.senjata.getPeluru()-1);
                }
                else {
                    System.out.println("Gagal tembak, Peluru habis");
                }
            }
            System.out.println(">> Peluru sisa: " + this.senjata.getPeluru());
        }
    }

    public String menusuk() {
        return "";
    }
    
    public void pasangBayonet() {
        
    }
}
