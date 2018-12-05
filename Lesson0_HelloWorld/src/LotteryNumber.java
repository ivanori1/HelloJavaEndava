import java.util.Scanner;
import java.util.Random;
public class LotteryNumber {
        public static void main(String args[]) {

            Scanner lotteryNumber = new Scanner(System.in);
            System.out.println("Unesite broj od 1 do 50");
            int n = lotteryNumber.nextInt();
            lotteryNumber.close();
            Random random = new Random();
            int j = random.nextInt(50) + 1; // 50 je maksimum a 1 je minimum
            int k = n - j;

            if (k == 0) {
                System.out.println("Nevjerovato! Pogodili ste tacan broj!");
            }else if (Math.abs(k) <= 5) {
                System.out.println("Dobar pokusaj, bili ste jako blizu");
            }else {
                System.out.println("Vise srece sledeci put...");
            }
            System.out.println(j + " je random broj");
    }
}
