package BasicsOfJava;
import java.util.Scanner;
public class even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the range : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            if(i%2 == 0){
                System.out.print(i+" ");
            }
        }
    }
}
