import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 3, 6};

        HashSet seen =new HashSet();
        HashSet duplicates=new HashSet();

        for (int a:arr)
        {
            if (!seen.add(a))
            {
                duplicates.add(a);
            }
        }
        System.out.println("Duplicates : "+duplicates);


        java.util.List<Integer> sduplicates  = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                        .entrySet()
                .stream()
                .filter(f->f.getValue()>1)
                .map(f->f.getKey())
                .toList();

        System.out.println("Stream's Duplicates : "+sduplicates);
    }
}
