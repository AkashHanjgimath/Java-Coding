
// Selection Sort: repeatedly find the smallest element from the unsorted part and swap it into its correct position.
//Selection Sort is slightly better overall because it minimizes swaps, but Bubble Sort is better when the input is almost sorted

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        selectionSort(arr);
        for (int n:arr)
        {
            System.out.print(n+" ");
        }

    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
