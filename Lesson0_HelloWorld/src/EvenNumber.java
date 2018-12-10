import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        System.out.println("Unosenje dva broja, nakon cega ce program da vrati parne brojeve izmedju ta dva broja");
        System.out.println("Prvi broj mora biti manji od drugog");
        Scanner broj = new Scanner(System.in);
        System.out.println("Unesite prvi broj");
        int prviBroj = broj.nextInt();
        System.out.println("Unesite drugi broj");
        int drugiBroj = broj.nextInt();

            while (prviBroj < drugiBroj) {
                if (prviBroj % 2 == 0) {

                    System.out.println(prviBroj);
                }
                prviBroj++;
            }
        }
    }
