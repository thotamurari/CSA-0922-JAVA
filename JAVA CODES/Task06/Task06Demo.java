public class Task06Demo {
    static abstract class Vehicle { String reg; Vehicle(String r){reg=r;System.out.println("Vehicle constructor");} abstract int rate(); }
    static class Car extends Vehicle { Car(String r){super(r);System.out.println("Car constructor");} int rate(){return 30;} }
    static class ElectricCar extends Car { ElectricCar(String r){super(r);System.out.println("ElectricCar constructor");} }
    public static void main(String[] args) {
        ElectricCar e=new ElectricCar("TN03C3");
        System.out.println("Rate per hour: Rs "+e.rate());
    }
}
