//Create a class person with properties(name and age) with following features
//Default age of person should be 18
//A person object can be initialized  with name and age
//Method to display name and age of person

import java.util.Scanner;

class Person{
	
	private String name;
	private int age;
	
	public Person(String name) {
		this.age=18;
		this.name=name;
	}

 public Person(String name,int age){
	this.age=age;
	this.name=name;
 }
 
public void display() {
	 System.out.println("Name : "+name);
	 
	 System.out.println("Age : "+age);
 }
}

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Person p1 = new Person("Palash");
		p1.display();
		
		Person p2 = new Person("Devika",23);
		p2.display();
	}
}
