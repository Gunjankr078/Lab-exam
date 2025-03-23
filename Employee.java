package practice1;

public abstract class Employee implements BonusEligibility {
	
	int emp;
	String name;
	String designation;
	double salary;
	double totalsalary;
	public Employee(int emp, String name, String designation,double salary) {
		
		this.emp = emp;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	
	double calculateSalary(){
		return totalsalary;};

void display() {
	System.out.println(emp+" "+name+" "+ designation+" " +salary);
}
}

//PermanentEmployee: Has additional benefits such as medical allowance.
//•	ContractEmployee: Receives payment based on the number of working hours.


class PermanentEmployee extends Employee implements BonusEligibility{
		
	int medicalAllowance =15000;
	
	
	
	public PermanentEmployee(int emp, String name, String designation,double salary) {
		super(emp, name, designation,salary);
		
		
	}
	
	
	 double calculateSalary() {
		 boolean iseligible =BonusEligibility.isEligibleForBonus(medicalAllowance+salary);
		 if(iseligible) {
			 totalsalary = medicalAllowance+salary+10000;
			 System.out.println("you're eligible for bonus");
			 System.out.println("Your total Salary is "+totalsalary);
			 
		 }
		 else {
			 totalsalary = medicalAllowance+salary;
			 System.out.println("you're not eligible for bonus");
			 System.out.println("Your total Salary is "+totalsalary);
			 return totalsalary;

			 
		 }
		 
		 return totalsalary;
		
	 }
	
}

class ContractEmployee extends Employee implements BonusEligibility{
	
	double salPerHour=1000;
	double workinHours ;
	
	
	public ContractEmployee(int emp, String name, String designation,double salary,double workinHours) {
		super(emp, name, designation,salary);
		this.workinHours= workinHours;
		
		
	}
	
	double calculateSalary(){
		
		 boolean iseligible =BonusEligibility.isEligibleForBonus(salPerHour*workinHours*30);
		 if(iseligible) {
			 totalsalary = (salPerHour*workinHours*30)+10000;
			 System.out.println("you're eligible for bonus");
			 System.out.println("Your total Salary is "+totalsalary);
			
		 }
		 else {
			 totalsalary = salPerHour*workinHours*30;
			 System.out.println("you're not eligible for bonus");
			 System.out.println("Your total Salary is "+totalsalary);
			
			 
		 }
	
		 return totalsalary;	
	}
}
	
