import java.util.Arrays;

public class IterativeQuickSort {

    String complexity;

    IterativeQuickSort() {

        complexity = ". Quasilinear Time Complexity.";

    }

    void sort(int[] sortArray) {

        /*
        Begin Time Start
         */
        double start = (double) System.nanoTime();

        sortArray = sort(sortArray, 0, sortArray.length - 1);

        /*
        End Time
         */
        double end = (double) System.nanoTime();

        System.out.println("IterativeQuickSort: " + Arrays.toString(sortArray) + complexity + " Seconds taken was " + ((end - start) / 1000000));

    }

    int[] sort(int[] sortArray, int lo, int hi) {

        int[] stack = new int[hi - lo + 1];

        int topStack = -1;

        stack[++topStack] = lo;
        stack[++topStack] = hi;

        while (topStack >= 0) {

            hi = stack[topStack--];
            lo = stack[topStack--];

            int partitionIndex = partition(sortArray, lo, hi);

            if (partitionIndex - 1 > lo) {

                stack[++topStack] = lo;
                stack[++topStack] = partitionIndex - 1;

            }

            if (partitionIndex + 1 < hi) {

                stack[++topStack] = partitionIndex + 1;
                stack[++topStack] = hi;

            }

        }

        return sortArray;

    }

    int partition(int[] sortArray, int lo, int hi) {

        int pivot = sortArray[hi];

        int returnNum = (lo - 1);

        for (int count = lo; count < hi; count++) {

            if (sortArray[count] <= pivot) {

                returnNum++;

                int tempInt = sortArray[returnNum];
                sortArray[returnNum] = sortArray[count];
                sortArray[count] = tempInt;

            }

        }

        int tempInt = sortArray[returnNum + 1];
        sortArray[returnNum + 1] = sortArray[hi];
        sortArray[hi] = tempInt;

        return (returnNum + 1);
    }

}
