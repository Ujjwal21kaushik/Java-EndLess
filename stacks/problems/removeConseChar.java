package stacks.problems;

import java.util.Stack;

public class removeConseChar {
    public static void main(String[] args) {
        String str = "aaabbccd";
        Stack<Character> st = new Stack<>();

        for(char ch : str.toCharArray()){
            if(st.isEmpty() || st.peek()!=ch){
                st.push(ch);
            }
        }
        System.out.println(st);
    }
}
