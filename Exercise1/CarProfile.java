/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyenvanthien_9000.HomeworkClassObject.Exercise1;


import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class CarProfile {

    private String make;
    private String model;
    private int year;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        }
    }
    public void addProfile()
    {
        System.out.println("Make: ");
        Scanner sc = new Scanner(System.in);
        String a= sc.nextLine();
        this.setMake(a);
        System.out.println("Model: ");
        String b= sc.nextLine();
        this.setModel(b);
        
        System.out.println("Year: ");
        int c= sc.nextInt();
        sc.nextLine();
        this.setYear(c);
    }
    public void displayProfile()
    {
        System.out.println("Make: "+ this.getMake() + " : Model: "+ this.getModel()+ " : Year: "+ this.getYear());
    }
}