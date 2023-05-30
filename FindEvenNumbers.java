
public class FindEvenNumbers {
	public static void main(String[] args) {
		check(20);
	}
	static void check(int n) {
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i + " is even number");
			}
		}
	}
}
