import java.util.Scanner;

public class Sum {
    public static void main (String [] args){
        int number1 = 0, number2 = 0;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        for(int i = 0 ; i < 2 ; i ++){

            System.out.print("Enter the number : ");
            if(i==0){
                number1 = input.nextInt();
                sum += number1;
            }
            else {
                number2 = input.nextInt();
                sum += number2;
            }

        }

        input.close();

        System.out.println("Sum of " + number1 + " and " +number2+" = " + sum);


    }
}
