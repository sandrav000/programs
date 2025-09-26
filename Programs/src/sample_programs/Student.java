package sample_programs;

public class Student {
	private String name;
	private int rollNo;
	private int marks;
	Student( String name,int rollNo,int marks){
		this.name=name;
		this.rollNo=rollNo;
		this.marks=marks;
		
	}
	
	public void displayDetails() {
		System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
		
		
	}
	
	
	
	public static void main(String[] args) {
		Student s=new Student("sandra",50,34);
		s.displayDetails();
		
	}

}
