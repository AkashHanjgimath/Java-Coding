package String;

//An Isogram is a word where no letter repeats
import java.util.HashSet;
import java.util.Set;

public class Isogram {

    public static boolean checkIsogram(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toLowerCase().toCharArray()) {
            if (!set.add(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Machine is Isogram "+checkIsogram("Machine"));
        System.out.println("Programming is Isogram "+checkIsogram("Programming"));

        String str="Machine";
        System.out.println("In Streams -> " +(str.toLowerCase().chars().distinct().count()==str.length()));
    }
}
