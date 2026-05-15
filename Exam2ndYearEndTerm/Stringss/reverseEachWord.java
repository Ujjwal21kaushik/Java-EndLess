package Exam2ndYearEndTerm.Stringss;

public class reverseEachWord {
    public static void main(String[] args) {
        String s = "hello coders life is endless";

        String[] words = s.split(" ");

        String ans = "";


        for (String word : words) {
            ans += reverse(word) + " ";
        }

        System.out.println(ans);
    }

    private static String reverse(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
                rev += str.charAt(i);
        }
        return rev;
    }


}
