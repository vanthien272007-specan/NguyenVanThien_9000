/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyenvanthien_9000.Exercise2;
public abstract class Employee {

    private String name;

    public Employee() {

    }

    public Employee(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void disPlayInfo() {
        System.out.println("Name:" + name);
    }

    public abstract double calculateSalary();

}
