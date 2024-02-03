import java.util.Scanner;
public class MadnessWithMethods
{
    public static void main(String[] args)
    {
        System.out.println("Please enter an Integer");
        int num1 = getIntFromTheUser();
        System.out.println("Please enter another Integer");
        int num2 = getIntFromTheUser();
        System.out.println("You have entered " + num1 + " and " + num2 + ".");
        System.out.println("The biggest number is " + compareTwoInts(num1,num2));
        System.out.println("The sum is " + sumTwoInts(num1,num2));
        System.out.println("The difference is " + subtractTwoInts(num1,num2));
        System.out.println("The product is " + multiplyTwoInts(num1,num2));

    }
    static int getIntFromTheUser()//Validate int input
    {
        Scanner stdin = new Scanner(System.in);
        int num = 0;
        if(stdin.hasNextInt()) //checks if the input has an int
        {
             num = stdin.nextInt();// assigns the input to num
        }
        else //ask the user for a different input if they did not input an int
        {
            System.out.println("Invalid input, please input an Integer");
            getIntFromTheUser();
        }
        return num;
    }
    static int compareTwoInts(int a, int b){
        if(a > b)//checks if a is bigger than b
        {
            return a;
        }
        else//returns b if it was greater than or equal
        {
            return b;
        }
    }
    static int sumTwoInts(int a, int b){
        return a + b;//adds a and b together
    }
    static int subtractTwoInts(int a, int b){
        return a - b;//subtracts a from b
    }
    static int multiplyTwoInts(int a, int b){
        return a * b;//multiples a and b
    }
}
