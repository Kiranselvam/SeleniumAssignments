package week1.day2.assignments.mandatory;

public class PrintingStringInAlternativeCase {
    public static void main(String s[])
    {
        String testString = "TESTSTRING";
        String output = "";
        for (int i = 0; i < testString.length(); i++) {
            if(i%2 == 0)
            {
                output += Character.toUpperCase(testString.toCharArray()[i]);
            }else
            {
                output += Character.toLowerCase(testString.toCharArray()[i]);
            }
        }

        System.out.println("Newly generated string is as follow: "+ output);
    }
}
