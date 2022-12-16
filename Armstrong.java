//Sachin Mandal
import java.util.Scanner;
public class Armstrong {

    public static void main(String[] args) {
        System.out.println("Cheaking Armstrong number or not");
        System.out.println("Enter a number:");

        int k, rem, result = 0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        k = num;

        while (k != 0)
        {
            rem = k % 10;
            result += Math.pow(rem, 3);
            k /= 10;
        }

        if(result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}