/*  
*   Nama      = Asersi1.java 5/3/2024    
*   Penulis   = Rosidah Rahmati 24060122140121
*   Deskripsi = Program class Asersi1
*/

public class Asersi1 {
    public static void main (String[] args) {
        int x =-2;
        if (x > 0) {
            System.out.println("Nilai x = " + x);
        }
        else {
            assert(x < 0): "kesalahan code" ;
            System.out.println("x bilangan negatif") ;
        }
    }
    
}
