package String;

import java.util.HashSet;

public class RemoveTheCharFromFirstString {

    public static void main(String[] args) {
        String firstString = "computer";
        String secondString = "cat";

        HashSet set = new HashSet<>();
        for (char c : secondString.toCharArray()) {
            set.add(c);
        }
        StringBuilder builder = new StringBuilder();
        for (char c : firstString.toCharArray()) {
            if (!set.contains(c)) {
                builder.append(c);
            }
        }
        System.out.println(builder.toString());
    }
}
