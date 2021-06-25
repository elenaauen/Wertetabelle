import java.util.Scanner;

public class anpassbaresUndHochwertigesIntervall {

    public static void main(String[] args) {

        Scanner benutzereingabe = new Scanner(System.in);

        double m;
        char operator;
        int p;
        int q;
        double b;
        double n;


        System.out.println("Bitte geben Sie einen Wert für m an (nach f(x)= m * x^n + b): ");
        m = benutzereingabe.nextDouble();

        System.out.println("Bitte geben Sie einen Rechenoperator an ('*', '/'):");
        operator = benutzereingabe.next().charAt(0);

        System.out.println("Bitte geben Sie einen Wert für den Exponenten n an:");
        n = benutzereingabe.nextDouble();

        System.out.println("Bitte geben Sie einen Wert für b an:");
        b = benutzereingabe.nextDouble();

        System.out.println("Bitte geben Sie die untere Grenze des Intervalls an:");
        p = benutzereingabe.nextInt();

        System.out.println("Bitte geben Sie die obere Grenze des Intervalls an:");
        q = benutzereingabe.nextInt();


        System.out.println();

        System.out.println("f(x) = " + m + " * x^" + n + " + " + b);
        System.out.println("I = [" + p + "; " + q + "]");

        System.out.println();

        for (int x = p; x <= q; x++) {

            System.out.println(x);


            if (operator == '*') {
                System.out.println(m * Math.pow(x,n) + b);
            } else if (operator == '/') {
                System.out.println(m / Math.pow(x,n) + b);
            } else {
                System.out.println("Ungültiger Rechenoperator");
            }

        }
    }
}



// todo: Formatierung als Tabelle, komplexere Gleichungen, Tabellenform mit anpassbarem Intervall verbinden

