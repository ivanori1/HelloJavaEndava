
import java.util.Scanner;
import java.util.Random;

public class LotteryNumber {
    public static void main(String args[]) {
        /**
         * Uraditi modifikaciju domaćeg iz prethodne nedelje, zadatak pogađanja broja.
         * Vrteti se u petlji dok ne pogodimo broj, ili budemo barem blizu (razlika manja od 5).
         * Taj deo sa proverom pogotka izdvojiti u zasebnu metodu, kojoj se kao argument prosledjuje broj koji tipujemo,
         * a povratna vrednost metode je 0 – ako smo pogodili, 1 – ako smo bili blizu, 2 – ako smo promašili.
         * Na osnovu toga ostajemo ili izlazimo iz petlje i završavamo program sa odgovarajućom porukom.
         */
        Scanner lotteryNumber = new Scanner(System.in);
        System.out.println("Unesite broj od 1 do 50");
        int n = lotteryNumber.nextInt();
        lotteryNumber.close();
        Random random = new Random();
        int j = random.nextInt(50) + 1; // 50 je maksimum a 1 je minimum
        int k = n - j;
        if (n <= 50) {
            if (k == 0) {
                System.out.println("Nevjerovato! Pogodili ste tacan broj!");
            } else if (Math.abs(k) <= 5) {
                System.out.println("Dobar pokusaj, bili ste jako blizu");
            } else {
                System.out.println("Vise srece sledeci put...");
            }
            System.out.println(j + " je random broj");
        } else {
            System.out.println("Broj koji ste unijeli je veci od 50");
        }
        lotteryNumber.close();
    }
}