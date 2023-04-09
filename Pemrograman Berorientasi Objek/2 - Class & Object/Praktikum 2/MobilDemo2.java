public class MobilDemo2 {
    public static void main(String[] args) {
        Mobil2 civic = new Mobil2();
        
        civic.nama = "Honda Civic";
        civic.hidupkan_mobil(civic.nama);
        civic.ubah_gigi(civic.nama);
        civic.maju();
        civic.belok();
        civic.mundur();
        
        System.out.println("Roda mobil " + civic.nama + " adalah " + civic.get_roda());
        civic.mesin = 1500;
        System.out.println("Mesin mobil " + civic.nama + " adalah " + civic.mesin);
        civic.set_body(2);
        System.out.println("Body mobil " + civic.nama + " adalah " + civic.get_body());
        
        Mobil2 innova = new Mobil2();
        
        innova.nama = "Toyota Innova";
        innova.hidupkan_mobil(innova.nama);
        innova.ubah_gigi(innova.nama);
        innova.maju();
        innova.belok();
        innova.mundur();

        System.out.println("Roda mobil " + innova.nama + " adalah " + innova.get_roda());
        innova.mesin = 2400;
        System.out.println("Mesin mobil " + innova.nama + " adalah " + innova.mesin);
        innova.set_body(5);
        System.out.println("Body mobil " + innova.nama + " adalah " + innova.get_body());
    }
}