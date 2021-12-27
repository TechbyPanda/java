import java.util.Scanner;

class Faculty{
	private int facultyid , salary;
	
	Faculty(){}
	
	Faculty(int facultyid , int salary){
		this.facultyid = facultyid;
		this.salary = salary;
	}
	
	void setData(int facultyid , int salary) {
		this.facultyid = facultyid;
		this.salary = salary;
	}
	
	void setFacultyid(int facultyid) {
		this.facultyid = facultyid;
	}
	
	void setSalary(int salary) {
		this.salary = salary;
	}
	
	int getFacultyid() {
		return facultyid;
	}
	
	int getSalary() {
		return salary;
	}
	
	void display() {
		System.out.println("Faculty id : "+getFacultyid());
		System.out.println("Faculty Salary : "+getSalary());
	}
}

class FullTimeFaculty extends Faculty{
	private int basic, allowance;
	Scanner in = new Scanner(System.in);
	
	FullTimeFaculty(int facultyid,int basic, int allowance){
		setFacultyid(facultyid);
		this.basic = basic;
		this.allowance = allowance;
	}
	
	FullTimeFaculty(){}
	
	void setBasic(int basic) {
		this.basic = basic;
	}
	
	void setAllowance(int allowance) {
		this.allowance = allowance;
	}
	
	void setData(int facultyid,int basic ,int allowance) {
		setFacultyid(facultyid);
		this.basic = basic;
		this.allowance = allowance;
	}
	
	int getBasic() {
		return basic;
	}
	
	int getAllowance() {
		return allowance;
	}
	
	public void input() {
		System.out.println("Enter the faculty id : ");
		int id = in.nextInt();
		setFacultyid(id);
		System.out.println("Enter the basic salary : ");
		basic = in.nextInt();
		System.out.println("Enter the allowance : ");
		allowance = in.nextInt();
		setSalary(basic + allowance);
	}
	
}

class PartTimeFaculty extends Faculty{
	private int hour , rate;
	Scanner in = new Scanner(System.in);
	
	PartTimeFaculty(int facultyid,int hour,int rate){
		setFacultyid(facultyid);
		this.hour = hour;
		this.rate = rate;
	}
	
	PartTimeFaculty(){}
	
	void setHour(int hour) {
		this.hour = hour;
	}
	
	void setRate(int rate) {
		this.rate = rate;
	}
	
	int getHour() {
		return hour;
	}
	
	int getRate() {
		return rate;
	}
	
	void input() {
		System.out.println("Enter the Faculty id : ");
		int id = in.nextInt();
		setFacultyid(id);
		System.out.println("Enter the working hour : ");
		hour = in.nextInt();
		System.out.println("Enter the rate : ");
		rate = in.nextInt();
		setSalary(hour*rate);
	}
}

public class Main {

	public static void main(String[] args) throws Exception{
		FullTimeFaculty ftf[] = new FullTimeFaculty[3];
		PartTimeFaculty ptf[] = new PartTimeFaculty[3];
		int i;
		
		System.out.println("__________________________________");
		System.out.println(" Enter the Full Time Faculty Data");
		for(i=0;i<ftf.length;i++) {
			ftf[i] = new FullTimeFaculty();
			ftf[i].input();
		}
		
		System.out.println("___________________________________");
		System.out.println("Enter the data of part time faculty");
		for(i=0;i<ptf.length;i++) {
			ptf[i] = new PartTimeFaculty();
			ptf[i].input();
		}
		
		System.out.println("______________________________");
		System.out.println("       Full Time Faculty      ");
		for(i=0;i<ftf.length;i++) {
			ftf[i].display();
		}
		
		System.out.println("______________________________");
		System.out.println("       Part Time Faculty      ");
		for(i=0;i<ftf.length;i++) {
			ptf[i].display();
		}

	}

}
