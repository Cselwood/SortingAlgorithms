import java.util.Arrays;

public class GnomeSort {

    String complexity;

    GnomeSort() {

        complexity = ". Quadratic Time Complexity.";

    }

    void sort(int[] sortArray) {

        /*
        Begin Time Start
         */
        double start = (double) System.nanoTime();

        int count = 0;

        while (count < sortArray.length) {

            if (count == 0 || sortArray[count] >= sortArray[count - 1]) {
                count++;
            }
            else {
                int tempInt = 0;

                tempInt = sortArray[count];
                sortArray[count] = sortArray[count - 1];
                sortArray[count - 1] = tempInt;
                count--;
            }
        }

        /*
        End Time
         */
        double end = (double) System.nanoTime();

        System.out.println("GnomeSort: " + Arrays.toString(sortArray) + complexity + " Seconds taken was " + ((end - start) / 1000000));
    }

}
