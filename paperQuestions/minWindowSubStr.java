package paperQuestions;
import java.util.*;
public class minWindowSubStr {
    public static void main(String[] args) {
        String s= "ECODEBANC" ;
        String t = "ABC" ;
        HashMap<Character , Integer> map = new HashMap();
        int i=0 , j=0;
        int min = s.length();

        for(int z =0 ; z<t.length(); z++){
            char ch = t.charAt(z);
            map.put(ch , map.getOrDefault(ch,0)+1);
        }
        int count = map.size();
        while(j<s.length()){
            char ch = s.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch , map.get(ch)-1);
                if(map.get(ch) ==0){
                    count--;
                }
            }
            

            while(count==0){
                min = Math.min(min , j-i+1);

                char l = s.charAt(i);

                if(map.containsKey(l)){
                    map.put(l , map.get(l)+1);

                    if(map.get(l)>0) count++;
                }
                i++;
            }

            j++;
        }

        System.out.println(min);
    }
}
