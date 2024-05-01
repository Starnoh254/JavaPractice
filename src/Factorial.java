import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to find its factorial : ");
        int factorial = input.nextInt();

        for(int i = factorial - 1 ; i >= 1 ; i --){
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
