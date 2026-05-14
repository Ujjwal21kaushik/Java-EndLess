package stacks;

import java.util.Stack;

public class intro {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack();
        Stack<Integer> st2 = new Stack();
        
        st1.push(10);
        st1.push(20);
        st1.push(30);
        st1.push(40);
        st1.push(50);
        st1.push(60);

        // Traversing Top-Bottom
        while(st1.size()>0){
            int top = st1.pop();
            System.out.print(top + " ");
            st2.push(top);
        }
        System.out.println();
        // Traversing Bottom-Top
        while(st2.size()>0){
            int bottom = st2.pop();
            System.out.print(bottom + " ");
            st1.push(bottom);
        }

    }
}
