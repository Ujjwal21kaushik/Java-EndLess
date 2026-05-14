package paperQuestions;

public class longRepeatChar {
    public static void main(String[] args) {
        String s = "BWBWB";
        int k =1;
        int i=0;
        int[] freq = new int[26];
        int max =0;
        int ans =0;
        for(int j=0;j<s.length();j++){

            freq[s.charAt(j) - 'A']++;
            max = Math.max(max,freq[s.charAt(j) - 'A']);

            if((j-i+1)- max > k){
                freq[s.charAt(i) - 'A']--;
                i++;
            }
            ans = Math.max(ans,j-i+1);
        }
        
        System.out.println(ans);
    }
} 
