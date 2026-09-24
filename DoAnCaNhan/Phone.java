/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoAnCaNhan;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Phone implements IPhone {
   private String phoneId;
   private String brand;
   private Date importDate;
   private double unitPrice;
   private double quantity;

   public Phone() {
   }

   public Phone(String phoneId, String brand, Date importDate, double unitPrice, double quantity) {
      this.phoneId = phoneId;
      this.brand = brand;
      this.importDate = importDate;
      this.unitPrice = unitPrice;
      this.quantity = quantity;
   }

   public String getPhoneId() {
      return this.phoneId;
   }

   public void setPhoneId(String phoneId) {
      this.phoneId = phoneId;
   }

   public String getBrand() {
      return this.brand;
   }

   public void setBrand(String brand) {
      this.brand = brand;
   }

   public Date getImportDate() {
      return this.importDate;
   }

   public void setImportDate(Date importDate) {
      this.importDate = importDate;
   }

   public double getUnitPrice() {
      return this.unitPrice;
   }

   public void setUnitPrice(double unitPrice) {
      this.unitPrice = unitPrice;
   }

   public double getQuantity() {
      return this.quantity;
   }

   public void setQuantity(double quantity) {
      this.quantity = quantity;
   }

   public void addPhone() {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter Phone ID: ");
      this.setPhoneId(input.nextLine());
      System.out.print("Enter Brand: ");
      this.setBrand(input.nextLine());
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      System.out.print("Enter Import Date (dd/MM/yyyy): ");
      String dateString = input.nextLine();

      try {
         this.setImportDate(sdf.parse(dateString));
      } catch (ParseException var5) {
         System.out.println("Wrong date format!");
      }

      System.out.print("Enter Unit Price: ");
      this.setUnitPrice(input.nextDouble());
      System.out.print("Enter Quantity: ");
      this.setQuantity(input.nextDouble());
   }

   public void updatePhone() {
      try {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter Brand: ");
         this.setBrand(input.nextLine());
         System.out.print("Enter Unit Price: ");
         this.setUnitPrice(input.nextDouble());
         System.out.print("Enter Quantity: ");
         this.setQuantity(input.nextDouble());
         input.nextLine();
         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
         System.out.print("Enter Import Date (dd/MM/yyyy): ");
         String dateString = input.nextLine();
         this.setImportDate(sdf.parse(dateString));
      } catch (ParseException var4) {
         System.out.println("Invalid date format!");
      }

   }

   public void displayPhone() {
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      String dateFormatted = this.importDate != null ? sdf.format(this.importDate) : "N/A";
      System.out.println("Phone ID: " + this.phoneId + ", Brand: " + this.brand + ", Import Date: " + dateFormatted + ", Price: " + this.unitPrice + ", Quantity: " + this.quantity);
   }
}
