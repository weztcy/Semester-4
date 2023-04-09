public class TestMobil {
    public static void main(String[] args) {
        Mobil avanza = new Mobil();
        avanza.maju();
        avanza.mundur();
        avanza.belok();
        System.out.println("Roda: " + avanza.roda);
        System.out.println("Mesin: " + avanza.mesin);
    }
}