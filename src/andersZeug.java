import java.util.Scanner;

public class andersZeug {


    public static void main(String[] args) {

        Scanner benutzereingabe = new Scanner(System.in);

        double m;
        char operator;
        double b;


        System.out.println("Bitte geben Sie einen Wert für m an (nach f(x)=m*x+b): ");
        m = benutzereingabe.nextDouble();

        System.out.println("Bitte geben Sie einen Rechenoperator an ('*', '/'):");
        operator = benutzereingabe.next().charAt(0);

        System.out.println("Bitte geben Sie einen Wert für b an:");
        b = benutzereingabe.nextDouble();


        System.out.println();

        System.out.println("f(x) = " + m + " * x + " + b);

        System.out.println();

        double[] xWerte = new double[]{0, 1, 2, 3, 4, 5};

        double[] yWerte = new double[xWerte.length];


        for (int x = 0; x <= 5; x++) {

            double y = 0;

            if (operator == '*') {
                y = m * x + b;
            } else if (operator == '/') {
                y = m / x + b;
            } else {
                System.out.println("Ungültiger Rechenoperator");
            }


            yWerte[x] = y;

        }


        System.out.print("x:  ");
        for (double zahl : xWerte) {
            System.out.print(zahl + "  ");
        }

        System.out.println("");

        System.out.print("y:  ");
        for (double zahl : yWerte) {
            System.out.print(zahl + "  ");
        }

    }
}