public class Task04Demo {
    static class Ticket {
        final long id; final String reg;
        Ticket(long id,String reg){this(id,reg,System.currentTimeMillis());}
        Ticket(long id,String reg,long time){this.id=id;this.reg=reg;}
        public String toString(){return "Ticket{id="+id+", reg="+reg+"}";}
    }
    public static void main(String[] args) {
        Ticket t=new Ticket(101,"TN01AB1111");
        System.out.println(t);
        System.out.println("Constructor chaining: successful");
    }
}
