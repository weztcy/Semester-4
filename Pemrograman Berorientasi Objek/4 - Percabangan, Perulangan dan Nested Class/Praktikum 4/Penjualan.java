public class Penjualan {
    private String nama, kode;
    private float harga;
    private int jumlah;
    float total;
    String bonus;

    void setData(String nama, String kode, float harga, int jumlah) {
        this.nama = nama;
        this.kode = kode;
        this.harga = harga;
        this.jumlah = jumlah;
    }
    String setNama() {
        return nama;
    }
    String setKode() {
        return kode;
    }
    float setHarga() {
        return harga;
    }
    int setJumlah() {
        return jumlah;
    }
    float getTotal() {
        total = harga * jumlah;
        return total;
    }

    String getBonus() {
        if (total >= 500000 && jumlah >= 5) {
            bonus = "Gratis 1 pcs setrika";
        } else if (total >= 100000 && jumlah >= 3) {
            bonus = "Gratis 1 pcs payung";
        } else if (total >= 50000 && jumlah >= 2) {
            bonus = "Gratis 1 pcs ballpoint";
        } else {
            bonus = "Tidak ada bonus";
        }
        return bonus;
    }

    void printNota() {
        System.out.println("Nama Barang : " + nama);
        System.out.println("Kode Barang : " + kode);
        System.out.println("Harga Barang : " + harga);
        System.out.println("Jumlah Barang : " + jumlah);
        System.out.println("Total Harga : " + getTotal());
        System.out.println("Bonus : " + getBonus());
    }
}