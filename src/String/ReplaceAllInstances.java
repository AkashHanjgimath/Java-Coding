package String;

public class ReplaceAllInstances {
    public static void main(String[] args) {

        String input = "abc123abc456abc";
        String target = "abc";
        String replacement = "XYZ";

        String output = replaceSubString(input, target, replacement);
        System.out.println("Input " + input);
        System.out.println("Output " + output);
    }

    public static String replaceSubString(String input, String target, String replacement) {
        StringBuilder builder = new StringBuilder();
        int n = input.length();
        int m = target.length();
        int i = 0;

        while (i < n) {
            if (i + m < n && input.substring(i, i + m).equals(target)) {
                builder.append(replacement);
                i = i + m;
            } else {
                builder.append(input.charAt(i));
                i++;
            }
        }
        return builder.toString();
    }
}
