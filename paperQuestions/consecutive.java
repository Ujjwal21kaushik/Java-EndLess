package paperQuestions;

import java.util.*;


public class consecutive {
    public static void main(String[] args) {
        // consec();
        // topk();
        // anagram();
    }


    public static void consec() {
        int[] nums = {100,4,200,1,3,2};  // 1 ,2,3,4,100,200//
        Arrays.sort(nums);
        int cnt =1;
        int max=1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]+1){
                cnt++;
            }else if(nums[i]!=nums[i-1]){
                cnt=1;
            }
            max = Math.max(max, cnt);
        }
        System.out.println(max);
    }

    public static void topk() {
        int[] nums = {1,1,1,2,2,3};
        int k =2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i] , map.getOrDefault(nums[i], 0)+1);
        }
        int max =-1;
        int key = -1;
        while(k>0){
           for(int n : map.keySet()){
                if(map.get(n) > max){
                    max = map.get(n);
                    key = n;
                }
           }
           System.out.println(key);
           map.remove(key);
           max=-1;
           k--;
        }
    }

    public static void anagram() {
        String s = "listen";
        String t = "silent";
        HashMap<Character , Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch , map.getOrDefault(ch, 0)+1);
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch , map.get(ch)-1);
            }
        }
        int f =0;
        for(char n : map.keySet()){
            if(map.get(n) != 0){
                f =1;
            } 
        }
        boolean ft = f==1 ? false : true;
        System.out.println(ft);
    }
 










}
