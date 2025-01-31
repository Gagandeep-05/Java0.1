package BasicsOfJava;
import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius;
        radius = sc.nextInt();
        double pi = 3.1415;
        double area = pi * radius * radius;
        System.out.println("The area of circle is : "+area);
    }
}
