package stacks;

import java.util.*;


public class pchp {
  public static void main(String[] args) {
    int[] arr = {5, 3,5,4,1};
    // System.out.println(NGEonRight(arr));
    // System.out.println(NGEonLeft(arr));
    // System.out.println(NSEonRight(arr));
    // System.out.println(NSEonLeft(arr));

      // String s = "(a+(b*(c+d)))";
      String s = "(a+(b*e)+(c+d))";
      System.out.println(depthParantheses(s));
    
  }

  private static int depthParantheses(String s) {
    int depth = 0;
    int maxDepth = 0;

    for(int i=0; i<s.length(); i++){
      char ch = s.charAt(i);

      if(s.charAt(i) == '('){
        depth++;
        maxDepth = Math.max(maxDepth , depth);
      }
      else if(s.charAt(i) == ')'){
        depth--;
      }
    }
    return maxDepth;
  }

  static String NGEonRight(int[]arr){
    Stack<Integer> st = new Stack<>();
    int[] ans = new int[arr.length];
    Arrays.fill(ans, -1);
    for(int i=0; i< arr.length; i++){

      while(!st.isEmpty() && arr[i]>arr[st.peek()]){
        ans[st.peek()] = arr[i];
        st.pop();
      }
      st.push(i);
    }
    
    System.out.println(st);
 
    return Arrays.toString(ans);
  }

  static String NGEonLeft(int[]arr){
    Stack<Integer> st = new Stack<>();
    int[] ans = new int[arr.length];
    Arrays.fill(ans, -1);
    for(int i=arr.length-1; i>=0 ; i--){

      while(!st.isEmpty() && arr[i]>arr[st.peek()]){
        ans[st.peek()] = arr[i];
        st.pop();
      }
      st.push(i);
    }
    return Arrays.toString(ans);
  }

  static String NSEonRight(int[]arr){
    Stack<Integer> st = new Stack<>();
    int[] ans = new int[arr.length];
    int n =arr.length; 
    ans[n-1] = n;
    for(int i=0; i<n ; i++){
      while(!st.isEmpty() && arr[i]<arr[st.peek()]){
        ans[st.peek()] = i;
        st.pop();
      }
      st.push(i);
    }
    return Arrays.toString(ans);
  }

  static String NSEonLeft(int[]arr){
    Stack<Integer> st = new Stack<>();
    int[] ans = new int[arr.length];
     int n =arr.length;
    Arrays.fill(ans, -1);
    for(int i=n-1; i>=0 ; i--){

      while(!st.isEmpty() && arr[i]<arr[st.peek()]){
        ans[st.peek()] = i;
        st.pop();
      }
      st.push(i);
    }
    return Arrays.toString(ans);
  }
    
    
}
