import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class MergeSortTest {

    private static int totalLoopCount = 0;
    public static class DefaultComparator<E> implements Comparator<E> { //from blackboard
        public int compare(E a, E b) throws ClassCastException {
            return ((Comparable<E>) a).compareTo(b);
        }
    }

    public static <E> void mergeSort(E[] S, Comparator<E> comp) {
        System.out.println("mergeSort called: " + Arrays.toString(S));
        int n = S.length;
        if (n < 2) return;

        int mid = n / 2;
        E[] S1 = Arrays.copyOfRange(S, 0, mid);
        E[] S2 = Arrays.copyOfRange(S, mid, n);

        mergeSort(S1, comp);
        mergeSort(S2, comp);

        merge(S1, S2, S, comp);
    }

    public static <E> void merge(E[] S1, E[] S2, E[] S, Comparator<E> comp) {
        System.out.println("merge called: " + Arrays.toString(S1) + " " + Arrays.toString(S2));
        int i = 0, j = 0, k = 0;
        int mergeLoopCount = 0;

        while (i < S1.length && j < S2.length) {
            mergeLoopCount++;
            totalLoopCount++;
            if (comp.compare(S1[i], S2[j]) <= 0) {
                S[k++] = S1[i++];
            } else {
                S[k++] = S2[j++];
            }
        }
        while (i < S1.length) {
            mergeLoopCount++;
            totalLoopCount++;
            S[k++] = S1[i++];
        }
        while (j < S2.length) {
            mergeLoopCount++;
            totalLoopCount++;
            S[k++] = S2[j++];
        }

        System.out.println("Merge returning S: " + Arrays.toString(S) + " | Loops in this merge: " + mergeLoopCount);
    }

    public static Integer[] generateRandomArray(int n) {
        Integer[] array = new Integer[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(1000); //random
        }
        return array;
    }

    public static void test(int N) {
        totalLoopCount = 0; // reset loop
        Integer[] array = generateRandomArray(N);
        System.out.println("Unsorted array: " + Arrays.toString(array));

        mergeSort(array, new DefaultComparator<>());

        System.out.println("Sorted array: " + Arrays.toString(array));
        double expectedCount = N * (Math.log(N) / Math.log(2));
        System.out.printf("Total while loop count: %d | Expected (N*log2(N)): %.2f%n", totalLoopCount, expectedCount);
    }

    public static void main(String[] args) { //from blackboard
        System.out.println("Hello World - Running Tests");

        // testing powers of 2
        for (int N = 2; N <= 64; N *= 2) {
            System.out.println("\n===== Testing N = " + N + " =====");
            test(N);
        }
    }
}
