package stacks.problems;

import java.util.Stack;

public class Hard84 {
    public static void main(String[] args) {
        int[] arr ={2,1,5,6,2,3};
        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        int[] nse = new int[n];

        //  NSE (Next Smaller Element)
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && arr[i] < arr[st.peek()]){
                nse[st.peek()] = i;  
                st.pop();
            }
            st.push(i);
        }

        while(!st.isEmpty()){
            nse[st.peek()] = n;  
            st.pop();
        }

        int[] pse = new int[n];

        //  PSE (Previous Smaller Element)
        for(int i = n-1; i >= 0; i--){
            while(!st.isEmpty() && arr[i] < arr[st.peek()]){
                pse[st.peek()] = i;   //store index
                st.pop();
            }
            st.push(i);
        }

        while(!st.isEmpty()){
            pse[st.peek()] = -1;    
            st.pop();
        }

        // Calculate max area
        int maxArea = 0;
        for(int i=0; i<n; i++){
            int area = arr[i] * (nse[i] - pse[i] - 1);
            maxArea = Math.max(maxArea , area);
        }

        System.out.println(maxArea);
    }
}