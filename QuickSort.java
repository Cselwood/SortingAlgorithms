import java.util.Arrays;

public class QuickSort {
    String complexity;

    QuickSort() {

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

        System.out.println("QuickSort: " + Arrays.toString(sortArray) + complexity + " Seconds taken was " + ((end - start) / 1000000));

    }

    int[] sort(int[] sortArray, int lo, int hi) {



        if (lo < hi) {

            int partitionIndex = partition(sortArray, lo, hi);

            sort(sortArray, lo, partitionIndex - 1);
            sort(sortArray, partitionIndex + 1, hi);

        }

        return sortArray;
    }

    int partition(int[] sortArray, int lo, int hi) {

        int pivot = sortArray[hi];

        int returnNum = (lo - 1);

        for (int count = lo; count < hi; count++) {

            if (sortArray[count] < pivot) {

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
