
public class BubbleSort {

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
