import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestAndSecondSmallest {


    public static void main(String[] args) {

        int[] arr = { 2, 5, 6, 4, 1, 3, 10, 8, 7 };

        int largest=arr[0]; int secondLargest=arr[0];

        int smallest=arr[0]; int secondsmallest=arr[0];

        for (int i=0;i< arr.length;i++)
        {
            int num=arr[i];

            if(num>largest)
            {
                secondLargest=largest;
                largest=num;
            } else if (num>secondLargest&&num<largest) {
                secondLargest=num;
                
            }

            if (num<smallest)
            {
                secondsmallest=smallest;
                smallest=num;
            } else if (num<secondsmallest&&num!=smallest) {
                secondsmallest=num;
            }
        }
        System.err.println("Second Largest  : " + secondLargest);
        System.err.println("Second Smallest : " + secondsmallest);

//   In streams

        int slargest= Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())  //need to convert to object to work this,so boxed used orelse sorted((a,b) -> b - a)
                .skip(1)
                .findFirst()
                .orElse(0);

        int sSmallest=Arrays.stream(arr)
                .sorted()
                .skip(1)
                .findFirst()
                .orElseThrow();

        System.err.println("Stream's Second Largest  : " + slargest);
        System.err.println("Stream's Second Smallest : " + sSmallest);

    }
}
