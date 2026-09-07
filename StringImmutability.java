/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyenvanthien_9000.BTap.Lec07_String;
public class StringImmutability {

    public static String concatenaWithPlus(String first, String second) {
        return first + " " + second;

    }

    public static String concatenaWithConcat(String first, String second) {
        return first.concat(" ").concat(second);
    }

    public static void main(String[] args) {
        String first = "Duy tan ";
        String second = "University";
        System.out.println("Using:" + concatenaWithPlus(first, second));
        System.out.println("using concat: " + concatenaWithConcat(first, second));
        first.concat("University");
        System.out.println("First after concat without reassigment: " + first);
    }
}
