import java.util.Arrays;

public class HeapSort {

    String complexity;

    HeapSort() {

        complexity = ". Quasilinear Time Complexity.";

    }

    void sort(int[] sortArray) {

        /*
        Begin Time Start
         */
        double start = (double) System.nanoTime();

        for (int count = (sortArray.length / 2) - 1; count >= 0; count--) {

            heapify(sortArray, sortArray.length, count);

        }

        for (int count = sortArray.length - 1; count >= 0; count--) {

            int tempInt = sortArray[0];
            sortArray[0] = sortArray[count];
            sortArray[count] = tempInt;

            heapify(sortArray, count, 0);

        }

        /*
        End Time
         */
        double end = (double) System.nanoTime();

        System.out.println("HeapSort: " + Arrays.toString(sortArray) + complexity + " Seconds taken was " + ((end - start) / 1000000));
    }

    void heapify(int[] sortArray, int length, int count) {

        int top = count;
        int left = (2 * count) + 1;
        int right = (2 * count) + 2;

        if (left < length && sortArray[left] > sortArray[top]) {

            top = left;

        }

        if (right < length && sortArray[right] > sortArray[top]) {

            top = right;
        }

        if (top != count) {

            int tempInt = sortArray[count];
            sortArray[count] = sortArray[top];
            sortArray[top] = tempInt;

            heapify(sortArray, length, top);

        }

    }

}
