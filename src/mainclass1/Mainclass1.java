/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass1;

import java.util.Scanner;

public class Mainclass1 {

    public static void main(String[] args) {
        int choice, bottleSelection;
        boolean x = true;
        
        BottleDispenser bd = BottleDispenser.getInstance();
        Scanner sc = new Scanner(System.in);
        
        while (x == true) {
            System.out.println("\n*** BOTTLE DISPENSER ***");
            System.out.println("1) Add money to the machine");
            System.out.println("2) Buy a bottle");
            System.out.println("3) Take money out");
            System.out.println("4) List bottles in the dispenser");
            System.out.println("0) End");
            System.out.print("Your choice: ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    bd.addMoney();
                    break;
                case 2:
                    bd.showList();
                    System.out.print("Your choice: ");
                    Scanner scanner = new Scanner(System.in);
                    bottleSelection = scanner.nextInt();
                    bd.buyBottle(bottleSelection);
                    break;
                case 3:
                    bd.returnMoney();
                    break;
                case 4:
                    bd.showList();
                    break;
                case 0:
                    x = false;
                    break;
            }          
        }
    }
}
