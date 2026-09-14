import java.util.Scanner;
public class Testsorting {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = s.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        

        // ---------------- SELECTION SORT ----------------
        int[] selectionArr = arr.clone();
        sorting.selectionSort(selectionArr);

        System.out.println("\nSelection Sort Result:");
        for (int i = 0; i < selectionArr.length; i++) {
            System.out.print(selectionArr[i] + " ");
        }
        System.out.println("\nTime Complexity: Best = Worst = O(n^2)");

        // ---------------- INSERTION SORT ----------------
        int[] insertionArr = arr.clone();
        sorting.insertionSort(insertionArr);

        System.out.println("\nInsertion Sort Result:");
        for (int i = 0; i < insertionArr.length; i++) {
            System.out.print(insertionArr[i] + " ");
        }
        System.out.println("\nTime Complexity: Best = O(n), Worst = O(n^2)");

    }
}


//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Testsorting {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("========== SORTING ALGORITHMS IMPLEMENTATION ==========\n");
//
//        // Input
//        System.out.print("Enter the number of elements: ");
//        int n = scanner.nextInt();
//
//        int[] originalArr = new int[n];
//        System.out.println("Enter " + n + " integers:");
//        for (int i = 0; i < n; i++) {
//            originalArr[i] = scanner.nextInt();
//        }
//
//        System.out.println("\nOriginal Array: " + Arrays.toString(originalArr));
//
//        // ==================== BASIC SORTING ALGORITHMS ====================
//        System.out.println("\n========== BASIC SORTING ALGORITHMS ==========");
//
//        // Bubble Sort
//        int[] bubbleArr = arr.clone();
//        bubbleSort(bubbleArr);
//        System.out.println("\nBubble Sort Result:");
//        System.out.println(bubbleArr);
//        System.out.println("Time Complexity: Best = O(n), Worst = O(n^2)");
//
//        // Selection Sort
//        int[] selectionArr = arr.clone();
//        selectionSort(selectionArr);
//        System.out.println("\nSelection Sort Result:");
//        System.out.println(selectionArr);
//        System.out.println("Time Complexity: Best = Worst = O(n^2)");
//
//        // Insertion Sort
//        int[] insertionArr = arr.clone();
//        insertionSort(insertionArr);
//        System.out.println("\nInsertion Sort Result:");
//        printArray(insertionArr);
//        System.out.println("Time Complexity: Best = O(n), Worst = O(n^2)");
//
//
//        // ==================== ADVANCED SORTING ====================
//        System.out.println("\n========== ADVANCED SORTING ALGORITHMS ==========");
//
//        int[] arrMerge = originalArr.clone();
//        int[] arrQuick = originalArr.clone();
//        int[] arrHeap = originalArr.clone();
//
//        // Merge Sort
//        sorting.MergeSortResult mergeResult = new sorting.MergeSortResult();
//        long startTime = System.nanoTime();
//        mergeResult.mergeSort(arrMerge, 0, arrMerge.length - 1);
//        mergeResult.time = System.nanoTime() - startTime;
//
//        // Quick Sort
//        sorting.QuickSortResult quickResult = new sorting.QuickSortResult();
//        startTime = System.nanoTime();
//        quickResult.quickSort(arrQuick, 0, arrQuick.length - 1);
//        quickResult.time = System.nanoTime() - startTime;
//
//        // Heap Sort
//        sorting.HeapSortResult heapResult = new sorting.HeapSortResult();
//        startTime = System.nanoTime();
//        heapResult.heapSort(arrHeap);
//        heapResult.time = System.nanoTime() - startTime;
//
//        // Table
//        System.out.println("\n+----------------+--------------+-------+--------------+");
//        System.out.println("| Algorithm      | Comparisons  | Swaps | Time (ms)    |");
//        System.out.println("+----------------+--------------+-------+--------------+");
//        System.out.printf("| Merge Sort     | %-12d | %-5d | %-12.4f |\n",
//                mergeResult.comparisons, mergeResult.swaps, mergeResult.time / 1_000_000.0);
//        System.out.printf("| Quick Sort     | %-12d | %-5d | %-12.4f |\n",
//                quickResult.comparisons, quickResult.swaps, quickResult.time / 1_000_000.0);
//        System.out.printf("| Heap Sort      | %-12d | %-5d | %-12.4f |\n",
//                heapResult.comparisons, heapResult.swaps, heapResult.time / 1_000_000.0);
//        System.out.println("+----------------+--------------+-------+--------------+");
//
//        // Output arrays
//        System.out.println("\nSorted Arrays:");
//        System.out.println("Merge Sort:  " + Arrays.toString(arrMerge));
//        System.out.println("Quick Sort:  " + Arrays.toString(arrQuick));
//        System.out.println("Heap Sort:   " + Arrays.toString(arrHeap));
//
//        scanner.close();
//    }
//}
