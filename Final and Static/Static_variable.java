
public class Static_variable {
	// static means its class variable
	static int a=10;
	// non static means its instance variable
	int b = 20;
	static void print() {
		// static variable can be changed
		a=20;
		System.out.println(a);
		//it will show an compilation error because b is non static variable
		b=20;
		System.out.println(b);
	}
	public static void main(String[] args) {
		print();
	}

}

/* Characteristics of static keyword in Java
 * 1. Shared memory allocation 
 * 2. Accessible without object instantiation
 * 3. Associated with class, not objects
 * 4. Can be overloaded, but not overridden
 * 
 * 
 * Benifits of static Keyword in Java
 * 1. memory efficiency
 * 2. improved performances
 * 3. Global accessibility
 * 4. Class-level functionality
 * */


