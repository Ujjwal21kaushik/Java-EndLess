package Exam2ndYearEndTerm.Stringss;

public class StringPalandrom {
    public static void main(String[] args) {
        String s = "stiuts";
        int i=0;
        int j=s.length()-1;
        boolean flag =true;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                flag = false;
                break;
            }
            i++;
            j--;
        }
        if(flag){
            System.out.println(true);
        } else{
            System.out.println(false);
        }
    }
}

