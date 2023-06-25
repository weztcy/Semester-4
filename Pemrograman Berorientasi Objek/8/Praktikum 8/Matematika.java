public class Matematika {
    double hasildouble;
    int hasilint;
    
    void tambah(int a, int b) {
        hasilint = a + b;
        System.out.println("Hasil tambah: " + hasilint);
    }
    int tambah(int a, int b, int c) {
        hasilint = a + b + c;
        return hasilint;
    }
    float tambah(float a, float b) {
        return a+b;
    }
    double tambah(double a, double b, double c) {
        return a+b+c;
    }

    void kurang(int a, int b) {
        hasilint = a - b;
        System.out.println("Hasil kurang: " + hasilint);
    }
    int kurang(int a, int b, int c) {
        hasilint = a - b - c;
        return hasilint;
    }
    float kurang(float a, float b) {
        return a-b;
    }
    double kurang(double a, double b, double c) {
        return a-b-c;
    }

    void kali(int a, int b) {
        hasilint = a * b;
        System.out.println("Hasil kali: " + hasilint);
    }
    int kali(int a, int b, int c) {
        hasilint = a * b * c;
        return hasilint;
    }
    float kali(float a, float b) {
        return a*b;
    }
    double kali(double a, double b, double c) {
        return a*b*c;
    }

    void bagi(int a, int b) {
        hasilint = a / b;
        System.out.println("Hasil bagi: " + hasilint);
    }
    int bagi(int a, int b, int c) {
        hasilint = a / b / c;
        return hasilint;
    }
    float bagi(float a, float b) {
        return a/b;
    }
    double bagi(double a, double b, double c) {
        return a/b/c;
    }
}