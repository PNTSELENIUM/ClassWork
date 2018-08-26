package LinkListTest;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UseLinkList {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        list.add("6 more weeks");
        list.add("to go back home");
        list.add("was about time");

        /*for (String st: list){
            System.out.println(st);
        }
             */
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
