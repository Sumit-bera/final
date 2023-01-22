package oops_inheritance.inheritance;

class Animal {
	void eat() {
		System.out.println("Animal eats everything");
	}
	void sleep() {
		System.out.println("Animal sleeps");
	}
}

class Bird extends Animal {
	@Override
	void eat() {
		System.out.println("Bird eats seeds");
	}
	@Override
	void sleep() {
		System.out.println("Bird sleeps");
	}
	void fly() {
		System.out.println("Bird fly");
	}
}

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal1 = new Animal();
		animal1.eat();
		animal1.sleep();
		
		Bird koyel = new Bird();
		koyel.eat();
		koyel.sleep();
		koyel.fly();
	}

}
