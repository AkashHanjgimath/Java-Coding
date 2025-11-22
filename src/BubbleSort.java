// Bubble Sort: repeatedly compare adjacent elements and swap them if they are in the wrong order.


public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {4, 2, 7, 1, 2};
        int n= arr.length;
        for (int i = 0; i < n-1; i++) {
            boolean swaped=false;
            for (int j=0;j<n-1-i;j++)
            {
                if (arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swaped=true;
                }
            }
            if (!swaped)
                break;
        }

        for (int f:arr)
        {
           // System.out.print(f+" ");
        }

        System.out.println("Through bubble sort");
        for(int a:arr)
            System.out.print(a+" ");
    }

    public static void bubbleSortRecursive(int arr[],int n)
    {
        // Base case: if array size becomes 1, it's sorted
        if (n==1)
            return;

        for (int j=0;j<n-1;j++)
        {
            if (arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        bubbleSortRecursive(arr, n-1);
    }

}
