/*
 * Data.java 13/5/2024
 * Penulis : Rosidah Rahmati 
 * NIM : 24060122140121
 * Lab : B2
 * Deskripsi : Program class Data
 */

 public class Data<T> {
    private T isi;

    T getIsi() {
        return this.isi;
    }

    void setIsi(T x) {
        this.isi = x;
    }
}