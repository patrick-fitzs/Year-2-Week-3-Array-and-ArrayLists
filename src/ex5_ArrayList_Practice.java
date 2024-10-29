import java.util.ArrayList;
import java.util.Scanner;

/**
 * Read a nymber from user
 * Put each number in an array
 * keep adding until -1
 **/
public class ex5_ArrayList_Practice {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println(numbers);

        int input;

        while (true){
            input = scan.nextInt();
            if(input== -1){
                break;
            }
            numbers.add(input);
        }

        System.out.println("New array: "+numbers);
        System.out.println("# of items: "+numbers.size());
        System.out.println("Average: "+ Average(numbers));
        System.out.println("Standard deviation of even numbers: "+ stdDeviation(numbers));
        System.out.println("Sum of odd numbers: "+ SumofOdd(numbers));
    }

    /** METHOD FOR GETTING THE AVERAGE OF AN ARRAYLIST **/
    public static double Average(ArrayList<Integer> numbersArray){
        int sum = 0;

        for (int i = 0;i<numbersArray.size();i++){
            sum+=numbersArray.get(i);
        }
        return (double)sum / numbersArray.size();
    }

    /** METHOD FOR GETTING THE STANDARD DEVIATION OF AN ARRAYLIST **/

    public static double stdDeviation(ArrayList<Integer> numbersArray){
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int numbers:numbersArray){
            if (numbers%2==0){
                evenNumbers.add(numbers);
            }
        }
        double average = Average(evenNumbers);
        double result = 0;

        for(int number: evenNumbers){
            result += Math.pow(number-average,2);
        }

        double varienceSum = result/evenNumbers.size();

        return Math.sqrt(varienceSum);
    }



    /** METHOD FOR GETTING THE SUM OF ODD NUMBERS IN AN ARRAYLIST **/
    public static int SumofOdd(ArrayList<Integer> numbersArray){
        int oddSum = 0;

        for (int i = 0; i < numbersArray.size(); i++){
            if (numbersArray.get(i)%2==1){
                oddSum+=numbersArray.get(i);
            }
        } return oddSum;
    }
}
