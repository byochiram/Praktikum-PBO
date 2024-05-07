/*
 * Senjata.java 7/5/2024
 * Penulis : Rosidah Rahmati 
 * NIM : 24060122140121
 * Lab : B2
 * Deskripsi : Program class Senjata
 */

package latihanVeryEasy;

/**
 *
 * @author USER
 */
public class Senjata {
    private String bunyi;
    private int peluru;
    
    public Senjata(String bunyi){
        this.bunyi = bunyi;
    }
    
    public String getBunyi() {
        return bunyi;
    }
    
    public int getPeluru() {
        return peluru;
    }
    
    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }
    
    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }
    
    public void menembak() {
        System.out.println(this.getBunyi());
        this.setPeluru(getPeluru()-1);
        System.out.println("Sisa Peluru: " + this.getPeluru());
    }   
}
