package Implementing_collection_frameworks;
import java.io.*;
import java.util.*;
public class Store_integers_using_stack {

        public static void main(String[] args)
        {

            // Default initialization of Stack
            Stack stack1 = new Stack();


            // pushing the elements
            stack1.push(4);
            stack1.push(2);
            stack1.push(5);

            // Printing the Stack Elements
            System.out.println(stack1);
            Iterator iterator = stack1.iterator();

            while (iterator.hasNext()) {
                System.out.print(iterator.next() + " ");
            }
        }
}

