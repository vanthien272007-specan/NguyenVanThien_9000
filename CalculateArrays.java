
package nguyenvanthien_9000.BTap.Lec06_ArrayArraylist;
import java.util.*;

public class CalculateArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            sum = sum + array[i];
        }
        System.out.println("sum =" + sum);
        System.out.println("average = " + (sum / n));
    }
}