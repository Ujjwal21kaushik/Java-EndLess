package paperQuestions;

import java.util.HashMap;

public class containsmostwater {
    public static void main(String[] args) {
        // mostWater();
        // rainWater(); 
        // twoSum(); 
        // buyStock();   
    }
    public static void mostWater() {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int i=0;
        int j = arr.length-1;
        int max =0;

        while(i!=j){
            int h = Math.min(arr[i] , arr[j]);
            int w = j-i;
            int area = h*w;
            max  = Math.max(max , area);

            if(arr[i] < arr[j]){
                i++;
            }else{
                j--;
            }
        }
        System.out.println(max);
    }

    public static void rainWater() {
       int[] arr = { 0,1,0,2,1,0,1,3,2,1,2,1};
       int i =0;
       int j = arr.length-1;

       int maxleft =0;
       int maxright =0;
       int water =0;

       while(i<j){
        if(arr[i] < arr[j]){
            if(arr[i]>=maxleft){
                maxleft = arr[i];
            }else{
                water += maxleft - arr[i]; 
            }
            i++;
        }else{
            if(arr[j]>=maxright){
                maxright = arr[j];
            }else{
                water += maxright - arr[j]; 
            }
            j--;
        }
       }
       System.out.println(water);
    }

    public static void twoSum() {
        int[] arr = {3,2,4};
        int trg = 6;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int diff = trg - arr[i];

            if(map.containsKey(diff)){
                System.out.println(map.get(diff) + "-" +  i);
                break;
            }

            map.put(arr[i] , i);
        }
       

        
    }

    public static void buyStock() {
        int[] arr = {7,1,5,3,6,4};
        int maxdiff = 0;
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
            maxdiff  = Math.max(maxdiff , arr[i]-min);
        }
        System.out.println(maxdiff);
    }

    

}
