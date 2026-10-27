public class Task10Demo {
    static class Ticket {
        private int duration;
        public void setDuration(int minutes) {
            if(minutes<0) throw new IllegalArgumentException("Duration cannot be negative");
            duration=minutes;
        }
        public int getDuration(){return duration;}
    }
    public static void main(String[] args) {
        Ticket t=new Ticket(); t.setDuration(45);
        System.out.println("Validated duration: "+t.getDuration());
        try { t.setDuration(-2); }
        catch(IllegalArgumentException e){System.out.println("Invalid input rejected: "+e.getMessage());}
    }
}
