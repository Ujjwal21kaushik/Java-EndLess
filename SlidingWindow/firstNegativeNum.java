package SlidingWindow;

import java.util.ArrayList;

public class firstNegativeNum {
    public static void usingArrList(int[] arr ,int k) {
        int i=0,j=0;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> negList = new ArrayList<>();
        while(j<arr.length){
            list.add(arr[j]);
            if(j-i+1 < k){
                j++;
            }
            else if(j-i+1 == k && list.size()==k){
                int f =0;
                for(int z =0 ; z<list.size() ; z++){
                    if(list.get(z)<0){
                        negList.add(list.get(z));
                        f=1;
                        break;
                    }
                }
                if(f==0) negList.add(0);    
                list.remove(0);
                i++;
                j++;

            }
        }
        System.out.println(negList);
    }
    
    public static void usingSw(int[] arr ,int k){
        int i=0,j=0;
        ArrayList<Integer> negList = new ArrayList<>();
        while(j<arr.length){
            if(arr[j]<0){
                negList.add(arr[j]);
            }

            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                if (negList.size()==0) {
                    System.out.print("0 ");
                }
                else{
                    System.out.print(negList.get(0)+" ");
                }
                if(negList.size()>0 && arr[i]==negList.get(0)){
                    negList.remove(0);
                }
                i++;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {12,-1,-7,8,-18,0,16,28};
        int k=3;
        // usingArrList(arr, k);
        usingSw(arr, k);
    }
}
