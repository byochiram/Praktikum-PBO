/*  
*   Nama      = MTiket.java 10/3/2024    
*   Penulis   = Rosidah Rahmati 24060122140121
*   Deskripsi = Program class MTiket
*/

import java.util.Scanner;

public class MTiket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah tiket yang ingin dipesan: ");
        int jumlahTiket = scanner.nextInt();
        Tiket.pesanJumlahTiket(jumlahTiket);

        System.out.println("Pilih e-wallet yang akan digunakan:");
        System.out.println("1. OVO");
        System.out.println("2. GoPay");
        System.out.println("3. DANA");
        System.out.println("4. LinkAja");
        System.out.print("Pilih e-wallet (1-4): ");
        int EWallet = scanner.nextInt();

        Tiket.isEWallet(EWallet);

        // Tutup scanner setelah selesai digunakan
        scanner.close();
    }
}

/*CATATAN PENTING
* Untuk menjalankan asersi perlu mengaktifkan terlebih dahulu mode asersi di terminal dengan mengetik "java -enableassertions MTiket.java"
*/