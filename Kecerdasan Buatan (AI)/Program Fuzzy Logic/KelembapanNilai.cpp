#include <iostream>
using namespace std;

// Fungsi Keanggotaan Segitiga
double triangle(double x, double a, double b, double c) {
    double nilaiKeanggotaan = 0.0;
    if (x <= a || x >= c) {
        nilaiKeanggotaan = 0.0;
    } else if (x > a && x <= b) {
        nilaiKeanggotaan = (x - a) / (b - a);
    } else if (x > b && x < c) {
        nilaiKeanggotaan = (c - x) / (c - b);
    }
    return nilaiKeanggotaan;
}

// Fungsi Implikasi (AND)
double implication(double a, double b) {
    return min(a, b);
}

// Fungsi Implikasi (OR)
double implicationOr(double a, double b) {
    return max(a, b);
}

// Defuzzifikasi menggunakan metode centroid
double defuzzification(double a, double b, double c) {
    double centroid = (a + b + c) / 3.0;
    return centroid;
}

int main() {
    // Input
    double kelembapan;

    cout << "Masukkan nilai kelembapan ruangan (0-100): ";
    cin >> kelembapan;

    // Fuzzifikasi
    double rendah = triangle(kelembapan, 0, 0, 40);
    double sedang = triangle(kelembapan, 30, 50, 70);
    double tinggi = triangle(kelembapan, 60, 100, 100);

    // Inferensi
    double suhuRendah = implication(rendah, 30);
    double suhuNormal = implicationOr(sedang, rendah);
    double suhuTinggi = implication(tinggi, 30);

    // Defuzzifikasi
    double suhuRuangan = defuzzification(suhuRendah, suhuNormal, suhuTinggi);

    // Output
    cout << "Hasil defuzzifikasi: " << suhuRuangan << endl;

    return 0;
}
