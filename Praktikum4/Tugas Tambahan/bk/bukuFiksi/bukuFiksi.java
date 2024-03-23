/*  
*   Nama      = Rosidah Rahmati 
*   NIM       = 24060122140121
*   Nama File = bukuFiksi.java 22/3/2024 
*   Deskripsi = Program class bukuFiksi
*/

package bk.bukuFiksi;

import bk.buku.Buku;

public class bukuFiksi extends Buku {
    private String genre;

    public bukuFiksi(String judul, String penulis, String tahunTerbit, int jumlahHalaman, double harga, String genre) {
        super(judul, penulis, tahunTerbit, jumlahHalaman, harga);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void view() {
        super.view();
        System.out.println("Genre: " + genre);
    }
}