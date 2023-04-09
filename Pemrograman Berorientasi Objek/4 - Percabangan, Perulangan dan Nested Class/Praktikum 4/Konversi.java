public class Konversi {
    int detik; 
    int detikMenit = 60, detikJam = 3600, detikHari = 86400;

    void detik(int detik) {
        this.detik = detik;
    }

    int hitungMenit() {
        int menit = detik / detikMenit;
        return menit;
    }
    int hitungJam() {
        int jam = detik / detikJam;
        return jam;
    }
    int hitungHari() {
        int hari = detik / detikHari;
        return hari;
    }
    int hitungDetik() {
        return detik;
    }

    void tampilHasil() {
        System.out.println("Detik: " + detik);
        System.out.println("Menit: " + hitungMenit());
        System.out.println("Jam: " + hitungJam());
        System.out.println("Hari: " + hitungHari());
    }

}