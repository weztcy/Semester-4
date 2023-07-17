interface Kamera {
    public void setPixel(float pixel);

    public void ambilGambar();
}

interface Radio {
    public void setGelombang(String gel);
}

class Telepon {
    protected long nomor;

    public void telpon() {
        System.out.println("Sedang Menelepon");
    }
}

class Handphone extends Telepon implements Kamera, Radio {
    private String gelombang;
    private float pixel;

    public void ambilGambar() {
        System.out.println("Gambar Terambil...");
    }

    public void setGelombang(String gel) {
        this.gelombang = gel;
    }

    public void setPixel(float pixel) {
        this.pixel = pixel;
    }

    public void setNomor(long no) {
        this.nomor = no;
    }
}

public class TeleponDemo {
    public static void main(String[] args) {
        Handphone hp = new Handphone();
        hp.setNomor(8183434);

        hp.telpon();
        hp.setPixel(1024);
        hp.ambilGambar();
        hp.setGelombang("FM 101.2");
    }
}