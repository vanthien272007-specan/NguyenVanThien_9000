/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoAnCaNhan;
import java.util.Scanner;

public class Processor {
   public static void main(String[] args) {
      PhoneArrayList store = new PhoneArrayList();
      Scanner scanner = new Scanner(System.in);

      int choice;
      do {
         System.out.println("\n===== PHONE STORE MANAGER =====");
         System.out.println("1. Add new phone");
         System.out.println("2. Update phone by id");
         System.out.println("3. Delete phone by id");
         System.out.println("4. Find phone by id");
         System.out.println("5. Display all phones");
         System.out.println("6. Count phone by type");
         System.out.println("0. Exit");
         System.out.print("Choose option: ");
         choice = scanner.nextInt();
         scanner.nextLine();
         switch (choice) {
            case 0:
               System.out.println("Exiting program...");
               break;
            case 1:
               System.out.println("1. Official Phone");
               System.out.println("2. Hand-Carry Phone");
               System.out.print("Choose phone type: ");
               int type = scanner.nextInt();
               scanner.nextLine();
               if (type == 1) {
                  store.addPhone(new OfficialPhone());
               } else if (type == 2) {
                  store.addPhone(new HandCarryPhone());
               } else {
                  System.out.println("Invalid type!");
               }
               break;
            case 2:
               System.out.print("Enter Phone ID to update: ");
               String updateId = scanner.nextLine();
               store.updatePhone(updateId);
               break;
            case 3:
               System.out.print("Enter Phone ID to delete: ");
               String deleteId = scanner.nextLine();
               store.deletePhoneById(deleteId);
               break;
            case 4:
               System.out.print("Enter Phone ID to find: ");
               String findId = scanner.nextLine();
               Phone foundPhone = store.findPhoneById(findId);
               if (foundPhone != null) {
                  foundPhone.displayPhone();
               } else {
                  System.out.println("Phone not found!");
               }
               break;
            case 5:
               store.displayAllPhones();
               break;
            case 6:
               store.countPhoneByType();
               break;
            default:
               System.out.println("Invalid choice!");
         }
      } while(choice != 0);

   }
}
