package stacks.problems;

import java.util.Stack;

public class P1047 {
    public static void main(String[] args) {
        String str = "abbaca";
        Stack<Character> st = new Stack<>();
        int i=0;
        while(i< str.length()){
            char ch = str.charAt(i);
            if(!st.isEmpty() && st.peek()==ch){
                st.pop();
            }
            else{
                st.push(ch);
            }
            i++;
        }
        System.out.println(st);
    }
}
