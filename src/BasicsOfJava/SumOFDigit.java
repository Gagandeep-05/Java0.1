package BasicsOfJava;
import java.util.Scanner;
public class SumOFDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();
        int s = 0;
        int m = 1;
        while(n!=0){
            int lastDigit = n%10;
            s += lastDigit;
            m *= lastDigit;
            n/=10;
        }
        System.out.println(s);
        System.out.println(m);
    }
}
