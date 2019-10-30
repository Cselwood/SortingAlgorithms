import java.util.Arrays;

public class SelectionSort {

    String complexity;

    SelectionSort() {

        complexity = ". Quadratic Time Complexity.";

    }

    void sort(int[] sortArray) {

        /*
        Begin Time Start
         */
        double start = (double) System.nanoTime();

        for (int count = 0; count < sortArray.length - 1; count++) {

            int lowest = count;

            for (int countTwo = count + 1; countTwo < sortArray.length; countTwo++) {

                if (sortArray[countTwo] < sortArray[lowest]) {

                    lowest = countTwo;

                }

            }

            int tempInt = sortArray[lowest];
            sortArray[lowest] = sortArray[count];
            sortArray[count] = tempInt;

        }

        /*
        End Time
         */
        double end = (double) System.nanoTime();

        System.out.println("SelectionSort: " + Arrays.toString(sortArray) + complexity + " Seconds taken was " + ((end - start) / 1000000));
    }

}
