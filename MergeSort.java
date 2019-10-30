import java.util.Arrays;

public class MergeSort {

    String complexity;

    MergeSort() {

        complexity = ". Quasilinear Time Complexity.";

    }

    void sort(int[] sortArray) {

        /*
        Begin Time Start
         */
        double start = (double) System.nanoTime();

        sort(sortArray, 0, sortArray.length - 1);

        /*
        End Time
         */
        double end = (double) System.nanoTime();

        System.out.println("MergeSort: " + Arrays.toString(sortArray) + complexity + " Seconds taken was " + ((end - start) / 1000000));

    }

    void sort(int[] sortArray, int first, int last) {

        if (first < last)
        {

            int m = (first + last)/2;

            sort(sortArray, first, m);
            sort(sortArray , m+1, last);
            mergeSort(sortArray, first, m, last);

        }

    }

    void mergeSort(int[] sortArray, int first, int middle, int last) {

        int firstHalf = middle - first + 1;
        int secondHalf = last - middle;

        int left[] = new int[firstHalf];
        int right[] = new int[secondHalf];

        for (int count = 0; count < firstHalf; count++) {

            left[count] = sortArray[first + count];

        }

        for (int countTwo = 0; countTwo < secondHalf; countTwo++) {

            right[countTwo] = sortArray[middle + 1 + countTwo];

        }

        int count = 0;
        int countTwo = 0;
        int countThree = first;

        while (count < firstHalf && countTwo < secondHalf)
        {

            if (left[count] <= right[countTwo])
            {

                sortArray[countThree] = left[count];
                count++;

            }
            else
            {

                sortArray[countThree] = right[countTwo];
                countTwo++;

            }

            countThree++;

        }

        while (count < firstHalf)
        {
            sortArray[countThree] = left[count];

            count++;
            countThree++;

        }

        while (countTwo < secondHalf)
        {
            sortArray[countThree] = right[countTwo];

            countTwo++;
            countThree++;

        }
    }
}
