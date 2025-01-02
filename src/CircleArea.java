import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the circle =  " );
        double radius = sc.nextDouble();

        //area
        double area = Math.PI * Math.pow(radius,2);

        System.out.printf("The area of the circle with radius %.2f is %.2f\n", radius, area);
    }
}
