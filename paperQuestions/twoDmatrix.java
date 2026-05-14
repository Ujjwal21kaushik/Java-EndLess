package paperQuestions;

import java.util.Arrays;

public class twoDmatrix {
    public static void main(String[] args) {
        int[][] arr = {{3,4,2,3},{2,3,4,2}};
        int x = 0;
        int y=2;
        int k =2;
        int n = arr.length;
        for(int i =0; i<k >>1; i++){
            for(int j = 0; j<k;j++){
                int temp = arr[x+i][y+j];
                arr[x+i][y+j] = arr[x+k-i-1][y+j];
                arr[x+k-i-1][y+j] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));


    }
}
