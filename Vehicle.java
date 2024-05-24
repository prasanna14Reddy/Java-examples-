class Vehicle {
    void drive() {
        System.out.println("Vehicle is being driven");
    }
}

class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Car is being driven");
    }

    void park() {
        System.out.println("Car is parked");
    }
}

class ElectricCar extends Car {
    @Override
    void drive() {
        System.out.println("Electric car is being driven");
    }

    void charge() {
        System.out.println("Electric car is charging");
    }
}

public class Main {
    public static void main(String[] args) {
        ElectricCar myElectricCar = new ElectricCar();

        myElectricCar.drive(); // Output: Electric car is being driven
        myElectricCar.charge(); // Output: Electric car is charging
        myElectricCar.park(); // Output: Car is parked
    }
}
