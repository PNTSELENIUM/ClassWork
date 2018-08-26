package DataStructure;

import java.util.List;
import java.util.Stack;

public class UseStack {

    public static void main(String[] args) {
        List<String> stack = new Stack();
         ((Stack<String>) stack).push("ny");
         ((Stack<String>) stack).push("ca");
         ((Stack<String>) stack).push("fl");

         while(!((Stack<String>) stack).empty()){
             System.out.println(((Stack<String>) stack).pop());
         }





    }

}
