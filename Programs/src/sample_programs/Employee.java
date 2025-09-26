/*1. Employee Salary Bonus (Abstraction + Constructor)

Create an abstract class Employee with name and salary.

Abstract method: calculateBonus().

Create subclasses: Manager (20% bonus), Developer (10% bonus).

Use constructor to initialize name and salary.

Display name, salary, bonus.*/

package sample_programs;

abstract class Employee {
	String name;
	Double salary;
	
	
	Employee(String name,Double salary){
		this.name=name;
		this.salary=salary;
		
	}
	abstract void calculateBonus();

}
class Manager extends Employee{
	Manager(String name,Double salary){
		super(name, salary);
		
		
		
	}
	void calculateBonus() {
		Double bonus=0.2*salary;
		System.out.println("manager name:" +name +" "+ "salary:" +salary +" " +"bonus:" +bonus);
	}
	
}
class Developer extends Employee{
Developer(String name, Double salary) {
		super(name, salary);
		
	}

void calculateBonus() {
	Double bonus=0.1*salary;
	System.out.println("Developer name:" +name +" "+ "salary:" +salary +" "+"bonus:" +bonus);
	}
	
}
class AbstractionDemo{
	public static void main(String[] args) {
	Manager m=new Manager("sandra",30000.0);
	m.calculateBonus();
	
	Developer d=new Developer("ardra",150000.0);
	d.calculateBonus();
}
}
