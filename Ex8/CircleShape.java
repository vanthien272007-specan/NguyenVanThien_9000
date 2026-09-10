/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex8;
import java.util.Scanner;

public class CircleShape {

    private double radius;

    public CircleShape() {
    }

    public CircleShape(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void enterRadius() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius: ");
        this.radius = scanner.nextDouble();
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}