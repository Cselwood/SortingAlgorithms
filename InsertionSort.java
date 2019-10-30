import java.util.Arrays;

public class InsertionSort {

    String complexity;

    InsertionSort() {

        complexity = ". Quadratic Time Complexity.";

    }

    void sort(int[] sortArray) {

        /*
        Begin Time Start
         */
        double start = (double) System.nanoTime();

        for (int count = 1; count < sortArray.length; ++count) {

            int key = sortArray[count];

            int countTwo = count - 1;

            while (!(countTwo < 0) && sortArray[countTwo] > key) {

                sortArray[countTwo + 1] = sortArray[countTwo];
                countTwo--;

            }

            sortArray[countTwo + 1] = key;

        }

        /*
        End Time
         */
        double end = (double) System.nanoTime();

        System.out.println("InsertionSort: " + Arrays.toString(sortArray) + complexity + " Seconds taken was " + ((end - start) / 1000000));
    }

}
