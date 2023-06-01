
public class Static_methods {
	//with static keyword
	public static void Print() {
		System.out.println("This is printed with static keyword");
	}
	//without static keyword
	public void Print1() {
		System.out.println("This is printed without static keyword");
	}
	
	public static void main(String[] args) {
		// you can directly call the function if you have static method
		Print();
		// you have to make an object of the class if you have non-static method
		Static_methods s1 = new Static_methods();
		s1.Print1();
	}
}
