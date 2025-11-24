package String;

public class CheckStringRotation {

    public static void main(String[] args) {
        String s1="abcd";
        String s2="cdab";

        String newString=s1+s2;
        System.out.println(newString);
        System.out.println(newString.contains(s2));
    }
}
