public class TestPesawat {
    public static void main(String[] args) {
        Pesawat garuda = new Pesawat();
        PesawatTempur raptor = new PesawatTempur();
        System.out.println("...airbus...");
        garuda.terbang();
        garuda.mendarat();
        System.out.println("...f16...");
        raptor.manuver();
        raptor.terbang();

    }
}