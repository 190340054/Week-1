package Implementing_collection_frameworks;
import java.util.*;
public class Store_integers_using_hashset {
    public static void main(String[] args)
    {
        // Creating an empty HashSet
        HashSet<Integer> h = new HashSet<Integer>();

        // Adding elements into HashSet
        // using add() method
        h.add(1);
        h.add(2);
        h.add(3);

        // Displaying the HashSet
        System.out.println(h);
        // Display message
        System.out.println("Iterating over list:");

        // Iterating over hashSet items
        Iterator<Integer> i = h.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}
