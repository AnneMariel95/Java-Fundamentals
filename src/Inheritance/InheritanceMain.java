package Inheritance;

public class InheritanceMain {

    public static void main(String[] args) {

        Car car = new Car();

        car.go();

        Bicycle bike = new Bicycle();

        car.go();
        bike.stop();

        System.out.println(car.door);
        System.out.println(bike.pedals);
    }
}