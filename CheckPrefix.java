/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyenvanthien_9000.BTap.Lec07_String;
import java.util.*;

public class CheckPrefix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String F = scanner.nextLine();
        System.out.println(F.startsWith("report"));
        System.out.println(F.endsWith(".pdf"));
        System.out.println("First charater = " + F.charAt(0));
        System.out.println("Last character =" + F.charAt(F.length() - 1));
    }
    
}