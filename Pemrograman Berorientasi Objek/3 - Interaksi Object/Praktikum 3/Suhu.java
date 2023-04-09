public class Suhu {
    float hasil;
    
    public void kelvin(float celcius) {
        hasil = celcius + 273;
        System.out.println("Konversi ke kelvin: " + hasil);
    }

    public void fahrenheit(float celcius) {
        hasil = (celcius * 9/5) + 32;
        System.out.println("Konversi ke fahrenheit: " + hasil);
    }

    public void rankine(float celcius) {
        hasil = (celcius + 273) * 9/5;
        System.out.println("Konversi ke rankie: " + hasil);
    }

    public void delisle(float celcius) {
        hasil = (100 - celcius) * 3/2;
        System.out.println("Konversi ke delisle: " + hasil);
    }

    public void newton(float celcius) {
        hasil = celcius * 33/100;
        System.out.println("Konversi ke newton: " + hasil);
    }

    public void reaumur(float celcius) {
        hasil = celcius * 4/5;
        System.out.println("Konversi ke reaumur: " + hasil);
    }

    public void romer(float celcius) {
        hasil = (celcius * 21/40) + 7.5f;
        System.out.println("Konversi ke romer: " + hasil);
    }
}
