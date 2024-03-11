/*  
*   Nama      = Menu.java 10/3/2024    
*   Penulis   = Rosidah Rahmati 24060122140121
*   Deskripsi = Program class Menu
*/

public class Menu {
    private String nama;
    private double harga;
    private int stok;

    public Menu(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void kurangiStok(int jumlah) throws JumlahPesananMelebihiStokException {
        // Mengurangi stok dengan jumlah pesanan
        if (jumlah <= stok) {
            // Mengurangi stok aktual di objek Menu
            setStok(getStok() - jumlah);
        } else {
            // Jika pesanan melebihi stok yang tersedia, lemparkan pengecualian
            throw new JumlahPesananMelebihiStokException("Pesanan melebihi stok yang tersedia.");
        }
    }
}
