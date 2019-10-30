import java.util.Arrays;

public class CycleSort {

    String complexity;

    CycleSort() {

        complexity = ". Quadratic Time Complexity.";

    }

    void sort(int[] sortArray) {

        /*
        Begin Time Start
         */
        double start = (double) System.nanoTime();

        int changes = 0;

        for (int cycle = 0; cycle <= sortArray.length - 2; cycle++) {

            int select = sortArray[cycle];
            int position = cycle;

            for (int count = cycle + 1; count < sortArray.length; count++) {

                if (sortArray[count] < select) {

                    position++;

                }
            }

            // Check if already correct first
            if (position == cycle) {

                continue;

            }

            // Skip homogeneous items
            while (select == sortArray[position]) {

                position++;

            }

            if (position != cycle) {

                int tempInt = select;
                select = sortArray[position];
                sortArray[position] = tempInt;

                changes++;

            }

            // Change the cycle
            while (position != cycle) {

                position = cycle;

                for (int count = cycle + 1; count < sortArray.length; count++) {

                    if (sortArray[count] < select) {

                        position++;

                    }

                }

                while (select == sortArray[position]) {

                    position++;

                }

                if (select != sortArray[position]) {

                    int tempInt = select;
                    select = sortArray[position];
                    sortArray[position] = tempInt;
                    changes++;

                }

            }

        }

        /*
        End Time
         */
        double end = (double) System.nanoTime();

        System.out.println("CycleSort: " + Arrays.toString(sortArray) + complexity + " Seconds taken was " + ((end - start) / 1000000));
    }

}
