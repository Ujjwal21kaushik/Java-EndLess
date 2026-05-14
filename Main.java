import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void swap(int[] arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
//    write your code
//        if(searchInSorted()==-1){
//            System.out.println(false);
//        }else{
//            System.out.println(true);
//        }
//        subarraySum();
        combine();

    }

    static void sortedArr(){
        int[] list1 = {1,2,4} ;
        int[]  list2 = {1,3,4};

        int len = list1.length + list2.length; // 6
        int maxlen = list1.length > list2.length ? list1.length : list2.length;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            if (i<len-maxlen){    // 6-3 = 3
                arr[i] = list1[i];

            }
            else{
                arr[i] = list2[i - maxlen]; // 3-3 , 4-3 , 5-3
            }
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void roamnTointeger(){
        HashMap<Character , Integer> map = new HashMap<>();
        map.put('I' , 1);
        map.put('V' , 5);
        map.put('X' , 10);
        map.put('L' , 50);
        map.put('C' , 100);
        map.put('D' , 500);
        map.put('M' , 1000);

        String s ="III";
//        String s ="MCMXCIV";
        int sum = 0;

        for(int i =0 ; i < s.length()-1; i++){
            char currentChar = s.charAt(i);
            char nextChar = s.charAt(i + 1);
            if(map.get(currentChar) < map.get(nextChar)){
                sum -= map.get(currentChar);
            }else {
                sum += map.get(currentChar);
            }
        }
        sum += map.get(s.charAt(s.length()- 1));
        System.out.println(sum);
    }

    static void colorSort(){
        int[] arr = {1,2,0,2,0,1};
        int i=0;
        int j =0;
        int k = arr.length - 1;

        while(j<= k){
            if(arr[j] == 0){
                swap(arr , j , i);
                i++;
                j++;
            }
            else if(arr[j] == 1) j++;
            else{
                swap(arr , j , k);
                k--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void beststock(){
        int[] arr = {2,4,1};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
                idx = i;
            }
        }
//        System.out.println(min +"="+  idx);
        for (int i = idx; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
//        System.out.println(max - min);


        int min_price = arr[0];
        int max_diff = 0;
        for (int i = 1; i < arr.length; i++) {
            if(min_price > arr[i]){
                min_price = arr[i];
            }

            max_diff = Math.max(max_diff , arr[i]-min_price);
        }
        System.out.println(max_diff);


    }

    static  void containerWithMostWater(){
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int max =0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i; j < arr.length; j++) {
                max = Math.max(max , (j-i)*Math.min(arr[i] , arr[j]));
            }
        }
        System.out.println(max);
    }

    static void removeDuplicate(){
        int[] nums={1,1,1,2,2,3};
        int j =2;
        for (int i = 2; i < nums.length; i++) {
            if(nums[i]!=nums[j-2]){
                nums[j]=nums[i];
                j++;
            }
        }
        System.out.println(j);
    }


    static void maxChunkToMakeSortedII(){
        int[] arr = {1,1,0,0,1};
        int[] sorted_arr = arr.clone(); // [0,0,1,1,1]
        Arrays.sort(sorted_arr);
        int max1 = -1,max2 =-1;
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            max1 = Math.max(max1, arr[i]);
            max2 = Math.max(max2, sorted_arr[i]);
            if(max1==max2){
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    static int searchInSorted(){
        int[] arr = {2,5,6,0,0,1,2};
//        int[] arr = {7,5,4,3,2};
        int trg = 0;
        int start =0;
        int end = arr.length-1;
        boolean is_Asc = arr[start] < arr[end];
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == trg){
                return mid;
            }
            if(is_Asc){
                if(arr[mid] >  trg){
                    end = mid -1;
                } else{
                    start = mid +1 ;
                }
            }else{
                if(arr[mid] <  trg){
                    end = mid -1;
                } else{
                    start = mid +1 ;
                }
            }

        }
        return -1;
    }

    static void maxSubarrya(){
        int[] nums ={-2,1,-3,4,-1,2,1,-5,4};
        int sum =0;
        int max =0;
        for (int i = 0; i < nums.length; i++) {
            if(sum<0){
                sum = nums[i];

            }else{
                sum += nums[i];

            }
            if(max<sum){
                max=sum;
            }
        }
        System.out.println(max);
    }

    static void minimizeMaximumPairSuminArray(){
        int[] nums = {3,5,2,3};
        Arrays.sort(nums);
        int i =0;
        int j =nums.length-1;
        int max =0;
        while(i<j){
            max = Math.max(max , (nums[i]+nums[j]));
            i++;
            j--;
        }
        System.out.println(max);
    }

    static void subarraySum(){
        int[] nums={1,2,3};
        int k =3;
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        int cnt =0;
        for(int i =0; i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum - k)){
                cnt += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        System.out.println(cnt);

    }

    static void combine(){
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        String digits = "23";

        List<String> res = new ArrayList<>();
        if (digits == null || digits.length() == 0)
            System.out.println(res);

        res.add("");

        for(char digit: digits.toCharArray()){
            List<String> temp = new ArrayList<>();
            String letters = map.get(digit);

            for (String comb : res) {
                for (char ch : letters.toCharArray()) {
                    temp.add(comb + ch);
                }
            }
            res = temp;

        }
        System.out.println(res);
    }


}