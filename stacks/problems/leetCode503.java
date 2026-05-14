package stacks.problems;

import java.util.Arrays;
import java.util.Stack;

public class leetCode503 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,3};

        String s  = Arrays.toString(nextGreaterElements(arr));
        System.out.println(s
            
        );
    }

    public static int[] nextGreaterElements(int[] arr) {
    Stack<Integer> st = new Stack<>();

    int[] ans = new int[arr.length];
    Arrays.fill(ans , -1);

    for(int i=0; i< arr.length; i++){
      while(!st.isEmpty() && arr[i]>arr[st.peek()] ){
        ans[st.peek()] = arr[i];
        st.pop();
      }
      st.push(i);      
    }

    for(int i=0; i< arr.length; i++){
      while(!st.isEmpty() && arr[i]>arr[st.peek()] ){
        ans[st.peek()] = arr[i];
        st.pop();
      }      
    }
    
    return ans;
    
    }
}
