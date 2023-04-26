public class Bicycle {
    int speed = 0;
    int gear = 0;

    void changeGear(int newValue) {
        gear = gear + newValue;
        System.out.println("Gear: " + gear);
    }

    void speedUp(int increment) {
        speed = speed + increment;
        System.out.println("Speed: " + speed);
    }
}

class MountainBike extends Bicycle {
    int seatHeight;

    public void setHeight(int newValue) {
        seatHeight = newValue;
        System.out.println("Seat Height:" +seatHeight);
    }
}

class MountainBikeDemo {
    public static void main(String[] args) {
        MountainBike mbike = new MountainBike();
        mbike.speedUp(10);
        mbike.changeGear(2);
        mbike.setHeight(20);
    }
}