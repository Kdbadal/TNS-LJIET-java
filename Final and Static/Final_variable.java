//final variable
public class Final_variable {
	public static void main(String[] args) {
		//normal variables whoes value can be changed
		int a=20;
		a=40;
		//final variable whoes value cant be changed(like its constant)
		final int b=20;
		b=40;
		System.out.println(a);
		System.out.println(b);
	}
}
// the error we will be get: The final local variable b cannot be assigned. It must be blank and not using a compound assignment