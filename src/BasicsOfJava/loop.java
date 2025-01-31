package BasicsOfJava;
import java.util.Scanner;
public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of times you want to print : ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.print("Gagandeep ");
            System.out.println("Singh  ");
        }
    }
}
