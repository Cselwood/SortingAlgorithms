import java.util.Arrays;

public class RecursiveBubbleSort {

    String complexity;

    RecursiveBubbleSort() {

        complexity = ". Quadratic Time Complexity.";

    }

    void sort(int[] sortArray) {

        /*
        Begin Time Start
         */
        double start = (double) System.nanoTime();

        recursiveSort(sortArray, sortArray.length);

        /*
        End Time
         */
        double end = (double) System.nanoTime();

        System.out.println("RecursiveBubbleSort: " + Arrays.toString(sortArray) + complexity + " Seconds taken was " + ((end - start) / 1000000));
    }

    void recursiveSort(int[] sortArray, int sortArrayLength) {

        if (sortArrayLength == 1) {

            //skip
            return;

        }

        else {

            for (int count = 0; count < sortArrayLength - 1; count++) {

                if (sortArray[count] > sortArray[count + 1]) {

                    int tempInt = sortArray[count];
                    sortArray[count] = sortArray[count + 1];
                    sortArray[count + 1] = tempInt;

                }

            }

            recursiveSort(sortArray, sortArrayLength - 1);

        }

    }

}