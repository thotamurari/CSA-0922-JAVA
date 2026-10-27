public class Task09Demo {
    abstract static class Vehicle { abstract double rate(); }
    interface Chargeable { double chargingFee(int kWh); }
    static class EV extends Vehicle implements Chargeable {
        double rate(){return 30;}
        public double chargingFee(int kWh){return 12.0*kWh;}
    }
    public static void main(String[] args) {
        EV ev=new EV();
        System.out.println("Parking rate: Rs "+ev.rate());
        System.out.println("Charging for 5 kWh: Rs "+ev.chargingFee(5));
    }
}
