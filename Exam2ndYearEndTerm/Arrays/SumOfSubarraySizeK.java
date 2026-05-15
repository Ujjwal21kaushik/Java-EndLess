package Exam2ndYearEndTerm.Arrays;

public class SumOfSubarraySizeK {
    public static void main(String[] args) {
        int[] nums = {2, 1, 3, 5, 8};
        int k =3;
        int i=0;
        int j=0;

        int windowsum=0;

        int max =0;
        while(j<nums.length){
            
            windowsum += nums[j];


            if(j - i + 1 == k){
                max= Math.max(max , windowsum);
                windowsum -= nums[i];
                i++;

            }   
            j++;
        }
        System.out.println(max);
    }
}
