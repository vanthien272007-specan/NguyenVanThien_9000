/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyenvanthien_9000.HomeworkClassObject.Exercise2;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Processor {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.addInfo();
        double amount1, amount2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Deposit: ");
        amount1= sc.nextDouble();
        account.deposit(amount1);
        System.out.println("Withdraw: ");
        amount2= sc.nextDouble();
        boolean result = account.withdraw(amount2);
        if (result == true)
        {
            System.out.println("Completely withdraw");
        }
        else
        {
            System.out.println("Failed");
        }
        account.displayInfo();
        
    }
}