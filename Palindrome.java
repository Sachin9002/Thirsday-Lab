//Sachin Mandal
import java.util.Scanner;
public class Palindrome{
    public static void main(String []args) {
        int r = 0, sum = 0, k = 0;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (n == sum)
            System.out.println("Number is Palindrome");
        else
            System.out.println("Number is not Palindrome");
    }}