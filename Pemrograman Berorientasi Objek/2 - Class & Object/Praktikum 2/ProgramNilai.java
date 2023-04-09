import java.util.Scanner;

public class ProgramNilai {
    String nama, nim;
    float tugas, uts, uas, nilai_tugas, nilai_uts, nilai_uas, nilai_akhir;
    Scanner input = new Scanner(System.in);

    public void DataNilai(String nama, String nim, float tugas, float uts, float uas) {
        this.nama = nama;
        this.nim = nim;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }

    ProgramNilai() {}

    void input() {
        System.out.print("Masukkan Nama        : ");
        nama = input.nextLine();
        System.out.print("Masukkan NIM         : ");
        nim = input.nextLine();
        System.out.print("Masukkan Nilai Tugas : ");
        tugas = input.nextFloat();
        System.out.print("Masukkan Nilai UTS   : ");
        uts = input.nextFloat();
        System.out.print("Masukkan Nilai UAS   : ");
        uas = input.nextFloat();
    }

    void hitung() {
        nilai_tugas = tugas * 0.35f;
        nilai_uts = uts * 0.2f;
        nilai_uas = uas * 0.45f;
        nilai_akhir = nilai_tugas + nilai_uts + nilai_uas;
    }

    void output() {
        System.out.println("Nama                 : " + nama);
        System.out.println("NIM                  : " + nim);
        System.out.println("Nilai Tugas (35%)    : " + nilai_tugas);
        System.out.println("Nilai UTS (20%)      : " + nilai_uts);
        System.out.println("Nilai UAS (45%)      : " + nilai_uas);
        System.out.println("Nilai Akhir          : " + nilai_akhir);
    }
}
