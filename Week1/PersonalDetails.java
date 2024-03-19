/* 3. Create a second project called “PersonalDetails” and write a program
that outputs personal details to the screen, e.g. Name, Address, Age, 
Phone number etc.*/

 import java.util.Scanner;

 public class PersonalDetails {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter your name: ");
         String name = scanner.nextLine();
         System.out.println("Your Name is " + name);

         System.out.print("Enter your address: ");
         String address = scanner.nextLine();
          System.out.println("Yout Address is " + address);

         System.out.print("Enter your age: ");
         int age = scanner.nextInt();
         scanner.nextLine();
        System.out.println("Your age is " + age);

         System.out.print("Enter your phone number: ");
         String phoneNumber = scanner.nextLine();
         System.out.println("Ypur phone number is" + phoneNumber);
         scanner.close();
     }
 }
