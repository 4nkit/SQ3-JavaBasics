package hello;

public class BreakContinue {
    public static void main(String[] args) {
        for (int i=1; i<21; i++){
            if(i%3==0) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("******************");

        for (int k=1; k<31;k++){
            if (k%3==0){
                continue;
            }
            System.out.println(k);
        }
    }
}
