public class Task05Demo {
    static class TicketIds {
        private static long next=1;
        static long nextId(){return next++;}
    }
    public static void main(String[] args) {
        System.out.println("Ticket ID: "+TicketIds.nextId());
        System.out.println("Ticket ID: "+TicketIds.nextId());
        System.out.println("Shared static counter across calls");
    }
}
