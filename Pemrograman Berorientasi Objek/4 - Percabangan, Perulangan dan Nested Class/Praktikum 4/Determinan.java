public class Determinan {
    float a, b, c, d, x1, x2;
    boolean imajiner = true;

    void setData(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    int hitungAkar() {
        int d = (int) (b * b - (4 * a * c));
        if (d > 0) {
            x1 = (float) ((-b + Math.sqrt(d)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(d)) / (2 * a));
            imajiner = false;
        } else if (d == 0) {
            x1 = x2 = -b / (2 * a);
            imajiner = false;
        } else {
            x1 = (float) ((-b / (2 * a)) + (Math.sqrt(d) / (2 * a)));
            x2 = (float) ((-b / (2 * a)) - (Math.sqrt(d) / (2 * a)));
        }
        return d;
    }

    void tampilHasil() {
        d = hitungAkar();

        System.out.println("A : " + a);
        System.out.println("B : " + b);
        System.out.println("C : " + c);
        System.out.println("D : " + d);

        if (imajiner == true) {
            System.out.println("Akar-akar persamaan kuadrat adalah: ");
            System.out.println("x1 = " + x1 + ", nilai akar bersifat imaginer");
            System.out.println("x2 = " + x2 + ", nilai akar bersifat imaginer");
        } else {
            System.out.println("Akar-akar persamaan kuadrat adalah: ");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}