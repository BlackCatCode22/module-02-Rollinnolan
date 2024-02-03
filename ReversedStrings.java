import java.util.Scanner;
public class ReversedStrings
{
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Please enter a word or sentence.");
        String input = stdin.nextLine();
        String word = "";
        String output = "";
        /*====================================================================
        ======================================================================*/
        /*This is my first attempt before the extension*/
        /*for(int i = input.length(); i > 0; i--)
        {
            //length is 1 number higher than the last index char
            char c = input.charAt(i - 1);
            output = output + c;
        }*/
        /*====================================================================
        ======================================================================*/
        /*This for loop iterates after each word*/
        for(int i = 1; i <= input.length(); i = i + word.length())
        {
            word = input.substring(i-1);
            if (word.substring(1).contains(" "))
            {
                word = word.trim(); // trim a space that comes at the end of the index
                word = word.substring(0,word.indexOf(' '));
                for(int j = word.length(); j > 0; j--)
                {
                    //length is 1 number higher than the last index char
                    char c = word.charAt(j - 1);
                    output = output + c;
                }
                output = output + ' ';
                word = word + ' ';
                /*add the space back so that word.length() has the correct value*/
            }
            //This part works when there are no spaces at the end
            else
            {
                for(int j = word.length(); j > 0; j--)
                {
                    //length is 1 number higher than the last index char
                    char c = word.charAt(j - 1);
                    output = output + c;
                }
            }

        }
        System.out.println("Here is your response backwards:  "+output);
    }
}