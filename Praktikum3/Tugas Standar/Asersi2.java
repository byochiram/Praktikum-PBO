/*  
*   Nama      = Asersi2.java 5/3/2024    
*   Penulis   = Rosidah Rahmati 24060122140121
*   Deskripsi = Program class Asersi2
*/

//class Lingkaran
class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

//class Asersi2
public class Asersi2 {
    public static void main(String[] args){
        double jariJari = 0;
        assert jariJari > 0 : "jari jari tidak boleh nol";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran); 
    }
}

/* Secara konsep, ada yang kurang tepat pada program Asersi2 di atas?
 * Penempatan asersi untuk memastikan bahwa jari-jari tidak bernilai nol seharusnya dilakukan di dalam konstruktor kelas Lingkaran. 
 * Hal ini akan memastikan bahwa setiap kali objek Lingkaran dibuat, jari-jarinya akan diperiksa untuk validitasnya. Dengan cara ini, 
 * langkah inisialisasi objek dan pemeriksaan jari-jari menjadi terintegrasi, sehingga memastikan bahwa objek Lingkaran yang tercipta 
 * selalu memiliki jari-jari yang valid.
 */