import java.util.Arrays;
import java.util.stream.IntStream;

public class MoveZeroToFront {
    public static void main(String[] args) {
        int[] arr = {0, 2, 3, 0, 0, 1, 4, 0, 0};
      //  int[] res = zeroToLeft(arr);
        moveZeroTofrontwithoutArray(arr);
       // System.out.println(Arrays.toString(res));
       // System.out.println(Arrays.toString(arr));

        /*In Streams solution*/
        int[] streamRes= IntStream.concat(Arrays.stream(arr).filter(x->x==0),Arrays.stream(arr).filter(x->x>0)).toArray();
        System.out.println(Arrays.toString(streamRes));
    }

    public static int[] zeroToLeft(int arr[]) {
        int[] result = new int[arr.length];
        int zeroCount = 0;
        int index;

        for (int a : arr) {
            if (a == 0) {
                zeroCount++;
            }
        }
        index = zeroCount;
        for (int a : arr) {
            if (a != 0) {
                result[index++] = a;
            }
        }
        return result;
    }

    public static void moveZeroTofrontwithoutArray(int[] arr)
    {
        int write= arr.length-1;

        for (int read= arr.length-1;read>0;read--)
        {
            if(arr[read]!=0)
            {
                arr[write]=arr[read];
                write--;
            }
        }
        while(write>=0)
        {
            arr[write]=0;
            write--;
        }
    }


}
