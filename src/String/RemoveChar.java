package String;

public class RemoveChar {

    public static void main(String[] args) {
        String res=removeChar("banana",'a');
        System.out.println(res);

        String input = "banana";
        char charToRemove = 'a';

        System.out.println(input.replace(String.valueOf(charToRemove),""));
    }

    private static String removeChar(String b, char ch) {

        StringBuilder builder=new StringBuilder(b.length());
        for (int i=0;i<b.length();i++)
        {
            if (b.charAt(i)!=ch)
            {
                builder.append(b.charAt(i));
            }
        }
        return builder.toString();
    }
}
