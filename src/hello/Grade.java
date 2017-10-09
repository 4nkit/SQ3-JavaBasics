package hello;

public class Grade {
    public static void main(String[] args) {
        int g = 0;
        if(g<0 || g>=100)
            System.out.println("Invalid input");
        else if (g>=85 && g<=100)
            System.out.println("Your grade is A");
    }


}
