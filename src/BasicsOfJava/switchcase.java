package BasicsOfJava;

import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int rent = sc.nextInt();
        int month = sc.nextInt();
        int total = rent * month;
        String s;
        switch((total<=1000)?1:(total<=5000)?2:3)
        {
            case 1:
                s = "Payment by cash or check is recommended.";
                break;
            case 2:
                s = "payment by credit card is recommended.";
                break;
            case 3:
                s = "payment by bank transfer is recommended.";
                break;
            default:
                s = " ";
        }
        System.out.println("Total cost: "+total);
        System.out.println("Payment Method Suggestion: "+ s);
    }
}
