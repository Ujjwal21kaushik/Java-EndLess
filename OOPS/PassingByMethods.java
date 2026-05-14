package OOPS;

public class PassingByMethods {
    public static class Car {
        double length;
        int seats;
        int torque;
        String name;
        String type;

    }
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name = "Kia";
        c1.length = 3.99;
        c1.seats = 5;
        c1.type = "SUV";
        c1.torque = 179;
//        change(c1);
//        System.out.println(c1.seats);


    }

    private static void change(Car c1) {
        c1.seats = 4;
        // Thus we find out that it's a pass by reference,
        // when we send objects in methods.
    }

}
