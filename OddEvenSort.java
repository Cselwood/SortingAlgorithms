import java.util.Arrays;

public class OddEvenSort {

    String complexity;

    OddEvenSort() {

        complexity = ". Quadratic Time Complexity.";

    }

    void sort(int[] sortArray) {

        /*
        Begin Time Start
         */
        double start = (double) System.nanoTime();

        boolean needsSorting = true;

        while (needsSorting) {

            needsSorting = false;
            int tempInt;

            for (int count = 1; count <= sortArray.length - 2; count+=2) {

                if (sortArray[count] > sortArray[count + 1]) {

                    tempInt = sortArray[count];
                    sortArray[count] = sortArray[count + 1];
                    sortArray[count + 1] = tempInt;

                    needsSorting = true;
                }

            }

            for (int count = 0; count <= sortArray.length - 2; count+= 2) {

                if (sortArray[count] > sortArray[count + 1]) {

                    tempInt = sortArray[count];
                    sortArray[count] = sortArray[count + 1];
                    sortArray[count + 1] = tempInt;

                    needsSorting = true;
                }

            }

        }

        /*
        End Time
         */
        double end = (double) System.nanoTime();

        System.out.println("OddEvenSort: " + Arrays.toString(sortArray) + complexity + " Seconds taken was " + ((end - start) / 1000000));

    }
}
