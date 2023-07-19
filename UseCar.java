package com.onesoft.streamex;

import java.util.ArrayList;

public class UseCar {
	public static void main(String[] args) {
		
		Car c1 = new Car("BMW",600000,"AO0r","BLACK");
		Car c2 = new Car("AUDI",1100000,"XRY","White");
		Car c3 = new Car("BMW",600000,"City","Red");
		Car c4 = new Car("Honda",700000,"XXX","Green");
		Car c5 = new Car("BMW",500000,"YYY","White");
		
		ArrayList<Car> cars = new ArrayList<>();
		cars.add(c1);
		cars.add(c2);
		cars.add(c3);
		cars.add(c4);
		cars.add(c5);
		
	  // c = c1.carBrand(cars, "BMW"));
	 c1.getBrand(cars, "BMW").forEach(x -> System.out.println(x.getBrand()));
	 System.out.println(c1.findMax(cars));
	 System.out.println(c1.findMaxSecond(cars));
		
	}

}
