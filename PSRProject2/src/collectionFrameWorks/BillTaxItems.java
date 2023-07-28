package collectionFrameWorks;
import java.util.ArrayList;
import java.util.List;

// Abstract class Item
abstract class Item {
    private String name;
    private double price;
    private int quantity;

    // Constructor
    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Abstract method to calculate total cost
    public abstract double calculateTotalCost();

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

//Interface Taxable
interface Taxable {
 double getTaxRate();
}

//Concrete class TaxableItem implementing Item and Taxable interfaces
class TaxableItem extends Item implements Taxable {
 private double taxRate;

 // Constructor
 public TaxableItem(String name, double price, int quantity, double taxRate) {
     super(name, price, quantity);
     this.taxRate = taxRate;
 }

 // Overriding the abstract method to calculate total cost including tax
 @Override
 public double calculateTotalCost() {
     double totalCost = getPrice() * getQuantity();
     return totalCost + (totalCost * getTaxRate());
 }

 // Implementation of Taxable interface method
 @Override
 public double getTaxRate() {
     return taxRate;
 }
}



public class BillTaxItems {
    public static void main(String[] args) {
        // Creating taxable items
        TaxableItem item1 = new TaxableItem("Laptop", 800.0, 2, 0.1);
        TaxableItem item2 = new TaxableItem("Smartphone", 500.0, 3, 0.08);

        // Creating a list of items
        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);

        // Printing the bill
        System.out.println("Invoice:");
        System.out.println("Item\tPrice\tQuantity\tTotal");
        System.out.println("--------------------------------------");
        for (Item item : items) {
            System.out.println(item.getName() + "\t$" + item.getPrice() + "\t" +
                               item.getQuantity() + "\t\t$" + item.calculateTotalCost());
        }
        System.out.println("--------------------------------------");
    }
}

