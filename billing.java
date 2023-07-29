package com.jbk.HanumanGenralStores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class billing  {

	public static void main(String[] args) {

		String id = null;
		String ProductName = null;
		int Quantity = 0;
		double Price = 0.0;
		double TotalPrice = 0.0;
		double overAllPrice = 0.0;
		double CGST, SGST, Subtotal = 0.0;
		double Discount = 0.0;
		char choice = '\0';

		System.out.println("\t\t\t\t-------------------Invoice------------------");
		System.out.println("\t\t\t\t\t" + "    " + "Hanuman General Stores");
		System.out.println("\t\t\t\t\t     Gandhi Chowk,Girad");
		System.out.println("GSTIN:03AWBPP8756K592" + "\nContact:(+91)9423382962");

		SimpleDateFormat Formatter = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
		Date Date = new Date();
		Calendar calendar = Calendar.getInstance();
		String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Sturday" };

		System.out.println("Date:" + Formatter.format(Date) + " " + days[calendar.get(Calendar.DAY_OF_WEEK) - 1]
				+ "\t\t\t\t\t\t (+91) 8007317529");

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Customer Name: ");
		String customername = scan.nextLine();

		List<Product> product = new ArrayList<Product>();
		do {
			System.out.println("Enter the product details: ");
			System.out.println("Product id: ");
			id = scan.nextLine();
			System.out.println("Product Name: ");
			ProductName = scan.nextLine();
			System.out.println("Quantity: ");
			Quantity = scan.nextInt();
			System.out.println("Price (per unit): ");
			Price = scan.nextDouble();

			TotalPrice = Price * Quantity;

			overAllPrice = overAllPrice + TotalPrice;

			product.add(new Product(id, ProductName, Quantity, Price, TotalPrice));
			System.out.println("Want to add more items? (Y/N):");
			choice = scan.next().charAt(0);
			scan.nextLine();
		} while (choice == 'y' || choice == 'Y');
		Product.displayFormat();
		for (Product p : product) {
			p.display();
		}

		System.out.println("\n\t\t\t\t\t\t\t\t\t\t          Total Amount (Rs)" + overAllPrice);
		Discount = overAllPrice * 2 / 100;
		System.out.println("\n\t\t\t\t\t\t\t\t\t\t          Total Discount (Rs)" + Discount);
		Subtotal = overAllPrice - Discount;
		System.out.println("\n\t\t\t\t\t\t\t\t\t\t          Total Subtotal (Rs)" + Subtotal);
		SGST = overAllPrice * 12 / 100;
		System.out.println("\n\t\t\t\t\t\t\t\t\t\t          Total SGST (%)" + SGST);
		CGST = overAllPrice * 12 / 100;
		System.out.println("\n\t\t\t\t\t\t\t\t\t\t          Total CGST (%)" + CGST);
		System.out.println("\n\t\t\t\t\t\t\t\t\t\t          Invoice Total (Rs)" + (Subtotal + SGST + CGST));
		//System.out.println("\t\t\t\t\tCustomer Name:"+customername);
		System.out.println("\t\t\t\t----------------Thank You for Shopping!!-----------------");
		System.out.println("\t\t\t\t                     Visit Again");
		scan.close();

	}
}
