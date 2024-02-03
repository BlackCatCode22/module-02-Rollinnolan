public class LargestOfThree
{
    public static void main(String[] args)
    {
        /*Uses the getIntFromTheUser method from the MaddnessWithMethods class
        * to receive and validate an integer response*/
        System.out.println("Please enter your first integer");
        int num1 = MadnessWithMethods.getIntFromTheUser();
        System.out.println("Please enter your second integer");
        int num2 = MadnessWithMethods.getIntFromTheUser();
        System.out.println("Please enter your third integer");
        int num3 = MadnessWithMethods.getIntFromTheUser();

        int result;
        if(num1 >= num2 && num1 >= num3) //compares num1 to num2 and num3
        {
            result = num1;
        }
        else if(num2 >= num1 && num2 >= num3)//compares num2 to num1 and num3
        {
            result = num2;
        }
        else//num3 must be the largest if num1 and num 2 are not
        {
            result = num3;
        }
        System.out.println("The largest number is: " + result);
    }
}
