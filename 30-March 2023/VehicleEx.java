//.Create a parent class called "Vehicle" with attributes such as brand, model, year, and a method called "drive".
//Create a child class called "Car" that inherits from Vehicle and has an additional attribute called "color" and a method called "Type". 
//Create an object of the Car class and call both the "drive" and "Type" methods.

package pack1;

class Vehicle
{
	String brand;
	int model;
	double year;
	
	public void drive()
	{
		System.out.println("The vehicle brand is TATA");
		System.out.println("The vehicle model is NEXON-XZ");
		System.out.println("The vehicle year is 2022 ");
	}
}
class Car extends Vehicle
{
	String color;
	
	public void type()
	{
		System.out.println("The car color is Blue.");
	}
}
public class VehicleEx {

	public static void main(String[] args) {
		Car c=new Car();
		c.drive();
		c.type();
       
	}

}
