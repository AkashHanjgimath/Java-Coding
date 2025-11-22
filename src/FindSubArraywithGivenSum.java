import java.util.Arrays;
import java.util.stream.IntStream;

public class FindSubArraywithGivenSum {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 7, 5};
        int target = 12;

findSubArraywithTraget(arr,target);
    }

    public static void findSubArraywithTraget(int []arr,int target)
    {
        int start=0; int end=0;int currentSum=0;

        while(end<arr.length)
        {
            currentSum+=arr[end];


            while(currentSum>target&&start<end)
            {
                currentSum-=arr[start];
                start++;
            }

            if (currentSum==target)
            {
                break;
            }
            end++;
        }

      int[]res=IntStream.rangeClosed(start,end).map(x->arr[x]).toArray();
        System.out.println(Arrays.toString(res));
    }
}
