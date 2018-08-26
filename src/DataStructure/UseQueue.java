package DataStructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {
    public static void main(String[] args) {


        Queue<String> queue = new LinkedList<>();
        queue.add("NY");
        queue.add("FL");
        queue.add("CA");
//for each loop
        for (String st : queue) {
            System.out.println(st);
            //Using Iterator
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }

// while loop
            while (!queue.isEmpty()) {
                System.out.println(queue.poll());


            }
        }
    }
}
