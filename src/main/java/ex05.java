import java.util.Scanner;

public class ex05 {
    public static void main (String[] args) {
        Scanner input1 = new Scanner(System.in),
                input2 = new Scanner(System.in);

        System.out.print("What is the first number? ");
        Double d1 = input1.nextDouble();
        System.out.print("What is the second number? ");
        Double d2 = input2.nextDouble();

        double a1 = d1 + d2;
        double a2 = d1 - d2;
        double a3 = d1 * d2;
        double a4 = d1 / d2;

        System.out.println(d1 + " + " + d2 + " = " + a1 + "\n" +
                           d1 + " - " + d2 + " = " + a2 + "\n" +
                           d1 + " * " + d2 + " = " + a3 + "\n" +
                           d1 + " / " + d2 + " = " + a4);
        }
    }
