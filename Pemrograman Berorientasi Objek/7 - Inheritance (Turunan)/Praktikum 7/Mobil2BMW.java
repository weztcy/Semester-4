class Mobil2 {
    int roda = 4;
    int body = 1;
    int mesin = 1;
    String nama;

    void maju() {
        System.out.println("Maju...");
    }
    void mundur() {
        System.out.println("Mundur...");
    }
    void belok() {
        System.out.println("Belok...");
    }
    
    void hidupkanMobil(String nama) {
        System.out.println("Mesin " + nama + " hidup...");
    }
    void matikanMobil(String nama) {
        System.out.println("Mesin " + nama + " mati...");
    }
    void gantiGigi(String nama) {
        System.out.println("Ganti gigi " + nama + "sukses...");
    }
    
    void setRoda(int roda) {
        this.roda = roda;
    }
    int getRoda() {
        return roda;
    }
    void setBody(int body) {
        this.body = body;
    }
    int getBody() {
        return body;
    }
}

class Mobil2BMW extends Mobil2 {
    void nontonTV() {
        System.out.println("TV dihidupkan");
        System.out.println("TV mencari channel");
        System.out.println("TV menampilkan gambar");
    }
}

class Mobil2BMWDemo {
    public static void main(String[] args) {
        Mobil2BMW bmw = new Mobil2BMW();
        bmw.hidupkanMobil("BMW");
        bmw.gantiGigi("BMW");
        bmw.matikanMobil("BMW");
        bmw.nontonTV();
    }
}