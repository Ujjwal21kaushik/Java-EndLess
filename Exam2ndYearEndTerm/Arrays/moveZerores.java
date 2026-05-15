package Exam2ndYearEndTerm.Arrays;

public class moveZerores {
    public static void main(String[] args) {
        int[] arr = {1, 3, 0, 8, 0, 9, 0, 6, 7};
        int j =0;
        int[] newArr = new int[arr.length];
        for (int idx = 0; idx < arr.length; idx++) {
            if(arr[idx]!=0){
                newArr[j]=arr[idx];
                j++;
            }
            
        }
            
        for (int idx = 0; idx < arr.length; idx++) {
                System.out.print((newArr[idx]!=0 ? newArr[idx] : 0)+ " ");
        }
        
    }
}
