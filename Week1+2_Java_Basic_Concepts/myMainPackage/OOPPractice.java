package myMainPackage;



abstract class Vehicle{
    abstract void move();
    static void startEngine(){
        System.out.println("Engine starts");
    }

};

class Car extends Vehicle{
    @Override
    void move() {
        System.out.println("dgdggf");
    }

    static void sound(){
        System.out.println("onk onk");
    }
}

public class OOPPractice {

    public static void main(String[] args) {
        Car.sound();
        Car.startEngine();
    }
}

