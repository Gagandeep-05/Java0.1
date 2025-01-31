package BasicsOfJava;

public class narrowing {
    public static void main(String[] args) {
        double d = 259.41;
        long l = (long)d;
        int i = (int)l;
        System.out.println("double value "+d);
        System.out.println("long value "+l);
        System.out.println("int value "+i);
    }
}
