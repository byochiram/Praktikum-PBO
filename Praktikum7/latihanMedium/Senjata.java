/*
 * Senjata.java 7/5/2024
 * Penulis : Rosidah Rahmati 
 * NIM : 24060122140121
 * Lab : B2
 * Deskripsi : Program class Senjata
 */

package latihanMedium;

/**
 *
 * @author USER
 */
public class Senjata {
    private String bunyi;
    private boolean menusuk;
    private int peluru;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
    }
    
    public String getBunyi() {
        return bunyi;
    }

    public boolean isMenusuk() {
        return menusuk;
    }

    public int getPeluru() {
        return peluru;
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }
}