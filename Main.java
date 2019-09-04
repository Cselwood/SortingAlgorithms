import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String args[]) {

        // Created an integer array to pass into our bubble sort class, and our random integer object
        int[] randomList = new int[100];
        Random r = new Random();

        // Filled the array with 100 random integers from 0 - 300 (with potential for the same number to appear)
        for (int count = 0; count < randomList.length; count++) {
            randomList[count] = r.nextInt(301); // [0...300]
        }

        BubbleSort bubbleSort = new BubbleSort(randomList);
        System.out.println(Arrays.toString(bubbleSort.sort()));
    }

    static public class BubbleSort {

        int[] searchList = new int[100];

        BubbleSort(int[] randomList) {
            searchList = randomList;
        }

        int[] sort() {
            // Get our temp switching integer ready before the iterator's scope
            int tempInt = 0;

            for (int count = 0; count < searchList.length; count++) {

                for (int countTwo = 1; countTwo < (searchList.length - 1); countTwo++) {

                    // Conditional to check which is higher
                    if (searchList[countTwo - 1] > searchList[countTwo]) {

                        //Perform a simple bubble switching sort
                        tempInt = searchList[countTwo - 1];
                        searchList[countTwo - 1] = searchList[countTwo];
                        searchList[countTwo] = tempInt;

                    }
                }
            }

            return searchList;
        }

    }

}
