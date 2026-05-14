package SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;

public class maxSumOfDistinctSizeK {
    public static void main(String[] args) {
        int[] arr = {2,3,5,8,9,9,9};
        int k =3;
        usingSet(arr , k);
        usingMap(arr, k);

    }
    public static void usingSet(int[]arr , int k) {
        int i=0 ,j=0;
        long windowSum =0;
        long max =0;
        HashSet<Integer>set = new HashSet<>();
        while(j <arr.length){

            while(set.contains(arr[j])){
                set.remove(arr[i]);
                windowSum-=arr[i];
                i++;
            }
            set.add(arr[j]);
            windowSum+=arr[j];

            if(j-i+1 ==k){
                max =Math.max(max,windowSum);
                set.remove(arr[i]);
                windowSum-=arr[i];
                i++;
            }
            j++;
        }
        System.out.println(max);
    }

    public static void usingMap(int[]arr , int k) {
        int i=0;
        long windowSum =0;
        long max =0;
        HashMap<Integer,Integer> map = new HashMap();

        for(int j=0; j<arr.length;j++){
            map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
            windowSum+=arr[j];

            if(j-i+1 >k){
                map.put(arr[i] , map.get(arr[i])-1);
                if(map.get(arr[i])==0){
                    map.remove(arr[i]);
                }
                windowSum-=arr[i];
                i++;
            }
            if(j-i+1 ==k && map.size()==k){
                max = Math.max(max , windowSum);
            }
        }
        System.out.println(max);
    }
}
