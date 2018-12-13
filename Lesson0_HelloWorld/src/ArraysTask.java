import java.util.Arrays;
import java.util.Scanner;

public class ArraysTask {
    /*
    Za uneti niz celih brojeva duzine n (koja se takođe unosi), sortirati niz, ispitati da li sadrži broj x
    i ispisati prvih 5 članova niza na standardni izlaz. Koristiti klasu Arrays.
     */

    public static void main(String[] args) {

        int[] niz;

        Scanner input = new Scanner(System.in);
        System.out.println("Unesite broj clanova niza");

        niz = new int[input.nextInt()];
        System.out.println("Unesite broj koji je clan niza");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = input.nextInt();
        }
        Arrays.sort(niz);
        System.out.println("prvih pet clanova niza je: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(niz[i]);
        }
    }
}

