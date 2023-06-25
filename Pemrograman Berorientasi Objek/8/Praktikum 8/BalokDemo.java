public class BalokDemo {
    public static void main(String[] args) {
        Balok a = new Balok();
        a.p = 10;
        a.l = 5;
        a.t = 5;
        a.hitungLuas();
        a.hitungVolume();
        a.cetak();
        System.out.println("");
        a.l = 7;
        a.hitungLuas();
        a.hitungVolume();
        a.cetak("Balok");
    }
}