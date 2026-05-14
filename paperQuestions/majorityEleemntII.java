package paperQuestions;

public class majorityEleemntII {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 4, 5, 3};
        int cnt1 = 0;
        int cnt2 = 0;
        int val1 = -1;
        int val2 = -1;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == val1) {
                cnt1++;
            } else if (nums[i] == val2) {
                cnt2++;
            } else if (cnt1 == 0) {
                val1 = nums[i];
                cnt1 += 1;
            } else if (cnt2 == 0) {
                val2 = nums[i];
                cnt2 += 1;
            } else {
                cnt1--;
                cnt2--;
            }
        }
        System.out.println(val1 + "-" + val2);
        int c1 = 0;
        int c2 = 0;
        for (int num : nums) {
            if(num == val1) c1++;
            else if (num == val2) {
                c2++;
            }
        }
        if(c1>(n/3) && c2 > n/3){
            System.out.println("["+val1 + "," +val2+"]");
        }else if(c2 > n/3){
            System.out.println(val2);
        }else if(c1>n/3){
            System.out.println(val1);
        }
        else{
            System.out.println("[]");
        }
    }
}
