package stacks.problems;

public class sprialMatrix {
    public static void main(String[] args) {
        int top =0;
        int bottom = matrix.length -1;
        int left =0;
        int right = matrix[0].length -1;


        for(int i= left; i<= right; i++){
            res.add(matrix[top][j]);
            top++;
        }
        for(int i= top; i<= bottom; i++){
            res.add(matrix[i][right]);
            top++;
        }
        if(top<=bottom){
            for(int i= top; i>= bottom; i--){
            res.add(matrix[bootom][j]);
        }
        bottom--;
        }
        if(left<=right){
            for(int i= right; i>= left; i--){
            res.add(matrix[i][right]);
        }
        left++;
        }
        return res;
    }
}
