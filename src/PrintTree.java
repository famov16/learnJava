
import java.util.InputMismatchException;
import java.util.Scanner;


public class PrintTree {

    public static void tree(int numb) {

        int base = numb + numb - 1;
        int spaces = base / 2;
        int x = 1;
        while (spaces >= 0) {
            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }

            for (int n = 0; n < x; n++) {
                System.out.print("x");
            }
            System.out.println();
            spaces--;
            x += 2;
        }

        for (int i = 0; i < 2; i++) {
            for (int n = 1; n < base / 2; n++) {
                System.out.print(" ");
            }

            System.out.println("| |");
        }

    }

    public static void main(String[] args) throws Exception {

        boolean validData = false;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Escribe cuantas filas o niveles que  quieres que tenga tu arbol : ");
                int numb = sc.nextInt();
                tree(numb);
                validData = true;
                sc.close();
            } catch (InputMismatchException e) {
                System.out.println("error!, no es un numero");
            }

        } while (!validData);

    }

}
