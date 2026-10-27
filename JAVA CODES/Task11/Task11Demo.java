public class Task11Demo {
    static int billableHours(int minutes){return minutes<=0?0:(minutes+59)/60;}
    public static void main(String[] args) {
        int[] mins={0,60,61,130};
        for(int m:mins) System.out.println(m+" minutes -> "+billableHours(m)+" billable hours");
        double total=billableHours(61)*10 + billableHours(60)*30;
        System.out.println("Illustrative daily total: Rs "+total);
    }
}
