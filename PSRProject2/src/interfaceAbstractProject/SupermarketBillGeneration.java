package interfaceAbstractProject;

import java.util.*;

//Interface for billing operations
interface Billable {
	double calculateTotalBill();

	void displayBill();
}

//Abstract class for common features of customers
abstract class Customer implements Billable {
	protected String name;
	protected int customerID;

	// Constructor for Customer class
	public Customer(String name, int customerID) {
		this.name = name;
		this.customerID = customerID;
	}

	// Common method to display customer information
	public void displayCustomerInfo() {
		System.out.println("Customer ID: " + customerID);
		System.out.println("Customer Name: " + name);
	}
}

//Concrete class for regular customers
class RegularCustomer extends Customer {
	private double totalPurchaseAmount;

	// Constructor for RegularCustomer class
	public RegularCustomer(String name, int customerID, double totalPurchaseAmount) {
		super(name, customerID);
		this.totalPurchaseAmount = totalPurchaseAmount;
	}

	@Override
	public double calculateTotalBill() {
		return totalPurchaseAmount;
	}

	@Override
	public void displayBill() {
		displayCustomerInfo();
		System.out.println("Total Bill: $" + calculateTotalBill());
	}
}

//Concrete class for privileged customers
class PrivilegedCustomer extends Customer {
	private double totalPurchaseAmount;
	private double discountRate;

	// Constructor for PrivilegedCustomer class
	public PrivilegedCustomer(String name, int customerID, double totalPurchaseAmount, double discountRate) {
		super(name, customerID);
		this.totalPurchaseAmount = totalPurchaseAmount;
		this.discountRate = discountRate;
	}

	@Override
	public double calculateTotalBill() {
		return totalPurchaseAmount * (1 - discountRate / 100);
	}

	@Override
	public void displayBill() {
		displayCustomerInfo();
		System.out.println("Total Bill (after " + discountRate + "% discount): $" + calculateTotalBill());
	}
}

public class SupermarketBillGeneration {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Regular customer
		System.out.println("Regular Customer Details:");
		System.out.print("Enter customer name: ");
		String regularName = scanner.nextLine();
		System.out.print("Enter customer ID: ");
		int regularID = scanner.nextInt();
		System.out.print("Enter total purchase amount: $");
		double regularTotalPurchaseAmount = scanner.nextDouble();
		RegularCustomer regularCustomer = new RegularCustomer(regularName, regularID, regularTotalPurchaseAmount);

		// Privileged customer
		System.out.println("\nPrivileged Customer Details:");
		System.out.print("Enter customer name: ");
		scanner.nextLine(); // Clear the input buffer
		String privilegedName = scanner.nextLine();
		System.out.print("Enter customer ID: ");
		int privilegedID = scanner.nextInt();
		System.out.print("Enter total purchase amount: $");
		double privilegedTotalPurchaseAmount = scanner.nextDouble();
		System.out.print("Enter discount rate (%): ");
		double privilegedDiscountRate = scanner.nextDouble();
		PrivilegedCustomer privilegedCustomer = new PrivilegedCustomer(privilegedName, privilegedID,
				privilegedTotalPurchaseAmount, privilegedDiscountRate);

		System.out.println("\nBill Generation for Regular Customer:");
		regularCustomer.displayBill();

		System.out.println("\nBill Generation for Privileged Customer:");
		privilegedCustomer.displayBill();

		scanner.close();
	}
}
