public class Segitiga {
    public static void main(String[] args) {
        int alas = 15;
        int tinggi = 4;
        double luas = 0.5 * alas * tinggi;
        double Keliling = alas + tinggi + Math.sqrt(alas * alas + tinggi * tinggi);
        System.out.println("Menghitung Luas dan Keliling Segitiga");
        System.out.println("Alas              = " + alas);
        System.out.println("Tinggi            = " + tinggi);
        System.out.println("Luas Segitiga     = " + luas);
        System.out.println("Keliling Segitiga = " + Keliling);
    }
}