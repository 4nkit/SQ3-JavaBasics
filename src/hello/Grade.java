package hello;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter grade");
        int g=sc.nextInt();
        if(g<0 || g>100)
            System.out.println("Invalid input");
        else if (g>=85 && g<=100)
            System.out.println("Your grade is A");
        else if(g>=60 && g<=84)
            System.out.println("Your grade is B");
        else
            System.out.println("Your grade is C");
    }


}
