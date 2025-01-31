package Function;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        int age[] = new int[5];
        age[0] = 1;
        age[1] = 2;
        System.out.println(age.length);
        int marks[] = {1,2,3,4,5};
        System.out.println(marks[3]);
        for(int i=0; i<5; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        String names[] = {"ram" , "shyam", "rahul", "raj"};
        for(int i=0; i< names.length; i++){
            System.out.print(names[i]+" ");
        }
        for(String name: names){
            System.out.println("for each "+name);
        }
    }
}
