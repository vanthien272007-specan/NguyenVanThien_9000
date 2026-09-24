/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoAnCaNhan;
import java.util.Date;
import java.util.Scanner;

public class OfficialPhone extends Phone {
   private int warrantyMonths;
   private String serviceCenter;

   public OfficialPhone() {
   }

   public OfficialPhone(String phoneId, String brand, Date importDate, double unitPrice, double quantity, int warrantyMonths, String serviceCenter) {
      super(phoneId, brand, importDate, unitPrice, quantity);
      this.warrantyMonths = warrantyMonths;
      this.serviceCenter = serviceCenter;
   }

   public int getWarrantyMonths() {
      return this.warrantyMonths;
   }

   public void setWarrantyMonths(int warrantyMonths) {
      this.warrantyMonths = warrantyMonths;
   }

   public String getServiceCenter() {
      return this.serviceCenter;
   }

   public void setServiceCenter(String serviceCenter) {
      this.serviceCenter = serviceCenter;
   }

   public void addPhone() {
      super.addPhone();
      Scanner input = new Scanner(System.in);
      System.out.print("Enter Warranty (months): ");
      this.setWarrantyMonths(input.nextInt());
      input.nextLine();
      System.out.print("Enter Service Center: ");
      this.setServiceCenter(input.nextLine());
   }

   public void updatePhone() {
      super.updatePhone();
      Scanner input = new Scanner(System.in);
      System.out.print("Enter Warranty (months): ");
      this.setWarrantyMonths(input.nextInt());
      input.nextLine();
      System.out.print("Enter Service Center: ");
      this.setServiceCenter(input.nextLine());
   }

   public void displayPhone() {
      super.displayPhone();
      System.out.println("Type: Official | Warranty: " + this.warrantyMonths + " months | Service Center: " + this.serviceCenter);
   }
}