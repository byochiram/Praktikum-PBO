/*  
*   Nama      = AngkaSial.java 5/3/2024    
*   Penulis   = Rosidah Rahmati 24060122140121
*   Deskripsi = Program class AngkaSial
*/

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException {
        if(angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/* 1. Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
 *    Baris 12 (System.out.println(angka + " bukan angka sial");):
 *    Baris ini akan dieksekusi jika eksepsi tidak terjadi, artinya jika nilai angka yang diberikan kepada metode cobaAngka() tidak sama dengan 13. 
 *    Dalam contoh program ini, ketika angka pertama yang dilewatkan adalah 10, baris ini akan dieksekusi karena kondisi angka = 13 tidak terpenuhi. 
 *    Tetapi untuk nilai angka selanjutnya yaitu 13, baris ini tidak akan dieksekusi karena 13 termasuk angka sial.
 * 
 * 2. Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
 *    Baris 21 (System.out.println("hati-hati memasukkan angka!!!");):
 *    Baris ini akan dieksekusi jika terjadi eksepsi, yaitu jika nilai angka yang diberikan kepada metode cobaAngka() adalah 13. Dalam contoh program ini, 
 *    ketika melewati nilai angka pertama yaitu 10, baris ini tidak dieksekusi. Tetapi untuk nilai angka selanjutnya yaitu 13, eksepsi akan terjadi, 
 *    dan baris ini akan dieksekusi dalam blok catch.
 */
