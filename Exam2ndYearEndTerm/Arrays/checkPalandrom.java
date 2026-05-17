package Exam2ndYearEndTerm.Arrays;

import java.util.*;


public class checkPalandrom {
    public static void main(String[] args) {
        // int[] arr = {1,2,3,2};

        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int i=0;
        int j=arr.length-1;
        boolean flag =true;


        while(i<j){
            if(arr[i]!=arr[j]){
                flag = false;
                break;
            }
            i++;
            j--;
        }


        if(flag== true){
            System.out.println(true);
        } else{
            System.out.println(false);
        }
    }

}
