import java.util.Scanner;

public class ArraysTask {
    /*
    Za uneti niz celih brojeva duzine n (koja se takođe unosi), sortirati niz, ispitati da li sadrži broj x
    i ispisati prvih 5 članova niza na standardni izlaz. Koristiti klasu Arrays.
     */

    public static void main(String[] args) {

        int[] duzinaNiza;

        Scanner input = new Scanner(System.in);
        System.out.println("Unesite broj clanova niza");

        duzinaNiza = new int[input.nextInt()];
        System.out.println("Unesite broj koji je clan niza");
        for (int i = 0; i < duzinaNiza.length; i++) {
            duzinaNiza[i] = input.nextInt();
        }

    }
}

