import java.util.Arrays;

public class BucketSort {

    String complexity;

    BucketSort() {
        complexity = ". Quadratic Time Complexity.";
    }

    void sort(int[] sortArray) {

        /*
        Begin Time Start
         */
        double start = (double) System.nanoTime();

        int max = getMax(sortArray);
        int sortPosition = 0;

        int[] bucket = new int[max + 1];

        int[] sorted = new int[sortArray.length];

        for (int count = 0; count < sortArray.length; count++) {

            bucket[sortArray[count]]++;

        }

        for (int count = 0; count < bucket.length; count++) {

            for (int countTwo = 0; countTwo < bucket[count]; countTwo++) {

                sorted[sortPosition++] = count;

            }

        }

        /*
        End Time
         */
        double end = (double) System.nanoTime();

        System.out.println("BucketSort: " + Arrays.toString(sorted) + complexity + " Seconds taken was " + ((end - start) / 1000000));
    }

    int getMax(int[] maxArray) {

        int max = 0;

        for (int count = 0; count < maxArray.length; count++) {

            if (maxArray[count] > max) {

                max = maxArray[count];

            }

        }

        return max;
    }

}
