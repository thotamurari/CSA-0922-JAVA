public class Task01Demo {
    static class Vehicle { String reg; String type; Vehicle(String r,String t){reg=r;type=t;} }
    public static void main(String[] args) {
        Vehicle v = new Vehicle("TN01AB1111","Car");
        System.out.println("Registration: " + v.reg);
        System.out.println("Vehicle type: " + v.type);
        System.out.println("Candidate classes: Vehicle, ParkingFacility, ParkingTicket");
        System.out.println("Rule check: one vehicle represented by one object");
    }
}
