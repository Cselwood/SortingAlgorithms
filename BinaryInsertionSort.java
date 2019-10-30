import java.util.Arrays;

public class BinaryInsertionSort {

    String complexity;

    BinaryInsertionSort() {

        complexity = ". O(log2(n)) Time Complexity.";

    }

    void sort(int[] sortArray) {

        /*
        Begin Time Start
         */
        double start = (double) System.nanoTime();

        int location, select;
        int foobar;

        for (int count = 1; count < sortArray.length; count++) {

            foobar = count - 1;
            select = sortArray[count];

            location = binaryInsertionSort(sortArray, select, 0, foobar);

            while (foobar >= location) {

                sortArray[foobar + 1] = sortArray[foobar];
                foobar--;

            }

            sortArray[foobar + 1] = select;

        }

        /*
        End Time
         */
        double end = (double) System.nanoTime();

        System.out.println("BinaryInsertionSort: " + Arrays.toString(sortArray) + complexity + " Seconds taken was " + ((end - start) / 1000000));
    }

    int binaryInsertionSort(int[] sortArray, int select, int lower, int upper) {

        if (upper <= lower) {

            if (select > sortArray[lower]) {

                return (lower + 1);

            }
            else {

                return lower;

            }

        }

        int middle = (lower + upper) / 2;

        if (select == sortArray[middle]) {

            return (middle + 1);

        }

        if (select > sortArray[middle]) {

            return binaryInsertionSort(sortArray, select, (middle + 1), upper);

        }

        return binaryInsertionSort(sortArray, select, lower, (middle - 1));

    }

}
