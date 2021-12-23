/*Make list of Students having name, roll no., age, score. Write a program to accept 10 students
record and arrange the Students based on the score group [0-50], [50-65],[65-80],[80-100].*/
import java.util.Scanner;

class Student{
	String name;
	int rollno;
	int age;
	float score;
	Student(String name,int rollo,int age,float score){
		this.name=name;
		this.rollno=rollno;
		this.age=age;
		this.score=score;
	}
	public String toString(){
		return rollno+" "+name+" "+age+" "+score;
	}
}

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Student student[] = new Student[10];
		Student temp[];
		for(int i=0;i<10;i++){
			System.out.println("Enter the student name : ");
			String name = scan.next();
			System.out.println("Enter the student roll no.: ");
			int rollno = scan.nextInt();
			System.out.println("Enter the age : ");
			int age = scan.nextInt();
			System.out.println("Enter the score of student");
			float score = scan.nextFloat();
			student[i]= new Student(name,rollno,age,score);
		}
		for(int i=0;i<10;i++){
			if(student[i].score<=50){
				System.out.println(" Group A : "+student[i]);
			} else if(student[i].score<=65 && student[i].score>50){
				System.out.println(" Group B : "+student[i]);
			} else if(student[i].score<=80 && student[i].score>65){
				System.out.println(" Group C : "+student[i]);
			} else if(student[i].score<=100 && student[i].score>80){
				System.out.println(" Group D : "+student[i]);
			}
		}
	}
}