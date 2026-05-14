package paperQuestions;

import java.util.*;

public class longestSubStr {
    public static void main(String[] args) {
        String s = "abcabcbb" ;
        HashSet<Character> set = new HashSet();
        int i =0;
        int j =0;
        int max =0;
        while(j < s.length()){
            char ch =  s.charAt(j);
            if (!set.contains(ch)){
                set.add(ch);
                max = Math.max(max, j-i+1);
                j++;
            }
            else{
                set.remove(s.charAt(i));
                i++;
            }
        } 
        System.out.println(max);
    }
}
