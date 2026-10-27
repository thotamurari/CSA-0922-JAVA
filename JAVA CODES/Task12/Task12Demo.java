import java.time.LocalTime;
public class Task12Demo {
    interface PricingRule { double fee(int hours, LocalTime entry); }
    static class FlatFee implements PricingRule {
        private final double amount; FlatFee(double a){amount=a;}
        public double fee(int hours,LocalTime entry){return amount;}
    }
    static class DeliveryVan implements PricingRule {
        private final double carRate; DeliveryVan(double r){carRate=r;}
        public double fee(int hours,LocalTime entry){
            boolean day=!entry.isBefore(LocalTime.of(9,0)) && entry.isBefore(LocalTime.of(17,0));
            return hours*carRate*(day?2.0:1.0);
        }
    }
    public static void main(String[] args) {
        System.out.println("E-bike flat fee: Rs "+new FlatFee(20).fee(2,LocalTime.NOON));
        System.out.println("Van at 10:00, 2 hours: Rs "+new DeliveryVan(30).fee(2,LocalTime.of(10,0)));
        System.out.println("Van at 18:00, 2 hours: Rs "+new DeliveryVan(30).fee(2,LocalTime.of(18,0)));
        System.out.println("Note: van rule uses entry time as an explicit simplifying assumption.");
    }
}
