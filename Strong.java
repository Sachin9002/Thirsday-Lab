//Sachin Mandal
import java.util.*;
public class Strong {
    //main method
    public static void main(String[] args) {
        System.out.println("Check a number is strong or not");
        System.out.println("Enter a number");

       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
        
        int i,factorial,digit,sum = 0,k = num;
        while(k != 0) {
            i = 1;
            factorial = 1;

            //extracting the digit
            digit = k % 10;

            //get the factorial of the digit
            while(i <= digit) {
                factorial = factorial * i;
                i++;
            }

            //store the sum value
            sum = sum + factorial;

            //removing the digit one by one
            k = k / 10;
        }

        //check condition
        if(sum == num)
            //if sum value is equal to input number
            System.out.println(num + " is a strong number");
        else
            //if sum value is not equal to input number
            System.out.println(num + " is not a strong number");
    }
}