import java.util.Arrays;

public class StoogeSort {

    String complexity;

    StoogeSort() {

        complexity = ". O(nlog 3/log 1.5) Complexity.";

    }

    void sort(int[] sortArray) {

        /*
        Begin Time Start
         */
        double start = (double) System.nanoTime();

        // Recursive sort, reminiscent of bubble sort
        stoogeSort(sortArray);

        /*
        End Time
         */
        double end = (double) System.nanoTime();

        System.out.println("StoogeSort: " + Arrays.toString(sortArray) + complexity + " Seconds taken was " + ((end - start) / 1000000));
    }

    void stoogeSort(int[] sortArray) {

        stoogeSort(sortArray, 0, (sortArray.length - 1));

    }

    void stoogeSort(int[] sortArray, int first, int last) {

        if (sortArray[last] < sortArray[first]) {

            int tempInt = sortArray[first];
            sortArray[first] = sortArray[last];
            sortArray[last] = tempInt;

        }

        if ((last - first) >  1) {

            int tempInt = (last - first + 1) / 3;

            stoogeSort(sortArray, first, (last - tempInt));
            stoogeSort(sortArray, (first + tempInt), last);
            stoogeSort(sortArray, first, (last - tempInt));

        }

    }

}
