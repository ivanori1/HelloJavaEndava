import java.util.Scanner;

public class TheBestStudent {
    public static void main(String[] args) {
        /*
        Korišćenjem for petlje pronaći i ispisati ime studenta sa najvećim brojem poena na testu.
        Prvo se unosi broj studenata n, posle se n puta obilazi for petlja i unose ime i broj poena studenta.
        Zapamtiti onog sa najvećim brojem poena.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Unesite broj studenata");
        int brojStudenta = input.nextInt();
        int najvecaOcjena = 0;
        String najboljiStudent ="";

        for (int x =0; x < brojStudenta; x ++ ) {
            int ostatak = brojStudenta - x;
            int redniBroj = x+1;
            System.out.println("Ostalo za unos jos: "+ ostatak);
            System.out.println("Unesi ime studenta rednog broja " + redniBroj);
            String imeStudenta = input.next();
            System.out.println("Unesi broj poena studenta od 0 do 100");
            int ocjenaStudenta = input.nextInt();
            if (ocjenaStudenta > najvecaOcjena) {
                najvecaOcjena = ocjenaStudenta;
                najboljiStudent = imeStudenta;
            }
        }
        System.out.println("Najvecu ocjenu ima " + najboljiStudent + " sa ocjenom "+ najvecaOcjena);

    }
}
