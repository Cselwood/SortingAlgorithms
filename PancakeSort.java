import java.util.Arrays;

public class PancakeSort {

    String complexity;

    PancakeSort() {

        complexity = ". Quadratic Time Complexity.";

    }

    void sort(int[] sortArray) {

        /*
        Begin Time Start
         */
        double start = (double) System.nanoTime();

        for (int stackSize = sortArray.length; stackSize > 1; stackSize--)
        {
            int maximum, count;

            for (maximum = 0, count = 0; count < stackSize; count++) {

                if (sortArray[count] > sortArray[maximum]) {

                    maximum = count;

                }

            }

            if (maximum != stackSize - 1)
            {

                flipPancake(sortArray, maximum);
                flipPancake(sortArray, stackSize - 1);

            }
        }

        /*
        End Time
         */
        double end = (double) System.nanoTime();

        System.out.println("PancakeSort: " + Arrays.toString(sortArray) + complexity + " Seconds taken was " + ((end - start) / 1000000));
    }

    int[] flipPancake(int[] sortArray, int flipNum) {

        int tempInt, begin = 0;

        while (begin < flipNum)
        {

            tempInt = sortArray[begin];
            sortArray[begin] = sortArray[flipNum];
            sortArray[flipNum] = tempInt;

            begin++;
            flipNum--;

        }

        return sortArray;
    }

}
