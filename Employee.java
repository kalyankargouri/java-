import java.util.*;
class Employee1{
	String name;
	int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
}
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 E1=new Employee1();
		 E1.setName("gouri");
		 System.out.println(E1.getName());
		 
		 E1.setSalary(5000);
		 System.out.println(E1.getSalary());
		

	}

}
