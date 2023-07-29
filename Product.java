package com.jbk.HanumanGenralStores;

public class Product {

	private String id;
	private String pname;
	private int qty;
	private double price;
	private double totalprice;

	Product(String id,String pname,int qty,double price,double totalprice) {

		this.id = id;
		this.pname = pname;
		this.qty = qty;
		this.price = price;
		this.totalprice = totalprice;

	}

	public String getid() {
		return id;
	}

	public String getpname() {
		return pname;
	}

	public int getqty() {
		return qty;
	}

	public double getprice() {
		return price;
	}

	public double gettotalprice() {
		return totalprice;
	}


	public static void displayFormat() {
		System.out.format(
				"-----------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("\nProduct ID \t\tName\t\tQuantity\t\tRate \t\t\t\tTotal Price\n");
		System.out.format(
				"-----------------------------------------------------------------------------------------------------------------------------------\n");
	}

	public void display() {
		System.out.format("   %-9s             %-9s      %5d               %9.2f                       %14.2f\n", id,pname,qty,price,totalprice);
	}
}
