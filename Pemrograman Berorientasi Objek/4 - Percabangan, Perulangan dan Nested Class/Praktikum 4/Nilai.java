import java.util.Scanner;

public class Nilai {
    String nim, nama;
    float nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
    float pnilaiTugas, pnilaiUTS, pnilaiUAS;
    char indexNilai;
    String predikat;

    Scanner input = new Scanner(System.in);

    public Nilai(String nim, String nama, float nilaiTugas, float nilaiUTS, float nilaiUAS) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }
    public Nilai(){  
    }
    void isiData(){
        System.out.print("Masukkan NIM : ");
        nim = input.nextLine();
        System.out.print("Masukkan Nama : ");
        nama = input.nextLine();
        System.out.print("Masukkan Nilai Tugas : ");
        nilaiTugas = input.nextFloat();
        System.out.print("Masukkan Nilai UTS : ");
        nilaiUTS = input.nextFloat();
        System.out.print("Masukkan Nilai UAS : ");
        nilaiUAS = input.nextFloat();
    }
    void hitungNilai(){
        pnilaiTugas = (float) (nilaiTugas * 0.3);
        pnilaiUTS = (float) (nilaiUTS * 0.3);
        pnilaiUAS = (float) (nilaiUAS * 0.4);
        nilaiAkhir = pnilaiTugas + pnilaiUTS + pnilaiUAS;
    }
    void hitungIndex(){
        if (nilaiAkhir >= 80 && nilaiAkhir <= 100){
            indexNilai = 'A';
            predikat = "Sangat Baik";
        } else if (nilaiAkhir >= 68 && nilaiAkhir < 80){
            indexNilai = 'B';
            predikat = "Baik";
        } else if (nilaiAkhir >= 56 && nilaiAkhir < 68){
            indexNilai = 'C';
            predikat = "Cukup";
        } else if (nilaiAkhir >= 45 && nilaiAkhir < 56){
            indexNilai = 'D';
            predikat = "Kurang";
        } else if (nilaiAkhir >= 0 && nilaiAkhir < 45){
            indexNilai = 'E';
            predikat = "Sangat Kurang";
        } else {
            System.out.println("Nilai yang dimasukkan salah");
        }
    }
    void tampilData(){
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Nilai Tugas : " + nilaiTugas);
        System.out.println("Nilai UTS : " + nilaiUTS);
        System.out.println("Nilai UAS : " + nilaiUAS);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Index : " + indexNilai);
        System.out.println("Predikat : " + predikat);
    }
    void setNim(String nim){
        this.nim = nim;
    }
    String getNim(){
        return nim;
    }
}