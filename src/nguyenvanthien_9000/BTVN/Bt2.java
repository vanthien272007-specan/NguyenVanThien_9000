
package nguyenvanthien_9000.BTVN;

import java.util.Scanner;

public class Bt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so nguyen n");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + "la so chan");

        } else {
            System.out.println(n + "la so le");
        }
    }
}
