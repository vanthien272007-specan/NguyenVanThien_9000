/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyenvanthien_9000.Exercise2;
public class FullTimeEmployee extends Employee {

    private double salary;

    public FullTimeEmployee() {

    }

    public FullTimeEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public void setSalary(double salary) {

        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
