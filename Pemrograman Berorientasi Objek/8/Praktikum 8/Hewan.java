public class Hewan {
    String jenis, ciri;
    void suara(){
        System.out.print("Hewan ini suaranya berbunyi ");
    };
    void berjalan(){
        System.out.print("Hewan ini berjalan dengan ");
    };
    void bernapas(){
        System.out.print("Hewan ini bernapas dengan ");
    };

    class Singa extends Hewan {
        void suara(){
            super.suara();
            System.out.println("roarrrr");
        }
        void berjalan(){
            super.berjalan();
            System.out.println("berlari");
        }
        void bernapas(){
            super.bernapas();
            System.out.println("paru-paru");
        }
    }

    class Elang extends Hewan {
        void suara(){
            super.suara();
            System.out.println("kiiiiii");
        }
        void berjalan(){
            super.berjalan();
            System.out.println("terbang");
        }
        void bernapas(){
            super.bernapas();
            System.out.println("paru-paru");
        }
    }

    class Lebah extends Hewan {
        void suara(){
            super.suara();
            System.out.println("bzzzzzz");
        }
        void berjalan(){
            super.berjalan();
            System.out.println("terbang");
        }
        void bernapas(){
            super.bernapas();
            System.out.println("trakea");
        }
    }

    class Paus extends Hewan {
        void suara(){
            super.suara();
            System.out.println("eeeeeee");
        }
        void berjalan(){
            super.berjalan();
            System.out.println("berenang");
        }
        void bernapas(){
            super.bernapas();
            System.out.println("paru-paru");
        }
    }
}