package paperQuestions;

import java.util.Arrays;

public class nextPremuntation {
    public static void main(String[] args) {
        int[] nums = {1,2,3,6,5,4};
        int pvt = pivot(nums);
        if(pvt == -1){
            reverse(nums , 0 , nums.length-1);
            System.out.println(Arrays.toString(nums));
        }
        else{
            int min = -1;
            for (int i = nums.length - 1; i > pvt; i--) {
                if(nums[i] > nums[pvt]){
                    min = i;
                    break;
                }
            }

            swap(nums ,pvt , min);
            reverse(nums , pvt+1 , nums.length-1);
            System.out.println(Arrays.toString(nums));
        }


    }
    static int pivot(int[] nums){
        int p =-1;
        int n = nums.length-1;
        for (int i = n-1; i > -1; i--) {
            if(nums[i]<nums[i+1]){
                p = i;
                break;
            }
        }
        return p;
    }

    static void swap(int[] arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void reverse(int[] arr , int l , int r){
        while (l < r){
            swap(arr , l ,r);
            l++;
            r--;
        }
    }
}
