import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculators {

    /**
     * Questo metodo chiede all'utente di inserire due numeri
     * e stampa a video la somma, la sottrazione, la moltiplicazione e
     * la divisione
     */
    public static void calculator() {
        Scanner input = new Scanner(System.in);
        boolean flag1 = false;
        boolean flag2 = false;
        do {
            System.out.println("Ciao! Inserisci due numeri:");
            String par1 = input.next();
            String par2 = input.next();
            for (int i = 0; i < par1.length(); i++) {
                if (!Character.isDigit(par1.charAt(i))) {
                    flag1 = true;
                    break;
                }
            }
            if (flag1) {
                System.out.println("Il primo numero inserito è in un formato errato");
                flag1 = false;
                continue;
            }
            for (int i = 0; i < par2.length(); i++) {
                if (!Character.isDigit(par2.charAt(i))) {
                    flag2 = true;
                    break;
                }
            }
            if (flag2) {
                System.out.println("Il secondo numero inserito è in un formato errato");
                flag2 = false;
                continue;
            }
            int x = Integer.parseInt(par1);
            int y = Integer.parseInt(par2);
            System.out.println("La somma tra " + x + " e " + y + " è: " + (x+y));
            System.out.println("La sottrazione tra " + x + " e " + y + " è: " + (x-y));
            System.out.println("La moltiplicazione tra " + x + " e " + y + " è: " + (x*y));
            if (y != 0) {
                System.out.println("La divisione tra " + x + " e " + y + " è: " + (x/y));
            }
            else System.out.println("Non posso dividere per 0!");
            break;
        } while (true);
        input.close();
    }

    /**
     * Questo metodo chiede all'utente di inserire due numeri
     * e stampa a video la somma, la sottrazione, la moltiplicazione e
     * la divisione, usando una regex come validator
     */

    public static void calculator_regex() {
        Scanner input = new Scanner(System.in);
        String regex = "[0-9]";
        System.out.println("Ciao! Inserisci due numeri:");
        String par1 = input.next();
        String par2 = input.next();
        while (!(par1.matches(regex) && par2.matches(regex))) {
            System.out.println("Qualcosa non è andato! Reinserisci due numeri:");
            par1 = input.next();
            par2 = input.next();
        }
        int x = Integer.parseInt(par1);
        int y = Integer.parseInt(par2);
        System.out.println("La somma tra " + x + " e " + y + " è: " + (x+y));
        System.out.println("La sottrazione tra " + x + " e " + y + " è: " + (x-y));
        System.out.println("La moltiplicazione tra " + x + " e " + y + " è: " + (x*y));
        if (y != 0) {
            System.out.println("La divisione tra " + x + " e " + y + " è: " + (x/y));
        }
        else System.out.println("Non posso dividere per 0!");
        input.close();
    }

    public static void calculator_exceptions() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ciao! Inserisci due numeri: ");
        String par1 = input.next();
        String par2 = input.next();
        try {
            int x = Integer.parseInt(par1);
            int y = Integer.parseInt(par2);
            System.out.println("La somma tra " + x + " e " + y + " è: " + (x+y));
            System.out.println("La sottrazione tra " + x + " e " + y + " è: " + (x-y));
            System.out.println("La moltiplicazione tra " + x + " e " + y + " è: " + (x*y));
            System.out.println("La divisione tra " + x + " e " + y + " è: " + (x/y));
        } catch (NumberFormatException e) {
            System.out.println("ERRORE! Uno degli input non è nel giusto formato!");
            calculator_exceptions();
        } catch (ArithmeticException e) {
            System.out.println("Non posso dividere per 0!");
        }

    }

}
