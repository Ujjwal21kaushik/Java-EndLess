package Exam2ndYearEndTerm.stack;

import java.util.*;

public class dailyTemperature {
    public static void main(String[] args) {
        int[] nums= {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(daily(nums)));
    }
    static int[] daily(int[] arr) {
        int[] ans = new int[arr.length];

        Stack<Integer> st = new Stack();

        for (int i = 0; i < arr.length; i++) {
            
            while(!st.isEmpty() && arr[st.peek()] < arr[i]){
                ans[st.peek()] = (i-st.peek());
                st.pop();
            }
            st.push(i);
        }
        return ans;
    }
}
