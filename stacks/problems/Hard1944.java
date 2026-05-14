package stacks.problems;

import java.util.*;

public class Hard1944 {
 public static void main(String[] args) {
    int[] arr={10,6,8,5,11,9};
    int n = arr.length;
    int[] ans = new int[n];
    Stack<Integer> st = new Stack<>();
    st.push(arr[n-1]);
    ans[n-1] = 0;
    for(int i= n-2 ; i>=0;i--){
        int cnt =0;
        while(st.size()>0 && arr[i]>st.peek()){
            cnt++;
            st.pop();
        }
        if(st.size()>0) cnt++;
        ans[i] = cnt; 
        st.push(arr[i]);
    }
    System.out.println(Arrays.toString(ans));
 }   
}
