package hello;

public class ArrayIndex {
    public static void main(String[] args) {
        double [] numbers = {5.6, 4.5, 3.3, 13.2, 4.0, 34.33, 34.0, 45.45,99.993,11123};
        //1. print out all numbers inside array

       for (int i=0; i< numbers.length; i++)
           System.out.println(numbers[i]);

       //2. print out sum of all numbers inside array
        double sum =0;
        for (int j=0; j<numbers.length; j++) {
            sum += numbers[j];
        }
        System.out.println("Sum = "+sum);

        //3. print out all numbers which are >10 but <100
        for (int i=0; i<numbers.length; i++){
            if (numbers[i]>10 && numbers[i] <100)
                System.out.println("number: "+numbers[i]);
        }
        //4. print out the index of occurence of 34.33

        for (int i=0; i<numbers.length; i++){
            if (numbers[i] == 34.33)
                System.out.println("index of the number: "+i);
            break;
        }

        //5. print out the index of the lesser number
        double smallest = numbers[0];
        int index = 0;
        for (int i=1; i<numbers.length; i++){
            if (smallest > numbers[i]){
                smallest = numbers[i];
                index =i;
            }
        }
        System.out.println("number: "+smallest + "and index is: "+ index);
        }
    }

