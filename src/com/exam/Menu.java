package com.exam;

public class Menu {

	int id;
	String name;
	int price;
	String kcal;
	public Menu(int id, String name, int price, String kcal) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.kcal = kcal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getKcal() {
		return kcal;
	}
	public void setKcal(String kcal) {
		this.kcal = kcal;
	}
	}


