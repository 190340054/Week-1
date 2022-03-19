package Implementing_collection_frameworks;
import java.util.*;
public class Store_integers_using_arraylist {

        public static void main(String[] args)
        {
            ArrayList<Integer> arr = new ArrayList<Integer>();

            // Appending new elements at
            // the end of the list
            for (int i = 5; i >= 1; i--) {
                arr.add(i);
            }
            // Printing elements
            System.out.println(arr);

        }
}
