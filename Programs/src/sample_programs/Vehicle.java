/*Create an abstract class Vehicle with fields:

String name

String type

Constructor in Vehicle to initialize name and type.

Abstract method:

void start()

Create subclasses:

Car → start() prints: "Car <name> of type <type> is starting"

Bike → start() prints: "Bike <name> of type <type> is starting"

In main():

Create Car and Bike objects

Call start() for both*/


package sample_programs;

abstract class Vehicle {
	String name;
	String type;
	Vehicle(String name,String type){
		this.name=name;
		this.type=type;
		
	}
	abstract void start();

}
class Car extends Vehicle{
	Car(String name,String type){
		super(name,type);
		
	}
	void start() {
		System.out.println("Car "+name +" of type "+ type+" is starting");
		
	}
	
}
class Bike extends Vehicle{
	Bike(String name,String type){
		super(name,type);
		
	}
	void start() {
        System.out.println("Bike " + name + " of type " + type + " is starting");
    }
}
class VehicleDemo{
	public static void main(String[] args) {

	Car c=new Car("VAGON R","MARUTHI");
	c.start();
	Bike b=new Bike("bullet","FC");
	b.start();
}
}
