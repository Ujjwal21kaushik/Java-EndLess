public class GenneralQues {
    public static void main(String[] args) {
        int[] n = {2,1,3};

        int max = 0;

        // Find max height
        for (int num : n) {
            max = Math.max(max, num);
        }

        // Print pattern
        for (int i = max; i >= 1; i--) {
            for (int j = 0; j < n.length; j++) {
                if (n[j] >= i) {
                    System.out.print("X ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
