package SlidingWindow;

public class variableWindow {
    public static void main(String[] args) {
        int[] arr={1,2,6,9};
        int k = 3;
        int i=0;
        int n = arr.length;
        int j=0;
        int max= 0;
        while(j<n){

            while(i<j && arr[j] > k*arr[i]){
                i++;
            }
            max = Math.max(max , j-i+1);
            j++;
        }
        System.out.println(n-max);
    }
}
