public class MatematikaDemo {
    public static void main(String[] args) {
        int angka1 = 11;
        int angka2 = 7;

        Matematika hitung = new Matematika();
        hitung.tambah(angka1, angka2);
        System.out.println("Hasil tambah: " + hitung.tambah(angka1, angka2, angka2));
        System.out.println("Hasil tambah: " + hitung.tambah(1.5f, 2.5f));
        
        hitung.kurang(angka1, angka2);
        System.out.println("Hasil kurang: " + hitung.kurang(angka1, angka2, angka2));
        System.out.println("Hasil kurang: " + hitung.kurang(1.5f, 2.5f));
        
        hitung.kali(angka1, angka2);
        System.out.println("Hasil kali: " + hitung.kali(angka1, angka2, angka2));
        System.out.println("Hasil kali: " + hitung.kali(1.5f, 2.5f));
        
        hitung.bagi(angka1, angka2);
        System.out.println("Hasil bagi: " + hitung.bagi(angka1, angka2, angka2));
        System.out.println("Hasil bagi: " + hitung.bagi(1.5f, 2.5f));
    }
}
