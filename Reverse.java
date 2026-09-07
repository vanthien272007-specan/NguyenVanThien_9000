/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyenvanthien_9000.BTap.Lec07_String;
import java.util.*;

public class Reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string ");
        String s = sc.nextLine();

        System.out.println("original: " + s);
        System.out.println("reversed " + new StringBuilder(s).reverse());
    }
}

