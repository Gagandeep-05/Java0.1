package BasicsOfJava;
import java.util.Scanner;
public class dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        for(int i=n; i>=1; i--){
            System.out.println(i);
        }
    }
}
