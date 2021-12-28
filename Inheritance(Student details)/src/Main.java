import java.util.Scanner;

class Student{
	private int rollno;
	private float per;
	
	Student(){}
	
	Student(int rollno, float per){
		this.rollno = rollno;
		this.per =per;
	}
	
	void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	void setPer(float per) {
		this.per = per;
	}
	
	int getRollno() {
		return rollno;
	}
	
	float getPer() {
		return per;
	}
	
	void show() {
		System.out.println("Student roll no.: "+rollno);
		System.out.println("Student percentage : "+per);
	}

}

class CollegeStudent extends Student{
	private int sem;
	
	CollegeStudent(int sem,int rollno,float per){
		setRollno(rollno);
		setPer(per);
		this.sem = sem;
	}
	
	CollegeStudent(){}
	
	void setSem(int sem){
		this.sem = sem;
	}
	
	int getSem() {
		return sem;
	}
	
	void show() {
		System.out.println("Student roll no.:"+getRollno());
		System.out.println("Student semester : "+sem);
		System.out.println("Student percentage : "+getPer());
	}
	
}

class SchoolStudent extends Student{
	private int classname;
	
	SchoolStudent(){}
	
	SchoolStudent(int rollno,int classname ,int per){
		setRollno(rollno);
		setPer(per);
		this.classname = classname;
	}
	
	void setClassname(int classname){
		this.classname = classname;
	}
	
	int getClassname() {
		return classname;
	}
	
	void show() {
		System.out.println("Student roll no.:"+getRollno());
		System.out.println("Student semester : "+classname);
		System.out.println("Student percentage : "+getPer());
	}
}

public class Main {

	public static void main(String[] args) {
		Student s[] = new Student[5];
		Scanner in = new Scanner(System.in);
		int i;
		int count = 0;
		
		for(i=0;i<s.length;i++) {
			if(i<2) {
				System.out.println("Enter the student roll no.");
				int rollno = in.nextInt();
				System.out.println("Enter the semester : ");
				int sem = in.nextInt();
				System.out.println("Enter the percentage : ");
				int per = in.nextInt();
				s[i] = new CollegeStudent(rollno,sem,per);
			}
			else
			{
				System.out.println("Enter the student roll no.");
				int rollno = in.nextInt();
				System.out.println("Enter the semester/class : ");
				int classname = in.nextInt();
				System.out.println("Enter the percentage : ");
				int per = in.nextInt();
				s[i] = new SchoolStudent(rollno,classname,per);
			}
		}
		
		for(i=0;i<s.length;i++) {
			System.out.println("_______________________________________");
			s[i].show();
			System.out.println("_______________________________________");
		}
		
		for(i=0;i<s.length;i++) {
			if(s[i].getPer() > 75) {
				count++;
			}
		}
		System.out.println(count+" Student got A grade.");
		
		System.out.println("Enter the rollno.: ");
		int rollno = in.nextInt();
		for(i=0;i<s.length;i++) {
			if(s[i].getRollno() == rollno) {
				System.out.println("Student : "+s[i].getClass());
			}
		}

	}

}
