public class ex1_Create_Array {
    public static void main(String[]args){
        // (a).
        double[] x = {8,4,5,21,7,9,18,100};
        // (b).
        System.out.println(x.length);
        // (c).
        System.out.println(x[0]);
        // (d).
        double lastNum = x[x.length-1];
        System.out.println(lastNum);
        // (e).
        System.out.println(x[x.length-1]);
        // (f).
        for(int i = 0; i<x.length; i++){
            System.out.print(x[i]+" \n");
        }
        System.out.println("-------Below is Question (G).-------");
        // (g).
        for (int i =0; i<x.length; i++){
            System.out.println("x["+i+"] = "+x[i]);
        }

        System.out.println("-------Below is Question (H).-------");
        // (h).
        for (int i = x.length -1 ; i>=0; i--){
            System.out.println("x["+i+"] = "+x[i]);
        }
        // (i).
        System.out.println("-------Below is Question (I).-------");
        // enhanced for loop
        for(double element: x){
            System.out.println(element
            );
        }

    }
}
