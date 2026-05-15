package Exam2ndYearEndTerm.Arrays;

public class checkPalandrom {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
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
        if(flag){
            System.out.println(true);
        } else{
            System.out.println(false);
        }
    }

}
