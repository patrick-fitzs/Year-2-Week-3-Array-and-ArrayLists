import java.util.ArrayList;

public class ex4_ArrayListRunner {
    public static void main(String[]args){

        ArrayList<String> names = new ArrayList<>();
        System.out.println(names);

        // (a) Invoke add() to enter the following names in sequence:
        //Alice, Bob, Connie, David, Edward, Fran, Gomez, Harry.
        //Print the ArrayList again.
        names.add("\nAlice");
        names.add("Bob");
        names.add("Connie");
        names.add("David");
        names.add("Edward");
        names.add("Fran");
        names.add("Gomez" );
        names.add("Harry");
        for (String x:names){
            System.out.println(x);
        }
        // (b) Use get() to retrieve and print the first and last names.

        System.out.println("\nFirst name: "+names.get(0));
        System.out.println("Last name: " + names.get(names.size()-1)); // Or just names.get(7)

        // (c) Print the size() of the ArrayList.
        System.out.println("\nSize of the array : "+ names.size());

        // (d) Use size() to help you print the last name in the list.
        System.out.println("\nUsing size to help get last name: " + names.get(names.size()-1));

        // (e) Use set() to change Alice to Anna.
        //Print the ArrayList to verify the change.
        names.set(0, "Anna");
        System.out.println(names.get(0));

        // (f) Use the alternate form of add() to insert Doug after David.
        //Print the ArrayList again.
        names.add(4, "Doug");
        System.out.println(names);

        System.out.println();
        // (g) Use an enhanced for loop to print each name in the ArrayList.

        for(String name : names){
            System.out.println(name);
        }
        // (h) Create a second ArrayList called names2 that is built by calling the ArrayList
        // constructor that accepts another ArrayList as an argument. Pass names to
        // the constructor to build names2. Then print the ArrayList.

        ArrayList<String> names2 = new ArrayList<>(names); // An ArrayList Constructor
        System.out.println("names2 list contains: "+names2);
        if (names2 == names);
        System.out.println(true);

        //(i) Call names.remove(0) to remove the first element. Print names and names2.
        //Verify that Anna was removed from names, but not from names2.

        names.remove(0);
        System.out.println("names: "+names);
        System.out.println("names2: "+names2);

    }
}

