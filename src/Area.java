import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Provide the radius of the circle to find the area : ");
        int radius = input.nextInt();

        double area = Math.PI * radius * radius;

        System.out.println("The area of the circle with radius " + radius + " is " + area);
    }
}
