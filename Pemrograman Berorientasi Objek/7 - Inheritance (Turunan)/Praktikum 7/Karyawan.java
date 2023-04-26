import java.util.Scanner;

class Karyawan {
    String nama;
    int jumlahAnak;
    int tunjanganAnak = 500000;

    void isiData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama: ");
        nama = input.nextLine();
        System.out.print("Jumlah Anak: ");
        jumlahAnak = input.nextInt();
    }
}

class KaryawanTetap extends Karyawan {
    int gajiPokok = 5000000;

    int totalGaji() {
        int totalGaji = gajiPokok + (tunjanganAnak * jumlahAnak);
        return totalGaji;
    }

    void tampilGaji() {
        System.out.println("Karyawan Tetap");
        System.out.println("Nama: " + nama);
        System.out.println("Jumlah Anak: " + jumlahAnak);
        System.out.println("Tunjangan Anak: " + tunjanganAnak);
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Total Gaji: " + totalGaji());
    }
}

class KaryawanKontrak extends Karyawan {
    int upahHarian = 100000;
    int jumlahHariKerja;

    void isiData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama: ");
        nama = input.nextLine();
        System.out.print("Masukkan jumlah hari kerja: ");
        jumlahHariKerja = input.nextInt();
    }

    int totalGaji() {
        int totalGaji = upahHarian * jumlahHariKerja;
        return totalGaji;
    }

    void tampilGaji() {
        System.out.println("Karyawan Kontrak");
        System.out.println("Nama: " + nama);
        System.out.println("Jumlah Anak: " + jumlahAnak);
        System.out.println("Tunjangan Anak: " + tunjanganAnak);
        System.out.println("Upah Harian: " + upahHarian);
        System.out.println("Jumlah Hari Kerja: " + jumlahHariKerja);
        System.out.println("Total Gaji: " + totalGaji());
    }
}

class karyawanDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;

        do {
            System.out.println("");
            System.out.println("Menu Pilihan Karyawan PT KIA");
            System.out.println("");
            System.out.println("1. Karyawan Tetap");
            System.out.println("2. Karyawan Kontrak");
            System.out.println("3. Keluar");
            System.out.println("");
            System.out.print("Masukkan pilihan: ");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    KaryawanTetap karyawanTetap = new KaryawanTetap();
                    System.out.println("");
                    karyawanTetap.isiData();
                    System.out.println("");
                    karyawanTetap.tampilGaji();
                    System.out.println("");
                    break;
                case 2:
                    KaryawanKontrak karyawanKontrak = new KaryawanKontrak();
                    System.out.println("");
                    karyawanKontrak.isiData();
                    System.out.println("");
                    karyawanKontrak.tampilGaji();
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("");
                    System.out.println("Pilihan tidak tersedia.");
                    break;
            }
        }
        while (menu <= 4);
    }
}