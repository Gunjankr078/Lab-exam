package practice1;

public class EmployeeManagement {

public static void main(String[] args) {
		
		double totalSpent = 0;
					
		Employee[] e = new Employee[5];
			
		e[0]  = new PermanentEmployee(1001, "gunjan", "developer",55000);
		
		e[1] = new ContractEmployee(1002,"palash","developer",30000,2);
		
		e[2]  = new PermanentEmployee(1003, "vipul", "developer",20000);
		
		e[3] = new ContractEmployee(1004,"ansul","developer",10000,2);
		
		e[4]  = new PermanentEmployee(1005, "ravi", "developer",60000);
		
		//e[5] = new ContractEmployee(1006,"tharki","developer",22000,2);
		
		for(Employee obj : e) {
			obj.display();
			obj.calculateSalary();
		}
	
		for(Employee obj : e) {
			totalSpent += obj.totalsalary;
		}
		
		System.out.println("Total Compansetion of tha conpanay: $"+totalSpent);
		
		
		for(Employee obj : e) {
			if(obj.salary>50000) {
				obj.display();
			}
		}
		
		
		
	}
}
