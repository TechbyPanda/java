/*Create a class Employee with(empNo ,salary and totalSalary) with following features.
• Only parameterized constructor;
• totalSalary always represent total of all the salaries of all employees created.
• empNo should be auto incremented.
• display total employees and totalSalary using class method.*/
import java.util.Scanner;
   class Employee{
	   int empNo;
	   int salary;
	   int totalSalary;
	   Employee(int salary){
		   this.empNo++;
		   this.salary=salary;
		   this.totalSalary+=salary;
	   }
	   void display() {
		   System.out.println(empNo+" : "+totalSalary);
	   }
   }
class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int salary;
		int n,i;
		System.out.println("Enter the no. of Employee : ");
		n = scan.nextInt();
		Employee e[] = new Employee[n];
		for(i=0;i<n;i++) {
			System.out.println("Employee no.: "+(i+1));
			System.out.println("Enter employee salary : ");
			salary = scan.nextInt();
			e[i] = new Employee(salary);
		}
		for( i=0;i<e.length;i++) {
			e[i].display();
		}
	}
}