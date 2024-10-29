import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class inClass {
    // PUBLIC means accessible anywhere in the class
    // VOID meaning doesn't return a value
    // MAIN id the method name
    // (STRING[]ARGS) Is the string type going in as an args, can be used to pass in arg from command line
    public static void main(String[]args){

        // ARRAY REFERENCE FOR LOOP
        double[] values = new double[5];
        System.out.println(STR."Print Array which prints the array reference: \{values}");

        // ARRAY INDEX FOR LOOP
        System.out.println("\nBelow prints out the index of the array with a standard for loop");
        for(int i = 0; i < values.length; i++){
            System.out.println(i);
        }

        // ELEMENTS IN THE ARRAY FOR LOOP
        System.out.println("\nBelow prints out the elements in the array with a standard for loop");
        for (int i = 0; i< values.length; i++){
            System.out.println(values[i]);
        }

        // ELEMENTS IN THE ARRAY FOR LOOP
        System.out.println("\nBelow prints out the element in the array with an enhanced for loop");
        for (double elem: values){
            System.out.println(elem);
        }

        // NEW ARRAY WITH VALUES THAT ARE THE SQUARE OF THE INDEX, I.E
        // 1*1, 2*2, 3*3....
        int [] newValues = new int [11];
        for (int i = 0; i < newValues.length; i++){
            newValues[i] = i*i;
        }
        System.out.println("\nBelow is new values array: square of each index");
        for (int i: newValues){
            System.out.println(i);
        }

        // SUM AND AVERAGE OF THE ARRAY
        System.out.println("\nBelow is sum and average : ");

        double total = 0.0, average = 0.0;
        for(double elem: newValues){
            total = total + elem;
        }
        if (newValues.length>0) {
            average = total / newValues.length;
        }
        System.out.println("Average : " + average + "Total = " + total);

        // FIND THE MAX NUMBER IN AN ARRAY (SAME FOR MIN)
        System.out.println("\nBelow is max and min");

        double largest = newValues[0];
        for(double elem: newValues)
            if (elem> largest)
                largest = elem;

        System.out.println("Largest elem is "+ largest);

        // LINEAR SEARCH IN AN ARRAY
        System.out.println("\nLinear search for a specific value : 89");

        double[] numArray = new double[]{2,6,9,23,89,56};
        int searchedValue = 89;
        int pos = 0;
        boolean found = false;
        while(pos < numArray.length && !found){
            if (numArray[pos] == searchedValue){
                found = true;
            } else {
                pos++;
            }
        }
        if (found){System.out.println("Found at position: "+ pos);}
        else{System.out.println("Not found");
        }

        int[] numbers = squares(10); // (1,4,9,16,25,36,49,64,81,100)
        System.out.println(numbers[6]);

        // N-DIMENSIONAL ARRAYS
        final int COUNTRIES = 4;
        final int MEDALS = 3;
        int[][] counts = new int[COUNTRIES][MEDALS];

        for(int[] elem: counts){
            System.out.println(Arrays.toString(elem));
        }
        // CREATE A NEW ARRAYLIST TO STORE STRING ENTRIES
        ArrayList<String> names = new ArrayList<>();
        names.add("Patrick");
        names.add("Lior");
        System.out.println(names);
    }



    // METHOD BELOW FOR DECLARING AN ARRAY
    public static int[] squares(int n){
        int[] result = new int[n];
        for (int i= 0;i<n;i++)
            result[i] = i*i;
        return result;
    }
}
