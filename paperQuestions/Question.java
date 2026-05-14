package paperQuestions;

import java.util.*;

public class Question {
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(repeatedNumber(109880)));
        //PossiblePalindrome();
        //PossibleAlphaPalindrome();
        //CreatePinAlpaBetaGama();
        //WeightOfString();
        //rover();
        //addString();
        //identitfyPossibleWord();
        //identifyWordTwo();
        //encodedThreeStr();
        //nambiarNumber();
        //Password();
        //Add_sub();
        //userId();
//        pin();
        //arrluck();
        // image();
    }

    static int[] repeatedNumber(int n){
//        int n = 1098800;
        int[] freq = new int[10];
        if(n==0){
            freq[0] = 1;
        }
        while(n>0){
            freq[n%10]++;
            n = n/10;
        }
//        return freq;
//        System.out.println(Arrays.toString(freq));
//        int count = 0;
//        for(int i : freq){
//            if(i>1){
//                count++;
//            }
//        }
//        System.out.println(count);
        int max =0;
        int digit =0;
        for (int i = 0; i < 10; i++) {
            if(freq[i] > max){
                max = freq[i];
                digit = i;
            } else if (freq[i] == max && i > digit) {
                digit = i;
            }
        }
//        System.out.println(digit);
        return freq;
    }

    static void PossiblePalindrome(){
        int n = 1001;
        int[] check = repeatedNumber(n);
        int oddcheck = 0;
        for(int i:check){
            if(i % 2!=0){
                oddcheck++;
            }
        }
        System.out.println(oddcheck > 1 ? false :true);

    }

    static void PossibleAlphaPalindrome(){
        HashMap<Character , Integer> map = new HashMap<>();
        int[]freq = new int[26];
        String s ="ababccde";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            map.put(ch , map.getOrDefault(ch , 0)+1);

        }
        int cnt =0;
        char st =' ';
        for(Character i : map.keySet()){
            if(map.get(i) % 2!=0){
                cnt++;
                st = i;
            }
        }
        System.out.println(st);
        System.out.println(cnt >1 ? false : true);
    }

    static void CreatePinAlpaBetaGama(){
        int a = 0;
        int b = 0;
        int g = 1;
        long val = 1L * a * 1000003 + 1L * b *1009 + g;
        val = Math.abs(val);

        String s = Long.toString(val % 10000);

        while(s.length()<4){
            s = "0" + s;
        }
        System.out.print("value is :" +  val + " Last four digits : " + s);
    }

    static void WeightOfString(){
        String s = "Ab3#";
        if(s==null) System.out.print("0");
        s=s.toLowerCase();
        char[] ch_s = s.toCharArray();
        int cnt =0;
        for(char c : ch_s){
            if(Character.isLetter(c)){
                cnt += ((int)c - 'a')+1;
            } else if (Character.isDigit(c)) {
                cnt += c - '0';
            }else {
                cnt += (c % 26)+1;
            }
        }
        System.out.println(cnt);
    }

    static void rover() {
        int[] arr = {2, 3, 1, 1, 5, 4};
        int jumps = 0, end = 0, far = 0;

        for (int i = 0; i < arr.length-1; i++) {
            far = Math.max(far, i + arr[i]);
            if (i == end) {
                jumps++;
                end = far;
            }
        }
        System.out.println(jumps );
        System.out.println(far);
        System.out.println(end);
    }

    static void addString(){
        String s1 = "987654321987654321";
        String s2 = "123456789123456789";

        int i = s1.length()-1;
        int j = s2.length()-1;
        int carry =0;
        int sum=0;
        StringBuilder res = new StringBuilder();
        while(i>=0 || j>=0 || carry >0){
            int d1 = i>=0 ? s1.charAt(i--) - '0' : 0;
            int d2 = j>=0 ? s2.charAt(j--) - '0' : 0;
            sum = d1 +d2 +carry;

            res.append(sum%10);
            carry = sum /10;
        }
        System.out.println(res.reverse().toString());
    }

    static void identitfyPossibleWord(){
        String s ="eat";
        String[] dict = {"cat" , "Tea" , "at" , "ate"};
        int[] freq = new int[26];
        ArrayList<String> res = new ArrayList<>();
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }
        for(String word : dict){
            boolean f =true;
            int[] temp  = Arrays.copyOf(freq , 26);
            for(char c : word.toLowerCase().toCharArray()){
                if(--temp[c -'a'] < 0){
                    f = false;
                    break;
                }
            }
            if(f) res.add(word);
        }
        System.out.println(res);
    }

    static void identifyWordTwo(){
        String input1 = "Fi_er";
        String input2 = "Filter:Filer:Fixer:Fiter";

        String[] spl = input2.split(":");
        String pattern = input1.toLowerCase();
        int uniqchar = pattern.indexOf("_");
        StringBuilder sb = new StringBuilder();
        for(String word : spl){

            if(word.length() != pattern.length()) continue;
            String lw = word.toLowerCase();
            boolean flag = true;
            for (int i = 0; i < lw.length(); i++) {
                if(i==uniqchar) continue;

                if(lw.charAt(i)!=pattern.charAt(i)) {
                    flag = false;
                    break;
                }
            }
            if(sb.length()>0) sb.append(":");
            sb.append(lw.toUpperCase());
        }
        System.out.println(sb.toString());
    }

    static void encodedThreeStr(){
        String one = "John";
        String two = "Johny";
        String three = "Janardhan";
        String[] p1 = splitIntoThree(one);
        String[] p2 = splitIntoThree(two);
        String[] p3 = splitIntoThree(three);
//        System.out.println(Arrays.toString(p1));
//        System.out.println(Arrays.toString(p2));
//        System.out.println(Arrays.toString(p3));
        String sone = p1[0] + p2[0] + p3[0];
        String stwo = p1[1] + p2[1] + p3[1];
        String sthree = p1[2] + p2[2] + p3[2];

        System.out.println(sone);
        System.out.println(stwo);
        System.out.println(sthree);
//        System.out.println(sthree.equals(sthree.toLowerCase()) ? sthree.toUpperCase() : sthree);


    }
    
    static String[] splitIntoThree(String s){
        int len = s.length();
        int base = len/3;
        int rem = len%3;
        int f = base;
        int m = base;
        int e = base;

        if(rem == 1){
            m++;
        } else if (rem == 2) {
            f++;
            e++;
        }

        String front = s.substring(0 , f);
        String middel = s.substring(f , f+m);
        String end = s.substring(f+m);

        return new String[]{front , middel , end};
    }

    static void nambiarNumber(){
        String num = "9880127431";
        int i =0;

        String ans ="";
        while(i < num.length()){
            int first = num.charAt(i) - '0';
            int sum = first;
            i++;
            if(first %2 ==1){
                while(sum %2==1 && i < num.length()){
                    int next = num.charAt(i) - '0';
                    sum += next;
                    i++;
                }
            }
            else{
                while(sum %2==0 && i < num.length()){
                    int next = num.charAt(i) - '0';
                    sum += next;
                    i++;
                }
            }
            ans += sum;
        }
        System.out.println(ans);
    }

    static void Password(){
        String st = "12312";

        int[] f = new int[9];
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            f[ch - '0']++;
        }
        int expected = 0;
        for(int i : f){
            if (i >0){
                expected = i;
                break;
            }
        }
        boolean flag= true;
        for(int i : f){
            if(i != expected && i > 0){
                flag =false;
                break;
            }
        }
        if(flag) System.out.println("stable");
        else System.out.println("Unsatble");
    }

    static void Add_sub(){
        int input1 = 6;
        int input2 = 2;
        int result = 0;
        int sign = 1;
        if (input2 == 1) {
            for(int i = input1; i >= 1; i--) {
                result += sign*i;
                sign *= -1;
            }
        }
        else if (input2 == 2) {
            result = input1;
            for(int i = input1 - 1; i >= 1; i--) {
                result += sign*i;
                sign *= -1;
            }
        }
        System.out.println( result);
    }

    static void userId(){
        String one = "Manoj";
        String two = "Kumars";
        int pin = 528627;
        int n =6;
        String small ="";
        String longs ="";
        if(one.length() > two.length()) {
            small = two;
            longs =one;
        }
        else if(one.length() < two.length()){
            small = one;
            longs = two;
        }else {
            if (one.compareTo(two) < 0) {
                small = one;
                longs = two;
            } else {
                small = two;
                longs =one;
            }
        }
        char lastsmallchar = small.charAt(small.length() -1 );
        String pinS = String.valueOf(pin);
        char leftpin = pinS.charAt(n-1);
        char rightpin = pinS.charAt(pinS.length() - n );
        String main ="";
        main += lastsmallchar + longs + leftpin + rightpin;
        System.out.println(toogle(main));
    }
    
    static String toogle(String s){
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isUpperCase(c)){
                char t = Character.toLowerCase(c);
                sb.append(t);
            }else if(Character.isLowerCase(c)){
                char t = Character.toUpperCase(c);
                sb.append(t);
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }


    static void pin(){
        int one = 987;
        int two = 416;
        int three = 523;
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list1 = new ArrayList();
        ArrayList<Integer> list2 = new ArrayList();
        ArrayList<Integer> list3 = new ArrayList();
        int d1 = one%10;
        int d2 = two%10;
        int d3 = three%10;
        list1.add(d1);
        list1.add(d2);
        list1.add(d3);
        one /= 10;
        two/=10;
        three/=10;
        list2.add(one%10);
        list2.add(two%10);
        list2.add(three%10);
        one/=10;
        two/=10;
        three/=10;
        list3.add(one%10);
        list3.add(two%10);
        list3.add(three%10);
        System.out.println(list2);
        int min1 = Collections.min(list1);
        int min2 = Collections.min(list2);
        int min3 = Collections.min(list3);

        int sum =0;
        for (int i = 0; i < list1.size(); i++) {
            sum += list1.get(i);
            sum += list2.get(i);
            sum += list3.get(i);
        }
        sb.append(sum).append(min1).append(min2).append((min3));
//        System.out.print(sum + " " + min1 + " " + min2 + " " + min3);
        System.out.println(sb.toString());


    }

    static void arrluck(){
        int[][] arr = {
            {1,3,5} , {4,2,6} , {10 ,12 ,15}
        };
        int res =0;
        for (int i = 0; i < arr.length; i++) {
            int min = Integer.MAX_VALUE;
            int col =0;

            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]<min){
                    min = arr[i][j];
                    col = j;
                }
            }
            boolean luck = true;

            for (int k = 0; k < arr.length; k++) {
                if(arr[k][col] > min){
                    luck = false;
                }
            }
            if(luck){
                res = min;
            }
        }
        System.out.println(res);


    }


    static void image() {
        int[][] arr = {
                {1, 1, 0}, {0, 1, 0}, {1, 0, 1}
        };
        int m = arr.length;
        int n = arr[0].length;
        for (int[] a : arr) {
            int l = 0;
            int r = n - 1;

            while (l < r) {
                int temp = a[l];
                a[l] = a[r];
                a[r] = temp;
                l++;
                r--;
            }
            System.out.println(Arrays.toString(a));
            for (int i = 0; i < m; i++) {
                a[i] ^= 1;
            }
            System.out.println(Arrays.toString(a));
        }
    }
}


