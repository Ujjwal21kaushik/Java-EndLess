package Exam2ndYearEndTerm.Stringss;

public class cntVowCon {
    public static void main(String[] args) {
        String s ="sam";
        int v=0;
        int c =0;
        for(char ch : s.toLowerCase().toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'  || ch == 'u'){
                v++;
            }
            else{
                c++;
            }
        }
        System.out.println("vowel: "+ v + " " + "ConsonantS : "+ c);
    }
}
