package String;

public class StringToCamelCase {

    public static void main(String[] args) {

        String inputString="hello to the coding world";

        String [] arr=inputString.split(" ");

        StringBuilder builder=new StringBuilder();

        for (int i=0;i< arr.length;i++)
        {
            String word=arr[i];

            builder.append(Character.toUpperCase(word.charAt(0))+word.substring(1).toLowerCase());

            builder.append(" ");
        }
        System.out.println(builder.toString());

    }

}
