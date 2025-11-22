import java.util.Arrays;
import java.util.stream.IntStream;

public class MoveZerostoEnd {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        int i=0;

        for (int num:arr) {
            if (num != 0) {
                arr[i] = num;
                i++;
            }
        }
            while(i< arr.length)
            {
                arr[i]=0;
                i++;
            }

            System.out.println("In Code "+Arrays.toString(arr));

            int [] sResult= IntStream
                    .concat(Arrays.stream(arr).filter(f->f>0),Arrays.stream(arr).filter(x->x==0)).toArray();

        System.out.println("Streams array "+Arrays.toString(sResult));
    }
}
