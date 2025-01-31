package BasicsOfJava;
import java.util.Scanner;
public class ap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();
        int k =0;
        if(n > 1){
            for(int i=1; i<=n; i++){
                if(n%i==0){
                    k = k + 1;

                }
            }
        }
    if(k > 2){
        System.out.println("composite number");

    }else{
        System.out.println("prime number");
    }
    }
}
