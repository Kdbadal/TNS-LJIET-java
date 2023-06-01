import java.util.*;
public class Member {
	String Name;
	int Age;
	int PhoneNumber;
	String Address;
	int Salary;
	public static void main(String[] args) {
		public static void printSalary() {
			Scanner sc = new scanner(System.in);
			Employee E1 = new Employee();
			E1.getdata();
			Manager M1 = new Manager();
			M1.getdata();
		}
	}
}

	class Employee extends Member{
		String Specialization;
		public void getdata() {
			Scanner sc = new scanner(System.in);
			Name = sc.next();
			System.out.println("Name:" + Name);
			Age = sc.nextInt();
			System.out.println("Age:" + Age);
			PhoneNumber = sc.nextInt();
			System.out.println("PhoneNumber:" + PhoneNumber);
			Address = sc.next();
			System.out.println("Address:" + Address);
			Salary = sc.nextInt();
			System.out.println("Salary:" + Salary);
			Specialization = sc.next();
			System.out.println("Specialization:" + Specialization);
			
		}
	}

	class Manager extends Employee{
		public void getdata() {
			Scanner sc = new scanner(System.in);
			Name = sc.next();
			System.out.println("Name:" + Name);
			Age = sc.nextInt();
			System.out.println("Age:" + Age);
			PhoneNumber = sc.nextInt();
			System.out.println("PhoneNumber:" + PhoneNumber);
			Address = sc.next();
			System.out.println("Address:" + Address);
			Salary = sc.nextInt();
			System.out.println("Salary:" + Salary);
		}
	}
