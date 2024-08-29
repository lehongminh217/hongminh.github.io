
package Baitap;
import java.util.Scanner;

public class Random {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random   = new Random();
        String check;
        do {
            System.err.println("Tiep tuc chuong trinh (yes or no) ? ");
            check = scanner.next();
            int n = random.nextInt + 1;
            if (n % 2 == 0) {
                System.out.println(n + " la so chan");
            } else {
                System.out.println(n + " la so le");
            }

        } while (check.equals("yes"));
    } 
}
    