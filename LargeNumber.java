import java.util.*;
public class LargeNumber {
	public static void main(String[] args) {
		check();
		
	}
	static void check() {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int max = a > b ? a : b;
	System.out.println("maximum is "+ max);
	}
}
