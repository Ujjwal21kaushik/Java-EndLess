package Recursion;

public class BasicsOfRecursions {
    public static void main(String[] args) {

//        System.out.println(fact(5 ,  1));
//        int[] arr ={1,4,6,2,5,7};
//        System.out.println(search(arr, 0 , 5));




    }
    public static void pd(int n){
        if(n==0){
            return ;
        }

        System.out.println(n);
        pd(n-1);

    }

    public static void pi(int n){
        if(n==0){
            return ;
        }

        pi(n-1);
        System.out.println(n);

    }

     public static int fact(int n , int ans){
        if(n==0) return ans;

//        int sp = fact(n-1);
//        int self = n * sp;

        return fact(n-1 , n*ans);
     }

    public static int search(int[] arr , int i , int val){
        if(i==arr.length) return -1;

        if(arr[i] == val){
            return i;
        }

        return search(arr , i+1 , val);
    }




}
