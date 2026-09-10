/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex6;

public class BookDemo {

    public static void main(String[] args) {
        System.out.println("--- Enter Book 1 ---");
        Book book1 = new Book();
        book1.enterBookInfo();

        System.out.println("\n--- Enter Book 2 ---");
        Book book2 = new Book();
        book2.enterBookInfo();

        System.out.println("\n--- Book List ---");
        book1.displayBookInfo();
        book2.displayBookInfo();
    }
}