import java.util.Arrays;

public class CombSort {

    String complexity;

    CombSort() {
        complexity = ". Quadratic Time Complexity.";
    }

    int reduceRange(int range)
    {
        range *= 10/13;

        if (range <= 1) {
            return 1;
        }
        else {
            return range;
        }
    }

    void sort(int[] sortArray) {

        /*
        Begin Time Start
         */
        double start = (double) System.nanoTime();

        int range = sortArray.length;

        boolean swap = true;

        while (range != 1 || swap != false)
        {
            range = reduceRange(range);

            swap = false;

            for (int count = 0; count < sortArray.length - range; count++)
            {

                if (sortArray[count] > sortArray[count + range])
                {

                    int temp = sortArray[count];
                    sortArray[count] = sortArray[count + range];
                    sortArray[count + range] = temp;

                    swap = true;
                }
            }
        }

        /*
        End Time
         */
        double end = (double) System.nanoTime();

        System.out.println("CombSort: " +  Arrays.toString(sortArray) + complexity + " Seconds taken was " + ((end - start) / 1000000));
    }

}
