package oops_inheritance.overriding_polymorphism;

class Fruit {
	String name, taste, size;
	
	void eat() {
		System.out.println("Fruits");
	}
}

class Apple extends Fruit {
	
	Apple() {
		name = "Apple";
		taste = "sweet";
	}
	
	@Override
	void eat() {
		System.out.println(name + " is "+ taste);
	}
}

class Orange extends Fruit {
	
	Orange() {
		name = "Orange";
		taste = "tangy";
	}
	
	@Override
	void eat() {
		System.out.println(name + " is "+ taste);
	}	
}
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit fruit = new Fruit();
		Apple apple = new Apple();
		Orange orange = new Orange();
		fruit.eat();
		apple.eat();
		orange.eat();
		
	}

}
