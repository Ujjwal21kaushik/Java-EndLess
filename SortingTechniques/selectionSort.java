package SortingTechniques;

import java.util.Arrays;

public class selectionSort {
    public static void swap(int[] arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {4 ,1 ,5, 2 ,3};
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int small_idx = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[small_idx]) {
                    small_idx = j;
                }
            }
            swap(arr , i, small_idx );
        }
//        System.out.println(Arrays.toString(arr));
    }
}
