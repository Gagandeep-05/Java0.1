package BasicsOfJava;
import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("*****");
        }
    }
}
