/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass1;
import java.util.ArrayList;


public class BottleDispenser {
    private int bottles;
    private double money;
    private ArrayList<Bottle> bottle_array;
    
    private BottleDispenser() {
        bottles = 5;
        money = 0;
        
        bottle_array = new ArrayList<>();
        bottle_array.add(0, new Bottle("Pepsi Max", "Pepsi", 1.0, 1.5, 2.2));
        bottle_array.add(1, new Bottle("Pepsi Max", "Pepsi", 1.0, 1.5, 2.2));
        bottle_array.add(2, new Bottle("Pepsi Max", "Pepsi", 1.0, 1.5, 2.2));
        bottle_array.add(3, new Bottle("Pepsi Max", "Pepsi", 1.0, 1.5, 2.2));
        bottle_array.add(4, new Bottle("Pepsi Max", "Pepsi", 1.0, 1.5, 2.2));
    }
    
    private static BottleDispenser bd = new BottleDispenser();
    
    public static BottleDispenser getInstance(){
        return bd;
    }
    
    public void addMoney() {
        money += 1;
        System.out.println("Klink! Added more money!");
    }
    
    public void buyBottle(int userSelection) {
        Bottle selection = bottle_array.get(userSelection-1);
        if (money < selection.getPrice()) {
            System.out.println("Add money first!");
        } else if (bottles == 0) {
            System.out.println("Out of stock.");
        } else if (money >= selection.getPrice()) {
            bottles -= 1;
            money -= selection.getPrice();
            System.out.println("KACHUNK! " + selection.getName() + " came out of the dispenser!");
            removeBottle(userSelection);
        }
    }
    public void returnMoney() {
        System.out.printf("Klink klink. Money came out! You got %.2f€ back\n", money);
        money = 0;
    }
    
    public void showList(){
        int i = 1;
        for (Bottle btl : bottle_array) {
            System.out.println(i + ". Name: " + btl.getName() + "\n\t" + "Size: " + btl.getSize() + "\tPrice: " + btl.getPrice());
            i += 1;
        }
    }
    public void removeBottle(int userSelection) {
        Bottle x = bottle_array.get((userSelection)-1);
        bottle_array.remove(x);
    }
}