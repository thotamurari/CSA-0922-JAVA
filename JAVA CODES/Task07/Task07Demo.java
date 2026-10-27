public class Task07Demo {
    static class Vehicle { String reg; Vehicle(String r){reg=r;}
        @Override public boolean equals(Object o){return o instanceof Vehicle && reg.equals(((Vehicle)o).reg);}
        @Override public int hashCode(){return reg.hashCode();}
        @Override public String toString(){return "Vehicle["+reg+"]";}
    }
    public static void main(String[] args) {
        Vehicle a=new Vehicle("TN02B2"), b=new Vehicle("TN02B2");
        System.out.println(a);
        System.out.println("Same registration equals: "+a.equals(b));
        System.out.println("Hash codes equal: "+(a.hashCode()==b.hashCode()));
    }
}
