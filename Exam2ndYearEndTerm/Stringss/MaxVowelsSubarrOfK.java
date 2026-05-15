package Exam2ndYearEndTerm.Stringss;

public class MaxVowelsSubarrOfK {
    public static void main(String[] args) {
        String s = "abciiidef";
        int k =3;
        char[] c = s.toCharArray();
        int i=0;
        int j =0;
        int max =0;
        int vowels =0;

      
        while(j<s.length()){
            if(isVowels(c[j])) {
                vowels++;
            }

            if(j - i + 1 == k){
                max = Math.max(max ,vowels);
                if(isVowels(c[i])){
                    vowels--;
                } 
                i++;

            }
            j++;
        }
        System.out.println(max);
    }

    private static boolean isVowels(char ch) {
        
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'  || ch == 'u'){
            return true;
        }

        return false; 
    }
}
