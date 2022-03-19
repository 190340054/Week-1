package Implementing_collection_frameworks;

import java.util.HashSet;
import java.util.Iterator;

public class Store_integers_using_hashset_2 {
        public static void main(String[] args)
        {
            // Creating an empty HashSet
            HashSet<Integer> h = new HashSet<Integer>();

            // Adding elements into HashSet
            // using add() method
            for (int i = 5; i >= 1; i--) {
                h.add(i);
            };

            // adding duplicate elements
            h.add(3);
            h.add(5);

            // Displaying the HashSet
            System.out.println(h);
            // Display message
            System.out.println("Iterating over list:");

            // Iterating over hashSet items
            Iterator<Integer> i = h.iterator();
            while (i.hasNext())
                System.out.println(i.next());

            // even after two elements in size() -> same because it stores only unique elements
        }
}

