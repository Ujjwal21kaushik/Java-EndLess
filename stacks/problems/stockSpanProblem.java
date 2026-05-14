package stacks.problems;

import java.util.Arrays;
import java.util.Stack;

public class stockSpanProblem {
    public static void main(String[] args) {
        int[] arr = {100,80,60,70,60,75,85};
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        Arrays.fill(ans, 1);
        for(int i = arr.length-1; i>=0; i--){

            while(!st.isEmpty() && arr[i]>=arr[st.peek()]){
                ans[st.peek()] = st.peek()- i; 
                st.pop();
            }
            st.push(i);
        }

        System.out.println(Arrays.toString(ans));

    }
}
