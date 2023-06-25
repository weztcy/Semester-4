public class PesawatTempur extends Pesawat{
    PesawatTempur(){
        System.out.println("Ini adalah pesawat tempur...");
    }
    void manuver(){
        System.out.println("Pesawat tempur akan melakukan manuver...");
    }
    void terbang(){
        super.terbang();
        System.out.println("Pesawat tempur akan terbang...");
    }
}