import java.util.Scanner;

class Exercise{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the three numbers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        input.close();

        if (num1 > num2 && num1 > num3){
            System.out.printf("The largest number is %d \n" , num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.printf("The largest number is %d \n" , num2);
        }
        else {
            System.out.printf("The largest number is %d \n" , num3);
        }

    }

}

