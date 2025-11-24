package String;

public class CountNoOfWords {
    public static void main(String[] args) {
        String s="Hello to The Java World";
        int f=s.length();
        int space=0;

        for (int i=0;i<f;i++)
        {
            if (s.charAt(i)==' ')
            {
                space+=1;
            }
        }
        System.out.println("Number of words are ");
        System.out.println(space+1);

    }
}
