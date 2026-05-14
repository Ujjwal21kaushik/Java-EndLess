package SlidingWindow;

import java.util.*;

public class countAllAnagram {
    public static void main(String[] args) {
            String str = "forxxorfxaofr";
            String pattern = "for";
            int k = pattern.length();
            int i =0, j=0;
            HashMap<Character,Integer> map = new HashMap();
            for(int z=0; z<k;z++){
                char ch = pattern.charAt(z);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            int count = map.size();
            int ans =0;
            int first_idx =-1;
            int last_idx =-1;
            while(j<str.length()){
                // calculation
                char ch = str.charAt(j);
                if(map.containsKey(ch)){
                    map.put(ch , map.get(ch)-1);

                    if(map.get(ch)==0) count--;
                }

                if(j-i+1<k) j++;

                else if(j-i+1 == k){
                    // ans
                    if(count ==0){
                        ans++;
                        if(first_idx == -1){
                            first_idx = i;
                        }
                        last_idx = i;
                    } 

                    char chOfi = str.charAt(i);
                    if(map.containsKey(chOfi)){
                        map.put(chOfi , map.get(chOfi)+1);

                        if(map.get(chOfi)==1) count++;
                        
                    }
                    i++;
                    j++;
                }
            }
            System.out.println(ans);
            System.out.println(first_idx);
            System.out.println(last_idx);
    }
}
