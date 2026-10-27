public class Task02Demo {
    public static void main(String[] args) {
        int minutes=61;
        int hours=(minutes+59)/60;
        String[][] slots=new String[2][];
        slots[0]=new String[2]; slots[1]=new String[1];
        System.out.println("Duration: "+minutes+" minutes");
        System.out.println("Billable hours: "+hours);
        System.out.println("Floor 1 slots: "+slots[0].length);
        System.out.println("Floor 2 slots: "+slots[1].length);
    }
}
