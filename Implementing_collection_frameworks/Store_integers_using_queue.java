package Implementing_collection_frameworks;
import java.util.*;
public class Store_integers_using_queue {

        public static void main(String args[])
        {
            Queue<Integer> pq = new PriorityQueue<>();

            pq.add(1);
            pq.add(2);
            pq.add(3);
            pq.add(4);
            pq.add(5);
            pq.add(6);
            System.out.println(pq);
            // removing elements
            pq.remove(4);
            pq.remove(6);
            System.out.println("element removed : 4 6 ");
            System.out.println("element remaining after removing:");
            Iterator iterator = pq.iterator();

            while (iterator.hasNext()) {
                System.out.print(iterator.next() + " ");
            }
        }
}

