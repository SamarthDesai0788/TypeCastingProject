package basic;

class Vehicle {
	void type() {
		System.out.println("Type of Vehicle");
	}
}
class Bike extends Vehicle{
	void type() {
		System.out.println("Type of bike");
	}
}
class Car extends Vehicle{
	void type() {
		System.out.println("Type of car");
	}
}
public class TypeCasting{
	public static void main(String[] args) {
		Vehicle v=new Vehicle();///upcasting
		v.type();
		//Car c=(Car) new Vehicle();//downcasting
//c.type();
         Bike c1=(Bike)v;
         c1.type();
}
}

