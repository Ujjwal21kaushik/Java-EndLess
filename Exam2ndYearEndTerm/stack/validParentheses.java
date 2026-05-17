package Exam2ndYearEndTerm.stack;

import java.util.Stack;

public class validParentheses {
    public static void main(String[] args) {
        String s = "(]";
        System.out.println(valid(s));
    }
    public static boolean valid(String s) {
        Stack<Character> st = new Stack();
        
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch=='{'||ch=='['){
                st.push(ch);
            }
            else {
                Character top = st.pop();
                if(ch == ')' && top != '('){
                    return false;
                }   
                if(ch == '}' && top != '{'){
                    return false;
                }   
                if(ch == ']' && top != '['){
                    return false;
                }   
            }
        }
        return st.isEmpty();
    }
}
