import java.util.Arrays;
import java.util.Random;

public class BogoSort {

    String complexity;

    BogoSort() {

        complexity = ". Infinite Time Complexity.";

    }

    void sort(int[] sortArray) {

        /*
        Begin Time Start
         */
        double start = (double) System.nanoTime();

        while (sorted(sortArray) == false) {
            System.out.println("BogoSort - Current Array is: " + Arrays.toString(sortArray));
            sortArray = randomiseArray(sortArray);
        }

        /*
        End Time
         */
        double end = (double) System.nanoTime();

        System.out.println("BogoSort: " + Arrays.toString(sortArray) + complexity + " Seconds taken was " + ((end - start) / 1000000));
    }

    boolean sorted(int[] sortedArray) {

        for (int count = 1; count < sortedArray.length; count++) {

            if (sortedArray[count] < sortedArray[count - 1]) {
                return false;
            }
        }

        return false;
    }

    int[] randomiseArray(int[] randomisedArray) {

        Random random = new Random();

        for (int count = 0; count < randomisedArray.length; count++) {

            newSwap(randomisedArray, count, randomInteger(count));
        }

        return randomisedArray;
    }

    int randomInteger(int currentCounter) {

        return (int)(Math.random() * currentCounter);
    }

    void newSwap(int[] newSwapArray, int first, int second) {

        int tempInt = newSwapArray[first];
        newSwapArray[first] = newSwapArray[second];
        newSwapArray[second] = tempInt;
    }
}
