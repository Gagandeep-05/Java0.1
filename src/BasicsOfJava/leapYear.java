package BasicsOfJava;
import java.util.Scanner;
public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the year : ");
        int n = sc.nextInt();
        if(n%4==0 && n%100 != 0 || n%400 == 0){
            System.out.println("leap year");
        } else {
            System.out.println("not a leap year");
        }

    }
}
