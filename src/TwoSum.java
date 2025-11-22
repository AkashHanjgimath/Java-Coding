import java.util.*;

public class TwoSum {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 7, 5};

        int target = 12;

        System.out.println(twoSumSet(arr, target));
    }

    public static boolean twoSumSet(int arr[], int tar) {
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            int complement = tar - num;
            if (set.contains(complement)) {
                return true;
                // return Arrays.asList(num,complement);
            }
            set.add(num);
        }
       //return Collections.emptyList();
        return false;
    }
}
