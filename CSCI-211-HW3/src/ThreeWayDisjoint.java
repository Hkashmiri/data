public class ThreeWayDisjoint {

    /** looks for common value */
    public static boolean disjoint1(int[] groupA, int[] groupB, int[] groupC) {
        for (int a : groupA) {
            for (int b : groupB) {
                for (int c : groupC) {
                    if ((a == b) && (b == c)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /** an array of sequential integers */
    public static int[][] generateSequentialIntArrays(int numArrays, int size) {
        int[][] arrays = new int[numArrays][size];
        for (int i = 0; i < numArrays; i++) {
            for (int j = 0; j < size; j++) {
                arrays[i][j] = i * size + j;
            }
        }
        return arrays;
    }

    public static void main(String[] args) {
        int size1 = 1000;
        int size2 = 2000;

        System.out.println("Running ThreeWayDisjoint with size " + size1 + " and " + size2);

        int[][] arrays1 = generateSequentialIntArrays(3, size1);
        int[][] arrays2 = generateSequentialIntArrays(3, size2);

        long startTime = System.nanoTime();
        boolean result1 = disjoint1(arrays1[0], arrays1[1], arrays1[2]);
        long endTime = System.nanoTime();
        System.out.println("Size " + size1 + ": " + result1 + ", Time: " + (endTime - startTime) / 1e6 + " ms");

        startTime = System.nanoTime();
        boolean result2 = disjoint1(arrays2[0], arrays2[1], arrays2[2]);
        endTime = System.nanoTime();
        System.out.println("Size " + size2 + ": " + result2 + ", Time: " + (endTime - startTime) / 1e6 + " ms");
    }
}
