#include <iostream>

using namespace std;

float grafik_kiri(float x, float a, float b){
    if (x <= a){
        return 1;
    }
    if (x >= b) {
        return 0;
    } 
    if (x >= a && x <= b) {
        return ((b-x)/(b-a));
    }
    return 0;
}

float grafik_tengah(float x, float a, float b, float c){
    if (x <= a || x >= c){
        return 0;
    }
    if (x >= a && x <= b){
        return ((x-a)/(b-a));
    }
    if (x == b){
        return 1;
    }
    if (x >= b && x <= c){
        return ((c-x)/(c-b));
    }
    return 0;
}

float grafik_kanan(float x, float a, float b){
    if (x <= a){
        return 0;
    }
    if (x >= b){
        return 1;
    }
    if (x >= a && x <= b){
        return ((x-a)/(b-a));
    }
    return 0;
}

void aturan(float a, float b, float temp, float& then){
    // Cek agar menghitung yang ada nilainya saja
    if (a != 0){
        if (b != 0){
            if (a >= b){
                temp = b;
            } else {
                temp = a;
            }
            if (temp >= then){
                then = temp;
            }
        }
    }
}

void defuzzification(float tidakSehat, float cukupSehat, float sehat, float sampleTS[], float sampleCS[], float sampleS[], float &weight){
    float sTidakSehat = 0;
    float sCukupSehat = 0;
    float sSehat = 0;
    float perkalian = 0;
    float pembagian = 0;
    for (int i = 0; i <= 2; i++){
        sTidakSehat = sTidakSehat + sampleTS[i];
        sCukupSehat = sCukupSehat + sampleCS[i];
        sSehat = sSehat + sampleS[i];
    }
    perkalian = ((tidakSehat * sTidakSehat)+(cukupSehat * sCukupSehat)+(sehat * sSehat));
    pembagian = ((tidakSehat * 3)+(cukupSehat * 3)+(sehat * 3));
    weight = perkalian/pembagian;
}

int main()
{
    float xLelah, uBugar, uNormal, uLelah = 0;
    float xStres, uRendah, uSedang, uTinggi = 0;
    float tidak_sehat, cukup_sehat, sehat;
    float weighted_average;

    cout << "Masukkan x untuk nilai Lelah : ";
    cin >> xLelah;
    cout << "Masukkan x untuk nilai Stres : ";
    cin >> xStres;

    // Lelah
    uBugar = grafik_kiri(xLelah, 30, 50);
    uNormal = grafik_tengah(xLelah, 30, 50, 70);
    uLelah = grafik_kanan(xLelah, 50, 70);

    // Stres
    uRendah = grafik_kiri(xStres, 30, 50);
    uSedang = grafik_tengah(xStres, 30, 50, 70);
    uTinggi = grafik_kanan(xStres, 50, 70);

    cout << "Fuzzifikasi Lelah : \n";
    cout << "uBugar\t: " << uBugar << "\n";
    cout << "uNormal\t: " << uNormal << "\n";
    cout << "uLelah\t: " << uLelah << "\n";
    
    cout << "Fuzzifikasi Stres : \n";
    cout << "uRendah\t: " << uRendah << "\n";
    cout << "uSedang\t: " << uSedang << "\n";
    cout << "uTinggi\t: " << uTinggi << "\n";

    // Rules
    aturan(uBugar, uRendah, sehat, sehat);
    aturan(uBugar, uSedang, sehat, sehat);
    aturan(uBugar, uTinggi, cukup_sehat, cukup_sehat);
    aturan(uNormal, uRendah, cukup_sehat, cukup_sehat);
    aturan(uNormal, uSedang, cukup_sehat, cukup_sehat);
    aturan(uNormal, uTinggi, tidak_sehat, tidak_sehat);
    aturan(uLelah, uRendah, cukup_sehat, cukup_sehat);
    aturan(uLelah, uSedang, tidak_sehat, tidak_sehat);
    aturan(uLelah, uTinggi, tidak_sehat, tidak_sehat);

    // Nilai Output
    cout << "\nBobot Output : \n";
    cout << "uTidakSehat\t: " << tidak_sehat << "\n";
    cout << "uCukupSehat\t: " << cukup_sehat << "\n";
    cout << "uSehat\t\t: " << sehat << "\n";

    // Nilai Sample
    float sampleTS[3] = {10, 22, 29};
    float sampleCS[3] = {32, 35, 43};
    float sampleS[3] = {81, 87, 95};

    cout << "Nilai sample defuzzification : \n";
    cout << "Sample Tidak Sehat\t: ";
    for (int i = 0; i <= 2; i++){
        if (i == 2){
            cout << sampleTS[i] << "\n";
        } else {
            cout << sampleTS[i] << ", ";
        }
    }
    cout << "Sample Cukup Sehat\t: ";
    for (int i = 0; i <= 2; i++){
        if (i == 2){
            cout << sampleCS[i] << "\n";
        } else {
            cout << sampleCS[i] << ", ";
        }
    }
    cout << "Sample Sehat\t\t: ";
    for (int i = 0; i <= 2; i++){
        if (i == 2){
            cout << sampleS[i] << "\n";
        } else {
            cout << sampleS[i] << ", ";
        }
    }
    
    // Defuzzifikasi
    defuzzification(tidak_sehat, cukup_sehat, sehat, sampleTS, sampleCS, sampleS, weighted_average);
    cout << "\n\nTingkat Kesehatan : " << weighted_average;
    cout << "\n";

    return 0;
}