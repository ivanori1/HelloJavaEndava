import java.util.Scanner;

public class SimpleCalc {
    public static void main(String args[]) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Unesite dva broja i matematicku operaciju koju zelite");
        System.out.println("Prvi broj: ");
        int prviBroj = userInput.nextInt();

        System.out.println("Drugi broj: ");
        int drugiBroj = userInput.nextInt();

        System.out.println("Matematicka operacija: (‘s’ – sabiranje, ‘o’ – oduzimanje, ‘m’ – množenje, ‘d’ – dijeljenje)");
        String matematickaOperacija = userInput.next();

        if (matematickaOperacija.equals("s")){
            System.out.println(prviBroj+drugiBroj);
        } else if (matematickaOperacija.equals("o")) {
            System.out.println(prviBroj-drugiBroj);
        }else if (matematickaOperacija.equals("m")) {
            System.out.println(prviBroj*drugiBroj);
        }else if (matematickaOperacija.equals("d")) {
            System.out.println(prviBroj/drugiBroj);
        } else {
            System.out.println("Pogresan unos (‘s’ – sabiranje, ‘o’ – oduzimanje, ‘m’ – množenje, ‘d’ – dijeljenje)");
        }

    }
}
