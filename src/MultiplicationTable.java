import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to generate the multiplication table : ");
        int number = input.nextInt();
        input.close();
        for (int i = 1 ; i <= 10 ; i ++){
            System.out.printf("%d * %d = %d \n" , number , i , number * i );
        }
    }
}
