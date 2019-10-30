import java.util.Arrays;

public class RadixSort {

    String complexity;

    RadixSort() {

        complexity = ". O(w dot n) Time Complexity.";

    }

    void sort(int[] sortArray) {

        /*
        Begin Time Start
         */
        double start = (double) System.nanoTime();

        final int INITIAL_RADIX = 10;

        sort(sortArray, INITIAL_RADIX);

        /*
        End Time
         */
        double end = (double) System.nanoTime();

        System.out.println("RadixSort: " + Arrays.toString(sortArray) + complexity + " Seconds taken was " + ((end - start) / 1000000));

    }

    void sort(int[] sortArray, int column) {

        // Grab the start and finish of the array so we can match the range
        int min = sortArray[0];
        int max = sortArray[0];

        for (int count = 1; count < sortArray.length; count++) {

            if (sortArray[count] < min) {

                min = sortArray[count];

            }

            else if (sortArray[count] > max) {
                max = sortArray[count];
            }

        }

        int digit = 1;

        while ((max - min) / digit >= 1) {

            columnCompare(sortArray, column, digit, min);
            digit *= column;

        }

    }

    void columnCompare(int[] sortArray, int column, int digit, int min) {

        int index;

        int[] buckets = new int[column];
        int[] tempArray = new int[sortArray.length];

        for (int count = 0; count < sortArray.length; count++) {

            index = (int) (((sortArray[count] - min) / digit) % column); // Grab specific column using modulo
            buckets[index]++;

        }

        for (int count = 1; count < column; count++) {

            buckets[count] += buckets[count - 1];

        }

        for (int count = sortArray.length - 1; count >= 0; count--) {

            index = (int) (((sortArray[count] - min) / digit) % column);
            tempArray[--buckets[index]] = sortArray[count];

        }

        for (int count = 0; count < sortArray.length; count++) {

            sortArray[count] = tempArray[count];

        }

    }

}
