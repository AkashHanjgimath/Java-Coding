import java.util.Arrays;

public class TripletWithZeroSum {
    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4 };

        System.out.println(checkTriplet(arr));

    }
    private static boolean checkTriplet(int[]arr)
    {
        Arrays.sort(arr);
        int n= arr.length;
        for (int i=0;i<n-2;i++)
        {
            int left=i+1;
            int right=n-1;

            while(left<right)
            {
                int sum=arr[i]+arr[left]+arr[right];

                if (sum==0) {
                    System.out.println("Triplets " + arr[i] + " , " + arr[left] + " , " + arr[right]);

                    return true;
                }
                else if(sum<0)
                {
                    left++;
                }
                else
                {
                    right--;
                }
            }
        }
return false;
    }
}
