
package vonglap;

import java.util.Scanner;

public class ptbac1 {
        public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Nhap gia tri a: ");
            double a = input.nextDouble();
            System.out.print("Nhap gia tri b: ");
            double b = input.nextDouble();
            
            if (a == 0) {
                if (b == 0) {
                    System.out.println("Phuong trinh co vo so nghiem.");
                } else {
                    System.out.println("Phuong trinh vo nghiem.");
                }
            } else {
                double x = -b / a;
                System.out.println("Nghiem cua phuong trinh la: x = " + x);
            }
        }
    }
}

