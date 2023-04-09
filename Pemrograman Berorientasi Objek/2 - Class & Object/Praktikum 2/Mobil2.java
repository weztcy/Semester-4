public class Mobil2 {
    private int roda = 4;
    private int body = 1;
    String nama;
    int mesin = 1;
    void maju() {
        System.out.println("Maju");
    }
    void mundur() {
        System.out.println("Mundur");
    }
    void belok() {
        System.out.println("Belok");
    }
    void hidupkan_mobil(String nama) {
        System.out.println("Mobil " + nama + " hidup");
    }
    void matikan_mobil(String nama) {
        System.out.println("Mobil " + nama + " mati");
    }
    void ubah_gigi(String nama) {
        System.out.println("Gigi mobil " + nama + " diubah");
    }
    
    void set_roda (int roda) {
        this.roda = roda;
    }
    int get_roda() {
        return roda;
    }

    void set_body (int body) {
        this.body = body;
    }
    int get_body() {
        return body;
    }
}