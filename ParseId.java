/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyenvanthien_9000.BTap.Lec07_String;
import java.util.*;

public class ParseId {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student ID, for example SE123456: ");
        String ID = sc.nextLine();
        System.out.println("Major code = " + ID.substring(0, 2));
        System.out.println("Numeric part = " + ID.substring(2, 8));

    }
}
