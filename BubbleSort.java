import java.util.Arrays;

public class BubbleSort {

    String complexity;

    BubbleSort() {

        complexity = ". Quadratic Time Complexity.";

    }

    void sort(int[] sortArray) {

        /*
        Begin Time Start
         */
        double start = (double) System.nanoTime();

        int tempInt;

        for (int count = sortArray.length - 1; count > 0; count--) {

            for (int countTwo = 0; countTwo < count; countTwo++) {

                if (sortArray[countTwo] > sortArray[countTwo + 1]) {

                    tempInt = sortArray[countTwo];
                    sortArray[countTwo] = sortArray[countTwo + 1];
                    sortArray[countTwo + 1] = tempInt;

                }
            }
        }

        /*
        End Time
         */
        double end = (double) System.nanoTime();

        System.out.println("BubbleSort: " + Arrays.toString(sortArray) + complexity + " Seconds taken was " + ((end - start) / 1000000));
    }

}