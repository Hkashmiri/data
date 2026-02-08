public class ThreeWayDisjointImproved {

    /** common val */
    public static boolean disjoint2(int[] groupA, int[] groupB, int[] groupC) {
        for (int a : groupA) {
            for (int b : groupB) {
                if (a == b) {
                    for (int c : groupC) {
                        if (a == c) {
                            return false; // two loops and not a third (unless there is a match)
                        }
                    }
                }
            }
        }
        return true;  //no common values
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

        System.out.println("Running ThreeWayDisjointImproved with size " + size1 + " and " + size2);

        int[][] arrays1 = generateSequentialIntArrays(3, size1);
        int[][] arrays2 = generateSequentialIntArrays(3, size2);

        long startTime = System.nanoTime();
        boolean result1 = disjoint2(arrays1[0], arrays1[1], arrays1[2]);
        long endTime = System.nanoTime();
        System.out.println("Size " + size1 + ": " + result1 + ", Time: " + (endTime - startTime) / 1e6 + " ms");

        startTime = System.nanoTime();
        boolean result2 = disjoint2(arrays2[0], arrays2[1], arrays2[2]);
        endTime = System.nanoTime();
        System.out.println("Size " + size2 + ": " + result2 + ", Time: " + (endTime - startTime) / 1e6 + " ms");
    }
}
