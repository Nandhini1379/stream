package com.onesoft.streamex;

import java.util.Comparator;
import java.util.List;

public class Car {
	private String brand;
	private int price;
	private String model;
	private String color;
	
	public Car(String brand, int price, String model, String color) {
	
		this.brand = brand;
		this.price = price;
		this.model = model;
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	} 

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", model=" + model + ", color=" + color + "]";
	}
	
	public List<Car> getBrand(List<Car> cars,String brand) {
		return cars.stream().filter(x -> x.getBrand().equals(brand)).toList();
		
	}
	public Car findMax(List<Car> cars ) {
		return  cars.stream().max(Comparator.comparing(Car::getPrice)).get();
	}
	public Car findMaxSecond(List<Car> cars ) {
		return  cars.stream().sorted(Comparator.comparing(Car::getPrice)).skip(1).findFirst().get();
	}
	

}
