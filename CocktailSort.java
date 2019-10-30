import java.util.Arrays;

public class CocktailSort {

    String complexity;

    CocktailSort() {

        complexity = ". Quadratic Time Complexity.";

    }

    void sort(int[] sortArray) {

        /*
        Begin Time Start
         */
        double start = (double) System.nanoTime();

        boolean swap = true;

        int first = 0;
        int last = sortArray.length;

        while (swap) {

            swap = false;

            for (int count = first; count < last - 1; count++) {

                if (sortArray[count] > sortArray[count + 1]) {

                    int tempInt = sortArray[count];
                    sortArray[count] = sortArray[count + 1];
                    sortArray[count + 1] = tempInt;

                    swap = true;

                }

            }

            if (!swap) {
                // Break out of the loop
                break;

            }

            // Reset swap for next for, and last place item is correct so move position
            swap = false;
            last--;

            for (int count = last - 1; count >= first; count--) {

                if (sortArray[count] > sortArray[count + 1]) {

                    int tempInt = sortArray[count];
                    sortArray[count] = sortArray[count + 1];
                    sortArray[count + 1] = tempInt;

                    // can't have outside loop or the entire while would end
                    swap = true;

                }

            }

            // first place is correct, so move position
            start++;

        }

        /*
        End Time
         */
        double end = (double) System.nanoTime();

        System.out.println("CocktailSort: " + Arrays.toString(sortArray) + complexity + " Seconds taken was " + ((end - start) / 1000000));
    }

}
