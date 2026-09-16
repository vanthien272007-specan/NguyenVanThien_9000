/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyenvanthien_9000.Exercise2;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter salary: ");
        double salary = sc.nextDouble();

        Employee employee = new FullTimeEmployee(name, salary);
        employee.disPlayInfo();
        System.out.println("Salary: " + employee.calculateSalary());

    }
}