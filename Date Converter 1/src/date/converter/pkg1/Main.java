/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package date.converter.pkg1;

/**
 *
 * @author Minase
 */
import java.util.Scanner;

public class Main extends Converter{  // This is where Inheritance Happens
    public static void main(String [] args) {
        boolean continueLoop = true;
        while(continueLoop){
            Scanner mySc = new Scanner(System.in);
            System.out.println('\n' + "           MENU   ");
            System.out.println("-------------------------");
            System.out.println("1. Ethiopian to Gregorian ");
            System.out.println("2. Gregorian to Ethiopian ");
            System.out.println("-------------------------" + '\n');
            System.out.println("Enter Option (1/2) -> ");
            int choice = mySc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println('\n' + "Enter the Ethiopian Date: (dd mm yyyy)/(15 3 1993) -> ");
                    int dd = mySc.nextInt();
                    int mm = mySc.nextInt();
                    int yy = mySc.nextInt();
                    ethioToGregorian(dd, mm, yy);
                    break;
                case 2:
                    System.out.println('\n' + "Enter the Gregorian Date: (dd mm yyyy)/(24 11 2000) -> ");
                    int dd1 = mySc.nextInt();
                    int mm1 = mySc.nextInt();
                    int yy1 = mySc.nextInt();
                    gregToEthiopian(dd1, mm1, yy1); 
                    break;
                default:
                    System.out.println('\n' + "Please Enter 1 or 2!");
                    break;
            }
            System.out.println("\n" + "Do you wish to continue? (Y/N) ");
            char resume = mySc.next().charAt(0);

            if (resume == 'y' || resume == 'Y') {}
            else{
                continueLoop = false;
            }
        }  
    } 
}

