public class test_from_slides {
    public static void main(String[]args){
        //from slide 27
        int[] numbers = squares(10);
        System.out.println(squares(5)[4]);
        System.out.println(squares(6));
        System.out.println(numbers);


        for(int i:numbers){
            System.out.println(i);
        }
        System.out.println(squares(1));

    }
    public static int[] squares(int n){
        int[] result = new int[n];
        for(int i = 0; i< n; i++)
            result[i] = i*i;
        return result;

    }
}
