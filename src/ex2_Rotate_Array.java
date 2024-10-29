public class ex2_Rotate_Array {
    public static void main(String[]args){
        double[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100};
        double[] y = {1,2,3,4,5,6,7};

        System.out.println("Before rotation: ==============================");
        for (int i = 0; i < y.length; i++) {
            System.out.println("x[" + i + "]: " + y[i]);
        }
        y = rotate(y, 3);

        System.out.println("After rotation: ==============================");
        for (int i = 0; i < y.length; i++) {
            System.out.println("x[" + i + "]: " + y[i]);
        }
    }
// Your method goes here.
    public static double[] rotate(double[] x, int n){
        // create a new double array to store shifted array
        double[] newArray = new double[x.length];

        // calculate rotations if n> length of array, eg, 7 rotations for array length 5
        // is the same as 2 rotations
        n = n % x.length;

        // rotate by n positions
        for (int i = 0; i<x.length; i++){
            newArray[i] = x[(i+n)%x.length];
        }

        return newArray;
    }
}

