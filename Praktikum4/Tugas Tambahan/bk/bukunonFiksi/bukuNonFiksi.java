/*  
*   Nama      = Rosidah Rahmati 
*   NIM       = 24060122140121
*   Nama File = bukuNonFiksi.java 22/3/2024 
*   Deskripsi = Program class bukuNonFiksi
*/

package bk.bukunonFiksi;

import bk.buku.Buku;

public class bukuNonFiksi extends Buku {

    private String subjek;

    public bukuNonFiksi(String judul, String penulis, String tahunTerbit, int jumlahHalaman, double harga, String subjek) {
        super(judul, penulis, tahunTerbit, jumlahHalaman, harga);
        this.subjek = subjek;
    }

    public String getSubjek() {
        return subjek;
    }

    public void setSubjek(String subjek) {
        this.subjek = subjek;
    }

    @Override
    public void view() {
        super.view();
        System.out.println("Subjek: " + subjek);
    }
}
