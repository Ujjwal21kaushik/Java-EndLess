package Exam2ndYearEndTerm.Arrays;

public class twoSumSortedArr {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8};
        int target = 8;

        int i = 0;
        int j = arr.length - 1;
        boolean found = false;

        while (i < j) {
            int sum = arr[i] + arr[j];

            if (sum == target) {
                found = true;
                break;
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        if (found) {
            System.out.println("[" + i + ", " + j + "]");
        } else {
            System.out.println("Not Found");
        }
    }
}
