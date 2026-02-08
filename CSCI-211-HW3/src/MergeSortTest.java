import java.util.Arrays;
import java.util.Comparator;

public class MergeSortTest {

    public static class DefaultComparator<E> implements Comparator<E> {
        public int compare(E a, E b) throws ClassCastException {
            return ((Comparable<E>) a).compareTo(b); // from blackboard
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
        while (i < S1.length && j < S2.length) {
            if (comp.compare(S1[i], S2[j]) <= 0) {
                S[k++] = S1[i++];
            } else {
                S[k++] = S2[j++];
            }
        }
        while (i < S1.length) S[k++] = S1[i++];
        while (j < S2.length) S[k++] = S2[j++];

        System.out.println("Merge returning S: " + Arrays.toString(S));
    }

    public static void test() { //from blackboard
        String[] array1 = {"George", "Frank", "Charlie", "Don", "Ed", "Arnold", "Bob", "Harold"};
        mergeSort(array1, new DefaultComparator<>());
        System.out.println("Sorted array: " + Arrays.toString(array1));
    }

    public static void main(String[] args) { // from blackboard
        System.out.println("Hello World - Running Test Now");
        test();
    }
}

