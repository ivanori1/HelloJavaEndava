
import java.util.Scanner;
import java.util.Random;

public class LotteryNumber {
    /**
     * Uraditi modifikaciju domaćeg iz prethodne nedelje, zadatak pogađanja broja.
     * Vrteti se u petlji dok ne pogodimo broj, ili budemo barem blizu (razlika manja od 5).
     * Taj deo sa proverom pogotka izdvojiti u zasebnu metodu, kojoj se kao argument prosledjuje broj koji tipujemo,
     * a povratna vrednost metode je 0 – ako smo pogodili, 1 – ako smo bili blizu, 2 – ako smo promašili.
     * Na osnovu toga ostajemo ili izlazimo iz petlje i završavamo program sa odgovarajućom porukom.
     */

//    static Scanner input = new Scanner(System.in);
//    static int zeljeniBroj = input.nextInt();
//
//    static Random random = new Random();
//    static int zamisljeniBroj = random.nextInt(50) + 1;
//
//    static int razlika = zamisljeniBroj - zeljeniBroj;
    public static int vratiRezultat(int zeljeniBroj, int zamisljeniBroj) {
        int razlika = zamisljeniBroj - zeljeniBroj;
        if (razlika == 0) {
            return 0;
        } else if (Math.abs(razlika) < 5) {
            return 1;
        } else return 2;
    }

    public static void main(String args[]) {

        Random random = new Random();
        int zamisljeniBroj = random.nextInt(50) + 1;
        System.out.println("Broj je zamisljen! Probajte da ga pogodite.");
        Scanner input = new Scanner(System.in);

        while (true) {

             System.out.println("Unesi broj");
             int zeljeniBroj = input.nextInt();
             int rezultat = vratiRezultat(zeljeniBroj, zamisljeniBroj);
             if (zeljeniBroj < 50) {

                 if (rezultat == 0) {
                     System.out.println("Cestitamo, pogodili ste");
                     break;
                 } else if (vratiRezultat(zeljeniBroj, zamisljeniBroj) == 1) {
                     System.out.println("Blizu ste, pokusavajte jos, razlika izmedju brojeva je 5 ili manja");
                 } else if (rezultat == 2) {
                     System.out.println("Pokusaj nije blizu zamisljenog broja, nastavite da pokusavate");
                 }
             } else {
                 System.out.println("Uneseni broj je veci od 50");
             }

        }


    }
}