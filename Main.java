import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String args[]) {

        // Change limits here, be wary of long load times
        final int ARRAY_LENGTH = 10;
        final int UPPER_BOUND = 1001;

        int[] randomArray = new int[ARRAY_LENGTH];
        Random r = new Random();

        // Filled the array with 10 random integers from 0 to 1000 (with potential for the same number to appear)
        for (int count = 0; count < randomArray.length; count++) {

            randomArray[count] = r.nextInt(UPPER_BOUND); // Default is [0...1000]
        }

        System.out.println("------------------");
        System.out.println("QUADRATIC SORTS  ");
        System.out.println("------------------");

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(Arrays.copyOf(randomArray, randomArray.length));

        BucketSort bucketSort = new BucketSort();
        bucketSort.sort(Arrays.copyOf(randomArray, randomArray.length));

        CocktailSort cocktailSort = new CocktailSort();
        cocktailSort.sort(Arrays.copyOf(randomArray, randomArray.length));

        CombSort combSort = new CombSort();
        combSort.sort(Arrays.copyOf(randomArray, randomArray.length));

        CycleSort cycleSort = new CycleSort();
        cycleSort.sort(Arrays.copyOf(randomArray, randomArray.length));

        GnomeSort gnomeSort = new GnomeSort();
        gnomeSort.sort(Arrays.copyOf(randomArray, randomArray.length));

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(Arrays.copyOf(randomArray, randomArray.length));

        OddEvenSort oddEvenSort = new OddEvenSort();
        oddEvenSort.sort(Arrays.copyOf(randomArray, randomArray.length));

        PancakeSort pancakeSort = new PancakeSort();
        pancakeSort.sort(Arrays.copyOf(randomArray, randomArray.length));

        RecursiveBubbleSort recursiveBubbleSort = new RecursiveBubbleSort();
        recursiveBubbleSort.sort(Arrays.copyOf(randomArray, randomArray.length));

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(Arrays.copyOf(randomArray, randomArray.length));

        ShellSort shellSort = new ShellSort();
        shellSort.sort(Arrays.copyOf(randomArray, randomArray.length));

        System.out.println("");
        System.out.println("------------------");
        System.out.println("QUASILINEAR SORTS");
        System.out.println("------------------");

        HeapSort heapSort = new HeapSort();
        heapSort.sort(Arrays.copyOf(randomArray, randomArray.length));

        IterativeQuickSort iterativeQuickSort = new IterativeQuickSort();
        iterativeQuickSort.sort(Arrays.copyOf(randomArray, randomArray.length));

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(Arrays.copyOf(randomArray, randomArray.length));

        QuickSort quickSort = new QuickSort();
        quickSort.sort(Arrays.copyOf(randomArray, randomArray.length));

        System.out.println("");
        System.out.println("------------------");
        System.out.println("NON BOUNDED SORTS ");
        System.out.println("------------------");

        RadixSort radixSort = new RadixSort();
        radixSort.sort(Arrays.copyOf(randomArray, randomArray.length));

        System.out.println("");
        System.out.println("------------------");
        System.out.println("EXTRAS & INFINITE SORTS ");
        System.out.println("------------------");

        BinaryInsertionSort binaryInsertionSort = new BinaryInsertionSort();
        binaryInsertionSort.sort(Arrays.copyOf(randomArray, randomArray.length));

        BogoSort bogoSort = new BogoSort();
        System.out.println("BogoSort: " + "Uncomment to Activate");
        //bogoSort.sort(Arrays.copyOf(randomArray, randomArray.length));

        StoogeSort stoogeSort = new StoogeSort();
        System.out.println("StoogeSort: " + "Uncomment to Activate. Works fine with smaller array, has serious issues with big arrays");
        //stoogeSort.sort(Arrays.copyOf(randomArray, randomArray.length));
    }

}
