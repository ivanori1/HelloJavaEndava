import java.util.Scanner;

public class SimpleCalc {

    public static void sabiranje(double prviBroj, double drugiBroj) {
        double rezultat = prviBroj + drugiBroj;
        System.out.println(rezultat);
    }

    public static void oduzimanje(double prviBroj, double drugiBroj) {
        double rezultat = prviBroj - drugiBroj;
        System.out.println(rezultat);
    }

    public static void dijeljenje(double prviBroj, double drugiBroj) {
        double rezultat = prviBroj / drugiBroj;
        System.out.println(rezultat);
    }

    public static void mnozenje(double prviBroj, double drugiBroj) {
        double rezultat = prviBroj * drugiBroj;
        System.out.println(rezultat);
    }


    public static void main(String args[]) {
        /*
        Modifikacija digitrona od prošle nedelje: Sve operacije smestiti u posebne metode,
        i kada je to potrebno pozivati odgovarajuću metodu.
        Vrteti se u petlji, sve dok se za kod operacije ne unese nepostojeći kod (default kod switch-a).
         */

        Scanner userInput = new Scanner(System.in);
        System.out.println("Unesite dva broja i matematicku operaciju koju zelite");
        System.out.println("Prvi broj: ");
        double prviBroj = userInput.nextInt();

        System.out.println("Drugi broj: ");
        double drugiBroj = userInput.nextInt();

        System.out.println("Matematicka operacija: (‘s’ – sabiranje, ‘o’ – oduzimanje, ‘m’ – množenje, ‘d’ – dijeljenje)");


        String matematickaOperacija = userInput.next();
        switch (matematickaOperacija) {
            case "s":
                sabiranje(prviBroj, drugiBroj);
                break;
            case "o":
                oduzimanje(prviBroj, drugiBroj);
                break;
            case "m":
                mnozenje(prviBroj, drugiBroj);
                break;
            case "d":
                dijeljenje(prviBroj, drugiBroj);
                break;
            default:
                System.out.println("Pogresan unos (‘s’ – sabiranje, ‘o’ – oduzimanje, ‘m’ – množenje, ‘d’ – dijeljenje)");
                break;

        }
        userInput.close();

    }
}
