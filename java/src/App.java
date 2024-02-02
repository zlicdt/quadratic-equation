import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double a, b, c;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Please input a = ");
            a = input.nextDouble();
            System.out.print("Please input b = ");
            b = input.nextDouble();
            System.out.print("Please input c = ");
            c = input.nextDouble();
            System.out.println("It looks like -> " + a + "x^2 + " + b + "x + " + c + " = 0");

            // Got user input then calculate

            double delta = (b * b) - (4.0 * a * c);
            if (delta > 0.0) {
                double x1 = ((-b) + Math.sqrt(delta)) / (2.0 * a);
                double x2 = ((-b) - Math.sqrt(delta)) / (2.0 * a);
                System.out.println("Two results: x1 = " + x1 + "; x2 = " + x2 + ".");
            }
            if (delta == 0.0) {
                double x = (-b) / (2 * a);
                System.out.println("One result: x = " + x + ".");
            }
            if (delta < 0.0) {
                System.out.println("No result.");
            }
            System.out.println(" ");
            System.out.println("-- Repeat again --");
        }
    }
}
