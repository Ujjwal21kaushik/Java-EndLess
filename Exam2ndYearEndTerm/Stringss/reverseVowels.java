package Exam2ndYearEndTerm.Stringss;

public class reverseVowels {
    public static void main(String[] args) {
        String s = "hello";
        char[] arr = s.toCharArray();
        int i =0;
        int j=arr.length-1;

        while(i<j){

            while(i<j && !isVowels(arr[i])){
                i++;
            }
            while(i<j && !isVowels(arr[j])){
                j--;
            }

            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        System.out.println(new String(arr));
    }

    private static boolean isVowels(char ch) {
        
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'  || ch == 'u'){
            return true;
        }

        return false; 
    }
}
