package BasicsOfJava;
import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.print(n );
            System.out.print(" X ");
            System.out.print(i);
            System.out.print(" = ");
            System.out.println(n*i);
        }
    }
}
