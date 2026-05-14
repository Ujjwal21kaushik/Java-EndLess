package paperQuestions;

import java.util.ArrayList;

public class swMax {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7} ;
        int k = 3 ;

        int i=0,j=0;
        ArrayList<Integer> list = new ArrayList<>();
        while(j< nums.length){
            if(j-i+1 < k) j++;

            else if(j-i+1==k){
                int max = nums[i];
                
                for (int x = i; x <= j; x++) {
                    max = Math.max(max, nums[x]);
                }
                list.add(max);
                i++;
                j++;
            }
        }
        System.out.println(list);
    }
}
