/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyenvanthien_9000.BTap.Lec07_String;
import java.util.*;

public class CensorWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence:");
        String sentence = sc.nextLine();
        System.out.println("Enter word to censor:");
        String word = sc.nextLine();

        String start = "";
        for (int i = 0; i < word.length(); i++) {
            start += "*";
        }
        sentence = sentence.replace(word,start);
        System.out.println("Censor:" + sentence);
    }
}
