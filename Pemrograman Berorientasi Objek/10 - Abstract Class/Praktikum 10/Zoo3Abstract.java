abstract class Binatang { // abstract class
    abstract void makan(); // method abstract

    abstract void tidur();

    void mati() {
        System.out.println("mati............");
    }
}

class Harimau extends Binatang {
    void makan() {
        System.out.println("Harimau makan..........");
    }

    void tidur() {
        System.out.println("Harimau tidur.......... ");
    }
}

class Bebek extends Binatang {
    void makan() {
        System.out.println("Bebek makan..........");
    }

    void tidur() {
        System.out.println("Bebek tidur..........");
    }
}

public class Zoo3Abstract {
    static void test(Binatang a) {

        a.makan();
        a.tidur();
        a.mati();
    }

    public static void main(String[] a) {
        Harimau macan = new Harimau();
        Bebek duck = new Bebek();
        test(macan);
        test(duck);
    }
}