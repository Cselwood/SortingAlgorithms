import java.util.Arrays;

public class ShellSort {

    String complexity;

    ShellSort() {

        complexity = ". Quadratic (Unstable) Time Complexity .";

    }

    void sort(int[] sortArray) {

        /*
        Begin Time Start
         */
        double start = (double) System.nanoTime();

        for (int count = sortArray.length / 2; count > 0; count /= 2) {

            for (int countTwo = count; countTwo < sortArray.length; countTwo++) {

                int tempInt = sortArray[countTwo];

                int countThree;
                for (countThree = countTwo; countThree >= count && sortArray[countThree - count] > tempInt; countThree -= count) {

                    sortArray[countThree] = sortArray[countThree - count];

                }

                sortArray[countThree] = tempInt;

            }

        }

        /*
        End Time
         */
        double end = (double) System.nanoTime();

        System.out.println("ShellSort: " + Arrays.toString(sortArray) + complexity + " Seconds taken was " + ((end - start) / 1000000));
    }

}
