package SlidingWindow;

public class maxSumSizeK {
    public static void main(String[] args) {
        int[] arr = {2,5,1,8,9,1};
        int k =3;
        int i=0 , j=0;
        int windowsum =0;
        int max= 0;
        while(j<arr.length){
            windowsum += arr[j];
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                max = Math.max(max, windowsum);
                windowsum -= arr[i];
                i++;
                j++;
            }
        }
        System.out.println(max);
    }
}
