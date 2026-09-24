/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoAnCaNhan;
import java.util.Date;
import java.util.Scanner;

public class HandCarryPhone extends Phone {
   private String originCountry;
   private double conditionRate;

   public HandCarryPhone() {
   }

   public HandCarryPhone(String phoneId, String brand, Date importDate, double unitPrice, double quantity, String originCountry, double conditionRate) {
      super(phoneId, brand, importDate, unitPrice, quantity);
      this.originCountry = originCountry;
      this.conditionRate = conditionRate;
   }

   public String getOriginCountry() {
      return this.originCountry;
   }

   public void setOriginCountry(String originCountry) {
      this.originCountry = originCountry;
   }

   public double getConditionRate() {
      return this.conditionRate;
   }

   public void setConditionRate(double conditionRate) {
      this.conditionRate = conditionRate;
   }

   public void addPhone() {
      super.addPhone();
      Scanner input = new Scanner(System.in);
      System.out.print("Enter Origin Country (LL/A, J/A, ZA/A...): ");
      this.setOriginCountry(input.nextLine());
      System.out.print("Enter Condition Rate (%): ");
      this.setConditionRate(input.nextDouble());
   }

   public void updatePhone() {
      super.updatePhone();
      Scanner input = new Scanner(System.in);
      System.out.print("Enter Origin Country: ");
      this.setOriginCountry(input.nextLine());
      System.out.print("Enter Condition Rate (%): ");
      this.setConditionRate(input.nextDouble());
   }

   public void displayPhone() {
      super.displayPhone();
      System.out.println("Type: Hand-Carry | Origin Country: " + this.originCountry + " | Condition: " + this.conditionRate + "%");
   }
}
