package Function;
import javax.xml.transform.Source;
public class wrapper {
    public static void main(String[] args) {
        int n = 10;
        char c = 'A';
        byte b = 20;
        short s = 50;
        long l = 2321;
        boolean v = true;

        Integer I = (int)n;
        Character C = (char)c;
        Byte B = (byte)b;
        Short S = (short)s;
        Long L = (long)l;
        Boolean V = (boolean)v;

        System.out.println(+I);
        System.out.println(+C);
        System.out.println(+B);
        System.out.println(+S);
        System.out.println(+L);
        System.out.println(V);
        Object obj = L;
        System.out.println(obj);
        long z = (long)obj;
        System.out.println(+z);

    }
}
