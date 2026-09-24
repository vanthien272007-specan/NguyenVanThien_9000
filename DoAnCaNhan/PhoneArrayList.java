/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoAnCaNhan;
import java.util.ArrayList;

public class PhoneArrayList {
   private ArrayList<Phone> phoneArrayList = new ArrayList();

   public void addPhone(Phone phone) {
      phone.addPhone();
      this.phoneArrayList.add(phone);
      System.out.println("Phone added successfully!");
   }

   public void updatePhone(String id) {
      Phone phone = this.findPhoneById(id);
      if (phone != null) {
         phone.updatePhone();
         System.out.println("Phone updated successfully!");
      } else {
         System.out.println("Phone not found with ID: " + id);
      }

   }

   public void deletePhoneById(String id) {
      Phone phone = this.findPhoneById(id);
      if (phone != null) {
         this.phoneArrayList.remove(phone);
         System.out.println("Phone deleted successfully!");
      } else {
         System.out.println("Phone not found with ID: " + id);
      }

   }

   public Phone findPhoneById(String id) {
      for(Phone p : this.phoneArrayList) {
         if (p.getPhoneId().equalsIgnoreCase(id)) {
            return p;
         }
      }

      return null;
   }

   public void displayAllPhones() {
      if (this.phoneArrayList.isEmpty()) {
         System.out.println("No phones in store.");
      } else {
         for(Phone p : this.phoneArrayList) {
            p.displayPhone();
            System.out.println("--------------------");
         }

      }
   }

   public void countPhoneByType() {
      int officialCount = 0;
      int handCarryCount = 0;

      for(Phone p : this.phoneArrayList) {
         if (p instanceof OfficialPhone) {
            ++officialCount;
         } else if (p instanceof HandCarryPhone) {
            ++handCarryCount;
         }
      }

      System.out.println("Total Official Phones: " + officialCount);
      System.out.println("Total Hand-Carry Phones: " + handCarryCount);
   }
}
