
package nguyenvanthien_9000.BTVN;

import java.util.Scanner;

public class Bt1 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so nguyen n: ");
        int n = scanner.nextInt();

        if (n > 0) {
            System.out.println(n + "la so duong ");
        } else if (n < 0) {
            System.out.println(n + "la so am");
        } else {
            System.out.println(n + "bang 0");
        }
    }

    
}
