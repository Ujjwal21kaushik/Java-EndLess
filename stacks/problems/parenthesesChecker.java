package stacks.problems;

import java.util.Stack;

public class parenthesesChecker {
    static boolean isOpening(char ch){
        if(ch=='{' || ch =='[' || ch=='('){
            return true;
        }
        return false;
    }
    
    static boolean sameStyle(char a , char b){
        if(a=='{' && b =='}'){
            return true;
        }
        if(a=='[' && b ==']'){
            return true;
        }
        if(a=='(' && b ==')'){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        String s = "{[]}";
        for(char ch : s.toCharArray()){
            if(isOpening(ch)){
                st.push(ch);
            }
            else{
                if(st.size()==0) System.out.println("False");

                char top =st.peek();
                if(sameStyle(top , ch)) st.pop();
                else System.out.println("False");
            }

        }
        System.out.println(st.size()==0);
    }
}
