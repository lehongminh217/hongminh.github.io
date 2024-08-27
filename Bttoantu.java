
package Bttoantu;

import java.util.Scanner;

public class Bttoantu {

    
    public static void main(String[] args) {
        int x;
        int y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap hai so nguyen tu ban phim");
        x = scanner.nextInt();
        y = scanner.nextInt();
        System.out.println("Tong hai so nguyen la:" + (x+y));
        System.out.println("Hieu hai so nguyen la:" + (x-y));
        System.out.println("Tich hai so nguyen la:" + (x*y));
        System.out.println("Thuong hai so nguyen la:"+ (x/y));
        System.out.println("So du hai so nguyen la:" + (x%y));
        
 
    }
}
