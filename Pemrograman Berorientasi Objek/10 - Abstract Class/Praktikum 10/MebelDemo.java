class Mebel {
    int harga;
    String bahan;
}

class Almari extends Mebel {
    boolean roda;
}

class Meja extends Mebel {
    int jmlkaki;
}

class MejaMakan extends Meja {
    int jmlKursi;
}

interface Discountable {
public void discount(int harga);
}

class MejaTamu extends Meja implements Discountable {
    String bentukKaca;

    public void discount(int harga) {
        this.harga = (harga) - ((int) (harga * 0.5));
    }
}

class AlmariPakaian extends Almari implements Discountable {
    int jmlPintu;

    public void discount(int harga) {
        this.harga = (harga) - ((int) (harga * 0.5));
    }
}

class AlmariMakan extends Almari implements Discountable {
    int jmlRoda;

    public void discount(int harga) {
        this.harga = (harga) - ((int) (harga * 0.5));
    }
}

public class MebelDemo {
    public static void main(String[] args) {
        AlmariPakaian almariPakaian = new AlmariPakaian();
        almariPakaian.bahan = "Jati";
        almariPakaian.harga = 750000;
        almariPakaian.jmlPintu = 4;
        almariPakaian.roda = false;
        almariPakaian.discount(almariPakaian.harga);
        System.out.println("Almari Pakaian");
        System.out.println("Bahan\t: " + almariPakaian.bahan);
        System.out.println("Harga\t: " + almariPakaian.harga);
        System.out.println("Pintu\t: " + almariPakaian.jmlPintu);
        System.out.println("Roda\t: " + almariPakaian.roda);
        MejaTamu mejaMakan = new MejaTamu();
        mejaMakan.bahan = "Jati Tua";

        mejaMakan.harga = 1250000;
        mejaMakan.jmlkaki = 6;
        mejaMakan.bentukKaca = "Kotak";
        mejaMakan.discount(mejaMakan.harga);
        System.out.println("Meja Makan");
        System.out.println("Bahan\t: " + mejaMakan.bahan);
        System.out.println("Harga\t: " + mejaMakan.harga);
        System.out.println("Pintu\t: " + mejaMakan.jmlkaki);
        System.out.println("Roda\t: " + mejaMakan.bentukKaca);
    }
}