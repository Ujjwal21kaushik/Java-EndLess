package SortingTechniques;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[]nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        int[]arr = new int[m+n];
        int p1 = m-1;
        int p2 = n-1;
        int p = m+n-1;
        while(p1>=0 && p2>=0){
            if(nums1[p1] > nums2[p2]){
                nums1[p] = nums1[p1--];
            }
            else{
                nums1[p] = nums2[p2--];
            }
            p--;
        }
        while(p2>=0){
            nums1[p--]=nums2[p2--];
        }
        System.out.println(Arrays.toString(nums1));
    }
}
