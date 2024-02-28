/*  
*   Nama      = MTitik.java 27/2/2024    
*   Penulis   = Rosidah Rahmati 24060122140121
*   Deskripsi = Program class MTitik
*/

public class MTitik{
    public static void main(String[] args){
        Titik t1 = new Titik();
        t1.setAbsis(1);
        t1.setOrdinat(2);

        Titik t2 = new Titik();
        t2.setAbsis(3);
        t2.setOrdinat(4);

        Titik t3;
        t3 = new Titik(5,6);

        System.out.println("Jumlah objek titik : " + Titik.getCounterTitik());
        System.out.println("t1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")" );
        System.out.println("t2(" + t2.getAbsis() + ", " + t2.getOrdinat() + ")" );
        System.out.println("t3(" + t3.getAbsis() + ", " + t3.getOrdinat() + ")" );
        
        //jarak titik ke pusat
        System.out.println("Jarak t1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ") ke pusat adalah : " + t1.getJarakPusat());

        //refleksi sumbu x
        t1.refleksiX();
        System.out.println("Refleksi sumbu x t1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");

        //refleksi sumbu y
        t1.refleksiY();
        System.out.println("Refleksi sumbu y t1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");

        //refleksi sumbu x tanpa mengubah titik aslinya
        Titik tRefleksiX = t2.getRefleksiX();
        System.out.println("Refleksi sumbu x tRefleksiX(" + tRefleksiX.getAbsis() + ", " + tRefleksiX.getOrdinat() + ")");

        //refleksi sumbu y tanpa mengubah titik aslinya
        Titik tRefleksiY = t2.getRefleksiY();
        System.out.println("Refleksi sumbu y tRefleksiY(" + tRefleksiY.getAbsis() + ", " + tRefleksiY.getOrdinat() + ")");
    }
}

/* KESIMPULAN
 * Eksperimen enkapsulasi dilakukan pada class Titik dengan membuat atribut menjadi private, menyediakan method untuk mengakses dan 
 * memanipulasi data, dan menambahkan beberapa method. Enkapsulasi berguna untuk membatasi akses langsung ke atribut objek dan 
 * menyediakan method untuk berinteraksi dengan objek. Menambahkan method memungkinkan kita untuk memperluas penggunaan class Titik 
 * dan melakukan operasi matematika dan transformasi geometri. Pemanggilan method objek Titik dari MTitik juga berhasil, dibuktikan 
 * dengan implementasi class Titik yang sudah benar. Penggunaan akses private pada atribut dan public pada method memastikan akses 
 * langsung ke atribut terbatas, dan method yang disediakan dapat digunakan secara luas untuk berinteraksi dengan objek Titik. 
 * Method baru seperti penghitungan jarak ke pusat dan operasi refleksi membuat class Titik dapat digunakan lebih luas lagi.
 */