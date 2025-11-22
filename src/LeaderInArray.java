// A leader is an element that is greater than all elements to its right
// (e.g., in [16,17,4,3,5,2], leaders are 17, 5, 2).


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeaderInArray {

    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};
        System.out.println("Leaders are "+leaders(arr));
    }

    public static List<Integer> leaders(int arr[])
    {
        List<Integer> list=new ArrayList<>();

        int maxfromRight=arr[arr.length-1];
        list.add(maxfromRight);

        for (int i= arr.length-2;i>=0;i--)
        {
            if (arr[i]>maxfromRight)
            {
                list.add(arr[i]);
                maxfromRight=arr[i];
            }
        }

        Collections.reverse(list);
        return list;


    }
}
