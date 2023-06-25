public class MatematikaDemo {
    public static void main(String[] args) {
        int angka1 = 10;
        int angka2 = 5;
        int angka3 = 2;

        Matematika hitung = new Matematika();

        System.out.println("Operasi Pertambahan " + angka1 + " + " + angka2);
        hitung.tambah(angka1, angka2);
        System.out.println("Hasil tambah: " + hitung.tambah(angka1, angka2, angka3));
        System.out.println("Hasil tambah: " + hitung.tambah(12.5f, 28.7f));
        System.out.println("Hasil tambah: " + hitung.tambah(12.5, 28.7, 14.2));
        System.out.println();
        
        System.out.println("Operasi Pengurangan " + angka1 + " - " + angka2);       
        hitung.kurang(angka1, angka2);
        System.out.println("Hasil kurang: " + hitung.kurang(angka1, angka2, angka3));
        System.out.println("Hasil kurang: " + hitung.kurang(12.5f, 28.7f));
        System.out.println("Hasil kurang: " + hitung.kurang(12.5, 28.7, 14.2));
        System.out.println();
        
        System.out.println("Operasi Perkalian " + angka1 + " * " + angka2);
        hitung.kali(angka1, angka2);
        System.out.println("Hasil kali: " + hitung.kali(angka1, angka2, angka3));
        System.out.println("Hasil kali: " + hitung.kali(12.5f, 28.7f));
        System.out.println("Hasil kali: " + hitung.kali(12.5, 28.7, 14.2));
        System.out.println();
        
        System.out.println("Operasi Pembagian " + angka1 + " / " + angka2);
        hitung.bagi(angka1, angka2);
        System.out.println("Hasil bagi: " + hitung.bagi(angka1, angka2, angka3));
        System.out.println("Hasil bagi: " + hitung.bagi(12.5f, 28.7f));
        System.out.println("Hasil bagi: " + hitung.bagi(12.5, 28.7, 14.2));
    }
}