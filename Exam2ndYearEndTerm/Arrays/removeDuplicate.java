package Exam2ndYearEndTerm.Arrays;

import java.util.*;

public class removeDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 5, 5, 8};
        HashSet<Integer> set = new HashSet();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        System.out.println(set);
    }
}
