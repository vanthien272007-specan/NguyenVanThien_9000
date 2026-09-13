/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyenvanthien_9000.HomeworkClassObject.Exercise2;
import java.util.Scanner;

public class BankAccount {

    private String accountNumber;
    private String owner;
    private int balance;

    BankAccount() {
        this.balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void addInfo() {
        Scanner sc = new Scanner(System.in);
        String tamAccountNumber;
        String tamOwner;
        int tamBalance;
        System.out.print("AccountNumber: ");
        tamAccountNumber = sc.nextLine();
        System.out.print("Name: ");
        tamOwner = sc.nextLine();
        System.out.print("Balance: ");
        tamBalance = sc.nextInt();

        setAccountNumber(tamAccountNumber);
        setOwner(tamOwner);
        setBalance(tamBalance);
    }

    public void displayInfo() {
        System.out.println("AccountNumber: " + getAccountNumber());
        System.out.println("Name: " + getOwner());
        System.out.println("Balance: " + getBalance());
    }
}